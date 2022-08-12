package classesBase;

public class Habito {
	//ATRIBUTOS
		protected String nome;
		protected int repeticaoDia;
		protected String turno; //usar enum posteriomente
		protected int feito;
		protected boolean status;
		private Lembrete lembrete;

	//METODOS
		public String getNome() {
			return nome;}
		public void setNome(String nome) {
			this.nome = nome;}
		
		public int getRepeticaoDia() {
			return repeticaoDia;}
		public void setrepeticaoDia(int repeticoes) {
			this.repeticaoDia = repeticoes;}
		
		public String getTurno() {
			return turno;}
		public void setTurno(String turno) {
			this.turno = turno;}
		
		public int getFeito() {
			return feito;}
		public void setFeito(int feito) {
			this.feito = feito;}
		
		public boolean getStatus() {
			return status;}
		public void setStatus(boolean status) {
			this.status = status;}

}
