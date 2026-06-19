import java.util.Scanner;
import java.util.InputMismatchException;

public class MainSomador {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Somador somador = new Somador();

        while (true) {
            System.out.print("Digite um numero: ");
            try {

                int numero = kb.nextInt();
                if (numero <= 0)
                    break;
                somador.adicionar(numero);
            } catch (InputMismatchException error) {
                System.out.println("ERRO: Entrada invalida!");
                kb.nextLine();
            }
        }
        System.out.println("O somatório dos números é: " + somador.getSomatorio());
        kb.close();
    }
}