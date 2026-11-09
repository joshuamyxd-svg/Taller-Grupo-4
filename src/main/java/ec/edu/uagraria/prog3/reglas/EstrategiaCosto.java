
package ec.edu.uagraria.prog3.reglas;

import ec.edu.uagraria.prog3.dominio.Lote;

@FunctionalInterface
public interface EstrategiaCosto {

    double calcular(Lote lote);

    default String descripcion() {
        return "Estrategia de costo";
    }
}
