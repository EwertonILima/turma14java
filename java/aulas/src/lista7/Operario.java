package lista7;

public class Operario extends Empregado{

		private double valorProducao;
		private double comissao = 0.05;
		
		public Operario() {
			
		}
		
		
		public Operario(String nome, int codigoSetor, double salarioBase, double impostos, double valorProducao,double comissao) {
			super(nome, codigoSetor, salarioBase, impostos);
			this.valorProducao = valorProducao;
			this.comissao = comissao;
		}

		public Operario(String nome, int codigoSetor, double salarioBase, double impostos, double comissao) {
			super(nome, codigoSetor, salarioBase, impostos);
			this.comissao = comissao;
		}


		public double getValorProducao() {
			return valorProducao;
		}
		
		public void setValorProducao(double valorProducao) {
			this.valorProducao = valorProducao;
		}

		public double getComissao() {
			return comissao;
		}
		
		public double calculaComissao(double valorProducao) {
			return valorProducao * comissao;
		}
		
		
		

		
}


