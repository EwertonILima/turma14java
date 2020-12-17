package lista8;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public String emitirSom() {
		return "Som Pregui�a";
	}
	
	public boolean subirArvore(String detalhe){
		if(detalhe.equals("SUBINDO IGUAL PREGUI�A")) {
			return true;
		}
		else {
			return false;
		}
	}

}
