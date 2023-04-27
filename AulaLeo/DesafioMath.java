package AulaLeo;

public class DesafioMath {

    public static void main(String[] args){

        double formula, primeira, segunda, terceiro, soma, somadois;

        primeira = 3*(Math.pow(-0.75, -2));
        soma = Math.pow(3, -1)/4;
        segunda = (6*soma)-4;
        somadois = Math.pow(-0.75, -1);
        terceiro = (7*somadois)+2;
        formula = Math.pow(((primeira + segunda)/terceiro), -1) + 4;

        System.out.println("O resultado é: " + formula);

    }
}
