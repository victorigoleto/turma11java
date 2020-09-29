programa
{
	
	funcao inicio()
	{
		/*
		 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do 
		 distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do 
		 distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de 
		 fábrica de um carro e escreva o custo ao consumidor. 
		 */
		 
		//variaveis
		real perDistribuidor = 28
		real perImposto = 45
		real custoFabrica, valorImposto, valorDistribuidor, custoConsumidor
		
		//input
		escreva("\nInsira o valor do custo de fabrica: ")
		escreva("\nCusto de Fábrica do Carro: ")
		leia(custoFabrica)

		//processamento
		valorImposto = (custoFabrica*perImposto)/100
		valorDistribuidor = (custoFabrica*perImposto)/100
		custoConsumidor = custoFabrica + valorDistribuidor + valorImposto
		

		//saida
		escreva("\nCusto do consumidor: ", custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */