package ec.edu.uagraria.prog3.alertas;

/**
 * Representa una magnitud medible en el sistema de alertas.
 */
public record Magnitud(
        String nombre,
        double valor,
        String unidad,
        double umbralMinimo,
        double umbralMaximo
) {
    public Magnitud(String nombre, double valor, String unidad) {
        this(nombre, valor, unidad, 0, Double.MAX_VALUE);
    }
}
