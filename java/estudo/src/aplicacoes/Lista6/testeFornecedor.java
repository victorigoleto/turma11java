package aplicacoes.Lista6;

public class testeFornecedor {
	public static void main(String[] args) {
		
		
		Pessoa pessoaqualquer = new Pessoa("Ednilson");
		Fornecedor fornecedor1 = new Fornecedor("MAGAZINE LUIZA");
		Fornecedor fornecedor2 = new Fornecedor("CASAS BAHIA", "RUA X", 10000.55);
		
		
		fornecedor2.setValorDivida(500.98);
		
		
		System.out.println("Saldo da "+fornecedor2.getNome()+" "+fornecedor2.obterSaldo());
		
	}
}
