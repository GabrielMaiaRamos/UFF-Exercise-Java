import java.util.Scanner;

public class ex02_L3 {
    public static void main(String[] args) {

        // a solucao correta eh a A
        // o codigo da B corrigido seria

        Scanner kb = new Scanner(System.in);
        int codigo;

        do {
            System.out.println("Informe o codigo: ");
            codigo = kb.nextInt();
            if (codigo != -1)
                System.out.printf("codigo: %d\n", codigo);
        } while (codigo != -1);

        kb.close();
    }
}
