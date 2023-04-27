//3 - Escreva um programa que crie dois vetores de inteiros do mesmo tamanho e preencha com valores digitados pelo usuário.
//        Em seguida, o programa deve calcular e exibir a soma dos valores presentes em cada posição dos vetores, ou seja,
//        somar a posição 0 de um vetor com a posição 0 de outro vetor, assim por diante e apresentar para o usuário..

package nivelbasico;

import java.util.Locale;
import java.util.Scanner;

public class exe3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will be in the vectors? ");
        int n = sc.nextInt();

        int[] vect1 = new int[n];
        int[] vect2 = new int[n];

        System.out.println("\nVector 1:");

        for (int i = 0; i < vect1.length; i++) {

            sc.nextLine();
            System.out.print("Enter a number: ");
            vect1[i] = sc.nextInt();
        }

        System.out.println("\nVector 2:");

        for (int i = 0; i < vect2.length; i++) {

            sc.nextLine();
            System.out.print("Enter a number: ");
            vect2[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = vect1[i] + vect2[i];
            System.out.printf("\nSum between position %d: %d", i, sum);
        }

        sc.close();
    }
}
