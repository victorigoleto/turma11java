programa
{
	
	funcao inicio()
	{
		/*
		 1) João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o 
		 rendimento diário de seu trabalho. Toda vez que ele traz um peso de tomate maior que o 
		 estabelecido pelo regulamento do estado de São Paulo (50 quilos) deve pagar um multa de 
		 R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a 
		 variável P (peso de tomates) e verifique se há excesso. Se houver, gravar na 
		 variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
		 Caso contrário mostrar tais variáveis com o conteúdo ZERO.
		 */

		//variavel
		real P
		real M = 0
		real E = 0

		//Input
		escreva("Olá, informe o peso de tomates para o cálculo: ")
		leia(P)

		//Condição
		se (P > 50){
			E = P - 50
			M = E * 4
			escreva("\nO peso dos tomates excedeu em: ", E, " kilos sendo necessario pagar: R$ ", M, " reais")
		}
		senao{
			escreva("\nO peso dos tomates não excedeu !! \nPeso dos tomates: ", P, "\nTaxa de Excesso: ", E, "\nValor da Multa: ", M) )
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 902; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */