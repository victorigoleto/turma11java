package aplicacoes.Lista4;

import java.util.Scanner;

public class Lista4ExemploFutebol {

	public static void main(String[] args) {
		/*
		VETOR COM OS 4 TIMES DE SÃO PAULO
		CORINTHIANS
		PALMEIRAS
		SPFC
		SANTOS
		GANHA - 3 PONTOS
		EMPATA - 1 PONTO
		PERDE - 0 PONTO
		PRIMEIRA RODADA
		CADA TIME SE GANHOU, PERDEU OU EMPATOU
		MOSTRA A PONTUAÇÃO DA PRIMEIRA RODADA
		SEGUNDA RODADA
		 */

		Scanner scanner = new Scanner(System.in);
		final int NUMERO_DE_TIMES = 4, NUMERO_DE_RODADAS = 3;
		String times[] = {"Corinthians", "Palmeiras", "São Paulo F.C.", "Santos"};
		int[] pontuacao = {0,0,0,0};
		int resultado;
		
		for (int i = 0; i < NUMERO_DE_RODADAS; i++) {
			System.out.println("\nRODADA NÚMERO " + (i + 1) + "\n");
			for (int j = 0; j < NUMERO_DE_TIMES; j++) {
				System.out.printf("Time %s:\n1 para ganhou, 2 para perdeu ou 3 para empatou: ", times[j]);
				resultado = scanner.nextInt();
				/*
				if (resultado == 1) {
					pontuacao[j] += 3;
				} else if (resultado == 3) {
					pontuacao[j] += 1;
				}
				*/
				pontuacao[j] += (resultado == 1) ? 3 : ( (resultado == 3) ? 1 : 0 );
			}
		}
	
		for (int i = 0; i < NUMERO_DE_TIMES; i++) {	
			System.out.printf("%s tem %d pontos\n", times[i], pontuacao[i]);
		}
		
		scanner.close();
	}
}
