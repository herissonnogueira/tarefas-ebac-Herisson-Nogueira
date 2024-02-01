import java.util.Scanner;

/**
 * @author herisson.nogueira
 */

public class ControleDeFluxo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double nota1 = s.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = s.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = s.nextDouble();

        System.out.println("Digite sua quarta nota: ");
        double nota4 = s.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
