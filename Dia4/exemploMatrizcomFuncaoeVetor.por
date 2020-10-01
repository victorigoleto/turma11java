programa
{
	funcao pula(){
		escreva("\n")
	}
	funcao edlinha(){
		para (inteiro x = 1; x<40; x++){
			escreva("═")	
		}
		
	}
	
	funcao inicio()
	{
		real valorTemp
		real valorSaida
		caracter tipo
		escreva("programa de conversão de temperatura ")
		pula()
		
		escreva("Digite a temperatura :")
		leia(valorTemp)
		escreva("Temperatura C - Celcius ou F-Fahrenheit :")
		leia(tipo)
		se (tipo =='C' ou tipo == 'c')
		{
			valorSaida = faren(valorTemp)
			escreva("Temperatura em Faren é ", valorSaida)
		}
		senao se (tipo == 'F' ou tipo =='f')
		{
			valorSaida = celcius(valorTemp)
			escreva("Temperatura em Celcius é ", valorSaida)
			
		}
		senao
		{
			escreva("vc naão escolheu C ou F, tchau!!")
		}
		
	}
	funcao real celcius(real tempFaren)
	{
		retorne (((tempFaren*5)-160)/9)
	}
	funcao real faren(real tempCelcius)
	{
		retorne (((9*tempCelcius)+160)/5)	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 876; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */