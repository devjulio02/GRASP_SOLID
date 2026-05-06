package Refatorado;

public class PagamentoBoleto extends FormaPagamento{
    
    public double logicaPagamento(double valor) {
        return valor + (valor * 5 / 100);
    }
}
