package lista7;

public class Fornecedor  extends Pessoa{
	
	private double valorCredito;
	private double valorDivida = 1000.0;
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	
	public double obterSaldo() {
		return valorCredito - valorDivida;
	}

}
