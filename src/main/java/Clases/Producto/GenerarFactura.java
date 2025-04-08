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

    public static void generarFacturaPDF(String nombreArchivo, int idFactura, int idCliente, List<Producto> productos,
            BigDecimal subtotal, BigDecimal itbis, BigDecimal total) {

        try {
            File archivo = new File(nombreArchivo);
            PdfWriter writer = new PdfWriter(archivo);
            PdfDocument pdf = new PdfDocument(writer);
            Document documento = new Document(pdf);

            // Encabezado
            documento.add(new Paragraph("PRUEBA 4").setBold().setFontSize(14));
            documento.add(new Paragraph("Factura ID: " + idFactura));
            documento.add(new Paragraph("Cliente ID: " + idCliente));
            documento.add(new Paragraph("--------------------------------------------------"));

            // Productos
            documento.add(new Paragraph("Productos:"));
            for (Producto producto : productos) {
                documento.add(new Paragraph("- " + producto.getMarca() + " - $" + producto.getPrecio()));
            }

            documento.add(new Paragraph("--------------------------------------------------"));
            documento.add(new Paragraph("ITBIS: $" + itbis.setScale(2, RoundingMode.HALF_UP)));
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
