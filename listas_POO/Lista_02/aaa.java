import java.util.Scanner;
import java.util.Random;

public class aaa {
    public static void main(String[] args) {
        // System.out.println(randomizar());
        // Scanner kb = new Scanner(System.in);
        // System.out.print("Digite A e B: ");
        // int a = kb.nextInt();
        // int b = kb.nextInt();
        // operacoes(a, b);
        // tradeCast(a, b);

        // System.out.print("Digite tempo em segundos: ");
        // int seg = kb.nextInt();
        // time(seg);

        // System.out.print("Distancia percorrida: ");
        // float dist = kb.nextFloat();
        // System.out.print("Tempo gasto: ");
        // float time = kb.nextFloat();
        // System.out.print("Gasolina gasta: ");
        // float gas = kb.nextFloat();
        // car (dist, time, gas);

        // kb.close();
        // System.out.printf("%s\n", triangle());
        // calculadora();
        // ex02();
        ex03();
    }

    public static int randomizar() {
        Random rand = new Random();
        int num = rand.nextInt(1, 38);
        return num;
    }

    public static void operacoes(int A, int B) {
        System.out.printf("A + B = %d\n", A + B);
        System.out.printf("A - B = %d\n", A - B);
        System.out.printf("A * B = %d\n", A * B);
        System.out.printf("A / B = %d\n", A / B);
    }

    public static void tradeCast(int a, int b) {
        float a2 = (float) a;
        float b2 = (float) b;
        System.out.printf("A and B in float: %.2f, %.2f\n", a2, b2);
    }

    public static void time(int seg) {
        int min = seg / 60;
        seg %= 60;
        int hr = min / 60;
        min %= 60;
        System.out.printf("%d hr, %d min, %d sec\n\n", hr, min, seg);
    }

    public static void car(float dist, float time, float gas) {
        float Vm = dist / time;
        float Gm = dist / gas;
        System.out.printf("Velocidade Media: %.2fKm/h, Consumo de Combustivel: %.2fKm/L\n", Vm, Gm);
    }

    // public static String triangle() {
    // Scanner kb = new Scanner(System.in);
    // float A, B, C, l1, l2, l3;
    // System.out.print("Digite Ax, By, Bx, By e Cx, Cy:");
    // A = kb.nextFloat();
    // B = kb.nextFloat();
    // C = kb.nextFloat();
    // l1 = Math.sqrt(A*A + B*B)
    // kb.close();
    // if (A <= B+C && B <= C+B && C <= A+B){
    // if (A == B && B == C)
    // return "Equilatero";
    // else if(A != B && A != C && B != C)
    // return "Escaleno";
    // else
    // return "Isosceles";
    // }
    // else
    // return "Nao eh triangulo!";
    // }

    public static void calculadora() {
        Scanner kb = new Scanner(System.in);
        System.out.printf("Digite o numero pra tabuada: ");
        int num;
        num = kb.nextInt();
        kb.close();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);
        }
    }

    public static void ex02() {
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

    public static void ex03() {
        String palavra, minusc;
        int count = 0;
        Scanner kb = new Scanner(System.in);
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
