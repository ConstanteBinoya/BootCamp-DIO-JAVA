package Exercicios.Loop;

import java.util.Scanner;

/*Faça um programa que peça N números inteiros,
  calcule e mostre a quantidade de números pares
  e a quantidade de ímpares.
 */

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, quantNumeros, quantPares = 0, quantImpares = 0;
       
        System.out.println("===========================");
        System.out.println("VERIFICADOR DE PAR OU IMPAR");
        System.out.println("===========================");
        System.out.println(" ");
        System.out.println("--------------------------");
        System.out.println("Quantos deseja verificar: ");
        quantNumeros = scan.nextInt();
        System.out.println("--------------------------");
        System.out.println(" ");

        int count = 0;
        do {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();
            System.out.println("------------------");

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

        count++;

       } while (count < quantNumeros);

        System.out.println("   ===========");
        System.out.println("=== RESULTADO ===");
        System.out.println("   ===========");
        System.out.println(" ");

        System.out.println("===================");
        System.out.println("Números Pares: " + quantPares);
        System.out.println("Números Impares: " + quantImpares);
        System.out.println("===================");
        System.out.println(" ");


    }  
}
