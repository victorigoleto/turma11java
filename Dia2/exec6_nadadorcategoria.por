programa
{
	
	funcao inicio()
	{
		/*
		 6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes 
		 categorias:
		Infantil A = 5 a 7 anos
		Infantil B = 8 a 11 anos
		Juvenil A = 12 a 13 anos
		Juvenil B = 14 a 17 anos
		Adultos = Maiores de 18 anos
		 */

		//variaveis
		inteiro idade

		//input
		escreva("Nadador, por favor informe a sua idade: ")
		leia(idade)

		//condição
		se (idade >= 5 e idade <= 7){
			escreva("Olá nadador, voce tem ", idade, " anos e sua categoria é a Infantil A")
		}
		senao se (idade >= 8 e idade <= 11){
			escreva("Olá nadador, voce tem ", idade, " anos e sua categoria é a Infantil B")
		}
		senao se (idade >= 12 e idade <= 13){
			escreva("Olá nadador, voce tem ", idade, " anos e sua categoria é a Juvenil A")
		}
		senao se (idade >= 14 e idade <= 17){
			escreva("Olá nadador, voce tem ", idade, " anos e sua categoria é a Juvenil B")
		}
		senao{
			escreva("Olá nadador, voce tem ", idade, " anos e sua categoria é a de Adultos")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1002; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */