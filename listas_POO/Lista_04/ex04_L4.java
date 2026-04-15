import java.util.Scanner;

public class ex04_L4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int tempInt, NUM = 3;
        String tempStr;
        int[] idades = new int[NUM];
        String[] nomes = new String[NUM];
        for (int i = 0; i < NUM; i++) {
            System.out.printf("Digite o nome da pessoa %d: ", i + 1);
            nomes[i] = kb.nextLine();
            System.out.printf("Digite a idade da pessoa %d: ", i + 1);
            idades[i] = kb.nextInt();
            kb.nextLine();
        }

        for (int i = 0; i < NUM - 1; i++) {
            for (int j = 0; j < NUM - i - 1; j++) {
                if (idades[j] > idades[j + 1]) {
                    tempInt = idades[j];
                    idades[j] = idades[j + 1];
                    idades[j + 1] = tempInt;

                    tempStr = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempStr;
                }
            }
        }
        System.out.println("Ordenacao por nomes: ");
        for (int i = 0; i < NUM; i++)
            System.out.printf("Nome: %s, Idade: %d\n", nomes[i], idades[i]);

        for (int i = 0; i < NUM - 1; i++) {
            for (int j = 0; j < NUM - 1 - i; j++) {
                if (nomes[j].compareTo(nomes[j + 1]) > 0) {
                    tempStr = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = tempStr;

                    tempInt = idades[j];
                    idades[j] = idades[j + 1];
                    idades[j + 1] = tempInt;
                }
            }
        }
        System.out.println("Ordenacao por idade: ");
        for (int i = 0; i < NUM; i++)
            System.out.printf("Nome: %s, Idade: %d\n", nomes[i], idades[i]);
        kb.close();
    }
}