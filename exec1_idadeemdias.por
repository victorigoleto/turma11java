programa
{
	
	funcao inicio()
	{
		/*
		 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a 
		 expressa apenas em dias. 
		 */
		 
		//declaração de variaveis
		inteiro anos, meses, dias, res

		//inputs
		escreva("Informe a sua idade:")
		
		escreva("\nAnos: ")
		leia(anos)

		escreva("\nMeses: ")
		leia(meses)

		escreva("\nDias: ")
		leia(dias)

		//processamento
		res = (anos*365)+(meses*30)+dias

		//saida
		escreva("\nSua idade em dias é:", res)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 172; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */