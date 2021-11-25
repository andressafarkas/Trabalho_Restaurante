package Restaurante;

public class Restaurante{
	
	public static void main(String[] args){
		System.out.println(".:: Restaurante O Pratão ::.");
		
		//cadastro de produtos padrão do Restaurante
		Produto pAtendimento = new Atendimento(14, "Atendimento", "unidade", 4);
		Produto pRefrigeranteCoca = new Refrigerante(20, "Refrigerante Coca-Cola", "lata", 5);
		Produto pRefrigeranteSprite = new Refrigerante(21, "Refrigerante Sprite", "lata", 5);		
		Produto pSucoLaranja = new Suco(12, "Suco laranja", "copo", 6, false);
		Produto pSucoLimao = new Suco (13, "Suco limão", "copo", 6, true);
		Produto pBuffet = new Buffet(7, "Buffet almoço", "quilo", 45, 25);
		
		System.out.println("\n[Caso de teste #1]");
		Pedido pedido1 = new Pedido();
		pedido1.adicionaItemPedido(pAtendimento, 2);
		pedido1.adicionaItemPedido(pSucoLaranja, 1);
		pedido1.adicionaItemPedido(pRefrigeranteCoca, 2);
		pedido1.adicionaItemPedido(pBuffet, 0.352);
		pedido1.adicionaItemPedido(pBuffet, 0.587);
		pedido1.gerarExtratoPedido();
		System.out.println("\nTotal de sucos pedidos: " + pedido1.getTotalSuco());	//deve mostrar 1 na tela
		System.out.println("Total de refrigerantes pedidos: " + pedido1.getTotalRefrigerante());	//deve mostrar 2 na tela
		System.out.println("Total de produtos 'lata': " + pedido1.getTotalProdutoLata());	//deve mostrar 2 na tela
		
		/**
		 * Extrato exibido para o caso de teste #1

			Item #1 - Atendimento 2.0x R$ 4.0 = R$ 8.0
			Item #2 - Suco laranja 1.0x R$ 6.0 = R$ 6.0
			Item #3 - Refrigerante Coca-Cola 2.0x R$ 5.0 = R$ 10.0
			Item #4 - Buffet almoço 0.352x R$ 45.0 = R$ 15.84
			Item #5 - Buffet almoço 0.587x R$ 45.0 = R$ 25.0
			> Total: R$ 64.84
		*/

		System.out.println("\n[Caso de teste #2]");
		Pedido pedido2 = new Pedido();
		pedido2.adicionaItemPedido(pAtendimento, 8);
		pedido2.adicionaItemPedido(pSucoLimao, 4);
		pedido2.adicionaItemPedido(pRefrigeranteCoca, 2);
		pedido2.adicionaItemPedido(pRefrigeranteSprite, 3);
		pedido2.gerarExtratoPedido();
		System.out.println("\nTotal de sucos pedidos: " + pedido2.getTotalSuco());	//deve mostrar 4 na tela
		System.out.println("Total de refrigerantes pedidos: " + pedido2.getTotalRefrigerante());	//deve mostrar 5 na tela
		System.out.println("Total de produtos 'lata': " + pedido2.getTotalProdutoLata());	//deve mostrar 5 na tela
		
		/**
		 * Extrato exibido para o caso de teste #2

			Item #1 - Atendimento 8.0x R$ 4.0 = R$ 0.0
			Item #2 - Suco limão 4.0x R$ 6.0 = R$ 20.4
			Item #3 - Refrigerante Coca-Cola 2.0x R$ 5.0 = R$ 10.0
			Item #4 - Refrigerante Sprite 3.0x R$ 5.0 = R$ 15.0
			> Total: R$ 45.4
		*/

		System.out.println("\n[Caso de teste #3]");
		Pedido pedido3 = new Pedido();
		pedido3.adicionaItemPedido(pAtendimento, 3);
		pedido3.adicionaItemPedido(pRefrigeranteCoca, 2);
		pedido3.adicionaItemPedido(pRefrigeranteCoca, 2);
		pedido3.adicionaItemPedido(pRefrigeranteCoca, 2);
		pedido3.adicionaItemPedido(pRefrigeranteCoca, 2);
		pedido3.adicionaItemPedido(pRefrigeranteCoca, 2);
		pedido3.adicionaItemPedido(pRefrigeranteCoca, 2);
		pedido3.adicionaItemPedido(pRefrigeranteCoca, 2);
		pedido3.adicionaItemPedido(pRefrigeranteCoca, 2);
		pedido3.adicionaItemPedido(pRefrigeranteCoca, 2);
		//esse último item não pode ser adicionado, pois já há 10 itens no pedido. Deve ser escrito na tela "Comanda cheia."
		pedido3.adicionaItemPedido(pRefrigeranteCoca, 2);
		pedido3.gerarExtratoPedido();
		System.out.println("\nTotal de sucos pedidos: " + pedido3.getTotalSuco());	//deve mostrar 0 na tela
		System.out.println("Total de refrigerantes pedidos: " + pedido3.getTotalRefrigerante());	//deve mostrar 18 na tela
		System.out.println("Total de produtos 'lata': " + pedido3.getTotalProdutoLata());	//deve mostrar 18 na tela


		/**
		 * Extrato exibido para o caso de teste #3

			Item #1 - Atendimento 3.0x R$ 4.0 = R$ 12.0
			Item #2 - Refrigerante Coca-Cola 2.0x R$ 5.0 = R$ 10.0
			Item #3 - Refrigerante Coca-Cola 2.0x R$ 5.0 = R$ 10.0
			Item #4 - Refrigerante Coca-Cola 2.0x R$ 5.0 = R$ 10.0
			Item #5 - Refrigerante Coca-Cola 2.0x R$ 5.0 = R$ 10.0
			Item #6 - Refrigerante Coca-Cola 2.0x R$ 5.0 = R$ 10.0
			Item #7 - Refrigerante Coca-Cola 2.0x R$ 5.0 = R$ 10.0
			Item #8 - Refrigerante Coca-Cola 2.0x R$ 5.0 = R$ 10.0
			Item #9 - Refrigerante Coca-Cola 2.0x R$ 5.0 = R$ 10.0
			Item #10 - Refrigerante Coca-Cola 2.0x R$ 5.0 = R$ 10.0
			> Total: R$ 102.0
		*/
		
	}
}
