package aplicacoes.Lista4;

import java.util.Scanner;

public class ListaExercicio4 {

	public static void main(String[] args) {
		/*
		4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
		Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes 
		(2) subtrair a primeira matriz da segunda 
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes 
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
		Na terceira opção o valor da constante deve ser lido e o resultado da 
		adição da constante deve ser armazenado na própria matriz.
		 */
		
		Scanner tec = new Scanner(System.in);
		
		final int LIMITE = 2;
		int[][] MatrizNumeros1 = new int [LIMITE][LIMITE];
		int[][] MatrizNumeros2 = new int [LIMITE][LIMITE];
		int i = 0, j = 0, opcao=0, somaMatrizes1=0,somaMatrizes2=0,novoLIMITE=0;
		
		for(i=0; i < LIMITE; i++) {
			for(j=0; j < LIMITE; j++) {
			System.out.printf("Matriz 1 - Linha %d Coluna %d - Informe um valor: ", i,j);
			MatrizNumeros1[i][j] = tec.nextInt();
			}
		}
		
		for(i=0; i < LIMITE; i++) {
			for(j=0; j < LIMITE; j++) {
			System.out.printf("Matriz 2 - Linha %d Coluna %d - Informe um valor: ", i,j);
			MatrizNumeros2[i][j] = tec.nextInt();
			}
		}
		
		System.out.print("Olá Usuario, informe a opção desejada\r\n"
				+ "(1) somar as duas matrizes \r\n"
				+ "(2) subtrair a primeira matriz da segunda \r\n"
				+ "(3) adicionar uma constante as duas matrizes\r\n"
				+ "(4) imprimir as matrizes: ");
		opcao = tec.nextInt();
		if(opcao==1) {
			for(i=0; i < LIMITE; i++) {
				for(j=0; j < LIMITE; j++) {
					System.out.printf("\nMatriz 3 com valores somados da Matriz1 e Matriz2 - Linha %d Coluna %d - Informe um valor: %d", i,j,MatrizNumeros1[i][j]+MatrizNumeros2[i][j]);
				}
			}
		}
		if(opcao==2) {
			for(i=0; i < LIMITE; i++) {
				for(j=0; j < LIMITE; j++) {
					System.out.printf("\nMatriz 3 com valores subtraidos da Matriz1 e Matriz2 - Linha %d Coluna %d - Informe um valor: %d", i,j,MatrizNumeros1[i][j]-MatrizNumeros2[i][j]);
				}
			}
		}
		if(opcao==3) {
			System.out.print("Informe um novo valor para a constante das duas matrizes: ");
			novoLIMITE = tec.nextInt();
			System.out.printf("Valor %d adicionado para constante das duas matrizes", novoLIMITE);
		}
		
		if(opcao==4) {
			for(i=0; i < LIMITE; i++) {
				for(j=0; j < LIMITE; j++) {
				System.out.printf("\nMatriz 1 - Linha %d Coluna %d - Valor: %d ", i,j,MatrizNumeros1[i][j]);
				}
			}
			
			for(i=0; i < LIMITE; i++) {
				for(j=0; j < LIMITE; j++) {
				System.out.printf("\nMatriz 2 - Linha %d Coluna %d - Valor: %d ", i,j,MatrizNumeros2[i][j]);
				}
			}
		}
	}
}
