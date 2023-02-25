package com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a, b;
        
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();
        
        int soma = soma(a,b);
        int subtracao = subtracao(a,b);
        float divisao = divisao(a,b);
        int multiplicacao = multiplicacao(a,b);
        
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtracao: " + subtracao);
        System.out.println("Resultado da divisao: " + divisao);
        System.out.println("Resultado da multiplicacao: " + multiplicacao);
	}

	private static int multiplicacao(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	private static float divisao(float a, float b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	private static int subtracao(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	private static int soma(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	
	
}
