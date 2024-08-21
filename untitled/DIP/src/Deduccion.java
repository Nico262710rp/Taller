public class Deduccion implements CalculadoraDeduccion {
    @Override
    public float calculaDeduccion(float importeFactura, int porcentajeDeduccion) {
        return (importeFactura * porcentajeDeduccion) / 100;
    }
}