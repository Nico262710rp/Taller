public class Main {
    public static void main(String[] args) {
        Configuracion config = new Configuracion();
        config.cargarConfiguracion();
        config.salvarConfiguracion();
    }
}

public interface RecursoSoloLectura {
    void load();
}

public interface RecursoPersistente extends RecursoSoloLectura {
    void save();
}