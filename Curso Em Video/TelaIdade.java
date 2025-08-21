package classes;

// Nenhum import novo foi necessário para a lógica, pois o ano foi fixado.
// Para uma versão dinâmica, importaríamos 'java.time.LocalDate'.

public class TelaIdade extends javax.swing.JFrame {

    public TelaIdade() {
        initComponents();
    }
    
    /**
     * Este método é gerado pelo NetBeans e contém todo o design da tela.
     */
    private void initComponents() {

        // ... código de criação dos componentes ...

        // -> PONTO 1: USANDO O JSpinner
        //    Uma ótima escolha! O JSpinner é melhor que uma caixa de texto
        //    para anos, pois já garante que o usuário só pode digitar números
        //    e permite definir um valor mínimo e máximo, evitando erros.
        txtAN.setModel(new javax.swing.SpinnerNumberModel(1500, 1500, 2100, 1));
        
        // Conecta o clique do botão ao método que faz o cálculo.
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        // ... resto do código de layout ...

        pack();
    }

    /**
     * Este é o seu código, a lógica executada ao clicar no botão "Calcular".
     * @param evt O evento do clique.
     */
    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {
        int an, id;
        
        // -> PONTO 2: CAPTURANDO DADOS DO JSpinner
        //    Perfeito! Obter o valor de um JSpinner é um pouco diferente de
        //    uma caixa de texto. Você fez a conversão corretamente:
        //    1. .getValue() pega o valor (como um Objeto).
        //    2. .toString() converte para texto.
        //    3. Integer.parseInt() converte o texto para um número inteiro.
        an = Integer.parseInt(txtAN.getValue().toString());
        
        // -> PONTO 3: O CÁLCULO
        //    A lógica está correta para o ano de 2025.
        //    Veja a dica importante abaixo sobre como melhorar isso!
        id = 2025 - an;
        
        // Exibe o resultado final na tela, convertendo o número da idade
        // de volta para texto.
        lblIdade.setText(Integer.toString(id));
    }

    /**
     * Método 'main' que inicia a aplicação.
     */
    public static void main(String args[]) {
        
        // ... código padrão do NetBeans para iniciar a janela ...
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaIdade().setVisible(true);
            }
        });
    }

    // Declaração de variáveis dos componentes.
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JSpinner txtAN;
}