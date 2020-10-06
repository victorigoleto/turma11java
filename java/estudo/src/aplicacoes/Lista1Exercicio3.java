package aplicacoes;

import java.util.Scanner;

public class Lista1Exercicio3 {
	public static void main (String[] args) {
	/*
	3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em 
	segundos e mostre-o expresso em horas, minutos e segundos. 
	*/
		
		//declaração de variaveis
		int segundos = 0, horas = 0, minutos = 0;
		
		//inputs
		Scanner tec = new Scanner(System.in);
		System.out.print("Informe o tempo de duração de um evento em uma fábrica expressa em segundos:");
		segundos = tec.nextInt();
		
		//calculo
		horas = (segundos/3600);
		minutos = (segundos%3600)/60;
		segundos = (segundos%3600)%60;
		
		//saida
		System.out.printf("O seu evento durou %d horas, %d minutos e %d segundos", horas, minutos, segundos);
	}

}
