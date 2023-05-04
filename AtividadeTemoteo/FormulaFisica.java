package AtividadeTemoteo;

public class FormulaFisica extends Contas{

    private Double veloA;
    private Double veloB;

    public FormulaFisica(){
        super();
    }

    public FormulaFisica(Double a, Double b, Double veloA, Double veloB) {
        super(a, b);
        this.veloA = veloA;
        this.veloB = veloB;
    }

    public Double getVeloA() {
        return veloA;
    }

    public void setVeloA(Double veloA) {
        this.veloA = veloA;
    }

    public Double getVeloB() {
        return veloB;
    }

    public void setVeloB(Double veloB) {
        this.veloB = veloB;
    }

    @Override
    public Double formulaOne() {
        return ((a - b) / (veloB - veloA));
    }

    public double kmColi(){
        return b + veloB * formulaOne();
    }

    public String horario(){

        int horaini = 17, hora = 0, minuto = 0;

        double calculotempo = formulaOne()*60;

        if (calculotempo < 60){

            hora = (int) (formulaOne() + horaini);
            minuto = (int) calculotempo;

            return String.format("%d:%d:00", hora, minuto);

        } else if (calculotempo % 60 == 0) {
            hora = (int) (formulaOne() + horaini);
            return String.format("%d:%d0:00", hora, minuto);
        }

        return null;
    }

    @Override
    public String toString(){
        return "KM "
                + String.format("%.0f", kmColi())
                + ", "
                + String.format("%.0f", formulaOne()*3600)
                + " segundos, "
                + horario();
    }


}
