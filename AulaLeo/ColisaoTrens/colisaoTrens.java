package AulaLeo.ColisaoTrens;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class colisaoTrens {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while (true){

            try{

                double tremA, tremB, veloA, veloB;

                System.out.print("Diga a posição inicial do Trem A (do Km 0 a 10.000): ");
                tremA = sc.nextDouble();

                while (tremA < 0 || tremA > 10000){
                    System.out.println("O número deve ser maior ou igual a zero e menor que 10000 ");
                    System.out.println("Por favor, digite novamente: ");
                    tremA = sc.nextDouble();
                }

                System.out.print("Diga a velocidade do Trem A (até 300 km/h): ");
                veloA = sc.nextDouble();

                while (veloA < 0 || veloA > 300){
                    System.out.println("A velocidade do trem A sempre será positiva. ");
                    System.out.println("Por favor, digite novamente: ");
                    veloA = sc.nextDouble();
                }

                System.out.print("Diga a posição inicial do Trem B (do Km 0 a 10.000): ");
                tremB = sc.nextDouble();

                while (tremB < 0 || tremB > 10000){
                    System.out.println("O número deve ser maior ou igual a zero e menor que 10000 ");
                    System.out.println("Por favor, digite novamente: ");
                    tremB = sc.nextDouble();
                }

                System.out.print("Diga a velocidade do Trem B (até -300 km/h): ");
                veloB = sc.nextDouble();

                while (veloB < -300 || veloB > 0){
                    System.out.println("A velocidade do trem B sempre será negativa. ");
                    System.out.println("Por favor, digite novamente: ");
                    veloB = sc.nextDouble();
                }

                DataTrens trens = new DataTrens(tremA, tremB, veloA, veloB);

                System.out.println();
                System.out.println(trens);

            } catch (InputMismatchException e){
                System.out.print("Você digitou caractere inválido. ");
                System.out.println("Por favor, tente novamente: ");
                sc.nextLine();
            }

        }
    }
}

