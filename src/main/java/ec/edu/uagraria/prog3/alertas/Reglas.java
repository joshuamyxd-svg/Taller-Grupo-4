package ec.edu.uagraria.prog3.alertas;

import ec.edu.uagraria.riegosmart.dominio.Cultivo;

/**
 * Clase que agrupa todas las reglas de alertas predeterminadas del sistema.
 */
public class Reglas {
    
    private final MotorAlertas motor;
    private final Configuracion configuracion;
    
    public Reglas(MotorAlertas motor, Configuracion configuracion) {
        this.motor = motor;
        this.configuracion = configuracion;
        registrarReglasPredeterminadas();
    }
    
    private void registrarReglasPredeterminadas() {
        motor.agregarRegla(new ReglaHectareasBajas(configuracion.getHectareasMinimas()));
        motor.agregarRegla(new ReglaHectareasExcesivas(configuracion.getHectareasMaximas()));
        motor.agregarRegla(new ReglaHumedadBajas(configuracion.getHumedadMinima()));
        motor.agregarRegla(new ReglaNombreVacio());
    }
    
    public void evaluarCultivo(Cultivo cultivo) {
        motor.procesar(cultivo);
    }
    
    public void evaluarLectura(Lectura lectura) {
        motor.procesar(lectura);
    }
}
