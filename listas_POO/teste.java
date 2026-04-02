package listas_POO;

import java.util.Scanner;

public class teste {
    public static float ConstanteConversao = 1.8f;

    public static void main(String[] args) {
        int number, cents, vN;
        float grausC, grausF;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type your name: ");
        String nome = keyboard.nextLine();
        System.out.println("Hello " + nome + "! Welcome to Java!");

        System.out.println("=================");

        System.out.print("Type the temperature in Celsius: ");
        grausC = keyboard.nextFloat();
        grausF = ConstanteConversao * grausC + 32;
        System.out.println(grausC + "°C = " + grausF + "°F");

        System.out.println("=================");

        System.out.print("Type a number: ");
        number = keyboard.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " its even");
        else
            System.out.println(number + " its odd");

        System.out.println("=================");

        System.out.print("Type a value in cents: ");
        cents = keyboard.nextInt();

        if (cents >= 100) {
            vN = cents / 100;
            cents = cents % 100;
            System.out.println(vN + " moedas de 1 real");
        }
        if (cents >= 50) {
            vN = cents / 50;
            cents = cents % 50;
            System.out.println(vN + " moedas de 50 centavos");
        }
        if (cents >= 25) {
            vN = cents / 25;
            cents = cents % 25;
            System.out.println(vN + " moedas de 25 centavos");
        }
        if (cents >= 10) {
            vN = cents / 10;
            cents = cents % 10;
            System.out.println(vN + " moedas de 10 centavos");
        }
        if (cents >= 5) {
            vN = cents / 5;
            cents = cents % 5;
            System.out.println(vN + " moedas de 5 centavos");
        }
        vN = cents;
        System.out.println(vN + " moedas de 1 centavo");
        keyboard.close();
    }

}