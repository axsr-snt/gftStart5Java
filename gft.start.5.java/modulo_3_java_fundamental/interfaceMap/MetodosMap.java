package interfaceMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MetodosMap {
	
	public static void main(String[] args) {
		
		//Map carrosPopulares2020 = new HashMap(); //antes do java 5
		//Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
		//HashMap<String, Double> carrosPopulares = new HashMap<>();
		//Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6)
	
	Map<String, Double> carrosPop = new HashMap<>();
		carrosPop.put("Gol", 14.4);
		carrosPop.put("Uno", 15.6);
		carrosPop.put("Mobi", 16.1);
		carrosPop.put("HB20", 14.5);
		carrosPop.put("Kwid", 15.6);
		System.out.println("\nCarros populares: " + carrosPop.toString());
	
	//substituindo um valor de uma chave
	carrosPop.put("Gol", 15.2);
		System.out.println("\nLista com o Gol atualizado: " + carrosPop.toString());
	
	//consultar se a chave tucson est? no dicionario
	boolean status = carrosPop.containsKey("Tucson");
		System.out.println("\nCont?m o carro Tucson no dicionario? " + status);
	
	//exibindo o valor de uma chave
	double i = carrosPop.get("Uno");
		System.out.println("\nO consumo do Uno ? de: " + i);
	
	//exibir as chaves do dicionario
	Set<String> chaves = carrosPop.keySet();
		System.out.println("\nO conjunto de chaves do dicionario s?o: " + chaves);
	
	//exibir os valores do dicionario
	Collection<Double> valores = carrosPop.values();
		System.out.println("\nO conjunto de valores que o dicion?rio possui s?o: " + valores);
	
	//exibir a chave e o valor do modelo mais economico
	double eco = Collections.max(carrosPop.values());
	Set<Map.Entry<String, Double>> entries = carrosPop.entrySet();
		String modEco = "";
		for(Map.Entry<String, Double> entry : entries) {
			if(entry.getValue().equals(eco)) {
				modEco = entry.getKey();
		}
	}
		System.out.println("\nO modelo mais economico ?: " + modEco + " que faz " + eco + " km por litro");
	
	//exibir a chave e o valor do modelo menos economico
	double con = Collections.min(carrosPop.values());
		String modCon = "";
		for(Map.Entry<String, Double> entry : entries) {
			if(entry.getValue().equals(con)) {
				modCon = entry.getKey();
		}
	}
	System.out.println("\nO modelo menos economico ?: " + modCon + " que faz " + con + " km por litro");
	
	//exibir a m?dia da km/l
	Iterator<Double> iterator = carrosPop.values().iterator();
		double j = 0d;
		while(iterator.hasNext()) {
			j += iterator.next();
		}
		double med2 = j/carrosPop.size();
			System.out.println("\nA m?dia de consumo dos carros populares ?: " + med2);
	
	//remover os registros onde a km/l ? igual a 15.6
	/*Iterator<Double> iterator1 = carrosPop.values().iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next().equals(15.6))
				iterator1.remove();
	}
	System.out.println("\nA lista atualizada de carros ?: " + carrosPop);
	*/
	
	//exibir o dicionario na ordem de inser??o
	Map<String, Double> carrosPop2 = new LinkedHashMap<>(){{
		put("Gol", 14.4);
		put("Uno", 15.6);
		put("Mobi", 16.1);
		put("HB20", 14.5);
		put("Kwid", 15.6);
	}};
		System.out.println("\nDicionario na ordem de inser??o: " + carrosPop2.toString());
	
	//exibir dicionario ordenado pela chave
	Map<String, Double> carrosPop3 = new TreeMap<>(carrosPop2);
		System.out.println("Dicionario ordena??o pela chave: " + carrosPop3);
	
	carrosPop.clear();
	boolean status2 = carrosPop.isEmpty();
		System.out.println("\nO dicionario est? vazio? " + status2);
	
	}	
}
