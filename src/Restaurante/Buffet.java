package Restaurante;

public class Buffet extends Produto{

	private double limite;

	public Buffet(int codigo, String nome, String unidadeVenda, double precoUnitario, double limite) {
		super(codigo, nome, unidadeVenda, precoUnitario);
		this.limite = limite;	
	}

	public double calculaCusto(double quantidade){  
		double valor = super.calculaCusto(quantidade);
		if (valor > limite){
			return(limite);
		}else{
			return(valor);
		}
	}

}
