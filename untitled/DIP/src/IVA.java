public class IVA implements CalculadoraIVA {
    @Override
    public float calculaIVA(float importeFactura) {
        return (float) (importeFactura * 0.16);
    }
}