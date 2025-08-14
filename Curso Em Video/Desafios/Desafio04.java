/*
 * Comentários de licença e template gerados pelo NetBeans.
 */
package resolucaodatela;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 * A classe 'Desafio04' é uma janela gráfica, pois herda as
 * características de 'javax.swing.JFrame'.
 * @author Usuario
 */
public class Desafio04 extends javax.swing.JFrame {

    /**
     * Construtor da classe, responsável por inicializar
     * os componentes visuais da janela.
     */
    public Desafio04() {
        initComponents();
    }

    /**
     * Este método é 100% gerado pelo NetBeans e contém todo o código
     * para criar e posicionar os componentes na tela (botões, textos, etc.).
     * Não devemos editá-lo manualmente.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        // ... código de criação e layout dos componentes ...

        // Esta é a linha que "ouve" por cliques no botão e, quando um
        // clique ocorre, chama o método 'btnClickActionPerformed'.
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });

        // ... resto do código de layout ...

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este é o seu código! O método que contém a lógica a ser
     * executada quando o botão 'btnClick' é pressionado.
     * @param evt O evento do clique.
     */
    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
        // TODO: A recomendação "add your handling code here" pode ser apagada.

        // -> PONTO 1: LÓGICA PERFEITA
        //    Você seguiu a sequência correta para obter a resolução:
        //    1. Pega o ambiente gráfico.
        GraphicsEnvironment ambienteGrafico = GraphicsEnvironment.getLocalGraphicsEnvironment();
        
        //    2. Pega a tela principal.
        GraphicsDevice telaPrincipal = ambienteGrafico.getDefaultScreenDevice();
        
        //    3. Pega as configurações de exibição da tela.
        DisplayMode modoExibição = telaPrincipal.getDisplayMode();
        
        //    4. Extrai a largura e a altura.
        int largura = modoExibição.getWidth();
        int altura = modoExibição.getHeight();
        
        // -> PONTO 2: ATUALIZAÇÃO DA INTERFACE
        //    Esta é a ação final e mais importante: você pega o 'lblDescobrir'
        //    e atualiza seu texto para mostrar a resolução encontrada.
        //    A formatação "largura + 'x' + altura" está perfeita!
        

[Image of a computer monitor with resolution dimensions]

        lblDescobrir.setText(largura + "x" + altura);
    }//GEN-LAST:event_btnClickActionPerformed

    /**
     * Método 'main' que inicia a aplicação gráfica de forma segura.
     * @param args os argumentos de linha de comando
     */
    public static void main(String args[]) {
        /* Bloco para definir a aparência da janela */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Desafio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desafio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desafio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desafio04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Cria e exibe o formulário */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desafio04().setVisible(true);
            }
        });
    }

    // Declaração de variáveis para os componentes da tela.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDescobrir;
    // End of variables declaration//GEN-END:variables
}