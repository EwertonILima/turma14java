package lista7;

import java.util.Scanner;

public class Tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Fornecedor fornecedor1 = new Fornecedor();
		
		System.out.print("Insira o nome do Fornecedor: ");
		fornecedor1.setNome(leia.nextLine());
		System.out.print("Insira o endereço do Fornecedor: ");
		fornecedor1.setEndereco(leia.nextLine());
		System.out.print("Insira o telefone do Fornecedor: ");
		fornecedor1.setTelefone(leia.next());
		
		System.out.println(fornecedor1.getNome());
		System.out.println(fornecedor1.getEndereco());
		System.out.println(fornecedor1.getTelefone());
		
		System.out.println();
		System.out.print("Sua divida é de R$ " + fornecedor1.getValorDivida() + " reais, quanto de credito deseja colocar: R$ ");
		fornecedor1.setValorCredito(leia.nextDouble());
		
		System.out.println();
		System.out.println("O seu saldo é R$ " + fornecedor1.obterSaldo() + " reais") ;

		leia.close();
	}

}
