package lista7;

public class Administrador extends Pessoa{
	
	private double ajudaDeCusto;

	public Administrador(String nome, double ajudaDeCusto) {
		super(nome);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	

	public Administrador(String nome, String endereco, double ajudaDeCusto) {
		super(nome, endereco);
		this.ajudaDeCusto = ajudaDeCusto;
	}


	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	
	

}
