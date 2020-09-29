programa
{
	
	funcao inicio()
	{
		/*
		 8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for 
		 maior que 100, caso contrário imprimi-la com o valor zero.
		 */

		 //variavel
		 inteiro N = 0

		 //input
		 escreva("Por favor insira um numero: ")
		 leia(N)

		 //condição
		 se (N>100){
		 	escreva("O numero ", N, " é maior que 100 e por isso foi imprimido")
		 }
		 senao{
		 	N = 0
		 	escreva("O numero digitado não é maior que 100 e por isso possui valor ", N)
		 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 422; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */