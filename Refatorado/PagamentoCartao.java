package Refatorado;

public class PagamentoCartao extends FormaPagamento{
    
    public double logicaPagamento(double valor) {
        return valor + (valor * 10 /100);
    }
}
