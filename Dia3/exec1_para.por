programa
{
	
	funcao inicio()
	{
		/*
		 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
		a) média do salário da população; 
		b) média do número de filhos; 
		c) maior salário; 
		d) percentual de pessoas com salário até R$100,00.  
		 */

		//variavel
		inteiro filhos, x
		real salario=0.0, media_sal=0.0, media_filhos=0.0, maior_salario=0.0, perc_salario=0.0



		//laço
		para(x=1;x<=20;x++){
			
			//input
			escreva("\nPor favor informe o seu salario: ")
			leia(salario)
			limpa()
			escreva("\nPor favor informe o numero de filhos: ")
			leia(filhos)
			limpa()

			//processamento
			media_sal = salario / x
			media_filhos = filhos / x

			//condicional
			se (salario <= 100.0){
				perc_salario++
			}
			se (salario > maior_salario){
				maior_salario = salario
			}

		}

			//saida
			escreva("\nMedia do salário da população: ", media_sal, 
			"\nMédia do número de filhos: ", media_filhos,
			"\nMaior Salário: ", maior_salario,
			"\nPercentual de pessoal com salário até R$100,00: ", perc_salario)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 910; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */