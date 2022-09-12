package dao;

import java.util.ArrayList;
import java.util.List;

import classesBase.Usuario;

public class BancoUsuarios {
    private List<Usuario> usuarios;

    public BancoUsuarios() {
        this.usuarios = new ArrayList<Usuario>();
    }

    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    
//    public List<Usuario>  getUsuarioEspecifico(){
//        return usuarios.
//    
//    }
    
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
    public int tamanho(){
        return this.usuarios.size();
    }
    
    public void cadastrar(Usuario usuario){
    
        usuarios.add(usuario);
    }

    @Override
    public String toString() {
        return this.usuarios.toString();
    }
    
    
}
