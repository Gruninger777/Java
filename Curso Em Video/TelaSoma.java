package soma;

public class TelaSoma extends javax.swing.JFrame {

    public TelaSoma() {
        initComponents();
    }

    private void initComponents() {

        txtN1 = new javax.swing.JTextField();
        txtN2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnSoma = new javax.swing.JButton();
        lblSoma = new javax.swing.JLabel();

        // Conecta o clique no botão 'btnSoma' com o método 'btnSomaActionPerformed'.
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        pack();
    }

    private void txtN2ActionPerformed(java.awt.event.ActionEvent evt) {

    }
    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {
        
        int n1, n2, s;
        
        // -> PONTO 1: CAPTURA E CONVERSÃO DE TIPO (ENTRADA)
        //    Esta é a parte mais importante! O método .getText() retorna um
        //    texto (String). Para fazer cálculos matemáticos, você precisa
        //    converter esse texto para um número inteiro (int).
        //    Você fez isso perfeitamente com Integer.parseInt().
        
        n1 = Integer.parseInt(txtN1.getText());
        n2 = Integer.parseInt(txtN2.getText());
        
        // -> PONTO 2: O PROCESSAMENTO
        //    A lógica da soma. Simples, clara e correta.
        s = n1 + n2;
        
        // -> PONTO 3: CONVERSÃO DE TIPO (SAÍDA)
        //    O método .setText() só aceita texto (String). Então, você
        //    precisa converter o resultado da soma (um int) de volta
        //    para uma String antes de exibi-lo.
        //    Você fez isso perfeitamente com Integer.toString().
        lblSoma.setText(Integer.toString(s));
    }//GEN-LAST:event_btnSomaActionPerformed

    private void txtN1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public static void main(String args[]) {
        
        // ... código padrão do NetBeans para iniciar a janela ...
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSoma().setVisible(true);
            }
        });
    }

    // Declaração de variáveis para os componentes da tela.
    private javax.swing.JButton btnSoma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblSoma;
    private javax.swing.JTextField txtN1;
    private javax.swing.JTextField txtN2;
}