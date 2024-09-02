package programa;

import java.time.LocalDateTime;

import entidades.Solicitacao;

public interface IReserva {
    String getId();
    Solicitacao getSolicitacao();
    SituacaoReserva getSituacao();
    LocalDateTime getDiaDaReserva();
    int getDuracao();
}
