
package ec.edu.uagraria.prog3;

public record Banano(String variedad) implements Cultivo {

    @Override
    public String nombreComun() {
        return "Banano " + variedad;
    }
}
