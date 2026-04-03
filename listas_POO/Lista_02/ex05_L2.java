import java.util.Scanner;

public class ex05_L2 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double Ax, Ay, Bx, By, Cx, Cy, l1, l2, l3;

        System.out.print("Digite Ax e Ay: ");
        Ax = kb.nextDouble();
        Ay = kb.nextDouble();
        System.out.print("Digite Bx e By: ");
        Bx = kb.nextDouble();
        By = kb.nextDouble();
        System.out.print("Digite Cx e Cy: ");
        Cx = kb.nextDouble();
        Cy = kb.nextDouble();
        kb.close();

        l1 = Math.sqrt((Bx - Ax) * (Bx - Ax) + (By - Ay) * (By - Ay));
        l2 = Math.sqrt((Cx - Ax) * (Cx - Ax) + (Cy - Ay) * (Cy - Ay));
        l3 = Math.sqrt((Cx - Bx) * (Cx - Bx) + (Cy - By) * (Cy - By));

        if (l1 <= l2 + l3 && l2 <= l3 + l2 && l3 <= l1 + l2) {
            if (l1 == l2 && l2 == l3)
                System.out.print("Equilatero");
            else if (l1 != l2 && l1 != l3 && l2 != l3)
                System.out.print("Escaleno");
            else
                System.out.print("Isosceles");
        } else
            System.out.print("Nao eh triangulo!");
    }
}
