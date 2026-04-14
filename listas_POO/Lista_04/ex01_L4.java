import java.util.Scanner;

public class ex01_L4 {
    public static void main(String[] args) {
        int n;
        float media = 0;
        float[] notas;
        Scanner kb = new Scanner(System.in);
        System.out.print("Escreva a qnt de alunos: ");
        n = kb.nextInt();
        notas = new float[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Escreva a nota do aluna %d: ", i + 1);
            notas[i] = kb.nextFloat();
            media += notas[i];
        }
        media /= n;
        System.out.printf("Alunos acima da media (%.2f)\n", media);
        for (int i = 0; i < n; i++) {
            if (notas[i] >= media)
                System.out.println(notas[i]);
        }
        kb.close();
    }
}