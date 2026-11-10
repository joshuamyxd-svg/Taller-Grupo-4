package ec.edu.uagraria.prog3.alertas;

import java.util.Optional;

@FunctionalInterface
public interface ReglaAlerta {
    <T> Optional<Alerta> evaluar(T objeto);
}