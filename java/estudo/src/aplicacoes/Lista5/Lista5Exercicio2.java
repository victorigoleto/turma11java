package Lista5;

import java.util.Scanner;

public class Lista5Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); // instanciando o objeto Scanner
		Aviao av = new Aviao("LATAM", "BOING", 1956); // instanciando o objeto Cliente
		System.out.printf("Marca: %s \nModelo: %s \nAno de Fabricação: %d ", av.marca, av.modelo, av.anoFabricacao);
	}

}