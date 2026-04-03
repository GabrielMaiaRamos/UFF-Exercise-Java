import java.util.Scanner;

public class ex01_L2 {
    public static float ConstanteConversao = 1.8f;

    public static void main(String[] args) {
        int a, b;
        System.out.printf("Escreva A e B: ");
        Scanner kb = new Scanner(System.in);
        a = kb.nextInt();
        b = kb.nextInt();

        System.out.printf("A + B = %d\n", a + b);
        System.out.printf("A - B = %d\n", a - b);
        System.out.printf("A * B = %d\n", a * b);
        System.out.printf("A / B = %d\n", a / b);
        kb.close();
    }
}