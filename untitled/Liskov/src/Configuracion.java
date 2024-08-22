import java.util.*;

public class Configuracion {
    private Vector<RecursoCargable> confCargable = new Vector<RecursoCargable>();
    private Vector<RecursoPersistente> confPersistente = new Vector<RecursoPersistente>();

    public void cargarConfiguracion() {
        confCargable.add(new ConfiguracionSistema());
        confCargable.add(new ConfiguracionUsuario());
        confCargable.add(new ConfiguracionHoraria());

        for (RecursoCargable recurso : confCargable) {
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
