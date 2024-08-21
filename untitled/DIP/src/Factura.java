public class Factura {
    public String codigo;
    public Date fechaEmision;
    public float importeFactura;
    public float importeIVA;
    public float importeDeduccion;
    public float importeTotal;
    public int porcentajeDeduccion;

    private final CalculadoraDeduccion deduccion;
    private final CalculadoraIVA iva;

    // Constructor que recibe las implementaciones de las interfaces
    public Factura(CalculadoraDeduccion deduccion, CalculadoraIVA iva) {
        this.deduccion = deduccion;
        this.iva = iva;
    }

    // Método que calcula el total de la factura
    public void calcularTotal() {
        // Calculamos la deducción
        importeDeduccion = deduccion.calculaDeduccion(importeFactura, porcentajeDeduccion);

        // Calculamos el IVA
        importeIVA = iva.calculaIVA(importeFactura);

        // Calculamos el total
        importeTotal = (importeFactura - importeDeduccion) + importeIVA;
    }
}
