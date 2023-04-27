package AulaLeo;

//Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

import java.util.Scanner;

public class AreaTriang {
    public static void main(String[] args){
        int base, altura, area;

        Scanner vulgo = new Scanner(System.in);

        System.out.println("Digite o valor da base do triângulo: ");
        base = vulgo.nextInt();

        System.out.println("Digite o valor da altura do triângulo: ");
        altura = vulgo.nextInt();

        area = (base*altura)/2;

        System.out.println("A area do triângulo é: " + area);

    }
}

