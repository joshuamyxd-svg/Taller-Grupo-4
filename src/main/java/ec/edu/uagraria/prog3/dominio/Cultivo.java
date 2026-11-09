
package ec.edu.uagraria.prog3.dominio;

public sealed interface Cultivo permits Banano, Cacao, Arroz {
    String nombreComun();
}
