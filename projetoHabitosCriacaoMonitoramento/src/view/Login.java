package view;




import dao.BancoUsuarios;
import javax.swing.JOptionPane;

import classesBase.Usuario;
import controle.ControleLogin;

public class Login extends javax.swing.JFrame {

    private ControleLogin controller = new ControleLogin();
    private  BancoUsuarios bancoUsuarios ;
    private static Cadastro telaCadastro = new Cadastro();
    private static TelaPrincipal telaPrincipal;
    boolean cadastrado;
    
    
    
    public Login() {
        initComponents();       
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.bancoUsuarios= new BancoUsuarios();
        cadastrado = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        labelLogin = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        botaoEntrar = new javax.swing.JButton();
        labelCadastro = new javax.swing.JLabel();
        botaoTelaCadastro = new javax.swing.JButton();
        botaoRecarrega = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelLogin.setText("Login:");

        labelSenha.setText("Senha:");

        botaoEntrar.setText("Entrar");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        labelCadastro.setText("Ainda não possui uma conta?");

        botaoTelaCadastro.setText("Cadastre-se!");
        botaoTelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTelaCadastroActionPerformed(evt);
            }
        });

        botaoRecarrega.setText("Refresh");
        botaoRecarrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRecarregaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSenha)
                            .addComponent(labelLogin))
                        .addGap(18, 18, 18)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNome, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                            .addComponent(campoSenha)))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(labelCadastro))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(botaoRecarrega))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(botaoEntrar))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(botaoTelaCadastro)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(botaoRecarrega)
                .addGap(43, 43, 43)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogin)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(botaoEntrar)
                .addGap(18, 18, 18)
                .addComponent(labelCadastro)
                .addGap(18, 18, 18)
                .addComponent(botaoTelaCadastro)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
    //mostrar lista
    controller.mostraLista();

       //passo 1 - capturar o que o usuario digitou do campoNome
       String nome = campoNome.getText();
       //passo 2 - achar a posição da lista do nomeCampo
       controller.setUsuarios(bancoUsuarios.getUsuarios());
       int index = controller.buscaUsuarioPorNome(nome);
       //passo 3 -capturar senha
       String senha = campoSenha.getText();
       //passo4 - com a posição na lista e a senha, vamos validar o login usando método da controller
       boolean autenticado = controller.validaLogin(index, senha);
       
//       return dadosUsuario =[controller.buscaUsuarioPorNome(nome), ]
       JOptionPane.showMessageDialog(null, senha);
       
       
       if(autenticado){
        this.dispose();
        Usuario usuario = new Usuario();
        usuario.setNome(bancoUsuarios.getUsuarios().get(index).getNome());
        System.out.println("ENTROU AQUI");
        telaPrincipal = new TelaPrincipal();
        telaPrincipal.usuario = usuario;
        telaPrincipal.setVisible(true);
       }
       
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoTelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTelaCadastroActionPerformed
        telaCadastro.setVisible(true);
        this.cadastrado = true;
//        this.dispose();
    }//GEN-LAST:event_botaoTelaCadastroActionPerformed

    private void botaoRecarregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRecarregaActionPerformed
        Usuario usuario = this.telaCadastro.getUser();
        if(usuario == null)
        {
            JOptionPane.showMessageDialog(null, "lascou");
            return;
        }
        this.bancoUsuarios.cadastrar(usuario);
        
        JOptionPane.showMessageDialog(null, bancoUsuarios.toString());
    }//GEN-LAST:event_botaoRecarregaActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JButton botaoRecarrega;
    private javax.swing.JButton botaoTelaCadastro;
    private javax.swing.JTextField campoNome;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel labelCadastro;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
