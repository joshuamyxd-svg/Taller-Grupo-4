package ec.edu.uagraria.prog3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrozTest {

    @Test
    void debeGuardarLosCiclosPorAnio() {
        Arroz arroz = new Arroz(2);

        assertEquals(2, arroz.ciclosPorAnio());
    }

    @Test
    void debeDevolverElNombreComun() {
        Arroz arroz = new Arroz(2);

        assertEquals("Arroz (2 ciclos/año)", arroz.nombreComun());
    }

}