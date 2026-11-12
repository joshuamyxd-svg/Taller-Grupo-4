package ec.edu.uagraria.prog3.alertas;

import java.util.Optional;

/**
 * Interfaz para evaluar un objeto y determinar si genera una alerta.
 */
@FunctionalInterface
public interface ReglaAlerta {
    <T> Optional<Alerta> evaluar(T objeto);
}