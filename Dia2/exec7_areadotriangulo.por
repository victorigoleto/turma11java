programa
{
	
	funcao inicio()
	{
		/*
		 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos 
		 (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
		 */

		 //variaveis
		 inteiro base, altura, area

		 //input
		 escreva("Por favor informe a base do triângulo: ")
		 leia(base)
		 escreva("Por favor informe a altura do triângulo: ")
		 leia(altura)

		 //condição
		 se (base > 0 e altura > 0){
		 	escreva("A área do triangulo de base", base, " e altura", altura, " possui área de ", ((base*altura)/2))
		 }
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 569; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */