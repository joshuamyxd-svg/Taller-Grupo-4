package ec.edu.uagraria.prog3.alertas;

public class ConsolaObservador implements ObservadorAlertas {

    @Override
    public void onAlertaGenerada(Alerta alerta) {
        System.out.println("🚨 [ALERTA " + alerta.tipo() + "] Código: " + alerta.codigo() 
                + " | Mensaje: " + alerta.mensaje() 
                + " | Fecha: " + alerta.fechaHora());
    }
}