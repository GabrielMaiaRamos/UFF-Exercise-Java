import java.util.Scanner;

public class ex02_L2 {
    public static void main(String[] args) {
        int a, b;
        float a2, b2;
        Scanner kb = new Scanner(System.in);
        System.out.print("Escreva inteiros A e B: ");
        a = kb.nextInt();
        b = kb.nextInt();

        a2 = (float) a;
        b2 = (float) b;
        System.out.printf("A e B in float: %.2f, %.2f\n", a2, b2);
        kb.close();
    }
}
