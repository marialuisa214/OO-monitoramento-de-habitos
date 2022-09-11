package Swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Login {
	
	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setTitle("nome da tela");
		tela.setSize(350, 440);
		tela.setLocation(500, 330);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel painel = new JPanel();
		
		JLabel nomeLabel = new JLabel("Nome:");
		JTextField nome = new JTextField(10);
		
		JLabel senhaLabel = new JLabel("Senha:");
		JPasswordField senha = new JPasswordField(10);
		
		JButton botaoLogin = new JButton("Entrar");
		AcaoDoBotaoLogin acao = new AcaoDoBotaoLogin(nome);
		botaoLogin.addActionListener(acao);
		
		painel.add(nomeLabel); 
		painel.add(nome);
		painel.add(senhaLabel); 
		painel.add(senha);
		painel.add(botaoLogin);
		
				
		
		tela.add(painel);
		tela.setVisible(true);
	}

}
