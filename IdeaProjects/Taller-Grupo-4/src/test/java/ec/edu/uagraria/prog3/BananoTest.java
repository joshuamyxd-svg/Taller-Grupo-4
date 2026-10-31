package ec.edu.uagraria.prog3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class BananoTest {

    @Test
    void guardaLaVariedad() {
        assertEquals("Cavendish", new Banano("Cavendish").variedad());
    }

    @Test
    void nombreComunEsBananoMasVariedad() {
        assertEquals("Banano Cavendish", new Banano("Cavendish").nombreComun());
    }

    @Test
    void igualdadPorVariedad() {
        assertEquals(new Banano("Cavendish"), new Banano("Cavendish"));
        assertNotEquals(new Banano("Cavendish"), new Banano("Gros Michel"));
    }
}