package Clases.Producto;

import com.itextpdf.kernel.pdf.PdfWriter; 
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class GenerarFactura {

    public static void generarFacturaPDF(String nombreArchivo, String nombreCliente, int idFactura, String idCliente, List<Producto> productos, int idEmpleado,
            BigDecimal subtotal, BigDecimal itbis, BigDecimal total) {

        try {
            File archivo = new File(nombreArchivo);
            PdfWriter writer = new PdfWriter(archivo);
            PdfDocument pdf = new PdfDocument(writer);
            Document documento = new Document(pdf);

            // Encabezado
            documento.add(new Paragraph("Factura de Compra").setBold().setFontSize(16));
            documento.add(new Paragraph("Factura ID: " + idFactura));
            documento.add(new Paragraph("Cédula Cliente: " + idCliente));

            // Mostrar el nombre del cliente
            documento.add(new Paragraph("Cliente: " + nombreCliente));

            // Mostrar el ID de empleado
            documento.add(new Paragraph("ID Empleado: " + idEmpleado));
            
            documento.add(new Paragraph("--------------------------------------------------"));

            // Productos y cálculos
            documento.add(new Paragraph("Productos:"));
            BigDecimal subtotalCalculado = BigDecimal.ZERO;

            // Iterar sobre los productos
            for (Producto producto : productos) {
                BigDecimal totalPorProducto = producto.getPrecio().multiply(BigDecimal.valueOf(producto.getCantidadSeleccionada()));
                subtotalCalculado = subtotalCalculado.add(totalPorProducto);

                // Agregar información de cada producto
                documento.add(new Paragraph("- " + producto.getCantidadSeleccionada() + " x " + producto.getMarca() + " - $" 
                        + producto.getPrecio().setScale(2, RoundingMode.HALF_UP) + " c/u - Total: $" 
                        + totalPorProducto.setScale(2, RoundingMode.HALF_UP)));
            }

            // Si el subtotal no fue proporcionado, usar el calculado
            if (subtotal == null || subtotal.compareTo(BigDecimal.ZERO) == 0) {
                subtotal = subtotalCalculado;
            }

            documento.add(new Paragraph("--------------------------------------------------"));
            documento.add(new Paragraph("ITBIS (18%): $" + itbis.setScale(2, RoundingMode.HALF_UP)));
            documento.add(new Paragraph("Subtotal: $" + subtotal.setScale(2, RoundingMode.HALF_UP)));
            documento.add(new Paragraph("Total: $" + total.setScale(2, RoundingMode.HALF_UP)));
            documento.add(new Paragraph("--------------------------------------------------"));
            documento.add(new Paragraph("¡Gracias por su compra!"));

            documento.close();
            System.out.println("Factura generada correctamente en: " + archivo.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Error al generar PDF: " + e.getMessage());
        }
    }
}
