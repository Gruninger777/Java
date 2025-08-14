/*
 * Comentários de licença e template gerados pelo NetBeans.
 */
package linguagemdosistema;

import java.util.Locale;

/**
 * A classe 'Desafio03LinguagemDoSistema' é uma janela, pois herda
 * as características de 'javax.swing.JFrame'.
 * @author Usuario
 */
public class Desafio03LinguagemDoSistema extends javax.swing.JFrame {

    /**
     * Construtor da classe. É executado quando a janela é criada e
     * chama o método para desenhar os componentes.
     */
    public Desafio03LinguagemDoSistema() {
        initComponents();
    }

    /**
     * Este método é 100% gerado pelo NetBeans e representa o design visual
     * da sua tela. Qualquer componente que você arrasta no editor (botões,
     * imagens, textos) tem seu código de criação e posicionamento escrito aqui.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        // ... todo o código de criação e layout dos componentes ...
        
        // Esta linha conecta a ação de clicar no botão 'btnClick' com o
        // método 'btnClickActionPerformed' abaixo. É o elo entre o componente
        // visual e a sua lógica.
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });

        // ... resto do código de layout ...

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este é o seu código! É o método que executa a lógica principal
     * quando o botão é clicado.
     * @param evt O evento do clique que disparou a ação.
     */
    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
        // TODO: A recomendação "add your handling code here" pode ser apagada.
        
        // -> PONTO 1: Reutilização de Conhecimento
        //    Você aplicou perfeitamente a lógica do primeiro desafio para
        //    descobrir a localidade e o idioma do sistema.
        Locale idioma = Locale.getDefault();
        String idiomaSistema = idioma.getDisplayLanguage(idioma);
        
        // -> PONTO 2: Atualização da Interface Gráfica
        //    Esta é a ação principal. Você pega o componente 'lblIdioma' e
        //    atualiza seu texto para mostrar o idioma que você descobriu.
        //    É a conexão perfeita entre a lógica de "backend" e o "frontend" visual.
        
        lblIdioma.setText(idiomaSistema);
    }//GEN-LAST:event_btnClickActionPerformed

    /**
     * O método main, que inicia a aplicação gráfica de forma segura.
     * @param args a command line arguments
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
            java.util.logging.Logger.getLogger(Desafio03LinguagemDoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desafio03LinguagemDoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desafio03LinguagemDoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desafio03LinguagemDoSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Cria e exibe a janela */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desafio03LinguagemDoSistema().setVisible(true);
            }
        });
    }

    // Declaração das variáveis dos componentes, gerada pelo NetBeans
    // para que possam ser acessadas em toda a classe.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblIdioma;
    // End of variables declaration//GEN-END:variables
}