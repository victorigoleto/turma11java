programa
{
	funcao inicio()
	{
		/*
		  1 - Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma 
		 atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
		 */

		//variaveis e vetores
		const inteiro LIMITE = 5
		inteiro numeros[LIMITE], maior=0, valor=0, x=0
		
		//laço com pergunta ao usuario atribuindo a cada valor ao vetor
		para (x=0; x < LIMITE; x++){
			escreva("\nInsira o ", (x+1), " valor pontuação: ")
			leia(valor)
			
			numeros[x] = valor

			//condicional para avaliar o maior valor
			se (numeros[x] > maior){
				maior = numeros[x]
				
			}
			
		}	
			//saida dos valores de cada pontuação juntamente com o maior valor
			escreva("\nA pontuação ",(x), " contém valor : ", valor)
			escreva("\n\nO maior valor é: ", maior)
	}
}
			
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 486; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */