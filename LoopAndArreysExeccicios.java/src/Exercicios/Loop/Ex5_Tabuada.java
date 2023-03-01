package Exercicios.Loop;
import java.util.Scanner;

/*Desenvilva um gerador de tabuada capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10;
  O usuário deve informar de qual número ele deseja ver a tabuada;
  A saída deve ser conforme o exxemplo abaixo:

  Tabuada de 5:
  5 X 1 = 5
  5 x 2 = 10
  ...
  5 X 10 = 50
 */

public class Ex5_Tabuada {
    public static void main (String[] args) {
        try (Scanner scan = new Scanner (System.in)) {
            int tabuada;

            System.out.println("===================");
            System.out.println("GERADOR DE TABUADAS");
            System.out.println("===================");
            System.out.println(" ");

            System.out.println("--------------------------------------");
            System.out.println("Digite o número para gerar a tabuada: ");
            tabuada = scan.nextInt();
            System.out.println("--------------------------------------");
            System.out.println(" ");

            System.out.println("============");
            System.out.println("Tabuada de " + tabuada);
            System.out.println("============");

            for(int i = 1; i <= 10; i++) {
                System.out.println(" " + tabuada + " X " + i + " = " + (tabuada * i));

            }
        }

        System.out.println("   =====");
        System.out.println(" == FIM ==");
        System.out.println("   =====");
        System.out.println(" ");

    }
    
}
