package lista8;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	public String emitirSom() {
		return "Som Preguiça";
	}
	
	public boolean subirArvore(String detalhe){
		if(detalhe.equals("SUBINDO IGUAL PREGUIÇA")) {
			return true;
		}
		else {
			return false;
		}
	}

}
