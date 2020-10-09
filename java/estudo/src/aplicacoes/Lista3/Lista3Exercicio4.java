package aplicacoes.Lista3;

import java.util.Scanner;

public class Lista3Exercicio4 {

	public static void main(String[] args)
	{
		/*4 - 
		 * idade, sexo (1-feminino / 2-masculino / 3-Outros)
		 * as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3,
		 *  se a pessoa era agressiva)
		 *  limite - 150 pessoas
		 *  vou calcular
		 *  o número de pessoas calmas;
			o número de mulheres nervosas;
			o número de homens agressivos;
			o número de outros calmos;
			o número de pessoas nervosas com mais de 40 anos;
			o número de pessoas calmas com menos de 18 anos.
		 */
		//instanciando o objeto teclado chamado leia pela classe scanner
		Scanner leia = new Scanner(System.in);
		
		//declarar as variaveis
		int idade;
		final int LIMITE = 3; // O LIMITE DE PESSOAS É 150
		byte sexo; // (1-feminino / 2-masculino / 3-Outros)
		byte tipoHumor; //(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva)
		int pessoasCalmas=0, mulheresNervosas=0, homensAgressivos=0, outrosCalmos=0, nervosas40=0, calmasMenor18=0;
		
		int contador = 1;
		System.out.println("------- SISTEMA DE PESQUISA DA CIDADE DE EMBU -----------------");
		while (contador <=LIMITE) {
			System.out.print("Digite a sua idade:");
			idade = leia.nextInt();
			System.out.print("Digite 1-feminino / 2-masculino / 3-Outros :");
			sexo = leia.nextByte();
			System.out.print("Digite para cada tipo de pessoa: 1 - Calma / 2 - Nervosa / 3 - Agressiva :");
			tipoHumor = leia.nextByte();
			leia.nextLine(); //limpeza de buffer teclado
			
			if (tipoHumor == 1) {
				pessoasCalmas = pessoasCalmas + 1;
			}
			if ((tipoHumor ==2) && (sexo == 1)) {
				mulheresNervosas = mulheresNervosas +1;
			}
			if ((tipoHumor ==3) && (sexo == 2)) {
				homensAgressivos = homensAgressivos +1;
			}
			if ((tipoHumor ==1) && (sexo == 3)) {
				outrosCalmos = outrosCalmos +1;
			}
			if ((tipoHumor ==2) && (idade > 40)) {
				nervosas40 = nervosas40 +1;
			}
			if ((tipoHumor ==1) && (idade < 18)) {
				calmasMenor18 = calmasMenor18 +1;
			}
			// fuga do loop / laço
			contador++;
			
		}
		System.out.printf("\nTOTAL DE PESSOAS CALMAS : %d", pessoasCalmas);
		System.out.printf("\nTOTAL DE MULHERES NERVOSAS : %d", mulheresNervosas);
		System.out.printf("\nTOTAL DE HOMENS AGRESSIVOS : %d", homensAgressivos);
		System.out.printf("\nTOTAL DE OUTROS CALMOS : %d", outrosCalmos);
		System.out.printf("\nTOTAL DE PESSOAS NERVOSAS COM MAIS DE 40 ANOS : %d", nervosas40);
		System.out.printf("\nTOTAL DE PESSOAS CALMAS COM MENOS DE 18 ANOS : %d", calmasMenor18);
		leia.close();
		
	}
}