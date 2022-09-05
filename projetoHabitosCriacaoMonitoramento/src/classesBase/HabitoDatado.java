package classesBase;

import java.util.Calendar;

public class HabitoDatado {
//ATRIBUTOS
	int dataFixa;
	Calendar c = Calendar.getInstance();
	//instaciar "Calendar c = Calendar.getInstance();"
	// na main e depois passar como int dentro do data
		//ex: "c.set(Calendar.YEAR, 1998);"
		//ex: "correr.setData(c.get(Calendar.YEAR));"

//CONSTRUTOR

//METODOS
	public int getData() {
		return dataFixa;}
	public void setData(int data) {
		this.dataFixa = data;}
}
