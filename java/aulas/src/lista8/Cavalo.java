package lista8;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);

	}
	public String emitirSom() {
		return "Som Cavalo";
	}
	
	public boolean corre(String detalhe) {
		if(detalhe.equals("IGUAL CAVALO")) {
			return true;
		}
		else {
			return false;
		}
	}
}
