package Planas;

import Planas.Planas;

public class Hexagono extends Planas {

    public Hexagono(){
        super();
    }

    public Hexagono(Double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public Double area() {

        return (3*(Math.pow(comprimento, 2)*Math.sqrt(3)))/2;
    }

    @Override
    public Double perimetro() {
        return comprimento*6;
    }


}
