programa
{
	
	funcao inicio()
	{
		/*
		 5) A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de 
		 indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável 
		 varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas
		 a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo 
		 são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem 
		 ser notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição 
		 medido e emita a notificação adequada aos diferentes grupos de empresas.
		 */

		 //variavel
		 real indice
		 cadeia g1 = " Grupo 1"
		 cadeia g2 = " Grupo 2"
		 cadeia g3 = " Grupo 3"

		 //input
		 escreva("Por favor digite o índice de poluição medido: ")
		 leia(indice)

		 //condição
		 se (indice >= 0.5){
		 	escreva("Por favor", g1,g2,g3 , " paralisem as suas atividades imediatamente, pois o índice de poluição ", indice,  "ultrapassou o limite de 0,5")
		 }
		 senao se(indice >= 0.4){
		 	escreva("Por favor", g1,g2, " paralisem as suas atividades imediatamente, pois o índice de poluição ", indice,  "ultrapassou o limite de 0,4")
		 }
		 senao se(indice >= 0.3){
		 	escreva("Por favor", g1, " paralise as suas atividades imediatamente, pois o índice de poluição ", indice,  "ultrapassou o limite de 0,3")
		 }
		 senao{
		 	escreva("Nenhum grupo foi notificado, pois o índice de poluição ", indice,  " não ultrapassou o limite de 0,25")
		 }
		 
		 
		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1576; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */