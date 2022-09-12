/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

import classesBase.Usuario;

/**
 *
 * @author maria
 */
public class Cadastro extends javax.swing.JFrame {

    private Usuario user;
    
    
    public Cadastro() {
        initComponents();
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadastro = new javax.swing.JPanel();
        labelNomeCadastro = new javax.swing.JLabel();
        labelEmailCadastro = new javax.swing.JLabel();
        labelSenhaCadastro = new javax.swing.JLabel();
        labeConfirmaSenhaCadastro = new javax.swing.JLabel();
        nomeCadastro = new javax.swing.JTextField();
        emailCadastro = new javax.swing.JTextField();
        senhaCadastro = new javax.swing.JPasswordField();
        confirmaSenhaCadastro = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelNomeCadastro.setText("Nome:");

        labelEmailCadastro.setText("Email:");

        labelSenhaCadastro.setText("Senha:");

        labeConfirmaSenhaCadastro.setText("Confirmação de senha:");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadastroLayout = new javax.swing.GroupLayout(painelCadastro);
        painelCadastro.setLayout(painelCadastroLayout);
        painelCadastroLayout.setHorizontalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labeConfirmaSenhaCadastro)
                            .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                                    .addComponent(labelSenhaCadastro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(senhaCadastro))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCadastroLayout.createSequentialGroup()
                                    .addComponent(labelEmailCadastro)
                                    .addGap(18, 18, 18)
                                    .addComponent(emailCadastro))
                                .addGroup(painelCadastroLayout.createSequentialGroup()
                                    .addComponent(labelNomeCadastro)
                                    .addGap(18, 18, 18)
                                    .addComponent(nomeCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                .addComponent(confirmaSenhaCadastro, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(painelCadastroLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        painelCadastroLayout.setVerticalGroup(
            painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeCadastro)
                    .addComponent(nomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmailCadastro)
                    .addComponent(emailCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(painelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenhaCadastro)
                    .addComponent(senhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labeConfirmaSenhaCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmaSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.getUser();
    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean cadastrado()
    {
        if(this.user!=null)
        {
            return true;
        }
        else
        {
           return false;
        }
    }
    public Usuario getUser() {
      
        user = new Usuario();
        // 2 passo - pagar o capmo texto e colocar na classe Usuario
        user.setNome(nomeCadastro.getText());
        user.setEmail(emailCadastro.getText());
        if(senhaCadastro.getText().equals(confirmaSenhaCadastro.getText())){
            user.setSenha(senhaCadastro.getText());
        }else{
             JOptionPane.showMessageDialog(null, "A senha não confere, tente novamente!");
        }
        this.dispose();
        
        return user;
        
    }

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmaSenhaCadastro;
    private javax.swing.JTextField emailCadastro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel labeConfirmaSenhaCadastro;
    private javax.swing.JLabel labelEmailCadastro;
    private javax.swing.JLabel labelNomeCadastro;
    private javax.swing.JLabel labelSenhaCadastro;
    private javax.swing.JTextField nomeCadastro;
    private javax.swing.JPanel painelCadastro;
    private javax.swing.JPasswordField senhaCadastro;
    // End of variables declaration//GEN-END:variables
}
