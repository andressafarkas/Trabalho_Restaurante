package Restaurante;

public class Refrigerante extends Produto{

	public Refrigerante(int codigo, String nome, String unidadeVenda, double precoUnitario) {
		super(codigo, nome, unidadeVenda, precoUnitario);
	}
	
	
	public double CalculaCusto(double quantidade){  
		return super.calculaCusto(quantidade);
	}
	

}
