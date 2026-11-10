package ec.edu.uagraria.prog3.fabrica;

/** Datos de entrada para la fabrica; cada metodo estatico arma los de un tipo. */
public record DatosProducto(String nombre, String variedad, boolean organico,
                            int ciclosPorAnio, String parcela, int minutosUsados,
                            double cantidad, String unidad, double precioUnitario) {

    public static DatosProducto deArroz(int ciclosPorAnio) {
        return new DatosProducto(null, null, false, ciclosPorAnio, null, 0, 0, null, 0);
    }

    public static DatosProducto deBanano(String variedad) {
        return new DatosProducto(null, variedad, false, 0, null, 0, 0, null, 0);
    }

    public static DatosProducto deCacao(String variedad, boolean organico) {
        return new DatosProducto(null, variedad, organico, 0, null, 0, 0, null, 0);
    }

    public static DatosProducto deTurno(String parcela, int minutosUsados) {
        return new DatosProducto(null, null, false, 0, parcela, minutosUsados, 0, null, 0);
    }

    public static DatosProducto deInsumo(String nombre, double cantidad,
                                         String unidad, double precioUnitario) {
        return new DatosProducto(nombre, null, false, 0, null, 0, cantidad, unidad, precioUnitario);
    }
}
