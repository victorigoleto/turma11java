programa
{
	
	funcao inicio()
	{
		/*
		 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
		 Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
		 */
		 
		//variaveis
		real nota1, nota2, nota3, media

		//input
		escreva("\nPor Favor digita a primeira nota: ")
		leia(nota1)
		escreva("\nPor Favor digita a segunda nota: ")
		leia(nota2)
		escreva("\nPor Favor digita a terceira nota: ")
		leia(nota3)

		//processamento
		media = ((nota1 * 2)+(nota2 * 3)+(nota3 * 5))/10

		//saida
		escreva("\nO resultado da média ponderada é: ", media)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 626; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */