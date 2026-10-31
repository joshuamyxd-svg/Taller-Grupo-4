
package ec.edu.uagraria.prog3;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraCostosTest {

    private Lote loteBanano() {
        return new Lote("L-01", new Banano("Cavendish"), 4.0, List.of(
                new Insumo("Urea 50 kg", 12, "saco", 32.50),
                new Insumo("Fungicida", 8, "litro", 21.75),
                new Insumo("Semilla certificada", 1, "lote", 180.00)
        ));
    }

    // PRUEBA 1: Costo directo
    @Test
    void costoDirectoSumaLosInsumos() {
        var calc = new CalculadoraCostos(Estrategias.costoDirecto());

        assertEquals(744.00,
                calc.calcular(loteBanano()).orElseThrow(), 0.01);
    }

    // PRUEBA 2: Costo con mano de obra
    @Test
    void costoConManoDeObraSumaJornales() {
        var lote = loteBanano();
        var calc = new CalculadoraCostos(
                Estrategias.costoConManoDeObra());

        double esperado = lote.costoInsumos()
                + lote.jornalesPorHectarea()
                * lote.hectareas() * Estrategias.VALOR_JORNAL;

        assertEquals(esperado,
                calc.calcular(lote).orElseThrow(), 0.01);
    }

    // PRUEBA 3: Costo por hectárea
    @Test
    void costoPorHectareaCalculaCorrectamente() {
        var lote = loteBanano();
        var calc = new CalculadoraCostos(
                Estrategias.costoPorHectarea());

        double esperado = Estrategias.costoConManoDeObra()
                .calcular(lote) / lote.hectareas();

        assertEquals(esperado,
                calc.calcular(lote).orElseThrow(), 0.01);
    }

    // PRUEBA 4: Costo con subsidio de fertilizante
    @Test
    void costoConSubsidioDescuentaLaUrea() {
        var lote = loteBanano();
        double porcentaje = 0.10;

        var calc = new CalculadoraCostos(
                Estrategias.costoConSubsidioFertilizante(porcentaje));

        double descuento = lote.insumos().stream()
                .filter(i -> i.nombre().toLowerCase().contains("urea"))
                .mapToDouble(Insumo::costo)
                .sum() * porcentaje;

        double esperado = Estrategias.costoConManoDeObra()
                .calcular(lote) - descuento;

        assertEquals(esperado,
                calc.calcular(lote).orElseThrow(), 0.01);
    }

    // PRUEBA 5: Costo con IVA
    @Test
    void costoConIvaAplicaElPorcentajeCorrectamente() {
        var lote = loteBanano();
        var calc = new CalculadoraCostos(
                Estrategias.conIva(Estrategias.costoDirecto()));

        double esperado = lote.costoInsumos()
                * (1 + Estrategias.IVA);

        assertEquals(esperado,
                calc.calcular(lote).orElseThrow(), 0.01);
    }

    // PRUEBA 6: Optional vacío cuando no existe estrategia
    @Test
    void sinEstrategiaDevuelveOptionalVacio() {
        var calc = new CalculadoraCostos();

        assertTrue(calc.calcular(loteBanano()).isEmpty());
    }
}
