package loja;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente extends Pessoa{
	
	SimpleDateFormat anoFormato = new SimpleDateFormat ("yyyy");
	
	Date ano = new Date();
	
	private int anoAtual = Integer.parseInt(anoFormato.format(ano));
	

	private String cpf;
	

	public Cliente(String nome, char genero, int anoNascimento, String cpf) {
		super(nome, genero, anoNascimento);
		this.cpf = cpf;
	}
	

	public String getCpf() {
		return cpf;
	}


	/*public void corrigeCPF(String novoCPF) {
		
	}*/
	
	@Override
	public int voltaIdade(int anoNascimento) {
		return anoAtual - anoNascimento;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + ", Gênero: " + getGenero() + ", Ano de Nascimento: " + getAnoNascimento() + ", CPF: " + getCpf();
	}
}
