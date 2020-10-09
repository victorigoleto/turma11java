package aplicacoes.Lista3;

import java.util.Scanner;

public class exemploDoWhile {

	public static void main(String[] args) {
		int contador=0;
		char opcao;
		
		Scanner tec = new Scanner(System.in);
		
		do {
			System.out.printf("Numero: %d --- Continua S-Sim ou N-Nao: ", contador);
			opcao = tec.next().toUpperCase().charAt(0);
			
			contador++;

		}while (contador<=1000 && opcao == 'S');
		System.out.print("FIM DE PROGRAMA !!");
		tec.close();

	}

}
