package lista7;

public class Tarefa3 {

	public static void main(String[] args) {

		Empregado empregado1 = new Empregado("Ewerton", 13, 1000, 0.15);
		
		System.out.printf("Bom dia %s, seu c�digo de Setor � %d, seu salario Base � R$ %.2f reais e o seu salario Liquido � R$ %.2f reais", empregado1.getNome(), empregado1.getCodigoSetor(), empregado1.getSalarioBase(), empregado1.calcularSalario());

	}

}
