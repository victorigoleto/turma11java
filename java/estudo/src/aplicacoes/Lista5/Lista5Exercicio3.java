package Lista5;

import java.util.Scanner;

public class Lista5Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); // instanciando o objeto Scanner
		Eletronico el = new Eletronico("Celular", "Samsung", "A50", 2017, 110, 2.000); // instanciando o objeto Cliente
		System.out.printf("Nome: %s \nMarca: %s \nModelo: %s \nAno de Fabricacao: %d \nVoltagem: %d \nPreco: %.4f", el.nome, el.marca, el.modelo, el.anoFabricacao, el.voltagem, el.preco);
	}

}