import java.util.Scanner;

public class ex03_L3 {
    public static void main(String[] args) {
        String palavra, minusc;
        int count = 0;
        Scanner kb = new Scanner(System.in);

        System.out.print("Digite a palavra: ");
        palavra = kb.nextLine();
        minusc = palavra.toLowerCase();

        System.out.printf("Total de caracteres: %d\n", palavra.length());
        System.out.printf("Em maiusculo: %s\n", palavra.toUpperCase());
        System.out.printf("Em minusculo: %s\n", minusc);

        for (int i = 0; i < palavra.length(); i++)
            if (minusc.charAt(i) == 'a')
                count++;
        System.out.printf("Contagem de 'A': %d\n", count);

        kb.close();
    }
}
