package Refatorado;

public class SistemaPedidos {

    public double processarPedido(Pedido pedido, FormaPagamento pagamento) {
        double total = pedido.totalPedido();
        return pagamento.logicaPagamento(total);
    }
}