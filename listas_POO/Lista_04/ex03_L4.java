import java.util.Scanner;

public class ex03_L4 {
    public static void main(String[] args) {
        int n, k, p;
        int[] vet;
        Scanner kb = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        n = kb.nextInt();
        if (n == 0) {
            System.out.print("vetor nulo!");
            System.exit(1);
        }
        vet = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Digite o numero %d: ", i + 1);
            vet[i] = kb.nextInt();
        }
        for (int i = 0; i < n; i++)
            System.out.printf("%d - ", vet[i]);
        System.out.print("\n");
        System.out.print("Digite o numero pra inserir: ");
        k = kb.nextInt();
        System.out.print("Digite a posicao do numero: ");
        p = kb.nextInt();
        if (p - 1 > n) {
            System.out.print("P fora de alcance");
            System.exit(1);
        }

        for (int i = n - 1; i > p - 1; i--) {
            vet[i] = vet[i - 1];
        }
        vet[p - 1] = k;
        for (int i = 0; i < n; i++)
            System.out.printf("%d - ", vet[i]);
        kb.close();
    }
}
