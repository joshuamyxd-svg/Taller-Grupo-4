package ec.edu.uagraria.prog3.alertas;

/**
 * Interfaz para observar las alertas generadas por el motor.
 */
@FunctionalInterface
public interface ObservadorAlertas {
    void onAlertaGenerada(Alerta alerta);
}