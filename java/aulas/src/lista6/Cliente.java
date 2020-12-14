package lista6;

public class Cliente {

	public String nomeCliente;
	public int anoNascimento;
	public char genero;
	public int idade;
	
	public Cliente() {
		
	}
	
	public void calculaIdade() {
		this.idade = 2020 - this.anoNascimento;
	}
	
	public void verificaGenero() {
		if (this.genero == 'M') {
			System.out.print("Bem vindo! Sr. ");
		} else if (genero == 'F') {
			System.out.print("Bem vinda2! Sra.");
		} else {
			System.out.print("Bem vindx! Srx. ");
		}
	}
	
	
	
}
