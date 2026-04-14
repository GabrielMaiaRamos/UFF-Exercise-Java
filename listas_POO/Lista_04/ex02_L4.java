import java.util.Scanner;

public class ex02_L4 {
    public static void main(String[] args) {
        int n, k;
        boolean isIn = false;
        int[] vetor;
        Scanner kb = new Scanner(System.in);
        System.out.print("Escreva a qnt de numeros do vetor: ");
        n = kb.nextInt();
        vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Escreva o numero %d: ", i + 1);
            vetor[i] = kb.nextInt();
        }
        System.out.print("Escreva 'k': ");
        k = kb.nextInt();
        for (int i = 0; i < n; i++) {
            if (vetor[i] == k) {
                System.out.printf("Indice %d possui o valor de k\n", i);
                isIn = true;
            }
        }
        if (!isIn)
            System.out.printf("Numero %d nao encontrado!\n", k);
        kb.close();
    }
}
