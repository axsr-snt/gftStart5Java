package interfaceList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class OrdenarList {	

	public static void main(String[] args) {
		
		List<Gato> gatos = new ArrayList<>(){{
			add(new Gato("Puga", 6, "Sphynx"));
			add(new Gato("chico", 9, "Siames"));
			add(new Gato("Bob", 5, "Persa"));
			add(new Gato("Pandora", 8, "Ragdoll"));
			add(new Gato("Mimi", 3, "Munchkin"));
			add(new Gato("Teddy", 14, "Siberiano"));
		}};
		
		//ordena??o por ordem de inser??o
		System.out.println("\nOrdena??o por ordem de inser??o: " + gatos);
		
		//ordena??o aleat?ria utilizando a implementando a interface Collections
		Collections.shuffle(gatos);
		System.out.println("\nOrdena??o aleat?ria: " + gatos);
		
		//ordena??o por ordem natural
		Collections.sort(gatos);
		System.out.println("\nOrdena??o natural: " + gatos);
		
		//ordena??o por idade
		Collections.sort(gatos, new ComparatorIdade());
		//gatos.sort(new ComparatorIdade());
		System.out.println("\nOrdena??o por idade: " + gatos);
		
		//ordena??o por ra?a
		//Collections.sort(gatos, new ComparatorRaca());
		gatos.sort(new ComparatorRaca());
		System.out.println("\nOrdenado por ra?a: " + gatos);
		
		Collections.sort(gatos, new ComparatorFull());
		System.out.println("\nOrdena??o completa: " + gatos);
	}
}