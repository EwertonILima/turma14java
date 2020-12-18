package loja;

public class Produto {

		private String produto;
		private String codigo; //int
		private double precoUnitario;
		private int qtdeProdutoEstoque;
		private int valorTotal;
		
		
		public Produto(String produto, double precoUnitario, int qtdeProdutoEstoque) {
			super();
			this.produto = produto;
			this.precoUnitario = precoUnitario;
			this.qtdeProdutoEstoque = qtdeProdutoEstoque;
		}



		public Produto( String codigo, String produto,  double precoUnitario, int qtdeProdutoEstoque) {
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

		


		public void tiraEstoque(int saida) {
			if (testarEstoque(saida)){
				this.qtdeProdutoEstoque -= saida;
			}
			else {
				System.out.println("ESTOQUE INDISPONIVEL");
			}
		}
		
		
		public void adicionaEstoque(int entrada) {
			this.qtdeProdutoEstoque += entrada;
		}
		
		public boolean testarEstoque(int valor) 
		{
			
			if (valor > this.qtdeProdutoEstoque) 
			{
				return false;
			}
			else if (valor == 0)
			{
				return false;
			}
			else if (this.qtdeProdutoEstoque == 0)
			{
				return false;
			}
			else if (this.qtdeProdutoEstoque < 0)
			{
				return false;
			}
			else	
			{
				return true;
			}
			
		}
		

			public double venda(int qtdeVendida) {
				
				if (testarEstoque(qtdeVendida)){
					tiraEstoque(qtdeVendida);
					return qtdeVendida * this.precoUnitario;
				} 
				else {
					System.out.println("Venda negada!!!");
					return 0;
				}
			
			}
			
			public double valorTotalCarro(int qtdeVendida) {
				
				
				return valorTotal += qtdeVendida * this.precoUnitario;
			}
			
			public void limpaCarrinho() {
				
				this.valorTotal = 0;
			}
			
			


		
			
}
