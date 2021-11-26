package Restaurante;

public class Atendimento extends Produto{

	public Atendimento(int codigo, String nome, String unidadeVenda, double precoUnitario) {
		super(codigo, nome, unidadeVenda, precoUnitario);
	}
	
	public double calculaCusto(double quantidade){  
		if (quantidade >= 7){
			return 0;
		}else{
			return(super.calculaCusto(quantidade));
		}
	}
}
