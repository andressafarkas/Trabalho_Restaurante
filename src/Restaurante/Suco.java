package Restaurante;

public class Suco extends Produto{

	private boolean comAcucar;

	public Suco(int codigo, String nome, String unidadeVenda, double precoUnitario, boolean comAcucar) {
		super(codigo, nome, unidadeVenda, precoUnitario);
		this.comAcucar = comAcucar;
	}

	public double calculaCusto(double quantidade){ 
		double valorTotal = super.calculaCusto(quantidade); 
		if (quantidade > 3){
			valorTotal = valorTotal - (valorTotal * 15) / 100;
			return(valorTotal);
		}else{
			return(valorTotal);
		}
	}

}
