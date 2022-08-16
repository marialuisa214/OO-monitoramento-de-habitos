package classesBase;
import java.util.Date;

public class Lembrete {
	
//ATRIBUTOS
	private String aviso;
	private Date horarioDeEnvio;
	
//CONSTRUTOR
//	não é necessário um construtor-> já há um lembrete padrão
		//caso o usuario não defina uma mensagem de aviso, ela pode ser padrão
		//caso o usuario não deseje inserir um horario de lembrete, por padrão ele será 15 min antes do turno
	
//METODOS
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
