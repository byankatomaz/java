//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

package AulaLeo;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cel, fah;

        System.out.print("Digite o grau em Celsius que quer converter: ");
        cel = sc.nextInt();

        fah = (int) ((cel*1.8)+32);

        System.out.println("Esse grau em Fahrenheit é: " + fah);

    }
}

