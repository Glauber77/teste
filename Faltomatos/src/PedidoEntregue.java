public class PedidoEntregue implements PedidosState{

	public PedidosState IrPedidoNovo() {
		System.out.print("Pedido ja em andamento!\n");  
		return null;
		}
	public PedidosState IrPedidoAguardandoBoleto() {
		System.out.print("Pedido pago, continue!\n");  
		return null;
	}
	public PedidosState IrPedidoAprovado() {
		System.out.print("Pedido foi aprovado, continue!\n");  
		return null;
	}
	public PedidosState IrPedidoTransporte() {
		System.out.print("Pedido ja chego no destino, continue!\n");  
		return null;
	}
	public PedidosState IrPedidoEntregue() {
		System.out.print("Pedido Chego no Cliente!\n");  
		return null;
	}
	public PedidosState IrPedidoCancelado() {
		System.out.print("Pedido Cancelado pelo cliente!\n");  
		return new PedidoCancelado();
	}
	public PedidosState IrPedidoFinalizado() {
		System.out.print("Pedido chegou ao fim!\n");  
		return new PedidoFinalizado();
	}
	
	
	
}