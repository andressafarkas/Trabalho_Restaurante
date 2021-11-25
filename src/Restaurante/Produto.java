package Restaurante;

public class Produto {
	
	private static int codigo;
	private String nome;
	private static String unidadeVenda;
	private double precoUnitario;
	
	public Produto(int codigo, String nome, String unidadeVenda, double precoUnitario) {
		this.codigo = codigo;
		this.nome = nome;
		this.unidadeVenda = unidadeVenda;
		this.precoUnitario = precoUnitario;
	}

	public double calculaCusto(double quantidade) {
		return precoUnitario * quantidade;
	}
	
	 public void setNome(){
	        this.nome = nome;
	    }
	 
	 public void setPrecoUnitario(){
	        this.precoUnitario = precoUnitario;
	    }

	public double getPrecoUnitario(){
		return precoUnitario;
	}

	public String getUnidadeVenda(){
		return this.unidadeVenda;
	}

	public String getNome(){
		return this.nome;
	}
}
