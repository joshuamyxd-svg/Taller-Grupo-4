package ec.edu.uagraria.prog3.alertas;

/**
 * Fábrica para crear observadores de alertas según el tipo especificado.
 */
public class ObservadorFactory {
    
    public static ObservadorAlertas crearObservador(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "consola" -> new ConsolaObservador();
            default -> new ConsolaObservador();
        };
    }
}
