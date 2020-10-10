package aplicacoes.Lista4;

import java.util.Scanner;

public class Lista4Exercicio2 {

	public static void main(String[] args) {
		/*
		2- Faça um programa que receba 6 números inteiros e mostre: 
		• Os números pares digitados;  
		• A soma dos números pares digitados; 
		• Os números ímpares digitados; 
		• A quantidade de números ímpares digitados.
		 */
		
		Scanner tec = new Scanner(System.in);
		
		final int LIMITE = 6;
		int[] vetorNumeros = new int [LIMITE];
		int somaPar=0, quantidadeImpar=0;
		
		for(int i=0; i < LIMITE; i++) {
			System.out.print("Informe os numeros inteiros para o vetor: ");
			vetorNumeros[i] = tec.nextInt();
		}
		for(int i=0; i < LIMITE; i++) {
			if((vetorNumeros[i]%2)==0) {
				somaPar = somaPar + vetorNumeros[i];
				System.out.printf("\nNumero par digitado: %d", vetorNumeros[i]);
			}
			
		}
		System.out.printf("\nSoma dos Pares digitados: %d\n", somaPar);

		for(int i=0; i < LIMITE; i++) {
			if((vetorNumeros[i]%2)==1) {
				quantidadeImpar++;
				System.out.printf("\nNumero ímpar digitado: %d", vetorNumeros[i]);
			}
			
		}
		System.out.printf("\nQuantidade de ímpares digitados: %d", quantidadeImpar);
	}

}
