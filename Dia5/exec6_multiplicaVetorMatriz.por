programa
{
	/*
	6 - Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3 elementos. Em seguida o
	programa deve fazer a multiplicação do vetor pelas colunas da matriz.
	 */
	
	funcao pula ()
	 {
	 	escreva ("\n")
	 }
	 
	funcao inicio()
	{
		//variaveis
		const inteiro LIMITE = 3
		inteiro vetor[3], x=0, z=0, matriz[3][3])
		
		//captura dos elementos do vetor
		para (x = 0; x < LIMITE; x ++)
		{
			escreva ("Digite o ", x + 1, "º elemento para o vetor: ")
			leia (vetor[x])
			limpa()	
		}		

		//captura de elementos de linhas e colunas da matriz
			para(x=0; x<LIMITE;x++){
			//laço da coluna da matriz
			para (z=0; z < LIMITE; z++){
				//perguntando aos usuarios os valores
				escreva("\nInforme os valores da primeira matriz")
				escreva("\nDigite o valor da linha ", x , " e coluna ", z, ": ")
				leia(matriz[x][z])
				limpa()
				}
			}
		//multiplicação entre vetor e as colunas da matriz
			para(x=0; x<LIMITE;x++){
			//laço da coluna da matriz
			para (z=0; z < LIMITE; z++){
				matriz[x][z]=vetor[x]*matriz[x][z];
				}
			}
		//saida com mais um laço para apresentar os resultados objetido através da multiplicação
			escreva("Multiplicação do vetor pelas colunas da matriz:")
			pula()
			para(x=0; x<LIMITE;x++){
			//laço da coluna da matriz
			para (z=0; z < LIMITE; z++){
				escreva(matriz[x][z]);
				pula()
				}
			}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1157; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */