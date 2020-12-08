package lista2;



import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int codigoFuncionario, numeroHoras;
		double excessoSalario=0;

		final double LIMITEHORAS = 50.0, VALORHORA = 10.0, VALOREXCEDENTE = 20.0; 
		
	System.out.println("Insira o codigo do funcionario: ");
		codigoFuncionario = leia.nextInt();
		if(codigoFuncionario < 0) {
			System.out.println("Codigo invalido, insira o codigo correto");
		}
		else {
			System.out.println("Insira a quantidade de horas trabalhadas: ");
			numeroHoras = leia.nextInt();
			if(numeroHoras < 0) {
				System.out.println("Quantidade de horas invalida, insira o valor correto");
			}
			else if (numeroHoras > LIMITEHORAS) {
				 for (int i = 0; i < 100; ++i) { 
				       System.out.println();
				 }     
				excessoSalario = (numeroHoras - LIMITEHORAS) * VALOREXCEDENTE;
				System.out.println("Codigo: " + codigoFuncionario);
				System.out.println("Horas trabalhadas: " + numeroHoras + " horas, Salario Total: R$ " + ((LIMITEHORAS * VALORHORA) + excessoSalario) + " reais, Salario excedente: R$ " + excessoSalario + " reais.");
			}
			else {
				for (int i = 0; i < 100; ++i) { 
				       System.out.println();
				 }  
				System.out.println("Codigo: " + codigoFuncionario);
				System.out.println("Horas trabalhadas: " + numeroHoras + " horas, Salario Total: R$ " + (numeroHoras * VALORHORA) + " reais, Salario excedente: R$ " + excessoSalario + " reais.");
			}
		}
		
		
		leia.close();
	}
	

	
}



