package ec.edu.uagraria.prog3.alertas;

import ec.edu.uagraria.riegosmart.dominio.Cultivo;
import java.util.Optional;

/**
 * Regla que detecta cuando las hectareas de un cultivo exceden el máximo permitido.
 */
public class ReglaHectareasExcesivas implements ReglaAlerta {
    
    private final double hectareasMaximas;
    
    public ReglaHectareasExcesivas(double hectareasMaximas) {
        this.hectareasMaximas = hectareasMaximas;
    }
    
    @Override
    public Optional<Alerta> evaluar(Object objeto) {
        if (objeto instanceof Cultivo cultivo) {
            if (cultivo.hectareas() > hectareasMaximas) {
                return Optional.of(new Alerta(
                        TipoAlerta.CRITICA,
                        "El cultivo '" + cultivo.nombre() + "' excede las hectareas máximas: " 
                        + cultivo.hectareas() + " ha (máximo: " + hectareasMaximas + " ha)"
                ));
            }
        }
        return Optional.empty();
    }
}
