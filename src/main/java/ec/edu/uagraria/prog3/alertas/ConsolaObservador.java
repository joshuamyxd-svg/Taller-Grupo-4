package ec.edu.uagraria.prog3.alertas;

/**
 * Observador que imprime las alertas en la consola.
 */
public class ConsolaObservador implements ObservadorAlertas {

    @Override
    public void onAlertaGenerada(Alerta alerta) {
        System.out.println("🚨 [ALERTA " + alerta.tipo() + "] Código: " + alerta.codigo() 
                + " | Mensaje: " + alerta.mensaje() 
                + " | Fecha: " + alerta.fechaHora());
    }
}