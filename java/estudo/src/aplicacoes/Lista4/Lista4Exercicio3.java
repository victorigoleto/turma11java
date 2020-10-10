package aplicacoes.Lista4;

import java.util.Scanner;

public class Lista4Exercicio3 {

	public static void main(String[] args) {
		/*
		3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10
		ela possui.
		 */

		Scanner tec = new Scanner(System.in);
		
		final int LIMITE = 3;
		int[][] MatrizNumeros = new int [LIMITE][LIMITE];
		int i = 0, j = 0, maior10=0;
		
		for(i=0; i < LIMITE; i++) {
			for(j=0; j < LIMITE; j++) {
			System.out.printf("Linha %d Coluna %d - Informe um valor: ", i,j);
			MatrizNumeros[i][j] = tec.nextInt();
			}
		}
		
		for(i=0; i < LIMITE; i++) {
			for(j=0; j < LIMITE; j++) {
				System.out.printf("\nLinha %d Coluna %d - Valor: %d ", i,j,MatrizNumeros[i][j]);
				if(MatrizNumeros[i][j] > 10) {
					maior10++;
					
				}
			}
		}
		
		System.out.printf("\n\nQuantidade de valores maiores que 10: %d ", maior10);
	}

}
