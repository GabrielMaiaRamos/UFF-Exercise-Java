import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        int number;
        Scanner kb = new Scanner(System.in);
        System.out.print("Type a number: ");
        number = kb.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " its even");
        else
            System.out.println(number + " its odd");
        kb.close();
    }
}
