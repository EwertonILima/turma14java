package lista7;

public class Tarefa6 {

	public static void main(String[] args) {
		
		Vendedor vendedor1 = new Vendedor("Jo�o Vendedor",75,500.0, 0.05, 0.15, 25000.0);
		
		System.out.println(" O nome do vendedor � " + vendedor1.getNome() + ", Codigo do setor � " 
				+ vendedor1.getCodigoSetor() + ", o salario base � R$ " + vendedor1.getSalarioBase() + " reais, \n o valor das vendas foi R$ " 
				+ vendedor1.getValorVendas() + " reais, e a comiss�o � "  + (vendedor1.getComissao() * 100) +  "% em cima desse valor,\n adicionado ao vencimento base � R$ " 
				+ (vendedor1.calculaComissao(vendedor1.valorVendas) + vendedor1.getSalarioBase()));

	}

}
