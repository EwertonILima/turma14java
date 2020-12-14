package lista6;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		
		System.out.print("Informe o nome do cliente: ");
		cliente1.nomeCliente = leia.nextLine();
		System.out.print("Informe o genero [M/F/O]: ");
		cliente1.genero = leia.next().toUpperCase().charAt(0);
		System.out.print("Informe o ano de Nascimento: ");
		cliente1.anoNascimento = leia.nextInt();
		
		cliente1.verificaGenero();
		cliente1.calculaIdade();
		System.out.print(cliente1.nomeCliente + " sua idade é " + cliente1.idade + " anos");
		
		leia.close();
	}

}
