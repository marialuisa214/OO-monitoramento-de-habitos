package classesBase;

public class Usuario {
	//ATRIBUTOS
		private String nome;
		private String email;
		private String senha;

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
}
