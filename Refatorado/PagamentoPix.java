package Refatorado;

public class PagamentoPix extends FormaPagamento {
    
    public double logicaPagamento(double valor) {
        return valor - (valor * 5 / 100);
    }
}
