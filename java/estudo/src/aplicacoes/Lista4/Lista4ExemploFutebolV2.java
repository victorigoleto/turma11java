package aplicacoes.Lista4;
import java.util.Scanner;
public class Lista4ExemploFutebolV2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String[] times = new String [4];
		int[] pontosTimes = new int [4];
		char resposta;
		char continua;
		int contador = 1;
		
		times[0] = "Corinthians";
		times[1] = "Palmeiras";
		times[2] = "SPFC";
		times[3] = "Santos";
		
		do {
			System.out.println("Rodada "+contador);
			for (int x =0;x<times.length;x++) {
				System.out.println("O time "+times[x]+" ganhou, perdeu ou empatou?");
				resposta = leia.next().toUpperCase().charAt(0);
				if (resposta == 'G') {
					pontosTimes[x] = pontosTimes[x] + 3;
				}
				else if (resposta == 'P') {
					pontosTimes[x] = pontosTimes[x] + 0;
				}
				else if (resposta =='E') {
					pontosTimes[x] = pontosTimes[x] + 1;
				}
			}
		
			for (int x = 0;x<4;x++) {
				System.out.println(times[x]+" tem "+pontosTimes[x]+" pontos.");
			}
			System.out.println("Continua ou não?");
			continua = leia.next().toUpperCase().charAt(0);
			contador++;
		
		} while(continua == 'S');
				
	}
}
