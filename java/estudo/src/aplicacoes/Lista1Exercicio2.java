package aplicacoes;

import java.util.Scanner;

public class Lista1Exercicio2 {
	public static void main (String[] args) {
	/*
	2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em 
	anos, meses e dias. 
	*/
		
		//declaração de variaveis
		int dias = 0, anos = 0, meses = 0;
		
		//inputs
		Scanner tec = new Scanner(System.in);
		System.out.print("Informe a sua idade em dias: ");
		dias = tec.nextInt();
		
		//calculo
		anos = (dias/365);
		meses = (dias%365)/30;
		dias = (dias%365)%30;
		
		//saida
		System.out.printf("Voce possui %d anos, %d meses e %d dias", anos, meses, dias);
	}

}
