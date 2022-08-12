package classesBase;
import java.util.Date;

public class HabitoDatado {
//ATRIBUTOS
	Date dataFixa;
	
//CONSTRUTOR
	public HabitoDatado(Date data) {
		this.dataFixa = data;
	}

//METODOS
	public Date getDataFixa() {
		return dataFixa;}
	public void setDataFixa(Date data) {
		this.dataFixa = data;
	}
}
