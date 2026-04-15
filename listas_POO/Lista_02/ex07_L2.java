import java.util.Scanner;

public class ex07_L2 {
    public static void main(String[] args) {
        int menor, maior, n;
        Scanner kb = new Scanner(System.in);
        System.out.print("Digite o menor e o maior do intervalo: ");
        menor = kb.nextInt();
        maior = kb.nextInt();
        System.out.print("Digite o 'n' para saber se esta dentro do intervalo: ");
        n = kb.nextInt();
        if (n < menor)
            System.out.printf("O numero (%d) esta ANTES do intervalo (%d - %d)\n", n, menor, maior);
        else if (n > maior)
            System.out.printf("O numero (%d) esta DEPOIS do intervalo (%d - %d)\n", n, menor, maior);
        else
            System.out.printf("O numero (%d) esta DENTRO do intervalo (%d - %d)\n", n, menor, maior);
        kb.close();
    }
}
