package Exercicios.Loop;
import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
  Ex.: 5! = 120.
 */

public class Ex6_Fatorial {
    public static void main (String[] args) {
        try (Scanner scan = new Scanner (System.in)) {
            int fatorial, multiplicacao = 1;

            System.out.println("======================");
            System.out.println("CALCULADOR DE FATORIAL");
            System.out.println("======================");
            System.out.println(" ");

            System.out.println("----------------");
            System.out.println("Digite o número: ");
            System.out.println("----------------");
            fatorial = scan.nextInt();

            for (int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao * i;

            }

            System.out.println("==========");
            System.out.println(fatorial + "!" + " = " + multiplicacao);
        }
        
        System.out.println("==========");
        System.out.println(" ");

    }
    
}
