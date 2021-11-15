package Restaurante;

public class Atendimento extends Produto{

	private double valorPorPessoa;
	public Atendimento(int codigo, String nome, String unidadeVenda, double precoUnitario, double valorPorPessoa) {
		super(codigo, nome, unidadeVenda, precoUnitario);
		this.valorPorPessoa = valorPorPessoa;
	}
	
	public double CalculaCusto(double quantidade){  
		double valorTotal = super.calculaCusto(quantidade);
		if (quantidade >= 7){
			return(valorTotal);
		}else{
			valorTotal = valorTotal + (valorPorPessoa * quantidade);
			return(valorTotal);
		}
	}
}
