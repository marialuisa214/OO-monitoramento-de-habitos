package classesBase;

public enum DiasSemana {
	//ATRIBUTOS
		DOMINGO(1), SEGUNDA(2), TERÇA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);

		private int valor;
		
	//CONSTRUTOR
		DiasSemana(int valor) {
			this.valor = valor;
		}
	//METODOS
		public void setValor(int valor){
			this.valor = valor;
		}
		 public int valor() {
			 return valor;
		 }
}

