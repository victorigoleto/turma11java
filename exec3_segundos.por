programa
{
	
	funcao inicio()
	{
		/*
		 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em 
		 segundos e mostre-o expresso em horas, minutos e segundos. 
		 */
		 
		//declaração de variaveis
		inteiro segundos, horas, minutos

		//inputs
		escreva("Informe o tempo de duração de um evento em uma fábrica expressa em segundos:")

		escreva("\nSegundos: ")
		leia(segundos)

		//processamento
		horas = (segundos/3600)
		minutos = (segundos%3600)/60
		segundos = (segundos%3600)%60
		

		//saida
		escreva("\nHoras:", horas, "\nMinutos:", minutos, "\nSegundos:", segundos)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 201; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */