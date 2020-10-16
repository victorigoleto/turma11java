package aplicacoes.Lista6;

public class testeEmpregado {
	public static void main(String[] args) {
		
		
		Empregado empregado1 = new Empregado("Victor", 5, 1500.00, 15);
		
		System.out.println(empregado1.calcularSalario());
		
	}
}
