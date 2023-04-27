package AulaLeo;

public class ConcatenadoStrings {
    public static void main(String[] args) {

        double media = 5;
        int faltas = 2;
        boolean postura = true;
        String situacao;

        if (media >= 5.0 && faltas < 25 && postura){
            situacao = "Aprovado";
        } else if (media < 5.0 && faltas < 25 && postura) {
            situacao = "Recuperação";
        } else if (media > 5.0 && faltas >= 25 && postura) {
            situacao = "Sem ferias";
        } else if (media > 5.0 && faltas < 25 && !postura) {
            situacao = "Chamar para conversar";
        } else{
            situacao = "Reprovado";
        }

        System.out.println(situacao);
    }
}
