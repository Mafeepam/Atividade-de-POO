package entidades;

class ValidarSolicitacao {

    public ResultadoSolicitacao validar(Solicitacao solicitacao) {

        if (solicitacao.getProfessor().getReservasAprovadas() >= 6) {
            return ResultadoSolicitacao.LIMITE_ATINGIDO;
        }


        for (Solicitacao reserva : solicitacao.getLaboratorio().getReservas()) {
            if (reserva.getSituacao() == ResultadoSolicitacao.APROVADO) {
                if (solicitacao.getData().equals(reserva.getData()) &&
                        solicitacao.getTempo() == reserva.getTempo()) {
                    return ResultadoSolicitacao.CONFLITO;
                }
            }
        }

        return ResultadoSolicitacao.APROVADO;
    }
}