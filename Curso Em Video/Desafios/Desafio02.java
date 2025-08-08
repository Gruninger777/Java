/*Faça um programa que diz qual a resolução da sua tela principal.*/
package desafio02;

import java.awt.GraphicsDevice;
import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;


public class Desafio02 {

    public static void main(String[] args) {
        
        try {
            GraphicsEnvironment ambienteGrafico = GraphicsEnvironment.getLocalGraphicsEnvironment();
            
            GraphicsDevice telaPrincipal = ambienteGrafico.getDefaultScreenDevice();
            
            DisplayMode modoExibicao = telaPrincipal.getDisplayMode();
            
            int largura = modoExibicao.getWidth();
            int altura = modoExibicao.getHeight();
            
            System.out.println("A resolucao da sua tela principal e: " + largura + "x" + altura);
            
        }catch (Exception e) {
            
            System.out.println("Ocorreu um erro ao tentar obter a resolução de tela.");
            e.printStackTrace();
        }
    }
}
