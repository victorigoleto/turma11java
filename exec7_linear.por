programa
{
	
	funcao inicio()
	{
		/*
		 7. Um sistema de equações lineares do tipo:pode ser resolvido segundo mostrado abaixo : 

		 */
		//variaveis
		real a,b,c,d,g,f,x,y
		//input
		escreva("\nDigite um valor para A: ")
		leia(a)
		escreva("\nDigite um valor para B: ")
		leia(b)
		escreva("\nDigite um valor para C: ")
		leia(c)
		escreva("\nDigite um valor para D: ")
		leia(d)
		escreva("\nDigite um valor para E: ")
		leia(g)
		escreva("\nDigite um valor para F: ")
		leia(f)
		

		//processamento
		x = ((c*g)-(b*f))/((a*g)-(b*d))
		y = ((a*f)-(c*d))/((a*g)-(b*d))

		//saida
		escreva("\nResultado de x: ", x, "\nResultado de y: ", y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */