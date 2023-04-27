//3 - Escreva um programa que c+wie um vetor de inteiros e preencha com valores digitados pelo usuário.
//        Em seguida, o programa deve remover todos os valores iguais a zero e exibir os valores restantes.

package nivelintermediario;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class exe3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int contzero = 0;

        System.out.print("How many numbers will be in the vector? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        System.out.println("\nVector:");

        for (int i = 0; i < vect.length; i++) {

            sc.nextLine();
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();

            if (vect[i] == 0){
                contzero++;
            }
        }

        int[] newvect = new int[vect.length - contzero];

        for (int i = 0, j = 0; i < vect.length; i++) {
            if (vect[i] != 0) {
                newvect[j] = vect[i];
                j++;
            }
        }

        System.out.println("New list:");
        System.out.printf(Arrays.toString(newvect));

        sc.close();
    }
}