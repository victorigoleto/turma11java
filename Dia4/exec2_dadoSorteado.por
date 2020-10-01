programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		/*
		 2.Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere 
		 um vetor com os lançamentos, escreva esse vetor. A seguir determine e imprima a média 
		 aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da 
		 maior pontuação.
		 */

		//variaveis e vetores
		const inteiro LIMITE = 10
		inteiro valoresDado[LIMITE], maior=0,soma=0, totalMaior=0
		real media = 0.0

		escreva("Sorteando valores")
		pula()

		//laço para sortear os valores que atrelados aos lançamentos
		para (inteiro x = 0 ; x < LIMITE; x++) {
			valoresDado[x] = Util.sorteia(1, 6)
		}
		
		//laço para somar os lançamentos que posteriormente serao usadas na média
		para (inteiro x = 0; x < LIMITE; x++){
			soma = soma + valoresDado[x]

			//saida para informar na tela a posição do lançamentos e seu respectivo dado sorteado
			escreva("O lançamento ",(x+1), " contém o valor ",valoresDado[x])
			//condicional para avaliar quantas ocorrencias de maior pontuação possuem
			se (valoresDado[x] > maior){
				maior = valoresDado[x]
				totalMaior++
			}
			pula()
			
		}
		//processamento da média dos lançamentos
		media = soma / LIMITE
		//saida dos dados
		escreva("\nO maior valor é: ", maior)
		escreva("\nVezes que o maior valor apareceu: ", totalMaior)
		escreva("\nMédia aritmetica dos lançamentos: ", media)
	}

	funcao pula(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 962; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */