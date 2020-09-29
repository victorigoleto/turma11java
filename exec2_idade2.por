programa
{
	
	funcao inicio()
	{
		/*
		 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em 
		 anos, meses e dias. 
		 */
		 
		//declaração de variaveis
		inteiro dias, anos, meses

		//inputs
		escreva("Informe a sua idade em dias:")

		escreva("\nDias: ")
		leia(dias)

		//processamento
		anos = (dias/365)
		meses = (dias%365)/30
		dias = (dias%365)%30
		

		//saida
		escreva("\nAnos:", anos, "\nMeses:", meses, "\nDias:", dias)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */