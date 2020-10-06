package aplicacoes;

import java.util.Scanner;

public class Lista1Exercicio5 {
	public static void main (String[] args) {
		
	/*
	5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
	Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
	*/
		
		//variaveis
		double real = 0, nota1 = 0, nota2 = 0, nota3 = 0, media = 0;
				
		//input
		Scanner tec = new Scanner(System.in);
		System.out.print("Por favor digite a primeira nota: ");
		nota1 = tec.nextDouble();
		
		System.out.print("Por favor digite a segunda nota: ");
		nota2 = tec.nextDouble();
		
		System.out.print("Por favor digite a terceira nota: ");
		nota3 = tec.nextDouble();
		
		//calculo
		media = ((nota1 * 2)+(nota2 * 3)+(nota3 * 5))/10;
		
		//saida
		System.out.printf("O resultado da média ponderado é %.2f", media);
	}

}
