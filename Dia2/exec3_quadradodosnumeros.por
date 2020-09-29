programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		/*
		 Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 */

		//variaveis
		inteiro n1, n2, n3, n4

		//input
		escreva("Informe o primeiro numero: ")
		leia(n1)
		escreva("Informe o segundo numero: ")
		leia(n2)
		escreva("Informe o terceiro numero: ")
		leia(n3)
		escreva("Informe o quarto numero: ")
		leia(n4)

		
		//condição
		se (mat.potencia(n3, 2) >= 1000){
			escreva("O quadrado do terceiro numero é: ", mat.potencia(n3, 2))
		}
		senao {
			escreva("\nO quadrado do primeiro numero é: ", mat.potencia(n1, 2))
			escreva("\nO quadrado do segundo numero é: ", mat.potencia(n2, 2))
			escreva("\nO quadrado do terceiro numero é: ", mat.potencia(n3, 2))
			escreva("\nO quadrado do quarto numero é: ", mat.potencia(n4, 2))
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 947; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */