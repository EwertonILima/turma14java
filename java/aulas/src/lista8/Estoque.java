package lista8;

public class Estoque{

		private String produto;
		private String codigo; //int
		private double precoUnitario;
		private int qtdeProdutoEstoque;
		
		


		public Estoque( String codigo, String produto,  double precoUnitario, int qtdeProdutoEstoque) {
			super();
			this.produto = produto;
			this.codigo = codigo;
			this.precoUnitario = precoUnitario;
			this.qtdeProdutoEstoque = qtdeProdutoEstoque;
		}



		public String getProduto() {
			return produto;
		}



		public void setProduto(String produto) {
			this.produto = produto;
		}



		public String getCodigo() {
			return codigo;
		}



		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}



		public double getPrecoUnitario() {
			return precoUnitario;
		}



		public void setPrecoUnitario(double precoUnitario) {
			this.precoUnitario = precoUnitario;
		}



		public int getQtdeProdutoEstoque() {
			return qtdeProdutoEstoque;
		}

		
		
		public void adicionaEstoque(int entrada) {
			
			//this.qtdeProdutoEstoque = this.qtdeProdutoEstoque + entrada;
			this.qtdeProdutoEstoque += entrada;
		}
		
			
}
