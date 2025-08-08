/*Exercício 1: Detetive do Sistema
Objetivo: Criar um programa que mostre três informações:
O nome do seu usuário no sistema.
A versão do Java que está executando o programa.
O nome do Sistema Operacional.*/

package detetivedosistema;

public class DetetiveDoSistema {

    public static void main(String[] args) {
        String nomeUsuario = System.getProperty("user.name");
        String versaoJava = System.getProperty("java.version");
        String nomeSo = System.getProperty("os.name");
        
        System.out.println("User: " + nomeUsuario);
        System.out.println("Versao Java: " + versaoJava);
        System.out.println("Nome do SO: " + nomeSo);
    }
}
