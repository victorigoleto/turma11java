package aplicacoes.Lista3;

import java.util.Scanner;

public class Lista3Exercicio3 {

	public static void main(String[] args) {
	/*
	 3 - Solicitar a idade de várias pessoas e imprimir: Total de pessoas com 
	 menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina 
	 quando idade for =-99. 
	 */

		int idade = 0, cont1 = 0, cont2 = 0;
		
		Scanner tec = new Scanner(System.in);
		
		while(idade <= 99 ) {
			System.out.print("Informe sua idade: ");
			idade = tec.nextInt();
			
			if (idade <= 21) {
				cont1++;
			}
			else if(idade >= 50) {
				cont2++;
			}
		}
		System.out.printf("%d é o total de pessoas com menos de 21 anos e %d o total de pessoas com mais de 50 anos" , cont1,cont2);
	}

}
