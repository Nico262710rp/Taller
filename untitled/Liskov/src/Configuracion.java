public class Configuracion {
    private Vector<RecursoSoloLectura> recursosLectura = new Vector<RecursoSoloLectura>();
    private Vector<RecursoPersistente> recursosPersistentes = new Vector<RecursoPersistente>();

    public void cargarConfiguracion() {
        recursosLectura.add(new ConfiguracionSistema());
        recursosLectura.add(new ConfiguracionUsuario());
        recursosLectura.add(new ConfiguracionHoraria());

        for (RecursoSoloLectura recurso : recursosLectura) {
            recurso.load();
        }
    }

    public void salvarConfiguracion() {
        for (RecursoPersistente recurso : recursosPersistentes) {
            recurso.save();
        }
    }
}
