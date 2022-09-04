package classesBase;
import java.util.Calendar;

public class TesteMain {

	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		HabitoDatado correr = new HabitoDatado();
		
		c.set(Calendar.YEAR, 1998);
		
		
		correr.setData(c.get(Calendar.YEAR));
		System.out.println(correr.dataFixa);
		
		

	}

}
