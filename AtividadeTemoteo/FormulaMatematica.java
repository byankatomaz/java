package AtividadeTemoteo;

public class FormulaMatematica extends Contas{

    private Double c;
    private Double h;
    private Double r;

    public FormulaMatematica(Double a, Double b){
        super();
        this.a = a;
        this.b = b;
        this.h = a;
    }

    public FormulaMatematica(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public FormulaMatematica(Double r) {
        this.r = r;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    @Override
    public Double formulaOne() {
        //area retangulo
        return  b * h;
    }

    public Integer soma(){
        return (int) (a + b);
    }

    public Integer subt(){
        return (int) (a - b);
    }

    public Integer mult(){
        return (int) (a * b);
    }

    public Double div(){
        return a / b;
    }

    public Double formulaTria(){
        Double a = (b * h) / 2;

        return a;
    }

    public Double formulaCirc(){
        Double a = Math.PI * Math.pow(r, 2);

        return a;
    }

    public Double formulaBhask1(){

        double delta = Math.pow(b, 2) - 4 * a * c;

        Double x1 = ((-b) - Math.sqrt(delta))/ (2*a);

        return x1;
    }

    public Double formulaBhask2(){

        double delta = Math.pow(b, 2) - 4 * a * c;

        double x2 = ((-b) + Math.sqrt(delta))/ (2*a);

        return x2;
    }

    public String totalBhask(){

        return String.format ("\nO X1 é: %.2f\n" +
                "O X2: %.2f\n", formulaBhask1(), formulaBhask2());
    }

    public String totalBasicos(){

        return String.format ("A soma deu: %d\n" +
                "A subtração deu: %d\n" +
                "A multiplicação  deu: %d\n" +
                "A divisão deu: %.2f\n", soma(), subt(), mult(), div());
    }
}
