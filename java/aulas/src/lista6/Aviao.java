package lista6;

public class Aviao {
	
	public String motoLigado;
	public boolean permissaoVoo;
	public int combustivel;
	
	public void liberacaoPista() {
		if(this.motoLigado.equals("SIM") && this.combustivel > 100) {
			this.permissaoVoo = true;
			System.out.println("Pista Liberada");
		}
		else {
			this.permissaoVoo = false;
			System.out.println("Há impedimentos para esse voo"); 
		}
	}
	
	public void percurso() {
		if(this.permissaoVoo == true) {
			System.out.println();
			System.out.print("Partida - ");
			for(int i = 0; i < this.combustivel; i++) {
				System.out.print("✈");
				for(i = 0; i < this.combustivel; i++) {
					System.out.print("→→→→→");
				}
			}
			System.out.print("✈ - Chegada");
		}
		else {
			System.out.println();
			System.out.println();
			System.out.println("Condições insuficientes");
		}
	}

}


