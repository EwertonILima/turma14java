package lista6;

public class ProdutoEletronico {
	
	public double precoProduto;
	public int qtdProduto;
	public String descricaoProduto;
	
	
	public double calculaTotal(){
		return this.precoProduto * this.qtdProduto;
	}
	
}
