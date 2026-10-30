
package ec.edu.uagraria.prog3;

public sealed interface Cultivo permits Banano, Cacao, Arroz {
    String nombreComun();
}
