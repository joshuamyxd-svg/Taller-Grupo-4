package ec.edu.uagraria.prog3.dominio;

public record TurnoRiego(String codigo, String parcela, int minutosUsados)
        implements ProductoRiego {

    public TurnoRiego {
        if (minutosUsados < 0) {
            throw new IllegalArgumentException("Los minutos no pueden ser negativos");
        }
    }
}
