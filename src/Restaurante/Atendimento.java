package Restaurante;

public class Atendimento extends Produto{

	public Atendimento(int codigo, String nome, String unidadeVenda, double precoUnitario) {
		super(codigo, nome, unidadeVenda, precoUnitario);
	}
	
	public double CalculaCusto(double quantidade){  
		double valorTotal = super.calculaCusto(quantidade);
		if (quantidade >= 7){
			return(valorTotal);
		}else{
			valorTotal = valorTotal + (getPrecoUnitario() * quantidade);
			return(valorTotal);
		}
	}
}
