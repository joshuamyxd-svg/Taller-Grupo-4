package ec.edu.uagraria.prog3.alertas;

/**
 * Representa una lectura de sensor del sistema de riego.
 */
public record Lectura(
        String idSensor,
        String tipo,
        double valor,
        String unidad
) {
    public Lectura(String idSensor, double valor) {
        this(idSensor, "humedad", valor, "%");
    }
}
