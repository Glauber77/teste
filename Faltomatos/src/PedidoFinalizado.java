public class PedidoFinalizado implements PedidosState{

	public PedidosState IrPedidoNovo() {
		System.out.print("Pedido foi finalizado!\n");  
		return this;
		}
	public PedidosState IrPedidoAguardandoBoleto() {
		System.out.print("Pedido foi finalizado!\n");  
		return this;
	}
	public PedidosState IrPedidoAprovado() {
		System.out.print("Pedido foi finalizado!\n");  
		return this;
	}
	public PedidosState IrPedidoTransporte() {
		System.out.print("Pedido foi finalizado!\n");  
		return this;
	}
	public PedidosState IrPedidoEntregue() {
		System.out.print("Pedido foi finalizado!\n");  
		return this;
	}
	public PedidosState IrPedidoCancelado() {
		System.out.print("Pedido foi finalizado!\n");  
		return this;
	}
	public PedidosState IrPedidoFinalizado() {
		System.out.print("Pedido foi finalizado!");  
		return this;
	}
	
	
	
}