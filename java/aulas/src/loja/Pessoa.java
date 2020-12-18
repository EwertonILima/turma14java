package loja;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pessoa  {
	
	
	
	private String nome;
	private char genero;
	private int anoNascimento;
	
	
	
	public Pessoa(String nome, char genero, int anoNascimento) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoNascimento = anoNascimento;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public char getGenero() {
		return genero;
	}




	public void setGenero(char genero) {
		this.genero = genero;
	}




	public int getAnoNascimento() {
		return anoNascimento;
	}




	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}


	public int voltaIdade(int anoNascimento) {
		return 2020 - anoNascimento;
	}
	
	public char verificaGenero(char generoCliente) {
		
		if (generoCliente == 'M') {
			return 'o';
		}
		else if (generoCliente == 'F') {
			return 'a';
		}
		else {
			return 'x';
		}
		
	}
}
