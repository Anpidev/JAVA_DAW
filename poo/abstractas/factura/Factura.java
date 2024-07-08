
import java.util.*;

// Creamos la clase abstracta Factura
abstract class Factura {


    // Constructor de la clase Factura
    public Factura(int nFactura, double importe, String detalle) {
        this.nFactura = nFactura;
        this.importe = importe;
        this.detalle = detalle;
        this.iva = calcularIva();
        this.totalFinal = calcularTotalFinal();
    }

    // Métodos para obtener y establecer las propiedades
    public int getNFactura() {
        return this.nFactura;
    }

    public void setNFactura(int nFactura) {
        this.nFactura = nFactura;
    }

    public double getImporte() {
        return this.importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
        this.iva = calcularIva();
        this.totalFinal = calcularTotalFinal();
    }

    public double getIva() {
        return this.iva;
    }

    public String getDetalle() {
        return this.detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getTotalFinal() {
        return this.totalFinal;
    }

   // Método para mostrar los datos de la factura con un StringBuilder
public void mostrarDatos() {
    StringBuilder sb = new StringBuilder();
    sb.append("Número de factura: ").append(this.nFactura).append("\n");
    sb.append("Detalle: ").append(this.detalle).append("\n");
    sb.append("Importe: ").append(this.importe).append("\n");
    sb.append("IVA: ").append(this.iva).append("\n");
    sb.append("Total final: ").append(this.totalFinal).append("\n");

    System.out.println(sb.toString());
}

    // Método para calcular el IVA (21% del importe)
    private double calcularIva() {
        return this.importe * 0.21;
    }

    // Método para calcular el total final (subtotal + IVA)
    private double calcularTotalFinal() {
        return this.importe + this.iva;
    }

        // Campos de clase
    private int nFactura;
    private double importe;
    private double iva;
    private String detalle;
    private double totalFinal;
}
