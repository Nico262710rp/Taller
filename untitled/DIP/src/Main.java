public class Main {
    public static void main(String[] args) {
        CalculadoraDeduccion deduccion = new Deduccion();
        CalculadoraIVA iva = new IVA();

        Factura factura = new Factura(deduccion, iva);
        factura.importeFactura = 10000;
        factura.porcentajeDeduccion = 10;
        factura.calcularTotal();

        System.out.println("Total factura: " + factura.importeTotal);
    }
}