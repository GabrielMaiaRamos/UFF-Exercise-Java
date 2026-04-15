import java.util.Scanner;

public class ex06_L2 {
    public static void main(String[] args) {
        int quant;
        float preco;
        String nome;
        Scanner kb = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        nome = kb.nextLine();
        System.out.print("Digite a quantidade de produto: ");
        quant = kb.nextInt();
        System.out.print("Digite o preco do produto: ");
        preco = kb.nextFloat();
        if (quant >= 11 && quant <= 20)
            preco *= 0.9;
        else if (quant >= 21 && quant <= 50)
            preco *= 0.8;
        else if (quant >= 51)
            preco *= 0.75;
        System.out.printf("Produto: %s\nPreco: %.2f\n", nome, preco);
        kb.close();
    }
}
