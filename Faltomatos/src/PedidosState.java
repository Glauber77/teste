
public interface PedidosState {

	
	PedidosState IrPedidoNovo();
	PedidosState IrPedidoAguardandoBoleto();
	PedidosState IrPedidoAprovado();
	PedidosState IrPedidoTransporte();
	PedidosState IrPedidoEntregue();
	PedidosState IrPedidoCancelado();
	PedidosState IrPedidoFinalizado();
	
	
}
