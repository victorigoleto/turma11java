programa
{
	
	funcao inicio()
	{
		/*
		 4.Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em 
		 seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, 
		 diagonal principal.
		 */
		//variaveis e matrizes
		const inteiro LIMITELINHA=3,LIMITECOLUNA=3
		inteiro valores[LIMITELINHA][LIMITECOLUNA])
		inteiro l=0, c=0, totalDiagonal=0, totalMatriz=0

		//laço da linha
		para(l=0; l<LIMITELINHA;l++){
			//laço da coluna
			para (c = 0; c < LIMITECOLUNA; c++){
				//pergunta ao usuario para informar os valores das linhas e colunas
				escreva("Digite o valor da linha ", l , " e coluna ", c, ": ")
				leia(valores[l][c])
				limpa()

				//condicional para verificar se a linhas e colunas sao iguais e assim calcular
				//o total da diagonal
				se (l==c){
					totalDiagonal = totalDiagonal + valores[l][c]
				}
				//calculo da soma de todos os valores da matriz
				totalMatriz = totalMatriz + valores[l][c]
			}
		}
		//saida apresentando os calculos e condionais
		escreva("\nA soma da diagonal principal é: ", totalDiagonal)
		escreva("\nA soma dos valores da matriz é: ", totalMatriz)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 703; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */