package aplicacoes;

import java.util.Scanner;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		/*
		1 - Faça um programa que receba três inteiros e diga qual deles é o 
		maior.
		 */
		
		//variaveis
		int num1=0, num2=0, num3=0;

	    //input
	    Scanner tec = new Scanner(System.in);
		System.out.print("Digite o numero 1: ");
		num1 = tec.nextInt();
		
		System.out.print("Digite o numero 2: ");
		num2 = tec.nextInt();
		
		System.out.print("Digite o numero 3: ");
		num3 = tec.nextInt();
		
	    // laço de decisão
	    if (num1 > num2)
	    {
	        if(num1 > num3)
	        {
	            System.out.printf("O maior numero é %d", num1);
	        }
	        else
	        {
	        	System.out.printf("O maior numero é %d", num3);
	        }
	    }
	    else
	    {
	        if(num2 > num3)
	        {
	        	System.out.printf("O maior numero é %d", num2);
	        }
	        else
	        {
	        	System.out.printf("O maior numero é %d", num3);
	        }
	    }

	}

}
