package aplicacoes;

import java.util.Scanner;

public class Lista1Exercicio7 {
	public static void main (String[] args) {
	/*
	7. Um sistema de equações lineares do tipo:pode ser resolvido segundo mostrado abaixo : 
	*/
		
		//variaveis
		double a = 0, b = 0, c = 0, d = 0, e = 0 , f = 0, x = 0, y = 0;
		
		//input
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite um valor para A: ");
		a = tec.nextDouble();
		
		System.out.print("Digite um valor para B: ");
		b = tec.nextDouble();
		
		System.out.print("Digite um valor para C: ");
		c = tec.nextDouble();
		
		System.out.print("Digite um valor para D: ");
		d = tec.nextDouble();
		
		System.out.print("Digite um valor para E: ");
		e = tec.nextDouble();
		
		System.out.print("Digite um valor para F: ");
		f = tec.nextDouble();
		
		//calculo
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		
		//saida
		System.out.printf("O resultado de x é %.2f e o resultado de y é %.2f", x,y);
	}

}
