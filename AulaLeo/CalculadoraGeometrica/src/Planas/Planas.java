package Planas;//Triângulo Equilatero, Planas.Quadrado, Planas.Retangulo, Planas.Circulo, Planas.Hexagono


import FigurasGeometricas.FigurasGeometricas;

public class Planas extends FigurasGeometricas {

    @Override
    public Double area() {
        return comprimento * altura;
    }

    @Override
    public Double perimetro() {
        return (comprimento*2) + (altura*2);
    }
}
