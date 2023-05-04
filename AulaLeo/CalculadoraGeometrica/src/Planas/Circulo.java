package Planas;

import Planas.Planas;

public class Circulo extends Planas {

    private Double raio;

    public Circulo(){
        super();
    }

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public Double perimetro() {
        return 2 * Math.PI * raio;
    }

}
