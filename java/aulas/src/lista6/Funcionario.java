package lista6;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double taxas;
	
	public double salarioLiquido() {
		return salarioBruto - taxas;
	}
	
	public void aumentoSalario(double porcentagem) {
		salarioBruto += (salarioBruto *(porcentagem / 100));
	}
	
	public String toString() {
		return nome + ", R$" + String.format("%.2f", salarioLiquido());
	
	}
}
