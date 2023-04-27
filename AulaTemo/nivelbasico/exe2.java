//2 - Escreva um programa que crie um vetor de inteiros e preencha com valores aleatórios.
//        Em seguida, o programa deve exibir o maior valor presente no vetor.

package nivelbasico;

import java.util.Arrays;
import java.util.Random;

public class exe2 {

        public static void main(String[] args) {

                int tam = 10;
                int[] matriz = new int[tam];
                int maior = matriz[0];

                Random ale = new Random();

                for (int i = 0; i < matriz.length; i++) {
                        int num = ale.nextInt(100);
                        matriz[i] = num;
                        if(matriz[i] > maior){
                                maior = matriz[i];
                        }
                }

                System.out.println("\nO maior valor do vetor é: " + maior);
                System.out.println("Os valores gerados: ");
                System.out.println(Arrays.toString(matriz));

        }
}

