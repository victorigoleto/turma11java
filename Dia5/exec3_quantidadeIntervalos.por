programa
{
	/*
	 3 - Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles 
	 estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve 
	 terminar quando for lido um número negativo.
	 */
	funcao inicio()
	{
		//variaveis
		inteiro n = 1, i1 = 0, i2=0, i3=0, i4=0

		//laço para que o usuario digite quantas vezes desejar o numero pensado
		enquanto (n>0){
			escreva("Digite um numero quantas vezes desejar: ")
			leia(n)
			limpa()

			//condicional comparando se o numero digitado esta dentro dos intervalos
			se (n >=0 e n <=25){
				i1 = i1+1
			}
			senao se (n >=26 e n <=50){
				i2 = i2+1
			}
			senao se (n >=51 e n <=75){
				i3 = i3+1
			}
			senao se (n >=76 e n <=100){
				i4 = i4+1
			}
		}

		//saida apresentando de acordo com os laços condicionais
		escreva("A quantidade de números entre 0-25 é: ", i1, "\nde 26-50 é: ", i2, "\nde 51-75 é: ", 
		i3, "\nde 76-100 é: ", i4)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 841; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */