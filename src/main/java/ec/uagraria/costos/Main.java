
package ec.uagraria.costos;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Lote lote = new Lote(
                "L-01",
                new Banano("Cavendish"),
                4.0,
                List.of(
                        new Insumo("Urea 50 kg", 12, "saco", 32.50),
                        new Insumo("Fungicida", 8, "litro", 21.75),
                        new Insumo("Semilla certificada", 1, "lote", 180.00)
                )
        );

        CalculadoraCostos calc = new CalculadoraCostos();

        System.out.println("Sin estrategia: " + calc.calcular(lote));

        calc.setEstrategia(Estrategias.costoDirecto());
        System.out.println("Costo directo: USD "
                + calc.calcular(lote).map(CalculadoraCostos::redondear)
                .orElseThrow());

        calc.setEstrategia(Estrategias.costoConManoDeObra());
        System.out.println("Con mano de obra: USD "
                + calc.calcular(lote).map(CalculadoraCostos::redondear)
                .orElseThrow());

        calc.setEstrategia(Estrategias.costoPorHectarea());
        System.out.println("Por hectárea: USD "
                + calc.calcular(lote).map(CalculadoraCostos::redondear)
                .orElseThrow());

        calc.setEstrategia(
                Estrategias.costoConSubsidioFertilizante(0.20));
        System.out.println("Con subsidio: USD "
                + calc.calcular(lote).map(CalculadoraCostos::redondear)
                .orElseThrow());

        calc.setEstrategia(
                Estrategias.conIva(Estrategias.costoConManoDeObra()));
        System.out.println("Con IVA: USD "
                + calc.calcular(lote).map(CalculadoraCostos::redondear)
                .orElseThrow());
    }
}
