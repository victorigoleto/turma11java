package aplicacoes.Lista4;
import java.util.Scanner;
public class Lista4ExemploFutebolMatriz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		String[][] tabela;
		tabela = new String[4][100];
		
		// primeira coluna da matriz é os nomes
		tabela[0][0] = "Corinthians";
		tabela[1][0] = "PALMEIRAS";
		tabela[2][0] = "SPFC";
		tabela[3][0] = "SANTOS";
		tabela[0][1] = "0";
		tabela[1][1] = "0";
		tabela[2][1] = "0";
		tabela[3][1] = "0";
		
		char leitura,opc;
		// segunda coluna é a soma
		
		// terceira coluna [2] é o primera rodada e assim segue
		
		
		for (int rodada = 0; rodada <=100;rodada++) {
			System.out.printf("---------- Rodada %d --------------",rodada+1);
			for (int time = 0; time <=3;time++) {
				System.out.printf("Qual o resultado time %s \n",tabela[time][0] );
				System.out.print("1 - Vitoria / 2 - Empata / 3 - Derrota :");
				opc = leia.next().charAt(0);
				
				if (opc == '1') {
					tabela[time][rodada+2] += 3;
					tabela[time][1] =Integer.toString((Integer.parseInt(tabela[time][1])+3));
					
				}
				if (opc == '2') {
					tabela[time][rodada+2] += 1;
					tabela[time][1] =Integer.toString((Integer.parseInt(tabela[time][1])+1));;
					
				}
				if (opc == '3') {
					tabela[time][rodada+2] = "0";	
					
				}
				
			
			
			
			}
			System.out.printf(" Rodada %d \n",rodada+1);
			System.out.printf(" Time %s: %s pontos \n",tabela[0][0],tabela[0][1]);
			System.out.printf(" Time %s: %s pontos \n",tabela[1][0],tabela[1][1]);
			System.out.printf(" Time %s: %s pontos \n",tabela[2][0],tabela[2][1]);
			System.out.printf(" Time %s: %s pontos \n",tabela[3][0],tabela[3][1]);
			System.out.println("----------------------------------");		
			
			
			System.out.print("Proxima rodada Sim/Nao");
			leitura =leia.next().toUpperCase().charAt(0);
			if(leitura != 'S') break;				
			
		}
		
		
	}
}