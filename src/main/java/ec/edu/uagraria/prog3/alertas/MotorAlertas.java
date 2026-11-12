package ec.edu.uagraria.prog3.alertas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MotorAlertas {

    private final List<ReglaAlerta> reglas = new ArrayList<>();
    private final List<ObservadorAlertas> observadores = new ArrayList<>();

    public void agregarRegla(ReglaAlerta regla) {
        if (regla != null) {
            reglas.add(regla);
        }
    }

    public void suscribir(ObservadorAlertas observador) {
        if (observador != null) {
            observadores.add(observador);
        }
    }

    public void desuscribir(ObservadorAlertas observador) {
        observadores.remove(observador);
    }

    public <T> int procesar(T objetoEvaluar) {
        int alertasEmitidas = 0;

        for (ReglaAlerta regla : reglas) {
            Optional<Alerta> posibleAlerta = regla.evaluar(objetoEvaluar);
            
            if (posibleAlerta.isPresent()) {
                Alerta alerta = posibleAlerta.get();
                notificarObservadores(alerta);
                alertasEmitidas++;
            }
        }
        return alertasEmitidas;
    }

    private void notificarObservadores(Alerta alerta) {
        for (ObservadorAlertas obs : observadores) {
            obs.onAlertaGenerada(alerta);
        }
    }

    public List<ReglaAlerta> getReglas() {
        return List.copyOf(reglas);
    }
}