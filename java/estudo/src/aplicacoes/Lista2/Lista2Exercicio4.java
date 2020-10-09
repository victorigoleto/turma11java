package aplicacoes.Lista2;

import java.util.Scanner;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		/*
		 4 - Faça um programa em que permita a entrada de um número qualquer e 
		 exiba se este número é par ou ímpar. Se for par exiba também a raiz 
		 quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		 */
		
		//variaveis
		double n = 0;
		
		//input
		Scanner tec = new Scanner(System.in);
		System.out.print("Informe um numero: ");
		n = tec.nextDouble();
		
		
		//laço de decisão
		if((n%2)==0) {
			System.out.printf("O numero é PAR e a raiz quadrada dele é %.2f", Math.sqrt(n));
		}
		else {
			System.out.printf("O numero é ÍMPAR e ao quadrado fica %.2f", Math.pow(n,2));
		}

	}

}
