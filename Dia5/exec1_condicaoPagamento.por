programa
{
	inclua biblioteca Matematica --> mat
	/*
	1 - Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal 
	de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler 
	qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
	Código Condição de pagamento 
	1 À vista em dinheiro ou cheque, recebe 20% de desconto 
	2 À vista no cartão de crédito, recebe 15% de desconto 
	3 Em duas vezes, preço normal de etiqueta sem juros 
	4 Em três vezes, preço normal de etiqueta mais juros de 10%

	 */
	funcao inicio()
	{
		//variaveis
		real precoOriginal = 0.0, resultado = 0.0, calculo=0.0
		inteiro condicaoPagamento = 0
		
		//pergunta ao usuario o valor do produto desejado
		escreva("Olá, por favor informe o valor do produto: ")
		leia(precoOriginal)
		limpa()

		//pergunta ao usuario o código da condição de pagamento
		escreva("1 - À vista em dinheiro ou cheque, recebe 20% de desconto")
		escreva("\n2 - À vista no cartão de crédito, recebe 15% de desconto")
		escreva("\n3 - Em duas vezes, preço normal de etiqueta sem juros")
		escreva("\n4 - Em três vezes, preço normal de etiqueta mais juros de 10%")
		escreva("\n\nInforme a condição de pagamento: ")
		leia(condicaoPagamento)

		//laço condicional de acordo com o código da condição de pagamento digitado e sendo apresentado
		se (condicaoPagamento == 1){
			calculo = (20*precoOriginal)/100
			resultado = precoOriginal - calculo
			escreva("Você escolheu a condição de pagamento ", condicaoPagamento, " e com 20% de desconto seu produto tem um total de: ",  mat.arredondar(resultado,3))
		}
		senao se (condicaoPagamento == 2){
			calculo = (15*precoOriginal)/100
			resultado = precoOriginal - calculo
			escreva("Você escolheu a condição de pagamento ", condicaoPagamento, " e com 15% de desconto seu produto tem um total de: ",  mat.arredondar(resultado,3))
		}
		
		senao se (condicaoPagamento == 3){
			resultado = precoOriginal / 2
			escreva("Você escolheu a condição de pagamento ", condicaoPagamento, " parcelando seu produto em 2 vezes tendo um total de cada parcela de: ",  mat.arredondar(resultado,3))
		}
		senao se (condicaoPagamento == 4){
			calculo = (10*precoOriginal)/100
			resultado = (precoOriginal/3)+calculo
			escreva("Você escolheu a condição de pagamento ", condicaoPagamento, " parcelando seu produto em 3 vezes tendo um total de cada parcela de: ", mat.arredondar(resultado,3))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */