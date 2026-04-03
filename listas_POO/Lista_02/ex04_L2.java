import java.util.Scanner;

public class ex04_L2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Distancia percorrida: ");
        float dist = kb.nextFloat();
        System.out.print("Tempo gasto: ");
        float time = kb.nextFloat();
        System.out.print("Gasolina gasta: ");
        float gas = kb.nextFloat();

        kb.close();

        float Vm = dist / time;
        float Gm = dist / gas;

        System.out.printf("Velocidade Media: %.2fKm/h, Consumo de Combustivel: %.2fKm/L\n", Vm, Gm);
    }
}
