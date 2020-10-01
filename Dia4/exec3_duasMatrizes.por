programa
{
	
	funcao inicio()
	{
		/*
		3.Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes 
		N1 e N2;
		b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das 
		matrizes N1 e N2.
		 */

		//variaveis e matrizes
		const inteiro LIMITELINHA=4,LIMITECOLUNA=6
		inteiro valores1[LIMITELINHA][LIMITECOLUNA])
		inteiro valores2[LIMITELINHA][LIMITECOLUNA])
		inteiro l=0, c=0, mesmaPosicao1=0, mesmaPosicao2=0, totalMatriz1=0, totalMatriz2=0

		//laço da linha da matriz1 e matriz2
		para(l=0; l<LIMITELINHA;l++){
			//laço da coluna da matriz1
			para (c = 0; c < LIMITECOLUNA; c++){
				//perguntando aos usuarios os valores
				escreva("\nInforme os valores da primeira matriz")
				escreva("\nDigite o valor da linha ", l , " e coluna ", c, ": ")
				leia(valores1[l][c])
				limpa()
				//condicional para verificar se as posições sao iguais
				se (l==c){
					mesmaPosicao1 = mesmaPosicao1 + valores1[l][c]
				}
			}
			//laço da coluna da matriz2
			para (c = 0; c < LIMITECOLUNA; c++){
				escreva("\nInforme os valores da segunda matriz")
				escreva("\n2Digite o valor da linha ", l , " e coluna ", c, ": ")
				leia(valores2[l][c])
				limpa()
				//condicional para verificar se as posições sao iguais
				se (l==c){
					mesmaPosicao2 = mesmaPosicao2 + valores2[l][c]
				}
				totalMatriz1 = mesmaPosicao1+mesmaPosicao2
				totalMatriz2 = mesmaPosicao1-mesmaPosicao2
				}
		}
		//saida apresentando a soma da matriz e subtração da matriz2
		escreva("\nA soma da Matriz 1 de mesmo valores é: ", totalMatriz1)
		escreva("\nA substração da Matriz 2 de mesmo valores é: ", totalMatriz2)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1596; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */