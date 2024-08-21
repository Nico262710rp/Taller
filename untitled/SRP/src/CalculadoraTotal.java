public class CalculadoraTotal {
    public float calcularTotal(float importeFactura, float importeDeduccion, float importeIVA) {
        return (importeFactura - importeDeduccion) + importeIVA;
    }
}
