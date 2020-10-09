package aplicacoes.Lista3;

import java.util.Scanner;

public class exemploInverterValoresV2 {
	public static void main(String[] args) {

				int a = 0, b = 0;
				
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Insira a:");
				a = entrada.nextInt();
				
				System.out.println("insira b:");
				b = entrada.nextInt();
				
				entrada.close();
				
				System.out.printf("O valor de a original: %d%n", a);
				System.out.printf("O valor de b original: %d%n", b);
				
				a = a+b;
				b = a-b;
				a = a-b;
				
				System.out.printf("\nO valor de a invertido: %d%n", a);
				System.out.printf("O valor de b invertido: %d%n", b);
			}
		}