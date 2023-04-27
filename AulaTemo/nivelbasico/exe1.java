//1- Escreva um programa que crie um vetor de inteiros e preencha com valores digitados pelo usuário.
// Em seguida, o programa deve exibir o valor médio dos números armazenados no vetor.

package nivelbasico;

import java.util.Arrays;
import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner vetor = new Scanner(System.in);

        // Pedindo o tamanho do vetor ao usuário
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = vetor.nextInt();

        // Criando o vetor chamado matriz
        int[] matriz = new int[tamanho];

        // Preenchendo a matriz com valores digitados pelo usuário
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            matriz[i] = vetor.nextInt();
        }

        // Calculando o valor médio dos números armazenados no vetor
        int soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += matriz[i];
        }
        double media = (double) soma / tamanho;
        System.out.println("\nA média dos valores digitados: " + media);
        System.out.println("Os valores digitados: ");
        System.out.println(Arrays.toString(matriz));
        // Exibindo o valor médio dos números
    }
}