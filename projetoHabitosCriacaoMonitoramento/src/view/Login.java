package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ModuleLayer.Controller;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import controle.ControllerLogin;
public class Login implements ActionListener {
//	List<Usuario> usuarios = new ArrayList<Usuario>();
	private static JFrame janela;
	private static JPasswordField senha;
	private static JPanel p;
	static JLabel nameLabel;
	static JTextField nome;
	static JButton loginBotao;
	static JLabel senhaLabel;
	static ControllerLogin controller; 
	
	public static void iniciaLogin() {
		janela = new JFrame("Login");
		janela.setSize(350, 570);
		janela.setLocation(500, 150);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		p= new JPanel();
		nameLabel= new JLabel("Nome:");
		nome= new JTextField(10);
		senhaLabel= new JLabel("Senha:");
		p.add(nameLabel);
		p.add(senhaLabel);
		p.add(nome);
		p.add(senha);
		loginBotao= new JButton("Logar");
		p.add(loginBotao);
		controller = new ControllerLogin(); 
	}

	public static void main(String[] args) {
		
//		JLabel cadastraLabel = new JLabel("Não possui Login? Cadastre-se!");
//		JButton cadastraBotao = new JButton("Cadastrar-se!");
//		p.add(cadastraLabel);
//		p.add(cadastraBotao);
		/* Create and display the form */
        
		Login login=new Login();
		iniciaLogin();
		login.setVisible(true);
		
		
	
		}


	



	protected void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}


	public void setJanela(JFrame janela) {
		this.janela = janela;
	}



	public JPasswordField getSenha() {
		return senha;
	}



	public void setSenha(JPasswordField senha) {
		this.senha = senha;
	}



	public JPanel getP() {
		return p;
	}



	public void setP(JPanel p) {
		this.p = p;
	}



	public JLabel getNameLabel() {
		return nameLabel;
	}



	public void setNameLabel(JLabel nameLabel) {
		this.nameLabel = nameLabel;
	}



	public JTextField getNome() {
		return nome;
	}



	public void setNome(JTextField nome) {
		this.nome = nome;
	}



	public JButton getLoginBotao() {
		return loginBotao;
	}



	public void setLoginBotao(JButton loginBotao) {
		this.loginBotao = loginBotao;
	}



	public JLabel getSenhaLabel() {
		return senhaLabel;
	}



	public void setSenhaLabel(JLabel senhaLabel) {
		this.senhaLabel = senhaLabel;
	}



		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	
    
}
