package classesBase;

public abstract class Habito {
	//ATRIBUTOS
		protected String nome;
		protected int repeticaoDia = 1;
		protected Turno turno = Turno.QUALQUER; 
		protected int feito;
		protected boolean status;
		protected Lembrete lembrete;

	//METODOS
		public String getNome() {
			return nome;}
		public void setNome(String nome) {
			this.nome = nome;}
		
		public int getRepeticaoDia() {
			return repeticaoDia;}
		public void setRepeticaoDia(int repeticoes) {
			this.repeticaoDia = repeticoes;}
		
		public int getFeito() {
			return feito;}
		public void setFeito(int feito) {
			this.feito = feito;
			if(feito==repeticaoDia) {
				System.out.println("tarefa completa!");
				this.status = true;
			} if(feito > repeticaoDia) {
				System.out.println("erro"); //não deve ser possivel realizar mais vezes que o indicado ao criar o hábito
			} else {
				System.out.println("para finalizar esse hábito faltam " + (repeticaoDia - feito) + " vezes");
			}
				}
		
		public Turno getTurno(){
			return turno;}
		public void setDefinindoTurno(Turno turno) {
			this.turno = turno;}
		
		public boolean getStatus() {
			return status;}
		public void setStatus(boolean status) {
			this.status = status;}

}
