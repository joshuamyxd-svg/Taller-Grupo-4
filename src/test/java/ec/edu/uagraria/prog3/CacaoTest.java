package ec.edu.uagraria.prog3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CacaoTest {

    @Test
    void guardaVariedadYOrganico() {
        Cacao cacao = new Cacao("Nacional", true);

        assertEquals("Nacional", cacao.variedad());
        assertTrue(cacao.organico());
    }

    @Test
    void nombreComunEsCacaoMasVariedad() {
        assertEquals("Cacao Nacional", new Cacao("Nacional", false).nombreComun());
    }

    @Test
    void cacaoNoOrganicoSeReportaComoTal() {
        assertFalse(new Cacao("CCN-51", false).organico());
    }

    @Test
    void igualdadConsideraTodosLosCampos() {
        assertEquals(new Cacao("Nacional", true), new Cacao("Nacional", true));
        assertNotEquals(new Cacao("Nacional", true), new Cacao("Nacional", false));
    }
}