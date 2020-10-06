package utilidades;

import java.util.Scanner;

public class QuartoPrograma {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in); //criou o teclado
		
		String nome;
		int anoNascimento
		double salario;
		
		System.out.print("Escreva o nome do usuario: ");
		nome = tec.next();
		
		System.out.print("Escreva o ano de nascimento: ");
		anoNascimento = tec.nextInt();
		
		System.out.print("Escreva o salario ");
		salario = tec.nextDouble();
		

		System.out.println(nome);
		

	}

}
