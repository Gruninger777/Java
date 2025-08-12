/* Fazer um programa que pergunte o nome do usuário no console e, depois que ele digitar e apertar Enter, o programa responde "Olá, [Nome do Usuário]!".
 */

package olamundointerativo;

import java.util.Scanner;

public class OlaMundoInterativo {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Ola Mundo!");
        System.out.println("Me diga seu nome!");
        
        String nomeUsuario = leitor.nextLine();
        System.out.println("Ola, " + nomeUsuario);
        
    }
}
