package view;

import javax.swing.JOptionPane;
import model.AreaDaVida;
import model.HabitoSemanal;
import model.Usuario;

public class TelaHabitoSemanal extends javax.swing.JFrame {
//    public AreaDaVida areaVida;
    public HabitoSemanal habitoSemanal;
    public Usuario usuario = new Usuario();

    public TelaHabitoSemanal() {
        initComponents();
//        this.areaVida = new AreaDaVida();
        this.habitoSemanal = new HabitoSemanal();
//        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelNovoHabito = new javax.swing.JLabel();
        labelDiaSemana = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        radioSegunda = new javax.swing.JRadioButton();
        radioTerca = new javax.swing.JRadioButton();
        radioQuarta = new javax.swing.JRadioButton();
        radioQuinta = new javax.swing.JRadioButton();
        radioSexta = new javax.swing.JRadioButton();
        radioSabado = new javax.swing.JRadioButton();
        radioDomingo = new javax.swing.JRadioButton();
        labelTurno = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        radioQualquer = new javax.swing.JRadioButton();
        radioManha = new javax.swing.JRadioButton();
        radioTarde = new javax.swing.JRadioButton();
        radioNoite = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        nomeHabito = new javax.swing.JTextField();
        radioAreaSaude = new javax.swing.JRadioButton();
        radioAreaLazer = new javax.swing.JRadioButton();
        radioAreaFinanceiro = new javax.swing.JRadioButton();
        radioAreaPessoal = new javax.swing.JRadioButton();
        botaoCriarHabito = new javax.swing.JButton();
        labelNomeHabito = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNovoHabito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNovoHabito.setText("Hábito Semanal ");

        labelDiaSemana.setText("Dias da Semana:");

        radioSegunda.setText("Segunda");
        radioSegunda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSegundaActionPerformed(evt);
            }
        });

        radioTerca.setText("Terça");
        radioTerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTercaActionPerformed(evt);
            }
        });

        radioQuarta.setText("Quarta");
        radioQuarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioQuartaActionPerformed(evt);
            }
        });

        radioQuinta.setText("Quinta");

        radioSexta.setText("Sexta");
        radioSexta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSextaActionPerformed(evt);
            }
        });

        radioSabado.setText("Sábado");
        radioSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSabadoActionPerformed(evt);
            }
        });

        radioDomingo.setText("Domingo");
        radioDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDomingoActionPerformed(evt);
            }
        });

        labelTurno.setText("Turno");

        buttonGroup2.add(radioQualquer);
        radioQualquer.setText("Qualquer");
        radioQualquer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioQualquerActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioManha);
        radioManha.setText("Manha");
        radioManha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioManhaActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioTarde);
        radioTarde.setText("Tarde");
        radioTarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTardeActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioNoite);
        radioNoite.setText("Noite");

        nomeHabito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nomeHabito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeHabitoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioAreaSaude);
        radioAreaSaude.setText("Saúde");
        radioAreaSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAreaSaudeActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioAreaLazer);
        radioAreaLazer.setText("Lazer");
        radioAreaLazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAreaLazerActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioAreaFinanceiro);
        radioAreaFinanceiro.setText("Vida Financeira");

        buttonGroup1.add(radioAreaPessoal);
        radioAreaPessoal.setText("Desenvolvimento Pessoal");
        radioAreaPessoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAreaPessoalActionPerformed(evt);
            }
        });

        botaoCriarHabito.setText("Criar Hábito!");
        botaoCriarHabito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarHabitoActionPerformed(evt);
            }
        });

        labelNomeHabito.setText("Qual Hábito gostaria de  monitorar?");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecione Área Relacionada:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator3)
            .addComponent(labelNovoHabito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(botaoCriarHabito)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(labelNomeHabito)
                                .addGap(27, 27, 27)
                                .addComponent(nomeHabito, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(178, 178, 178)
                                        .addComponent(radioSabado)
                                        .addGap(30, 30, 30)
                                        .addComponent(radioDomingo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(74, 74, 74)
                                        .addComponent(radioSegunda)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioTerca)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioQuarta)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioQuinta)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioSexta))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(labelDiaSemana))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(radioAreaSaude)
                                .addGap(31, 31, 31)
                                .addComponent(radioAreaLazer)
                                .addGap(18, 18, 18)
                                .addComponent(radioAreaFinanceiro)
                                .addGap(18, 18, 18)
                                .addComponent(radioAreaPessoal))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(radioQualquer)
                                .addGap(70, 70, 70)
                                .addComponent(radioManha)
                                .addGap(70, 70, 70)
                                .addComponent(radioTarde)
                                .addGap(63, 63, 63)
                                .addComponent(radioNoite))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(labelTurno)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNovoHabito)
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAreaSaude)
                    .addComponent(radioAreaLazer)
                    .addComponent(radioAreaFinanceiro)
                    .addComponent(radioAreaPessoal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeHabito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeHabito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDiaSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSegunda)
                    .addComponent(radioTerca)
                    .addComponent(radioQuarta)
                    .addComponent(radioQuinta)
                    .addComponent(radioSexta))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSabado)
                    .addComponent(radioDomingo))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTurno)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNoite)
                    .addComponent(radioTarde)
                    .addComponent(radioManha)
                    .addComponent(radioQualquer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCriarHabito)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCriarHabitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarHabitoActionPerformed
        System.out.println(nomeHabito.getText());
//        //area da vida selecionada
//        if(radioAreaPessoal.isSelected() == true ){
//            habitoSemanal.areaVida.setNome("Crescimento Pessoal");
//        } if (radioAreaLazer.isSelected()){
//            habitoSemanal.areaVida.setNome("Lazer");
//        }if(radioAreaSaude.isSelected()){
//            habitoSemanal.areaVida.setNome("Saúde");
//        }if(radioAreaFinanceiro.isSelected()){
//            habitoSemanal.areaVida.setNome("Vida Financeira");
//        }
//        
        if(radioQualquer.isSelected() == true ){
            habitoSemanal.turno.setValor(1);
        } if (radioManha.isSelected()){
            habitoSemanal.turno.setValor(2);
        }if(radioTarde.isSelected()){
            habitoSemanal.turno.setValor(3);
        }if(radioNoite.isSelected()){
            habitoSemanal.turno.setValor(4);
        }

//        //Nome que o Hábito recebe
        if(nomeHabito.getText() == ""){ //ERROR!
            JOptionPane.showMessageDialog(null, "Você esqueceu de preencher todos os campos!");
        }else{        
        habitoSemanal.setNome(nomeHabito.getText());
        }
        
        //criar uma lista que  coleta todos os radio marcados 
//        habitoSemanal.
//        
//        
//        TelaHabitoSemanal habitoSemana= new TelaHabitoSemanal();
    }//GEN-LAST:event_botaoCriarHabitoActionPerformed

    private void radioManhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioManhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioManhaActionPerformed

    private void radioQualquerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioQualquerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioQualquerActionPerformed

    private void radioDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDomingoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDomingoActionPerformed

    private void radioSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSabadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSabadoActionPerformed

    private void radioSextaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSextaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSextaActionPerformed

    private void radioQuartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioQuartaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioQuartaActionPerformed

    private void radioTercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTercaActionPerformed

    private void radioSegundaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSegundaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSegundaActionPerformed

    private void nomeHabitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeHabitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeHabitoActionPerformed

    private void radioAreaSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAreaSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAreaSaudeActionPerformed

    private void radioAreaLazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAreaLazerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAreaLazerActionPerformed

    private void radioAreaPessoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAreaPessoalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAreaPessoalActionPerformed

    private void radioTardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTardeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTardeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(TelaHabitoSemanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaHabitoSemanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaHabitoSemanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaHabitoSemanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaHabitoSemanal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCriarHabito;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel labelDiaSemana;
    private javax.swing.JLabel labelNomeHabito;
    private javax.swing.JLabel labelNovoHabito;
    private javax.swing.JLabel labelTurno;
    private javax.swing.JTextField nomeHabito;
    private javax.swing.JRadioButton radioAreaFinanceiro;
    private javax.swing.JRadioButton radioAreaLazer;
    private javax.swing.JRadioButton radioAreaPessoal;
    private javax.swing.JRadioButton radioAreaSaude;
    private javax.swing.JRadioButton radioDomingo;
    private javax.swing.JRadioButton radioManha;
    private javax.swing.JRadioButton radioNoite;
    private javax.swing.JRadioButton radioQualquer;
    private javax.swing.JRadioButton radioQuarta;
    private javax.swing.JRadioButton radioQuinta;
    private javax.swing.JRadioButton radioSabado;
    private javax.swing.JRadioButton radioSegunda;
    private javax.swing.JRadioButton radioSexta;
    private javax.swing.JRadioButton radioTarde;
    private javax.swing.JRadioButton radioTerca;
    // End of variables declaration//GEN-END:variables
}
