package AtividadeTemoteo;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalContas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("\nVamos fazer algumas formulas:");
            System.out.print("Você quer fazer formula de Matemática, Fisica ou de Quimica (M/F/Q)? ");
            char resp = sc.next().toUpperCase().charAt(0);

            switch (resp){

                case 'M':

                    System.out.print("\nQuer fazer básico ou avançado (B/A)? ");
                    char resp1 = sc.next().toUpperCase().charAt(0);

                    if (resp1 == 'B'){

                        System.out.println("\nCerto! Vamos fazer a Soma, Subtração, Multiplicação e Divisão:");
                        System.out.print("Digite o primeiro numero: ");
                        double a = sc.nextDouble();

                        System.out.print("Digite o segundo numero: ");
                        double b = sc.nextDouble();

                        Contas mat = new FormulaMatematica(a, b);

                        System.out.printf("\n%s", ((FormulaMatematica) mat).totalBasicos());
                    }

                    else if (resp1 == 'A'){

                        System.out.println("\n****Opções de formulas avançadas****");
                        System.out.println("[1] Formula da Área de um Quadrado ou Retângulo");
                        System.out.println("[2] Formula da Área do Trângulo");
                        System.out.println("[3] Formula da Área do Circulo");
                        System.out.println("[4] Formula de Bhaskara");
                        System.out.print("\nDigite sua opção: ");
                        int op = sc.nextInt();

                        if (op == 1){

                            System.out.print("\nCerto! Digite o comprimento do quadrado/retângulo: ");
                            double b = sc.nextDouble();

                            System.out.print("Agora digite a altura: ");
                            double a = sc.nextDouble();

                            Contas mat = new FormulaMatematica(b, a);

                            System.out.printf("A area é: %.0f\n", mat.formulaOne());

                        }
                        else if (op == 2){

                            System.out.print("\nCerto! Digite a base do triângulo: ");
                            double b = sc.nextDouble();

                            System.out.print("Agora digite a altura: ");
                            double a = sc.nextDouble();

                            Contas mat = new FormulaMatematica(b, a);

                            System.out.printf("A area é: %.0f\n", ((FormulaMatematica) mat).formulaTria());

                        }
                        else if (op == 3){

                            System.out.print("\nCerto! Digite o valor do raio: ");
                            double r = sc.nextDouble();

                            Contas mat = new FormulaMatematica(r);

                            System.out.printf("A area do circulo é: %.0f\n", ((FormulaMatematica) mat).formulaCirc());

                        }
                        else if (op == 4){

                            System.out.print("\nCerto! Digite o valor a: ");
                            Double a = sc.nextDouble();

                            System.out.print("Digite o valor b:  ");
                            Double b = sc.nextDouble();

                            System.out.print("Digite o valor c:  ");
                            Double c = sc.nextDouble();

                            Contas mat = new FormulaMatematica(a, b, c);

                            System.out.print(((FormulaMatematica) mat).totalBhask());

                        }
                    }

                case 'F':

                    System.out.println("\nVamos calcular! Dois trens em alta velocidade, um indo em direção ao outro. Essa formula vai calcular em qual KM eles vão colidir e quanto tempo isso demora. Lembre-se, os trens sairam 17h");

                    System.out.print("Diga a posição inicial do Trem A (do Km 0 a 10.000): ");
                    double a = sc.nextDouble();

                    while (a < 0 || a > 10000){
                        System.out.println("O número deve ser maior ou igual a zero e menor que 10000 ");
                        System.out.println("Por favor, digite novamente: ");
                        a = sc.nextDouble();
                    }

                    System.out.print("Diga a velocidade do Trem A (até 300 km/h): ");
                    double veloA = sc.nextDouble();

                    while (veloA < 0 || veloA > 300){
                        System.out.println("A velocidade do trem A sempre será positiva. ");
                        System.out.println("Por favor, digite novamente: ");
                        veloA = sc.nextDouble();
                    }

                    System.out.print("Diga a posição inicial do Trem B (do Km 0 a 10.000): ");
                    double b = sc.nextDouble();

                    while (b < 0 || b > 10000){
                        System.out.println("O número deve ser maior ou igual a zero e menor que 10000 ");
                        System.out.println("Por favor, digite novamente: ");
                        b = sc.nextDouble();
                    }

                    System.out.print("Diga a velocidade do Trem B (até -300 km/h): ");
                    double veloB = sc.nextDouble();

                    while (veloB < -300 || veloB > 0){
                        System.out.println("A velocidade do trem B sempre será negativa. ");
                        System.out.println("Por favor, digite novamente: ");
                        veloB = sc.nextDouble();
                    }

                    Contas fisi = new FormulaFisica(a, b, veloA, veloB);

                    System.out.println();
                    System.out.println(fisi);
                    continue;


                case 'Q':

                    System.out.print("\nQuer fazer a formula de Densidade ou de Equilibrio Quimico (D/E)? ");
                    char resp3 = sc.next().toUpperCase().charAt(0);

                    if (resp3 == 'D'){

                        System.out.print("\nCerto! Digite o valor da massa da solução: ");
                        a = sc.nextDouble();

                        System.out.print("Digite o valor do volume da solução:  ");
                        b = sc.nextDouble();

                        Contas quimi = new FormulaQuimica(a, b);

                        System.out.printf("\nO valor da densidade é: %.2f\n", quimi.formulaOne());

                    }
                    else if (resp3 == 'E'){

                        System.out.print("\nCerto! Digite o valor do produto: ");
                        double produto = sc.nextDouble();

                        System.out.print("Digite o valor do reagente:  ");
                        double reagente = sc.nextDouble();

                        Contas quimi = new FormulaQuimica(produto, reagente);

                        System.out.printf("\nO Equilibrio Quimico é: %.2f", ((FormulaQuimica) quimi).formulaEquiQuimi());

                    }

                }

            }

        }
}
