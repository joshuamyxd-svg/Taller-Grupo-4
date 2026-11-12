package ec.edu.uagraria.prog3.alertas;

import java.util.Optional;

/**
 * Regla que detecta cuando la humedad del suelo está por debajo del mínimo.
 */
public class ReglaHumedadBajas implements ReglaAlerta {
    
    private final double humedadMinima;
    
    public ReglaHumedadBajas(double humedadMinima) {
        this.humedadMinima = humedadMinima;
    }
    
    @Override
    public Optional<Alerta> evaluar(Object objeto) {
        if (objeto instanceof Lectura lectura) {
            if ("humedad".equalsIgnoreCase(lectura.tipo()) && lectura.valor() < humedadMinima) {
                return Optional.of(new Alerta(
                        TipoAlerta.CRITICA,
                        "Humedad del suelo por debajo del mínimo en sensor " + lectura.idSensor() + ": " 
                        + lectura.valor() + "% (mínimo: " + humedadMinima + "%)"
                ));
            }
        }
        return Optional.empty();
    }
}
