programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		const inteiro LIMITE = 4
		inteiro notas[LIMITE]
		inteiro maior=0, x=0
		cadeia alunos[LIMITE]
		
		para (x = 0 ; x < LIMITE; x++) {
			escreva("Digite o nome do ", x+1, " aluno: ")
			leia(alunos[x])

			escreva("Digite a nota do ", x+1, " aluno: ")
			leia(notas[x])

			se (notas[x] > maior){
				maior = notas[x]
			}
			limpa()
		}
		para (x = 0; x < LIMITE; x++){
			se (notas[x] == maior){
				escreva("[",alunos[x], "]")
				escreva("[",notas[x], "*]\n")
			}senao{
				escreva("[",alunos[x], "]")
				escreva("[",notas[x], "]\n")
			}	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */