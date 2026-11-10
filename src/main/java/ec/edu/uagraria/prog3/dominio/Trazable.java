package ec.edu.uagraria.prog3.dominio;

import java.util.concurrent.atomic.AtomicInteger;

public interface Trazable {
    AtomicInteger CONTADOR = new AtomicInteger(1);

    static String generarCodigo(String prefijo) {
        return prefijo + "-" + String.format("%04d", CONTADOR.getAndIncrement());
    }
}
