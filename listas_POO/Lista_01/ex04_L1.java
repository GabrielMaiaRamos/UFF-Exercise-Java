import java.util.Scanner;

public class ex04_L1 {
    public static void main(String[] args) {
        int cents, vN;
        Scanner kb = new Scanner(System.in);
        System.out.print("Digite o valor em centavos: ");
        cents = kb.nextInt();

        if (cents >= 100) {
            vN = cents / 100;
            cents = cents % 100;
            System.out.println(vN + " moeda de 1 real");
        }
        if (cents >= 50) {
            vN = cents / 50;
            cents = cents % 50;
            System.out.println(vN + " moeda de 50 centavos");
        }
        if (cents >= 25) {
            vN = cents / 25;
            cents = cents % 25;
            System.out.println(vN + " moeda de 25 centavos");
        }
        if (cents >= 10) {
            vN = cents / 10;
            cents = cents % 10;
            System.out.println(vN + " moeda(s) de 10 centavos");
        }
        if (cents >= 5) {
            vN = cents / 5;
            cents = cents % 5;
            System.out.println(vN + " moeda de 5 centavos");
        }
        vN = cents;
        System.out.println(vN + " moeda(s) de 1 centavo");
        kb.close();
    }
}