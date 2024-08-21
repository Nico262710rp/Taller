

public class IVA {
    public float calcularIVA(float importeFactura, String codigo) {
        if ("0".equals(codigo)) {
            return 0; // No se aplica IVA para facturas con código "0"
        }
        return (float) (importeFactura * 0.18); // Cambia el IVA del 16% al 18%
    }
}
