package SisResRefatorado;

public class Quarto {
    private int precoDiaria;
    private boolean disponivel;

    public Quarto (int precoDiaria, boolean disponivel){
        this.precoDiaria = precoDiaria;
        this.disponivel = true;
    }

    public int getPrecoDiaria () {
        return precoDiaria;
    }

    public boolean getrDisponivel(){
        return disponivel;
    }            
}
