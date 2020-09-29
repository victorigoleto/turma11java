programa
{
	
	
	funcao inicio()
	{
		/*
		 2 - Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas 
		 trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
		 Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável
		 E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do 
		 processamento imprimir o salário total e o salário excedente.

		 */

		//variaveis
		inteiro C,N
		inteiro E = 0
		inteiro S = 0

		//input
		escreva("Olá Funcionário, informe o numero de horas trabalhadas: ")
		leia(N)

		//condição
		se (N > 50){
			E = (N * 20)
			S = (E + (N * 10))
		escreva("\nO seu numero de horas trabalhas excedeu e o seu salario excedente é: R$ ", E, " reais \nE o salario total é: R$ ", S, " reais")
	}
		senao {
			S = N * 10
			escreva("\nSuas horas não excederam !! \nSalario total: R$ ", S, " reais \nSalario excedente: R$ ", E, " reais")
			
		}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 988; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */