import java.util.Scanner;

public class ex02 {
    public static float ConstanteConversao = 1.8f;

    public static void main(String[] args) {
        float grausC, grausF;
        Scanner kb = new Scanner(System.in);
        System.out.print("Type the temperature in Celsius: ");
        grausC = kb.nextFloat();
        grausF = ConstanteConversao * grausC + 32;
        System.out.println(grausC + "°C = " + grausF + "°F");
        kb.close();
    }
}