
package classesBase;

public enum Turnos {
	QUALQUER(1), MANHA(2), TARDE(3), NOITE(4);

	public int valor;
	
//CONSTRUTOR
	Turnos(int valor) {
		this.valor = valor;
	}
//METODOS	
	public void setValor(int valor){
		this.valor = valor;
	}
	 public int getValor() {
		 return this.valor;
	 }
}
