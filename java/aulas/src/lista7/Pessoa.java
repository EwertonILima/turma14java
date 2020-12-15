package lista7;

public class Pessoa {
	
	private String nome;
	private String endereco;
	private String telefone;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, String endereço) {
		this.nome = nome;
		this.endereco = endereço;;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereço) {
		this.endereco = endereço;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}
