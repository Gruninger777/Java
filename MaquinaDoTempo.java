/*Crie um programa que mostre a data e a hora exatas do momento da execução.*/

package maquinadotempo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MaquinaDoTempo {

    public static void main(String[] args) {
        LocalDateTime horarioAgora = LocalDateTime.now();
        
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        String horarioAgoraFormatado = horarioAgora.format(formatador);
        
        System.out.println("Formato de horario padrao: " + horarioAgora);
        System.out.println("Formato de horario padrao do Brasil: " + horarioAgoraFormatado);
    }
}
