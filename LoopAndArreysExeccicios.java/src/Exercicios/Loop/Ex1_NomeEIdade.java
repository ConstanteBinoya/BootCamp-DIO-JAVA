package Exercicios.Loop;
import java.util.Scanner;

/*
 Faça um programa que leia conjuntos de dois valores: NOME e IDADE (respectivamente).
 Condçaõ de parada: o usuário deve digitar "0"
 */

public class Ex1_NomeEIdade { 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("=====================");  
        System.out.println("  CADASTRO SIMPLES"   ); 
        System.out.println("=====================");                                       

        String nome;
        int idade;

        while(true){ 
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();

            System.out.println("                         "); 
            System.out.println("========================="); 
            System.out.println("Para encerrar digite [0].");
            System.out.println("=========================");    
        }

        System.out.println("================================"); 
        System.out.println("Cadastro encerrado pelo usuário.");
        System.out.println("================================"); 
        System.out.println("                                "); 
        System.out.println("           ==========           "); 
        System.out.println("         == OBRIGADO ==         "); 
        System.out.println("           ==========           "); 
    }
}
