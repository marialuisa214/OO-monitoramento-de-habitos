package classesBase;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
//ATRIBUTOS
	private String nome;
	private String email;
	private String senha;
        public AreaDaVida area;
        private List<HabitoSemanal> habitosSemanais = new ArrayList<HabitoSemanal>();
//                
//        public List<HabitoSemanal> getHabitosSemanais() {
//            return habitosSemanais;
//        }
//        public void setUsuarios(List<HabitoSemanal> habitosSemanais) {
//        this.habitosSemanais = habitosSemanais;
//        }
//        
//        public void criarHabito(HabitoSemanal habitoSemanal){
//        habitosSemanais.add(habitoSemanal);
//    }
//                

    public List<HabitoSemanal> getHabitosSemanais() {
        return habitosSemanais;
    }

    public void setHabitosSemanais(List<HabitoSemanal> habitosSemanais) {
        this.habitosSemanais = habitosSemanais;
    }

         
                
	//CONSTRUTOR
	/*	public Usuario(String nome, String email, String senha) {
			this.nome = nome;
			this.email = email;
			this.senha = senha;
		}
	*/	
//	METODOS
		public String getNome() {
			return nome;}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getEmail() {
			return email;}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getSenha() {
			return senha;}
		public void setSenha(String senha) {
			this.senha = senha;
		}
	//validação de senha
		public boolean autentica(String  senha) {
			if(this.senha == senha) {
				return true;
			}else {
				return false;}
                }

//
//                public AreaDaVida getArea() {
//                    return area;
//                }
//
//                public void setArea(AreaDaVida area) {
//                    this.area = area;
//                }
		

    @Override
    public String toString() {
        return "Usuario{" + "nome=" + nome + ", email=" + email + ", senha=" + senha + '}';
    }
         
}

