package Espaciais;

public class Paralelepipedo extends Espaciais{

    protected Double largura;

    public Paralelepipedo(){
        super();
    }

    public Paralelepipedo(Double comprimento, Double altura, Double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public Double area() {
        return 2*(comprimento*largura + largura * altura + comprimento * altura);
    }

    public Double volume() {
        return comprimento * largura * altura;
    }

}
