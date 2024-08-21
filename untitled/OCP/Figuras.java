
import java.util.*;
public class Figuras {
    private Vector<Figura> figuras = new Vector<Figura>();

    public void addFigura(Figura f) {
        figuras.add(f);
    }

    public void dibujarFiguras() {
        Enumeration<Figura> enumFiguras = figuras.elements();
        while (enumFiguras.hasMoreElements()) {
            enumFiguras.nextElement().dibujar();
        }
    }
}