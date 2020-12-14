package lista6;

import java.util.Scanner;

public class Tarefa3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ProdutoEletronico produto1 = new ProdutoEletronico();
		
		System.out.print("Informe o valor do produto: ");
		produto1.precoProduto = leia.nextDouble();
		System.out.print("Informe a quantidade do produto: ");
		produto1.qtdProduto = leia.nextInt();
		System.out.print("Insira uma descrição para o produto: ");
		produto1.descricaoProduto = leia.next();
		
		
		System.out.printf("Produto:%s, custára R$ %.2f", produto1.descricaoProduto, produto1.calculaTotal());
		
		
		leia.close();
	}

}
