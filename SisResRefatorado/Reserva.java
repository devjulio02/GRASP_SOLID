package SisResRefatorado;

import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private List<Quarto> quartos = new ArrayList<>();
    private int numeroDeDias;

    public Reserva (int numeroDeDias){
        this.numeroDeDias = numeroDeDias;
    }

    public int getNumeroDeDias (){
        return numeroDeDias;
    }

    public void setNumeroDeDias (int numeroDeDias){
        this.numeroDeDias = numeroDeDias;
    }

    public double processarReserva (){
        double total = 0;
        for (Quarto quarto : quartos) {
            total = quarto.getPrecoDiaria() * quarto.get
        }
    }
}
