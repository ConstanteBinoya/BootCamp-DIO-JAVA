package Exercicios.Loop;
import java.util.Scanner;

/*
 Faça um programa que solicite uma nota entre zero (0) e dez (10);
 Mostre uma mensagem caso o valor esteja fora desse intervalo (valor inválido) e continue solicitando 
 valores até que seja informado um valor válido pelo usuário.
 */

 public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("========================================");  
        System.out.println("          AVALIAÇÃO DE SERVIÇO          "); 
        System.out.println("========================================");  

        int nota;

        System.out.println("De zero [0] a dez [10] como nos avalia: ");
        nota = scan.nextInt();

        while(nota < 0 || nota > 10) {
            
            System.out.println("########################################"); 
            System.out.println("   Valor inválido! Digite outra nota:   ");
            System.out.println("########################################");
            nota = scan.nextInt();
        }

        System.out.println("========================================"); 
        System.out.println("        === Sua nota foi: " + nota + " ===");
        System.out.println("========================================");
        System.out.println("              ------------              "); 
        System.out.println("            === OBRIGADO ===            "); 
        System.out.println("              ------------              "); 

    }
 }