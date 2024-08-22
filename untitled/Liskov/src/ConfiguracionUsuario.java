public class ConfiguracionUsuario implements RecursoPersistente, Notificable {
    public void load() {
        System.out.println("Configuracion usuario cargada");
    }

    public void save() {
        System.out.println("Configuracion usuario almacenada");
    }

    @Override
    public void notificar() {
        System.out.println("Notificación: Configuración de usuario ha sido procesada.");
    }
}
