package ec.edu.uagraria.prog3.alertas;

import ec.edu.uagraria.prog3.dominio.Trazable;
import java.time.LocalDateTime;

/**
 * Representa una alerta generada por el motor de reglas.
 */
public record Alerta(
        String codigo,
        TipoAlerta tipo,
        String mensaje,
        LocalDateTime fechaHora
) {
    public Alerta(TipoAlerta tipo, String mensaje) {
        this(Trazable.generarCodigo("ALT"), tipo, mensaje, LocalDateTime.now());
    }
}