package ec.edu.uagraria.prog3.alertas;

/**
 * Configuración de umbrales y parámetros para el motor de alertas.
 */
public class Configuracion {
    
    private double hectareasMinimas;
    private double hectareasMaximas;
    private double humedadMinima;
    private boolean validarNombre;
    
    public Configuracion() {
        this.hectareasMinimas = 0.5;
        this.hectareasMaximas = 100.0;
        this.humedadMinima = 20.0;
        this.validarNombre = true;
    }
    
    public double getHectareasMinimas() {
        return hectareasMinimas;
    }
    
    public void setHectareasMinimas(double hectareasMinimas) {
        this.hectareasMinimas = hectareasMinimas;
    }
    
    public double getHectareasMaximas() {
        return hectareasMaximas;
    }
    
    public void setHectareasMaximas(double hectareasMaximas) {
        this.hectareasMaximas = hectareasMaximas;
    }
    
    public double getHumedadMinima() {
        return humedadMinima;
    }
    
    public void setHumedadMinima(double humedadMinima) {
        this.humedadMinima = humedadMinima;
    }
    
    public boolean isValidarNombre() {
        return validarNombre;
    }
    
    public void setValidarNombre(boolean validarNombre) {
        this.validarNombre = validarNombre;
    }
}
