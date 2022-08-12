package classesBase;
import java.util.Date;


public class Lembrete {
//ATRIBUTOS
	private Habito habitoRelacionado;
	private String aviso;
	private Date horarioDeEnvio;
	
//CONSTRUTOR
	public Lembrete(Habito habitoRelacionado){
		this.habitoRelacionado = habitoRelacionado;
		//não é necessário para a existencia do habito que o usuario 
		//defina uma mensagem de aviso, ela pode ser padrão
		//caso o usuario não deseje inserir um horario de lembrete, por padrão ele será 15 min
	}
//METODOS
	public Habito getHabitoRelacionado() {
		return habitoRelacionado;}
	//um lembrete não pode ser alocado em outo habito, por isso não há setHabitoRelacionado
	
	public String getAviso() {
		return aviso;}
	public void setAviso(String mensagemEstilizada) {
		this.aviso = mensagemEstilizada;
	}
	
	public Date getHorarioDeEnvio() {
		return horarioDeEnvio;}
	public void setHorarioDeEnvio(Date horarioEstilizado) {
		this.horarioDeEnvio = horarioEstilizado;		
	}
	
}
