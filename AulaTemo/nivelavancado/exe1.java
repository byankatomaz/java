//1 - Escreva um programa que crie um vetor de inteiros e preencha com valores digitados pelo usuário.
//        Em seguida, o programa deve dividir o vetor em dois, um contendo os valores pares e outro contendo os valores ímpares.
//        Por fim, o programa deve exibir os dois vetores resultantes.

package nivelavancado;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int par = 0;

        System.out.print("How many numbers will be in the vector? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        System.out.println("\nVector:");

        for (int i = 0; i < vect.length; i++) {

            sc.nextLine();
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0){
                par++;
            }
        }

        int[] parvect = new int[par];
        int[] impvect = new int[vect.length - par];

        for (int i = 0, j = 0; i < vect.length; i++) {

            if (vect[i] % 2 == 0){
                parvect[j] = vect[i];
                j++;
            }impvect[j] = vect[i];
                j++;
        }

        System.out.println();
        System.out.println("Even list:");
        System.out.println(Arrays.toString(parvect));
        System.out.println("Odds list:");
        System.out.println(Arrays.toString(impvect));
    }
}
