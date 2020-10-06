package aplicacoes;

import java.util.Scanner;

public class Lista1Exercicio4 {
	public static void main (String[] args) {
	/*
	4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a 
	seguinte expressão: 
	*/
		//variaveis
		int a = 0, b = 0, c = 0;
		double d = 0, r = 0, s = 0;
		
		//input
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite um valor para A: ");
		a = tec.nextInt();
		
		System.out.print("Digite um valor para B: ");
		b = tec.nextInt();
		
		System.out.print("Digite um valor para C: ");
		c = tec.nextInt();
		
		//calculo
		r = Math.pow(a+b,2);
		s = Math.pow(b+c,2);
		d = (r+s)/2;
		
		//saida
		System.out.printf("O resultado da expressão é %.2f", d);
	}

}
