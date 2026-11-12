package ec.edu.uagraria.prog3.alertas;

@FunctionalInterface
public interface ObservadorAlertas {
    void onAlertaGenerada(Alerta alerta);
}