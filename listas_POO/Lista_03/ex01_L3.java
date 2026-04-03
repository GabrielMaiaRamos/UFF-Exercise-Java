import java.util.Scanner;

public class ex01_L3 {

    public static void main(String[] args) {
        int num;
        Scanner kb = new Scanner(System.in);

        System.out.printf("Digite o numero pra tabuada: ");
        num = kb.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }

        kb.close();
    }
}
