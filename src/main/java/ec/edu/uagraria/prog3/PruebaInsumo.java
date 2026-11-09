
package ec.edu.uagraria.prog3;

import ec.edu.uagraria.prog3.dominio.Insumo;

public class PruebaInsumo {
    public static void main(String[] args) {
        Insumo urea = new Insumo("Urea", 12, "sacos", 32.50);

        System.out.println("Insumo: " + urea.nombre());
        System.out.println("Costo total: " + urea.costo());
    }
}

