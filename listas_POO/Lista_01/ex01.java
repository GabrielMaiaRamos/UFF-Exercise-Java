import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Type your name: ");
        String nome = kb.nextLine();
        System.out.println("Hello " + nome + "! Welcome to Java!");
        kb.close();
    }
}