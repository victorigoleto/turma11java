package Lista5;


public class Cliente {
	
	//ATRIBUTOS
	public String nome;
	public char sexo;
	public int anoNascimento;
	public char tipo;
	

	//CONSTRUTOR
	public Cliente (String nome, char sexo, int anoNascimento, char tipo) {
		this.nome = nome;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;
		this.tipo = tipo;
	}
	
	//METODO
	public int idade (){
		return 2020 - anoNascimento;
	}
	
	
}
