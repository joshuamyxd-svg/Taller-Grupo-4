
package ec.edu.uagraria.prog3.dominio;

public record Banano(String variedad) implements Cultivo {

    @Override
    public String nombreComun() {
        return "Banano " + variedad;
    }
}
