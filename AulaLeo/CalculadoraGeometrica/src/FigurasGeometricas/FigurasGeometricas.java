package FigurasGeometricas;

public abstract class FigurasGeometricas {

    protected  Double comprimento;
    protected Double altura;

    public FigurasGeometricas(){
    }

    public FigurasGeometricas(Double comprimento, Double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public abstract Double area();

    public abstract Double perimetro();

}
