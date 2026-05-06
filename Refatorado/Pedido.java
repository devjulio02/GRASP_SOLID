package Refatorado;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> itens = new ArrayList<>();
    
    public double totalPedido(){
        double total = 0;
        for (Item item : itens) {
            total += item.totalItensPreco();
        }
        return total;
    }

    public void adicionaItem(Item item) {
    itens.add(item);
    }
}
