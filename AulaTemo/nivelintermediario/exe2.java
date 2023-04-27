//2 - Escreva um programa que crie um vetor de inteiros e preencha com valores aleatórios.
//        Em seguida, o programa deve criar um segundo vetor com os mesmos valores do primeiro vetor, porém na ordem inversa.
//        Por fim, o programa deve exibir os valores dos dois vetores.

package nivelintermediario;

import java.util.Arrays;
import java.util.Random;

public class exe2 {

    public static void main(String[] args) {

        int tam = 10;
        int[] vect = new int[tam];
        int[] invect = new int[tam];

        Random ale = new Random();

        for (int i = 0; i < vect.length; i++) {
            int num = ale.nextInt(100);
            vect[i] = num;
        }

        Arrays.sort(vect);

        for (int i = 0; i < vect.length; i++) {
            invect[9 - i] = vect[i];
        }

        System.out.println("Normal list:");
        System.out.printf(Arrays.toString(vect));
        System.out.println();
        System.out.println("Inverted list");
        System.out.printf(Arrays.toString(invect));


    }

}
