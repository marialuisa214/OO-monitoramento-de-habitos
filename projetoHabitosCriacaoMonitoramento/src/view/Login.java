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
	//ATRIBUTOS
	private JFrame janela = new JFrame();
	private JLabel nomeLabel = new JLabel("Nome:");
	private JTextField nome = new JTextField(10);
		
	private JLabel senhaLabel = new JLabel("Senha:");
	private JTextField senha = new JPasswordField(10);
		
	private static JButton botaoLogin = new JButton("Logar");
	private ControllerLogin controle = new ControllerLogin();
		
	//METODOS	
	public void autenticar() {
		System.out.println("rodei");
		janela = new JFrame();
		janela.setVisible(true);
		
	}
	public Login() {
		janela.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getSource();
		if(src == botaoLogin) {
			this.controle.usarioValido();
			int index = controle.buscaUsuarioPorNome(nome.getText());
			if(controle.validaLogin(index, senha.getText())) {
				JOptionPane.showMessageDialog(null, "encontrado!");
			} else {
				JOptionPane.showMessageDialog(null, "Não encontrado!");
			}
		}
	}

	public static void main(String[] args) {
		Login tela = new Login();
		tela.autenticar();
		botaoLogin.addActionListener(tela);
	
	}

}
