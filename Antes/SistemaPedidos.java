import java.util.ArrayList;
import java.util.List;

public class SistemaPedidos {
    private List<Pedido> pedidos = new ArrayList<>();

    public void processarPedido (Pedido pedido) {
        double total = 0;
        for (Item item ; pedido.getItens()) {
            total += item.getPreco() * item.getQuantidade();
        } 
        pedido.setTotal(total);

        if (pedido.getFormaPagamento().equals("Cartão")) {
            System.out.println("processando cartão...");
        } else if (pedido.getFormaPagamento().equals("Boleto")){
            System.out.println("Gerando boleto...");
        }

        pedidos.add(pedido);
        System.out.println("Pedido salvo: " + pedido.getId());
    } 
}