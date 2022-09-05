package controle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import  classesBase.Usuario;
import view.Login;

public class ControllerLogin {
	
	private List<Usuario> usuarios ;
	private Login telaLogin ;
	
	
	public ControllerLogin() {
		this.usuarios = new ArrayList<Usuario>();
		this.telaLogin = new Login();
		this.usarioValido();
	}
	public void usarioValido() {
		Usuario usuario = new Usuario();
		usuario.setNome("Maria");
		usuario.setSenha("ailab");
		usuario.setEmail("maria@ironmaiden.com");
		this.usuarios.add(usuario);
	}
	private int buscaUsuarioPorNome(String nome) {
		for(int i=0; i<usuarios.size();i++) {
			if(usuarios.get(i).getNome().equals(nome))
			{
				return i;
			}
		}
		return -1;
	}
	
	
	@SuppressWarnings("deprecation")
	private boolean validaLogin(int posicao) {
		if(posicao == -1) {
			return false;
		}
		if(usuarios.get(posicao).getSenha().equals(telaLogin.getSenha().getText()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void loginBotaoActionPerformed(java.awt.event.ActionEvent evt) {                                           
	    int index = this.buscaUsuarioPorNome(this.telaLogin.getNome().getText());  
	    if(validaLogin(index)) {
	    	JOptionPane.showMessageDialog(null,"Voce está autorizado");
	    }
    } 
}
