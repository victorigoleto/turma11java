programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
		 P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
		 */
		 
		//variaveis
		real x1, x2, y1, y2, d

		//input
		escreva("\nDigite um valor para X1: ")
		leia(x1)
		escreva("\nDigite um valor para X2: ")
		leia(x2)
		escreva("\nDigite um valor para Y1: ")
		leia(y1)
		escreva("\nDigite um valor para Y2: ")
		leia(y2)

		//processamento
		d = mat.raiz(mat.potencia((x1+x2),2)+mat.potencia((y1+y2),2), 2)

		//saida
		escreva("\nResultado: ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */