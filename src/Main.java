//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Total: " + Dispositivo.getTotalCreados());

        Dispositivo di1 = new Dispositivo("teclado", "entrada");
        System.out.println("Total: " + Dispositivo.getTotalCreados());

        Dispositivo di2 = new Dispositivo("monitor", "salida");
        Dispositivo di3 = new Dispositivo("impresora", "salida");
        System.out.println("Total: " + Dispositivo.getTotalCreados());

        System.out.println();
        System.out.println("ID " + di1.getId() + ": " + di1.getNombre() + " - " + di1.getTipo());
        System.out.println("ID " + di2.getId() + ": " + di2.getNombre() + " - " + di2.getTipo());
        System.out.println("ID " + di3.getId() + ": " + di3.getNombre() + " - " + di3.getTipo());
    }
}