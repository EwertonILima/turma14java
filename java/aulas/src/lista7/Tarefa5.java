package lista7;

public class Tarefa5 {

	public static void main(String[] args) {
		
		Operario operario1 = new Operario("João Operario", 50, 2000.0, 0.05, 10000.0, 0.10);
		
		System.out.println(" O nome do operario é " + operario1.getNome() + ", Codigo do setor é " 
		+ operario1.getCodigoSetor() + ", o salario base é R$ " + operario1.getSalarioBase() + " reais, \n o valor de Produção foi R$ " 
		+ operario1.getValorProducao() + " reais, e a comissão é "  + (operario1.getComissao() * 100) +  "% em cima desse valor,\n adicionado ao vencimento base é R$ " 
		+ (operario1.calculaComissao(operario1.getValorProducao()) + operario1.getSalarioBase()));
		
	}

}
