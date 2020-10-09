package aplicacoes.Lista3;

import java.util.Scanner;

public class exemploTabuadaV2 {

	public static void main(String[] args) {
		
		int n = 0;
				
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		n = tec.nextInt();
		
		
		for(int contador = 0; contador <= 10; contador++) {
			System.out.printf("\n%d x %d = %d", n,contador,(n*contador));
		}
	}
}