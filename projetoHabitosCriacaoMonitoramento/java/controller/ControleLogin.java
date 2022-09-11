package controller;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import  model.Usuario;
import view.Login;

public class ControleLogin {
	
	private List<Usuario> usuarios ;

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
	
	
	public ControleLogin() {
		this.usuarios = new ArrayList<Usuario>(); 
	}
	
        
	        public void mostraLista(){
             JOptionPane.showMessageDialog(null, usuarios.toString());
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
        
        public Usuario coletaUsuario(Usuario user){
            return user;
        }
        
	
	@SuppressWarnings("deprecation")
	public boolean validaLogin(int posicao, String senha) {
		if(posicao == -1) {
                        JOptionPane.showMessageDialog(null, "Não autenticado!");
			return false;
		}
		if(usuarios.get(posicao).getSenha().equals(senha))
		{
                    JOptionPane.showMessageDialog(null, "Autenticado!");
                    return true;
		}
		else
		{
                        JOptionPane.showMessageDialog(null, "Não autenticado!");
			return false;
		}
	}
 
}

