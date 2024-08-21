import java.util.Date;

public class Factura {
    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeDeduccion;
    public float importeIVA;
    public float importeTotal;
    public int porcentajeDeduccion;

    public Factura(String codigo, Date fechaEmision, float importeFactura, int porcentajeDeduccion) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.importeFactura = importeFactura;
        this.porcentajeDeduccion = porcentajeDeduccion;
    }

    public void calcularTotal() {
        Deduccion deduccion = new Deduccion();
        IVA iva = new IVA();

        // Calcular deducción
        importeDeduccion = deduccion.calcularDeduccion(importeFactura, porcentajeDeduccion);

        // Calcular IVA
        importeIVA = iva.calcularIVA(importeFactura, codigo);

        // Calcular total
        CalculadoraTotal calculadoraTotal = new CalculadoraTotal();
        importeTotal = calculadoraTotal.calcularTotal(importeFactura, importeDeduccion, importeIVA);
    }
}
