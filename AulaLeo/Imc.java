package AulaLeo;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args){

        Scanner nova = new Scanner(System.in);
        int peso;
        float altura, imc;

        System.out.print("Digite o seu peso: ");
        peso = nova.nextInt();
        System.out.print("Digite a sua altura: ");
        altura = nova.nextFloat();

        imc = (float) (peso / (Math.pow(altura, 2)));

        System.out.printf("Seu imc é: %.2f\n", imc);

        if (imc < 18.5){
            System.out.println("Magreza extrema");
        }else if (imc == 18 || imc <= 24.9){
            System.out.println("Peso Normal");
        }else if (imc == 25.0 || imc <= 29.9) {
            System.out.println("Excesso de peso");
        }else if (imc == 30 || imc <= 34.5) {
            System.out.println("Obsidade Classe I");
        }else if (imc == 35.0 || imc <= 39.9) {
            System.out.println("Obsidade Classe II");
        }else{
            System.out.println("Obsidade Calsse III");
        }

    }
}
