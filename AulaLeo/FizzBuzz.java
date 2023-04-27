package AulaLeo;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, divisao2, divisao5;

        System.out.print("Digite um número para verificar se é múltiplo de 2 ou 5: ");
        num = sc.nextInt();

        divisao2 = num % 2;
        divisao5 = num % 5;

        if (divisao2 == 0 && divisao5 == 0){
            System.out.println("FizzBuzz");
        } else if (divisao2 == 0) {
            System.out.println("Fizz");
        } else if (divisao5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("ERRO!");
        }
    }
}

