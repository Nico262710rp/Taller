public class ConfiguracionSistema implements RecursoPersistente, Notificable {
    public void load() {
        System.out.println("Configuracion sistema cargada");
    }

    public void save() {
        System.out.println("Configuracion sistema almacenada");
    }

    @Override
    public void notificar() {
        System.out.println("Notificación: Configuración del sistema ha sido procesada.");
    }
}
