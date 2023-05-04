package Planas;

import Planas.*;

public class Triangulo extends Planas {

    public Triangulo(){
        super();
    }

    public Triangulo(Double comprimento, Double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    @Override
    public Double area() {
        return (comprimento * altura)/2;
    }

    @Override
    public Double perimetro() {
        return comprimento*3;
    }

}
