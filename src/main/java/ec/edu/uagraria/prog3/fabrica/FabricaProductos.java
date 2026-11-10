package ec.edu.uagraria.prog3.fabrica;

import ec.edu.uagraria.prog3.dominio.Arroz;
import ec.edu.uagraria.prog3.dominio.Banano;
import ec.edu.uagraria.prog3.dominio.Cacao;
import ec.edu.uagraria.prog3.dominio.Insumo;
import ec.edu.uagraria.prog3.dominio.ProductoRiego;
import ec.edu.uagraria.prog3.dominio.Trazable;
import ec.edu.uagraria.prog3.dominio.TurnoRiego;

/** Unico lugar donde se hace new de los productos del dominio. */
public final class FabricaProductos {

    private FabricaProductos() { }

    public static ProductoRiego crear(TipoProducto tipo, DatosProducto d) {
        return switch (tipo) {
            case ARROZ        -> new Arroz(d.ciclosPorAnio());
            case BANANO       -> new Banano(d.variedad());
            case CACAO        -> new Cacao(d.variedad(), d.organico());
            case TURNO_RIEGO  -> new TurnoRiego(Trazable.generarCodigo("TUR"),
                                                d.parcela(), d.minutosUsados());
            case INSUMO_RIEGO -> new Insumo(d.nombre(), d.cantidad(),
                                            d.unidad(), d.precioUnitario());
        };
    }
}
