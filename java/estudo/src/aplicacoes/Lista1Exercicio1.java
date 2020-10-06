package aplicacoes;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
	/*
	1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a 
	expressa apenas em dias. 
	*/
		//Declaração de variaveis
		int anos = 0, meses = 0, dias = 0, res = 0;
				
		//Inputs
		Scanner tec = new Scanner(System.in);
		System.out.print("Informe seu ano de nascimento: ");
		anos = tec.nextInt();
		
		System.out.print("Informe quantos meses: ");
		meses = tec.nextInt();
		
		System.out.print("Informe quantos dias: ");
		dias = tec.nextInt();
		
		
		//calculo
		res = (anos*365)+(meses*30)+dias;
		
		//saida
		System.out.printf("Voce tem %d dias", res);
		

	}

}
