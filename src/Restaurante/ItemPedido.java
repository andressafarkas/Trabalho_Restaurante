package Restaurante;

public class ItemPedido {

    private Produto produto;
    private double quantidade;
    
    public ItemPedido(Produto produto, double quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto(){
        return this.produto;
    }

    public double getQuantidade(){
        return this.quantidade;
    }

    public double calculaSubtotal(){
        if (produto instanceof Suco){
            return produto.calculaCusto(getQuantidade());
        }else if(produto instanceof Buffet){
            return produto.calculaCusto(getQuantidade());
        }else if(produto instanceof Refrigerante){
            return produto.calculaCusto(getQuantidade());
        }else if(produto instanceof Atendimento){
            return produto.calculaCusto(getQuantidade());
        }else{
            return 0.0;
        }
          
    }
}
