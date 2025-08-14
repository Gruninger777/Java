package relogio;

import java.util.Date;


public class TelaRelogio extends javax.swing.JFrame {

    /**
     * Este é o método "construtor" da classe. Ele é executado assim que
     * a janela é criada e sua principal função aqui é chamar o método
     * que monta todos os componentes visuais.
     */
    public TelaRelogio() {
        initComponents();
    }

    /**
     * Este método é gerado 100% automaticamente pelo editor visual do NetBeans.
     * Ele contém toda a "planta baixa" da sua interface: a criação dos botões,
     * labels, a definição de fontes, cores, tamanhos e posições.
     *
     * AVISO: Geralmente não devemos editar este método manualmente, pois
     * qualquer alteração no modo visual pode sobrescrevê-lo.
     */
    @SuppressWarnings("unchecked")
                             
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        btnClick = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Sem título.png"))); // NOI18N

        jLabel1.setText("Data e Hora Atuais");

        lblHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblHora.setForeground(new java.awt.Color(102, 102, 102));
        lblHora.setText("Clique no Botão");

        btnClick.setText("Clique aqui");
        // Aqui, o botão "escuta" por um evento de clique.
        // Quando o clique acontece, ele executa o método 'btnClickActionPerformed'.
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });
        
        // Todo o código abaixo dentro de initComponents() é para o layout,
        // organizando os componentes na janela.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblHora)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnClick)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblHora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClick))
                    .addComponent(jLabel2))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    /**
     * Este é o seu código, o "cérebro" da aplicação!
     * Este método é o "ouvinte de evento" que é executado exatamente
     * quando o botão 'btnClick' é pressionado.
     * @param evt O evento de clique que acionou esta ação.
     */
    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // 1. Captura a data e a hora exatas do sistema no momento do clique.
        Date relogio = new Date();
        // 2. Pega o componente 'lblHora' (a etiqueta de texto na tela) e
        //    atualiza o seu texto com a data/hora capturada, convertida para String.
        lblHora.setText(relogio.toString());
    }                                        

    /**
     * O método main, ponto de partida de qualquer programa Java.
     * Em aplicações Swing, ele tem um formato um pouco diferente.
     */
    public static void main(String args[]) {
        /* Bloco "Look and Feel" gerado pelo NetBeans.
         * Tenta fazer com que a janela tenha a aparência nativa do
         * Sistema Operacional (Windows, macOS, etc.) para ficar mais bonita.
         * Se não conseguir, usa a aparência padrão do Java.
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaRelogio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelogio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelogio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelogio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Esta é a forma padrão e segura de iniciar aplicações gráficas em Java.
         * Ela coloca a criação da janela em uma "fila de eventos" para garantir
         * que a interface seja construída e exibida de forma organizada,
         * sem causar problemas de concorrência (múltiplas tarefas ao mesmo tempo).
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Finalmente, cria uma nova instância da nossa janela e a torna visível.
                new TelaRelogio().setVisible(true);
            }
        });
    }

    // Bloco onde o NetBeans declara as variáveis para os componentes da tela
    // (botões, labels, etc.). Por serem declaradas aqui, elas são acessíveis
    // por todos os métodos da classe, como o 'btnClickActionPerformed'.
    // Variables declaration - do not modify                     
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblHora;
    // End of variables declaration                   
}