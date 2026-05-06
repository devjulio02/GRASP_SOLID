public class SistemaReservas {
    private List<Reserva> reservas = new ArrayList<>();

    public void processarReserva(Reserva reserva) {
        // Calcula o valor total da estadia
        double total = reserva.getNumeroDias() * reserva.getQuarto().getPrecoDiaria();
        reserva.setTotal(total);

        // Verifica disponibilidade do quarto
        if (!reserva.getQuarto().isDisponivel()) {
            throw new RuntimeException("Quarto indisponível!");
        }

        // Aplica desconto para clientes premium
        if (reserva.getCliente().isPremium()) {
            total = total * 0.9; // 10% de desconto
            reserva.setTotal(total);
        }

        // Confirma a reserva
        reserva.getQuarto().setDisponivel(false);
        reservas.add(reserva);
        System.out.println("Reserva confirmada: " + reserva.getCodigo());
    }
}