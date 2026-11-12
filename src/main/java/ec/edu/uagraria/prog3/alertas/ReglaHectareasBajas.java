package ec.edu.uagraria.prog3.alertas;

import ec.edu.uagraria.riegosmart.dominio.Cultivo;
import java.util.Optional;

/**
 * Regla que detecta cuando las hectareas de un cultivo están por debajo del mínimo.
 */
public class ReglaHectareasBajas implements ReglaAlerta {
    
    private final double hectareasMinimas;
    
    public ReglaHectareasBajas(double hectareasMinimas) {
        this.hectareasMinimas = hectareasMinimas;
    }
    
    @Override
    public Optional<Alerta> evaluar(Object objeto) {
        if (objeto instanceof Cultivo cultivo) {
            if (cultivo.hectareas() < hectareasMinimas) {
                return Optional.of(new Alerta(
                        TipoAlerta.ADVERTENCIA,
                        "El cultivo '" + cultivo.nombre() + "' tiene hectareas por debajo del mínimo: " 
                        + cultivo.hectareas() + " ha (mínimo: " + hectareasMinimas + " ha)"
                ));
            }
        }
        return Optional.empty();
    }
}
