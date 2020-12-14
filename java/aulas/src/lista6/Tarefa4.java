package lista6;


import java.util.Scanner;


public class Tarefa4 {

	public static void main(String[] args) {
		
	
		Scanner leia = new Scanner(System.in);
		Funcionario funcionario1 = new Funcionario();
		
		double porcentagem;
		
		System.out.println("Insira os dados do Funcionario:");
		System.out.print("Nome: ");
		funcionario1.nome = leia.nextLine();
		System.out.print("Salario Bruto: ");
		funcionario1.salarioBruto = leia.nextDouble();
		System.out.print("Taxas: ");
		funcionario1.taxas = leia.nextDouble();
		
		System.out.println();
		System.out.println("Funcionario: " + funcionario1);
		System.out.println();
		System.out.print("Qual a porcentagem de aumento de Salario? ");
		porcentagem = leia.nextDouble();
		funcionario1.aumentoSalario(porcentagem);
		
		System.out.println();
		System.out.println("Atualização dos dados: " + funcionario1);
		
		leia.close();
	}

}
