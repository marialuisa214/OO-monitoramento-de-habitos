package classesBase;

public class HabitoSemanal extends Habito {
//ATRIBUTOS
	private DiasSemana diaSelecionado;
	
// o que é necessário para a construção do hábito?(nome, dias da semana o resto é pré preparado)
	
//METODOS
	public DiasSemana getDia(){
		return diaSelecionado;}
	public void setDiasSemana(DiasSemana dia) {
		this.diaSelecionado = dia;}
}
