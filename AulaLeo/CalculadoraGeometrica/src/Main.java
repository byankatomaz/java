import Espaciais.*;
import Planas.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Comprimento: ");
        double comprimeto = sc.nextDouble();

        System.out.print("Largura: ");
        double largura = sc.nextDouble();

//        Planas triangulo = new Triangulo(comprimeto, altura);
//        Planas quadrado = new Quadrado(comprimeto, altura);
//
//        System.out.printf("Area triangulo: %.2f", triangulo.area());
//        System.out.printf("\nPerimetro triangulo: %.2f\n", triangulo.perimetro());
//
//        System.out.printf("\nArea quadrado: %.2f", quadrado.area());
//        System.out.printf("\nPerimetro quadrado: %.2f\n", quadrado.perimetro());
//
//        System.out.print("\nDiga o valor do raio: ");
//        double raio = sc.nextDouble();
//
//        Planas circulo = new Circulo(raio);
//
//        System.out.printf("\nArea circulo: %.2f", circulo.area());
//        System.out.printf("\nPerimetro circulo: %.2f\n", circulo.perimetro());
//
//        Planas hexagono = new Hexagono(comprimeto);
//        System.out.printf("\nArea hexagono: %.2f", hexagono.area());
//        System.out.printf("\nPerimetro hexagono: %.2f\n", hexagono.perimetro());


        Espaciais cubo = new Cubo(comprimeto, altura);
        Espaciais paralele = new Paralelepipedo(comprimeto, altura, largura);

        System.out.printf("\nArea cubo: %.2f", cubo.area());
        System.out.printf("\nvolume cubo: %.2f\n", cubo.volume());

        System.out.printf("\nArea cubo: %.2f", paralele.area());
        System.out.printf("\nvolume cubo: %.2f\n", paralele.volume());

    }
}