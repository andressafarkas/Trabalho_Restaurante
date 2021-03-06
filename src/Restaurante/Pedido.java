package Restaurante;

public class Pedido {

    ItemPedido itens[];
    private int totalItens = 0;

    public Pedido(){
        itens = new ItemPedido[10];
    }

    public void adicionaItemPedido(Produto produto, double quantidade){
        if (totalItens >= 10){
            System.out.println("Comanda cheia!");
        }else if (itens[totalItens] == null){
            itens[totalItens] = new ItemPedido(produto, quantidade);
            totalItens ++;
        }     
    }

    public double calculaTotalPedido(){
        double total = 0;
        for(int i = 0; i < itens.length; i++){
            if(itens[i] != null){
                total += itens[i].calculaSubtotal();
            }
        }
        return total;
    }

    public void gerarExtratoPedido(){
        for(int i = 0; i < itens.length; i++){
            if(itens[i] != null){
                int n = i + 1;
                System.out.println("Item #" + n + " - " + itens[i].getProduto().getNome() + " " + itens[i].getQuantidade() + " x R$ " + itens[i].getProduto().getPrecoUnitario() + " = R$ " + itens[i].calculaSubtotal());
            }
        }
        System.out.println("> Total: R$ " + calculaTotalPedido());
    }

    public int getTotalRefrigerante(){
        int total = 0;
        for(int i = 0; i < itens.length; i++){
            if(itens[i] != null){
                if(itens[i].getProduto() instanceof Refrigerante){
                    total += itens[i].getQuantidade();
                }
            }
        }
        return total;
    }

    public int getTotalSuco(){
        int total = 0;
        for(int i = 0; i < itens.length; i++){
            if(itens[i] != null){
                if(itens[i].getProduto() instanceof Suco){
                    total += itens[i].getQuantidade();
                }
            }
        }
        return total;
    }

    public int getTotalProdutoLata(){
        int total = 0;
        for(int i = 0; i < itens.length; i++){
            if(itens[i] != null){
                if(itens[i].getProduto().getUnidadeVenda().equals("lata")){
                    total += itens[i].getQuantidade();
                }
            }
        }
        return total;
    }
}

