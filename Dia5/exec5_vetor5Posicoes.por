programa
{
	inclua biblioteca Util
	/*
	 * Faça um programa que leia um vetor de 5 posições para números reais e, 
	 * depois, um código inteiro. Se o código for zero, finalizar o programa;
	 * se for 1, mostre o vetor na ordem direta; se para
	 * 2, mostre o vetor na ordem inversa. Caso,
	 * o código para diferente de 1, 2 e 0, escreva uma mensagem informando que o código inválido.
	 */
	 
	 funcao pula ()
	 {
	 	escreva ("\n")
	 }
	funcao inicio ()
	{	
		//variaveis
		real vetor[5]
		inteiro c = 0
		inteiro x = 0

		//captura de elementos através do laço
		para (x = 0; x <5; x ++)
		{
			escreva ("Digite o ", x + 1, "º para o vetor: ")
			leia (vetor [x])
			limpa()			
			
		}
		pula()
		
		//pergunta ao usuario o próximo passo
		escreva("0 = sair, \n1 = imprimir o vetor na ordem direta, \n2 = imprimir vetor na ordem inversa")
		pula()
		escreva ("Digite o codigo: ")
		leia (c)
		limpa()

		//laço condicional de acordo com o que foi digitado acima
		se (c == 0){
			escreva ("FIM")
		} 
		senao se (c == 1){
			para (x = 0; x <5; x += 1){
				escreva (vetor[x],", ")
			}
			
		} 
		senao se (c == 2){
			para (x = 4; x> = 0; x -= 1)
			{
				escreva ("", vetor [x], ",")
			}
					
		}
		senao{
			escreva ("Código Inválido")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 963; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */