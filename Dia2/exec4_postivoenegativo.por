programa
{
	
	funcao inicio()
	{
		/*
		 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número
		 é par ou ímpar, e se é positivo ou negativo.
		 */

		 //variavel
		 inteiro n

		 //input
		 escreva("Digite um numero inteiro: ")
		 leia(n)

		 //condiçao
		 se (n % 2 == 0) {
		 	escreva("\nO número: ", n, " é par")
		 }
		 senao{
		 	escreva("\nO número: ", n, " é impar")
		 }
		 
		 se (n >= 0){
		 	escreva("\nO número: ", n, " é positivo")
		 }
		 senao{
		 	escreva("\nO número: ", n, " é negativo")
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */