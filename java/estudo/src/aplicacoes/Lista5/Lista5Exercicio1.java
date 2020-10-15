package Lista5;

import java.util.Scanner;

public class Lista5Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); // instanciando o objeto Scanner
		Cliente cl = new Cliente("Victor", 'M', 1997, 'V'); // instanciando o objeto Cliente
		System.out.printf("Nome: %s \nSexo: %s \nIdade: %d \nTipo de Cliente (A-Ativo ou V-Visitante): %s ", cl.nome, cl.sexo, cl.idade(), cl.tipo);
	}

}