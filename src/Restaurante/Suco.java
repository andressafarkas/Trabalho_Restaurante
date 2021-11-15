package Restaurante;

public class Suco extends Produto{

	private boolean comAcucar;

	public Suco(int codigo, String nome, String unidadeVenda, double precoUnitario, boolean comAcucar) {
		super(codigo, nome, unidadeVenda, precoUnitario);
		unidadeVenda = "copo";
		this.comAcucar = comAcucar;
	}

	public double CalculaCusto(double quantidade){  
		double valorTotal = super.calculaCusto(quantidade);
		if (quantidade >= 3){
			valorTotal = (valorTotal * 15) / 100;
			return(valorTotal);
		}else{
			return(valorTotal);
		}
	}

}
