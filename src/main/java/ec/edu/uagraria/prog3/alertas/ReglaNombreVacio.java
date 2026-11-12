package ec.edu.uagraria.prog3.alertas;

import ec.edu.uagraria.riegosmart.dominio.Cultivo;
import java.util.Optional;

/**
 * Regla que detecta cuando un cultivo no tiene nombre asignado.
 */
public class ReglaNombreVacio implements ReglaAlerta {
    
    @Override
    public Optional<Alerta> evaluar(Object objeto) {
        if (objeto instanceof Cultivo cultivo) {
            if (cultivo.nombre() == null || cultivo.nombre().trim().isEmpty()) {
                return Optional.of(new Alerta(
                        TipoAlerta.ADVERTENCIA,
                        "El cultivo con código '" + cultivo.codigo() + "' no tiene nombre asignado"
                ));
            }
        }
        return Optional.empty();
    }
}
