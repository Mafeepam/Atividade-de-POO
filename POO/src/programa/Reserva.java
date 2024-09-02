import java.util.Date;

import entidades.Disciplina;
import entidades.Professor;
import entidades.Solicitacao;

import java.time.LocalDateTime;

public class Reserva implements IReserva {
    private final String id;
    private final Solicitacao solicitacao;
    private final SituacaoReserva situacao;
    private final LocalDateTime diaDaReserva;
    private final int duracao;

    public Reserva(Solicitacao solicitacao, SituacaoReserva situacao, LocalDateTime diaDaReserva, int duracao) {
        this.id = "id-" + solicitacao.getId();  
        this.solicitacao = solicitacao;
        this.situacao = situacao;
        this.diaDaReserva = diaDaReserva;
        this.duracao = duracao;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    @Override
    public SituacaoReserva getSituacao() {
        return situacao;
    }

    @Override
    public LocalDateTime getDiaDaReserva() {
        return diaDaReserva;
    }

    @Override
    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Reserva [id=" + id + ", solicitacao=" + solicitacao + ", situacao=" + situacao +
               ", diaDaReserva=" + diaDaReserva + ", duracao=" + duracao + "]";
    }
}