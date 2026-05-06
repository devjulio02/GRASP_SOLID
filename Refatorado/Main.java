package Refatorado;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        pedido.adicionaItem(new Item(25.0, 2)); 
        pedido.adicionaItem(new Item(25.0, 2));  

        SistemaPedidos sistema = new SistemaPedidos();

        FormaPagamento pagamento = new PagamentoPix(); 

        double valorFinal = sistema.processarPedido(pedido, pagamento);

        System.out.println("Valor final: " + valorFinal);
    }
}