package interfaceList;

import java.util.ArrayList;
import java.util.List;

public class ExercicioList{
	
	public static void main(String[] args) {
		
		List<Tempo> hTemp = new ArrayList<>() {{
			add(new Tempo("Janeiro", 25.8));
			add(new Tempo("Fevereiro", 27.7));
			add(new Tempo("Mar�o", 28.1));
			add(new Tempo("Abril", 24.5));
			add(new Tempo("Maio", 23.4));
			add(new Tempo("Janho", 26.6));
		}};
		
	System.out.println(hTemp);
	/*
	Iterator<Tempo> at = hTemp.iterator();
	double i = 0;
	if(at.hasNext()) {
		double j = 
		i += at.next();
	}
	*/
	}
}
