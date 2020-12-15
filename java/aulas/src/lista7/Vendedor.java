package lista7;

public class Vendedor extends Operario{

	public double valorVendas;

	public Vendedor(String nome, int codigoSetor, double salarioBase, double impostos, double comissao, double valorVendas) {
		super(nome, codigoSetor, salarioBase, impostos, comissao);
		this.valorVendas = valorVendas;
	}

	public double getValorVendas() {
		return valorVendas;
	}
	
	
}
