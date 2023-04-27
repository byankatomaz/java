package AulaLeo;

import java.util.Scanner;

public class MathPow {
    public static void main(String[] args){

        Scanner antiga = new Scanner(System.in);
        float valor, cubo, qua;

        System.out.print("Diga o valor que quer calcular: ");
        valor = antiga.nextInt();
        qua = (float)Math.pow(valor, 2);
        cubo = (float) Math.pow(valor, 3);

        System.out.printf("\nO valor ao quadrado é: %.1f", qua);
        System.out.printf("\nO valor ao cubo é: %.1f", cubo);
    }
}
