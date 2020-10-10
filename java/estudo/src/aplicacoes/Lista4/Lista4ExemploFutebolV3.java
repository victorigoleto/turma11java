package aplicacoes.Lista4;
import java.util.Scanner;
public class Lista4ExemploFutebolV3 {
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		String times[] = {"CORINTHIANS","PALMEIRAS", "SPFC","SANTOS"}; //0-3
		int pontos[] = {0,0,0,0};
		char resultado; // GANHOU PERDEU EMPATOU
		char opc = 'S'; //S sim e N não
		int contador = 1;
		
		
		
		//momento inicial
		System.out.println("\nANTES DOS JOGOS");
		for (int x = 0; x < pontos.length; x++ ) { //(int x = 0; x < 4; x++ ){
			
			System.out.printf("\nEQUIPE - %s PONTOS: %d", times[x], pontos[x]);
		}
		//UMA RODADA
		
		System.out.println("PROCESSO DE RODADAS\n");
		while (opc=='S')
		{
			System.out.printf("RODADA Nº : %d", contador);
			
			for (int x = 0; x < pontos.length; x++ )
			{
				
				System.out.printf("\nEQUIPE - %s Digite G-ganhou, E-empatou ou P-perdeu : ", times[x]);
				resultado = leia.next().toUpperCase().charAt(0);
				if (resultado =='G') {
					pontos[x] = pontos[x]+3;
				} else if (resultado =='E') {
					pontos[x] = pontos[x]+1;
				} else if (resultado =='P') {
				  pontos[x] = pontos[x]+0;
				}
				
			}
			System.out.println("\nTABELA ATÉ O MOMENTO!!!");
			for (int x = 0; x < pontos.length; x++ )
			{
				System.out.printf("\nEQUIPE - %s PONTOS: %d", times[x], pontos[x]);
			}
			
			//fuga
			System.out.println("\nContinua sim ou não: ");
			opc = leia.next().toUpperCase().charAt(0);
			contador++;
			
		}
		System.out.println("Resultado após rodadas");
		for (int x = 0; x < pontos.length; x++ )
		{
			System.out.printf("\nEQUIPE - %s PONTOS: %d", times[x], pontos[x]);
		}
		linha();
		
		
		leia.close();
		
	}
	
	public static void linha()
	{
		System.out.println("\n-------------------------------------------------");
	}
	
}