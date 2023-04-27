//Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

package AulaLeo;

import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int cel, fah;

        System.out.print("Digite os graus em Fahrenheit que quer converter: ");
        fah = entrada.nextInt();

        int i = (fah - 32) / 9;
        cel = 5 * i;

        System.out.println("Esse grau em Celsius é: "+ cel);

    }
}
