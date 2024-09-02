
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import base_Dados.Base;

public class Execucao {

    public static void main(String[] args) throws ParseException {
        
        Base base = new Base();

        SolicitarLaboratorio solicitador = new SolicitarLaboratorio(base);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Informe qual o laboratório deseja reservar? (ou 'sair' para encerrar)");
            String descricaoLaboratorio = scanner.nextLine();

            if (descricaoLaboratorio.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Informe o nome do professor:");
            String nomeProfessor = scanner.nextLine();

            System.out.println("Informe a sigla da disciplina:");
            String siglaDisciplina = scanner.nextLine();

            System.out.println("Informe a data (dd/mm/aaaa) inicial de uso do laboratório:");
            String dataStr = scanner.nextLine();
            Date data = new SimpleDateFormat("dd/MM/yyyy").parse(dataStr);

            System.out.println("Informe a hora (HH:mm) inicial de uso do laboratório:");
            String horaStr = scanner.nextLine();

            System.out.println("Informe por quantos minutos deseja usar o laboratório?");
            int tempo = scanner.nextInt();
            scanner.nextLine(); 

            
            solicitador.solicitarReserva(descricaoLaboratorio, nomeProfessor, siglaDisciplina, data, tempo);
        }

        
        scanner.close();
    }
     @Override
    public String toString() {
    	
    	return super.toString();
    }
}
