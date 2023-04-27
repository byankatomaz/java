package AulaLeo;

import java.util.Scanner;

public class ParImparSimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num, divisao;

        System.out.print("Digite um número para verificar se é par ou ímpar: ");
        num = sc.nextInt();

        divisao = num % 2;

        System.out.println((divisao == 0) ? "O número é par" : "O número é ímpar");

    }
}
