programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		/*
		 4. Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a 
		 seguinte expressão: 
		 */
		 
		//variaveis
		inteiro a, b, c
		real d, r, s

		//input
		escreva("\nDigite um valor para A: ")
		leia(a)
		escreva("\nDigite um valor para B: ")
		leia(b)
		escreva("\nDigite um valor para C: ")
		leia(c)

		//processamento
		r = mat.potencia(a+b,2)
		s = mat.potencia(b+c,2)
		d = (r+s)/2

		//saida
		escreva("\nResultado: ", d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 201; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */