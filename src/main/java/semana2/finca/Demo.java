package semana2.finca;

public class Demo {
    public static void main(String[] args) {
        java.util.List<Activo> activos = java.util.List.of(
                new Producto("PR-001", "Saco de urea 50 kg", 32.50, 40),
                new Cultivo("CU-001", "Cacao CCN-51", 3.5, 1800.0),
                new Animal("AN-001", "Bovino", 420.0, 1.85),
                new Animal("AN-002", "Camarón de Taura", 800.0, 4.20)   // activo propio: cámbienlo si quieren
        );

        double total = 0;
        for (Activo a : activos) {
            double v = Valorador.valor(a);
            total += v;
            System.out.printf("%s -> USD %.2f%n", a, v);
        }
        System.out.printf("Valor total de la finca: USD %.2f%n", total);
        System.out.println("10 qq = " + UnidadMedida.QUINTAL.aKilos(10) + " kg");
    }
}