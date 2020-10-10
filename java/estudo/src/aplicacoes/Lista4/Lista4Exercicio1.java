package aplicacoes.Lista4;

import java.util.Scanner;


public class Lista4Exercicio1 {

	public static void main(String[] args) {
		
		/*
		1- Faça um programa que possua um vetor denominado A que armazene 6 
		números inteiros. O programa deve executar os seguintes passos: 
		(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
		(b) Armazene em uma variável inteira (simples) a soma entre os valores 
		das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
		(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
		(d) Mostre na tela cada valor do vetor A, um em cada linha.
		 */
		
		Scanner tec = new Scanner(System.in);
		
		//variaveis
		final int LIMITE = 6;
		int[] A = new int [LIMITE];
		int somaPosicoes = 0;
		
		for(int i=0; i < LIMITE;i++) {
			System.out.print("Informe os elementos para o vetor (1, 0, 5, -2, -5, 7): ");
			A[i] = tec.nextInt();
			
			
	
		}
		somaPosicoes = (A[0]+A[1]+A[5]);
		System.out.printf("A soma das posições A[0], A[1] e A[5] é: %d \n", somaPosicoes);
		
		System.out.print("Altere o vetor da posição 4 para o valor 100: ");
		A[4] = tec.nextInt();
		
		for(int i=0; i < LIMITE;i++) {
			System.out.printf("\n%d posição do Vetor A: %d ", i,A[i]);
			
		}
		
		
		
	}

}
