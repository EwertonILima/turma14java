package lista7;

public class Tarefa4 {

	public static void main(String[] args) {
		
		Administrador administrador1 = new Administrador("Tiririca", "Rua Tamandua",1000.0);
		Administrador administrador2 = new Administrador("Tirulipa", 1500.0);
		
		System.out.printf("Bom dia %s, seu endereço é %s, e sua ajuda de custo é R$ %.2f reais %n%n", administrador1.getNome(), administrador1.getEndereco(),administrador1.getAjudaDeCusto());
		System.out.printf("Bom dia %s, sua ajuda de custo é R$ %.2f reais", administrador2.getNome(), administrador2.getAjudaDeCusto());
	}

}
