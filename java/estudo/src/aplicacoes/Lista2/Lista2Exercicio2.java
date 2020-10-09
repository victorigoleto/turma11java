package aplicacoes.Lista2;

import java.util.Scanner;

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		/*
		2 - Faça um programa que entre com três números e coloque em ordem 
		crescente.
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
	    if (num1 < num2)
	    {
	        if(num2 < num3)
	        {
	            System.out.printf("O numero em ordem crescente é %d %d %d", num1, num2, num3);
	        }
	        else if(num1 < num3)
	        {
	        	System.out.printf("O numero em ordem crescente é %d %d %d", num1, num3, num2);
	        }
	        else {
	        	System.out.printf("O numero em ordem crescente é %d %d %d", num3, num1, num2);
	        }
	    }
	    else if(num2 < num3)
	    {
	        if(num1 < num3)
	        {
	        	System.out.printf("O numero em ordem crescente é %d %d %d", num2, num1, num3);
	        }
	        else
	        {
	        	System.out.printf("O numero em ordem crescente é %d %d %d", num2, num3, num1);
	        }
	    }
	    else {
	    	System.out.printf("O numero em ordem crescente é %d %d %d", num3, num2, num1);
	    }

	}

}
