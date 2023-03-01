package Exercicios.Loop;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/*
 Faça um programa que leia 5 números e informe o MAIOR número e a MÉDIA dentre eles.
 */

public class Ex3_MaiorEMedia {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;
        int media;

        System.out.println("===================================");  
        System.out.println("          BOLETIM ESCOLAR          "); 
        System.out.println("==================================="); 
        System.out.println(" ");

        System.out.println("-----------------------------------");
        System.out.println("Lance suas últimas cinco (05) notas");
        System.out.println("-----------------------------------");
        System.out.println(" ");

        do { 
            System.out.println("-----------------");                                        
            System.out.println("Digite uma nota: ");  //Do-While: do = faça; while = enquanto
            numero = scan.nextInt();                     //Aplicando: FAÇA isso ENQUANTO aquilo for verdade.                   

            soma = soma + numero;
            
            if (numero > maior) maior = numero;

            count = ++count;
        } while(count < 5);

        media = soma / 5;

        System.out.println("-----------------");
        System.out.println(" ");  

        System.out.println("  =============  ");
        System.out.println("=== RESULTADO ===");
        System.out.println("  =============  ");
        System.out.println(" ");
        System.out.println("Soma das notas: " + soma);
        System.out.println("Maior nota: " + maior);  
        System.out.println("Sua média foi: " + media);
        System.out.println(" ");

        if (media >= 7) {
            System.out.println("  ============"); 
            System.out.println("=== APROVADO ==="); 
            System.out.println("  ============");
        }
        else {
            System.out.println("  ==============="); 
            System.out.println("=== RECUPERAÇÃO ==="); 
            System.out.println("  ===============");
            System.out.println(" ");
        }
    }
}
