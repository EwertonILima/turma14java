package lista7;

public class Empregado extends Pessoa {
	
	private int codigoSetor;
	private double salarioBase;
	private double impostos;
	
	public Empregado() {
		
	}
	
	public Empregado(String nome, int codigoSetor, double salarioBase, double impostos) {
		super(nome);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.impostos = impostos;
	}


	public double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public int getCodigoSetor() {
		return codigoSetor;
	}


	public double getImpostos() {
		return impostos;
	}
	
	public double calcularSalario() {
		return  salarioBase -= salarioBase * impostos;
	}
	
	
	
}
