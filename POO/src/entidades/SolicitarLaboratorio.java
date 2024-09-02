package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SolicitarLaboratorio {

    private List<Solicitacao> reservasEfetivadas;

    public SolicitarLaboratorio() {
        this.reservasEfetivadas = new ArrayList<>();
    }

    public List<Solicitacao> getReservasEfetivadas() {
        return reservasEfetivadas;
    }

    public void solicitarLaboratorio(Solicitacao solicitacao) {
        ValidarSolicitacao validador = new ValidarSolicitacao();
        ResultadoSolicitacao resultado = validador.validar(solicitacao);

        if (resultado == ResultadoSolicitacao.APROVADO) {
            reservasEfetivadas.add(solicitacao);
            System.out.println("Solicitação aprovada. Reserva efetivada.");
        } else {
            System.out.println("Solicitação não aprovada. Motivo: " + resultado.getMensagem());
        }
    }
}