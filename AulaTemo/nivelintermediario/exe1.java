//1 - Escreva um programa que crie um vetor de inteiros e preencha com valores digitados pelo usuário.
//        Em seguida, o programa deve ordenar o vetor em ordem crescente e exibir os valores ordenados.

package nivelintermediario;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will be in the vect? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        System.out.println("\nVector:");

        for (int i = 0; i < vect.length; i++) {

            sc.nextLine();
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        System.out.print("\nOrder list:");

        Arrays.sort(vect);

        for (int i = 0; i < n; i++) {
            System.out.printf(" %d", vect[i]);
        }

        sc.close();
    }
}
