package lista8;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String emitirSom() {
		return "Som cachorro";
	}
	
	public boolean corre(String detalhe) {
		if(detalhe.equals("IGUAL CACHORRO")) {
			return true;
		}
		else {
			return false;
		}
	}
}
