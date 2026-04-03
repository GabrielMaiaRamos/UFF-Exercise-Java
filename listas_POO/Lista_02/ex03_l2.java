import java.util.Scanner;

public class ex03_l2 {
    public static void main(String[] args) {
        int seg, min, hr;
        Scanner kb = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        seg = kb.nextInt();

        min = seg / 60;
        seg %= 60;
        hr = min / 60;
        min %= 60;
        System.out.printf("%d hr, %d min, %d sec\n\n", hr, min, seg);
        kb.close();
    }
}
