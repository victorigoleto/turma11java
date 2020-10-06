package aplicacoes;

import java.util.Scanner;

public class Lista1Exercicio6 {
	public static void main (String[] args) {
	/*
	6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
	P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
	*/
		
		//variaveis
		double x1 = 0, x2 = 0, y1 = 0, y2 = 0, p = 0, d = 0;
		
		//input
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite um valor para X1: ");
		x1 = tec.nextDouble();
		
		System.out.print("Digite um valor para X2: ");
		x2 = tec.nextDouble();
		
		System.out.print("Digite um valor para Y1: ");
		y1 = tec.nextDouble();
		
		System.out.print("Digite um valor para Y2: ");
		y2 = tec.nextDouble();
		
		//calculo
		p = Math.pow((x1+x2),2)+Math.pow((y1+y2),2);
		d = Math.sqrt(p);
		
		//saida
		System.out.printf("O resultado da distância entre eles é %.2f", p);
	}

}
