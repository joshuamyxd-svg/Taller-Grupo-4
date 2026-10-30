
package ec.edu.uagraria.prog3;

public record Cacao(String variedad, boolean organico) implements Cultivo {

    @Override
    public String nombreComun() {
        return "Cacao " + variedad;
    }
}
