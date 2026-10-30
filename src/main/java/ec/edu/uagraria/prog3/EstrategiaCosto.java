
package ec.edu.uagraria.prog3;

@FunctionalInterface
public interface EstrategiaCosto {

    double calcular(Lote lote);

    default String descripcion() {
        return "Estrategia de costo";
    }
}
