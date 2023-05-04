package AtividadeTemoteo;

public abstract class Contas {

    protected Double a;
    protected Double b;

    public Contas() {
    }

    public Contas(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Contas(Double b) {
        this.b = b;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public abstract Double formulaOne();
}
