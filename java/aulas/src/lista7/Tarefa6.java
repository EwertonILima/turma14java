package lista7;

public class Tarefa6 {

	public static void main(String[] args) {
		
		Vendedor vendedor1 = new Vendedor("João Vendedor",75,500.0, 0.05, 0.15, 25000.0);
		
		System.out.println(" O nome do vendedor é " + vendedor1.getNome() + ", Codigo do setor é " 
				+ vendedor1.getCodigoSetor() + ", o salario base é R$ " + vendedor1.getSalarioBase() + " reais, \n o valor das vendas foi R$ " 
				+ vendedor1.getValorVendas() + " reais, e a comissão é "  + (vendedor1.getComissao() * 100) +  "% em cima desse valor,\n adicionado ao vencimento base é R$ " 
				+ (vendedor1.calculaComissao(vendedor1.valorVendas) + vendedor1.getSalarioBase()));

	}

}
