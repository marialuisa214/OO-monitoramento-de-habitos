package view;
public class HabitoSelecao extends javax.swing.JFrame {

    public static TelaHabitoDatado telaDatado = new TelaHabitoDatado();
    public static TelaHabitoSemanal telaSemanal = new TelaHabitoSemanal();
    
    public HabitoSelecao() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        painelSelecao = new javax.swing.JPanel();
        labelSelecioneTipoHabito = new javax.swing.JLabel();
        radioDiaFixo = new javax.swing.JRadioButton();
        radioSemanal = new javax.swing.JRadioButton();
        botaoSelecionaHabito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelSelecioneTipoHabito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSelecioneTipoHabito.setText("Selecione o tipo de habito desejado!");

        buttonGroup1.add(radioDiaFixo);
        radioDiaFixo.setText("Dia Fixo no mês");
        radioDiaFixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDiaFixoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioSemanal);
        radioSemanal.setText("Repetido Semanalmente");
        radioSemanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSemanalActionPerformed(evt);
            }
        });

        botaoSelecionaHabito.setText("Continuar");
        botaoSelecionaHabito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSelecionaHabitoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSelecaoLayout = new javax.swing.GroupLayout(painelSelecao);
        painelSelecao.setLayout(painelSelecaoLayout);
        painelSelecaoLayout.setHorizontalGroup(
            painelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSelecaoLayout.createSequentialGroup()
                .addGroup(painelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(labelSelecioneTipoHabito, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelSelecaoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(radioDiaFixo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioSemanal)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelSelecaoLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(botaoSelecionaHabito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelSelecaoLayout.setVerticalGroup(
            painelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSelecaoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelSelecioneTipoHabito)
                .addGap(31, 31, 31)
                .addGroup(painelSelecaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioDiaFixo)
                    .addComponent(radioSemanal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(botaoSelecionaHabito)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioDiaFixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDiaFixoActionPerformed
      
    }//GEN-LAST:event_radioDiaFixoActionPerformed

    private void radioSemanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSemanalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSemanalActionPerformed

    private void botaoSelecionaHabitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSelecionaHabitoActionPerformed
       
            this.telaDatado.setVisible(this.radioDiaFixo.isSelected());
            this.telaSemanal.setVisible(this.radioSemanal.isSelected());
           
       
    }//GEN-LAST:event_botaoSelecionaHabitoActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HabitoSelecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSelecionaHabito;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel labelSelecioneTipoHabito;
    private javax.swing.JPanel painelSelecao;
    private javax.swing.JRadioButton radioDiaFixo;
    private javax.swing.JRadioButton radioSemanal;
    // End of variables declaration//GEN-END:variables
}
