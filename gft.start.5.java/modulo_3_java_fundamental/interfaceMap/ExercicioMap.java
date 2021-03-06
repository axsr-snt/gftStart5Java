package interfaceMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExercicioMap {

	public static void main(String[] args) {
		Map<String, Integer> populacao = new HashMap<>();
		populacao.put("PE", 9616621);
		populacao.put("AL", 3351543);
		populacao.put("CE", 9187103);
		populacao.put("RN", 3534265);
	
	System.out.println("\nDicion?rio popu??o NE do Brasil: " + populacao.toString());
	
	populacao.put("RN", 3534165);
	System.out.println("\nAlterado valor RN de  3.534.265 para 3.534.165: " + populacao.toString());
	
	boolean status1 = populacao.containsKey("PB");
	System.out.println("\nH? informa??o de PB? " + status1);
	
	populacao.put("PB", 4039277);
	System.out.println("\nDicionario atualizado: " + populacao.toString());
	
	System.out.println("\nPopula??o PB: " + populacao.get("PB"));
	
	Map<String, Integer> populacao1 = new LinkedHashMap<>();
	populacao1.put("PE", 9616621);
	populacao1.put("AL", 3351543);
	populacao1.put("CE", 9187103);
	populacao1.put("RN", 3534265);
	populacao1.put("PB", 4039277);
	
	System.out.println("\nDicionario em ordem de inser??o: " + populacao1.toString());
	
	Map<String, Integer> populacao2 = new TreeMap<>(populacao1);
	System.out.println("\nDicionario em ordem alfabetica: " + populacao2.toString());
	
	Collection<Integer> populacao3 = populacao.values();
	String maxPop = "";
	String minPop = "";
	for(Map.Entry<String, Integer> entry : populacao.entrySet()) {
		if(entry.getValue().equals(Collections.max(populacao3))) 
			maxPop = entry.getKey();
		if(entry.getValue().equals(Collections.min(populacao3)))
			minPop = entry.getKey();	
	}
	System.out.printf("\nEstado com a menor popula??o: (%s) com (%d) pessoas", minPop, Collections.min(populacao3));
	System.out.printf("\nEstado com a maior popula??o: (%s) com (%d) pessoas", maxPop, Collections.max(populacao3));
	
	int s = 0;
	Iterator<Integer> iterator = populacao.values().iterator();
	while(iterator.hasNext()) {
		s += iterator.next();
	}
	System.out.println("\nA soma das popula??es dos estados do NE ?: " + s);
	
	/*//FOR EACH
	int x = 0;
	for(Map.Entry<String, Integer> entry : populacao.entrySet()) {
		x += entry.getValue();
	}
	*/
	
	int m = s/populacao.size();
	System.out.println("\nA m?dia das popula??o dos estados do NE ?: " + m);
	
	Iterator<Integer> iterator2 = populacao.values().iterator();
	while(iterator2.hasNext()) {
		if(iterator2.next() < 4000000) {
			iterator2.remove();
		}
	}
	System.out.println("Dicionario atualizado removidos valores < 4000000 " + populacao.toString());
	
	populacao.clear();
	boolean status2 = populacao.isEmpty();
	System.out.println("O dicionario est? vazio? " + status2);
	
	
	}
}
