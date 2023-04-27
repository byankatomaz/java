package AulaLeo.ColisaoTrens;

public class DataTrens {

    private double tremA;
    private double tremB;
    private double veloA;
    private double veloB;

    public DataTrens(double tremA, double tremB, double veloA, double veloB) {
        this.tremA = tremA;
        this.tremB = tremB;
        this.veloA = veloA;
        this.veloB = veloB;
    }

    public double getTremA() {
        return tremA;
    }

    public double getTremB() {
        return tremB;
    }

    public double getVeloA() {
        return veloA;
    }

    public double getVeloB() {
        return veloB;
    }

    public double equaHora() {
        return tremA + veloA * tempoEqua();
    }

    public double equaTremA(){
        return tremA + veloA * tempoEqua();
    }

    public double equaTremB(){
        return tremB + veloB * tempoEqua();
    }

    public double tempoEqua() {

        return ((tremA - tremB) / (veloB - veloA));
    }

    public String horario(){

        int horaini = 17, hora = 0, minuto = 0;

        double calculotempo = tempoEqua()*60;

        if (calculotempo < 60){

            hora = (int) tempoEqua() + horaini;
            minuto = (int) calculotempo;

            return String.format("%d:%d:00", hora, minuto);

        } else if (calculotempo % 60 == 0) {
            hora = (int) tempoEqua() + horaini;
            return String.format("%d:%d0:00", hora, minuto);
        }

        return null;
    }

    @Override
    public String toString(){
        return "KM "
                + String.format("%.0f", equaHora())
                + ", "
                + String.format("%.0f", tempoEqua()*3600)
                + " segundos, "
                + horario();
    }
}
