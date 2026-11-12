package ec.edu.uagraria.prog3.dominio;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Clase utilitaria para generar códigos únicos trazables.
 */
public class Trazable {
    
    private static final AtomicInteger contador = new AtomicInteger(1);
    
    public static String generarCodigo(String prefijo) {
        return prefijo + "-" + String.format("%04d", contador.getAndIncrement());
    }
}
