
package model;

import java.util.Calendar;

public class HabitoDatado extends Habito {
//ATRIBUTOS
	int dataFixa;
	Calendar c = Calendar.getInstance();
	//instaciar "Calendar c = Calendar.getInstance();"
	// na main e depois passar como int dentro do data
		//ex: "c.set(Calendar.YEAR, 1998);"
		//ex: "correr.setData(c.get(Calendar.YEAR));"

//CONSTRUTOR
        public HabitoDatado(String nome, AreaDaVida areaRelacionada){
		this.nome = nome;
		this.areaRelacionada = areaRelacionada;}

//METODOS
	public int getData() {
		return dataFixa;}
	public void setData(int data) {
		this.dataFixa = data;}
}
