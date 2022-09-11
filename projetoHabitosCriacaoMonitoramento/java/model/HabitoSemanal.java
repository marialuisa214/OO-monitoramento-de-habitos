package model;

public class HabitoSemanal extends Habito {
//ATRIBUTOS
	private DiasSemana diaSelecionado;
	
//CONSTRUTOR
//	HabitoSemanal (String nome, AreaDaVida areaRelacionada){
//		this.nome = nome;
//		this.areaRelacionada = areaRelacionada;
//		//inserir os dias tbm!!
//	}
	
//METODOS
	public DiasSemana getDia(){
		return diaSelecionado;}
	public void setDiasSemana(DiasSemana dia) {
		this.diaSelecionado = dia;}
}
