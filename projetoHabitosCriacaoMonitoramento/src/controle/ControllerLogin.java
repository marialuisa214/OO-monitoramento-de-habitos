package controle;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import  classesBase.Usuario;
import view.Login;

public class ControllerLogin {
	
	private List<Usuario> usuarios ;
	
	
	public ControllerLogin() {
		this.usuarios = new ArrayList<Usuario>();
		this.usarioValido();
	}
	
	public void usarioValido() {
		Usuario usuario = new Usuario();
		usuario.setNome("Maria");
		usuario.setSenha("ailab");
		usuario.setEmail("maria@ironmaiden.com");
		this.usuarios.add(usuario);
	}
	public int buscaUsuarioPorNome(String nome) {
			for(int i=0; i<usuarios.size();i++) {
			if(usuarios.get(i).getNome().equals(nome))
			{
				return i;
			}
		}
		return -1;
	}
	
	public Usuario retornoUsuarioID(int id) {
		return usuarios.get(id);
	}
	
	@SuppressWarnings("deprecation")
	public boolean validaLogin(int posicao, String senha) {
		if(posicao == -1) {
			return false;
		}
		if(usuarios.get(posicao).getSenha().equals(senha))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
 
}
