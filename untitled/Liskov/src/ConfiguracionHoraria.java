public class ConfiguracionHoraria implements RecursoSoloLectura, Notificable {
    public void load() {
        System.out.println("Configuracion horaria cargada");
    }

    @Override
    public void notificar() {
        System.out.println("Notificación: Configuración horaria ha sido cargada.");
    }
}
