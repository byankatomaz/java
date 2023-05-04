package Espaciais;//Espaciais.Cubo, paralelepipedo, Espaciais.Esfera, Piramide de Base quadrada, cilindro, cone

import FigurasGeometricas.FigurasGeometricas;

public class Espaciais extends FigurasGeometricas {

    public Espaciais() {
        super();
    }

    @Override
    public Double area() {
        return 6 * Math.pow(comprimento, 2);
    }

    @Override
    public Double perimetro() {
        return null;
    }

    public Double volume() {
        return area()*3;
    }
}
