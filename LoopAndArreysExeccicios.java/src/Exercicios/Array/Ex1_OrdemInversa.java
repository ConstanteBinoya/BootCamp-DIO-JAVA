package Exercicios.Array;

/*
 Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.
 */

public class Ex1_OrdemInversa {
    public static void main (String[] args) {
        
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        /*System.out.println(vetor.length); /*length: é uma propriedade que retorna o tamanho 
                                            (quant. de componentes do vetor)*/

        System.out.println(" ");
        System.out.println("======================");                                    
        System.out.print("Vetor: ");                                    
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.print("Vetor: "); 
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println(" ");
        System.out.println("======================");
        System.out.println(" ");
    }
}
