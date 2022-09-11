package Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AcaoDoBotaoLogin implements ActionListener {
	
	private JTextField nome;
	
	public AcaoDoBotaoLogin(JTextField nomeInserido) {
		this.nome = nomeInserido;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("vc apertou meu botãozinho");
		
		String nomeUser = nome.getText();
		JOptionPane.showMessageDialog(null, "O nome do usuario é: " + nomeUser);
	}

}
