package doces;

public class Pacoca {
	
	private int unidade ;
	protected double valorUn = 2.50;
	protected String nomeProduto = "Paçoca";
	
	public Pacoca(int unidade, double valorUn, String nomeProduto) {
		super();
		this.unidade = unidade;
		this.valorUn = valorUn;
		this.nomeProduto = nomeProduto;
	}

	//metodo de acesso unidade
	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}
	
	
	//metodo de aceso valorUn
	public double getValorUn() {
		return valorUn;
	}

	public void setValorUn(double valorUn) {
		this.valorUn = valorUn;
	}
	
	//metodos de acesso produto

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	
	

}
