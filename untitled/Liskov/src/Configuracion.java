import java.util.*;

public class Configuracion {
    private Vector<RecursoSoloLectura> confSoloLectura = new Vector<RecursoSoloLectura>();
    private Vector<RecursoPersistente> confPersistente = new Vector<RecursoPersistente>();

    public void cargarConfiguracion() {
        confSoloLectura.add(new ConfiguracionSistema());
        confSoloLectura.add(new ConfiguracionUsuario());
        confSoloLectura.add(new ConfiguracionHoraria());

        for (RecursoSoloLectura recurso : confSoloLectura) {
            recurso.load();
            if (recurso instanceof Notificable) {
                ((Notificable) recurso).notificar();
            }
        }
    }

    public void salvarConfiguracion() {
        confPersistente.add(new ConfiguracionSistema());
        confPersistente.add(new ConfiguracionUsuario());

        for (RecursoPersistente recurso : confPersistente) {
            recurso.save();
            if (recurso instanceof Notificable) {
                ((Notificable) recurso).notificar();
            }
        }
    }
}
