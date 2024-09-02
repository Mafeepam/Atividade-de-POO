package entidades;

import java.time.LocalDate;

public interface Reservavel {

	boolean estaDisponivel(LocalDate data, int tempoEmMinutos);
}
