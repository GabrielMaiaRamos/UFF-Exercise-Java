import java.util.Scanner;

public class ex03_L1 {
    public static void main(String[] args) {
        int num;
        Scanner kb = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        num = kb.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " its even");
        else
            System.out.println(num + " its odd");
        kb.close();
    }
}
