package Restaurante;

public class Buffet extends Produto{

	private double limite;

	public Buffet(int codigo, String nome, String unidadeVenda, double precoUnitario, double limite) {
		super(codigo, nome, unidadeVenda, precoUnitario);
		this.limite = limite;
		unidadeVenda = "quilo";	
	}

	public double CalculaCusto(double quantidade){  
		double valorTotal = super.calculaCusto(quantidade);
		if (valorTotal > limite){
			return(limite);
		}else{
			return(valorTotal);
		}
	}

}
