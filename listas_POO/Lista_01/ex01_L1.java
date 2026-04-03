import java.util.Scanner;

public class ex01_L1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = kb.nextLine();
        System.out.println("Ola " + nome + "! Bem vindo ao Java!");
        kb.close();
    }
}