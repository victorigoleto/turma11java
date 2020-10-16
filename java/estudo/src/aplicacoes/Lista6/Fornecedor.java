package aplicacoes.Lista6;

public class Fornecedor extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	
	//construtores		
			
	public Fornecedor(String nome) {
		super(nome);
	}
	public Fornecedor(String nome, String endereco, double valorCredito) {
		super(nome, endereco);
		this.valorCredito = valorCredito;
	}
	
	public double obterSaldo() {
		return valorCredito - valorDivida;
	}
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
}