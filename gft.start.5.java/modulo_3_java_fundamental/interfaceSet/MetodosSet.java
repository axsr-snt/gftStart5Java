package interfaceSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MetodosSet {

	public static void main(String[] args) {
		
		
		/*--- HASHSET ---
		Set notas = new HashSet(); //antes do java 5
		HashSet<Double> notas = new HashSet<>();
		Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
		Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
		*/
		Set<Double> notas = new HashSet<>(Arrays.asList(7.3,8.1,6.8,7d,9d,9.5,10d));
		
		System.out.println("Comt?m no objeto notas: " + notas.toString());
	
		/*
		Devido a sua caracteristica de n?o possuir indice a interface HashSet n?o consegue realizar ordena??es
		System.out.println("Exiba a posi??o da nota 5.0: ");
		System.out.println("Adicione na lista a nota 8.0 na posi??o 4: ");
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		System.out.println("Exiba a terceira nota adicionada: ");	
		*/
		
		boolean status = notas.contains(10d);
		System.out.println("\nO objeto cont?m a nota 10? " + status);
		
		double min = Collections.min(notas);
		System.out.println("\nA menor nota ?: " + min);
		
		double max = Collections.max(notas);
		System.out.println("\nA maior nota ?: " + max);
		
		Iterator<Double> iterator = notas.iterator();
		
		double i = 0d;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			i += next;
		}
		
		double med = i/notas.size();
		System.out.println("\nA m?dia das notas ?: " + med);
		
		notas.remove(8.1);
		System.out.println("\n" + notas);
		
		//--- LINKEDHASHSET ---
		//Ordena na ordem de inser??o
		Set<Double> notas2 = new LinkedHashSet<>();
		notas2.add(3.6);
		notas2.add(6.9);
		notas2.add(7.5);
		notas2.add(3.5);
		notas2.add(9.9);
		notas2.add(7.5);
		notas2.add(3.2);
		
		System.out.println("\n---- LINKED HASH SET ----");
		System.out.println("\nOrdem de inser??o: " + notas2);
		
		
		//--- TREESET ---
		//Ordena na ordem natural
		Set<Double> notas3 = new TreeSet<>(notas2);

		System.out.println("\n---- TREE SET ----");
		System.out.println("\nOrdem natural: " + notas3);
		
		notas.clear();
		
		System.out.println("\nO conjunto notas est? vazio? " + notas.isEmpty());
		System.out.println("\nO conjunto notas2 est? vazio? " + notas2.isEmpty());
		System.out.println("\nO conjunto notas3 est? vazio? " + notas3.isEmpty());
	}
}
