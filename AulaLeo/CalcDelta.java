package AulaLeo;

import java.util.Scanner;

public class CalcDelta {

    public static void main(String[] args){

        int a, b, c, delta;

        Scanner deltinha = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        a = deltinha.nextInt();

        System.out.println("Digite o valor de b: ");
        b = deltinha.nextInt();

        System.out.println("Digite o valor de c: ");
        c = deltinha.nextInt();

        delta = b*b - 4*a*c;

        System.out.println("O valor de delta é: " + delta);

    }
}
