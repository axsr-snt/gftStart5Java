package interfaceList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class MetodosList {

	public static void main(String[] args) {
		
		// jeitos de inst?nciar um objeto List
		
			//List notas = new ArrayList(); // antes do java 5
				
			//List<Double> notas = new ArrayList<>(); //Generics(jdk 5) - Diamond Operator (jdk 7)
			
			//ArrayList<Double> notas = new ArrayList<>();
			
			//List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
			
			//List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
	
		
		//
		List<Double> notas = new ArrayList<>();
			notas.add(9.6);
			notas.add(2d);
			notas.add(13.4);
			notas.add(1.7);
			notas.add(3.1);
			notas.add(4d);
			notas.add(10.9);
			System.out.println(notas);
		
			notas.remove(4d);
			System.out.println(notas);
			
			//descobrindo o index de um atributo na lista
			System.out.println("\nO index da nota 1.7 ?: " + notas.indexOf(1.7));
			
			//adicionando o n?mero 8 na quarta posi??o: .add(index, valor);
			notas.add(4,8d);
			System.out.println("\n" + notas);
			
			//substituindo o valor 13.4 e 10.9 por 9.3 e 10: .set(notas.indexOf(valor), novoValor);
			notas.set(notas.indexOf(13.4), 9.3);
			notas.set(notas.indexOf(10.9), 10d);
			
			System.out.println("\n" + notas);
			
			//conferindo se a nota 10 est? na lista: .contains(10d);
			boolean status = notas.contains(10d);
			System.out.println("\nA lista contem o valor 10? " + status);
			
			//exibindo a terceira nota adcionada: .get(index);
			double num = notas.get(2);
			System.out.println("\nA terceira nota adicionada foi: " + num);
			
			//exibindo todas as notas na ordem em que foram adicionadas
			for(double nota: notas) {
				System.out.println("\n" + nota);
			}
			
			//transformando a lista em uma string unica .toString();
			String listaNotas = notas.toString();
			System.out.println("\n" + listaNotas);
			
			//exibindo a menor nota, utilizamos a extens?o do metodo min da classe Collections
			double menor = Collections.min(notas);
			System.out.println("\nA menor nota ?: " + menor);
			
			//exibindo a maior nota, utilizamos a extens?o do metodo min da classe Collections
			double maior = Collections.max(notas);
			System.out.println("\nA maior nota ?: " + maior);
			
			//somando todos os n?meros da lista
			Iterator<Double> iterator = notas.iterator();
				double soma = 0d;
				while(iterator.hasNext()) {
					Double next = iterator.next();
					soma += next;
				}
			
			System.out.println("\nA soma da lista de n?meros ? igual ?: " + soma);
			
			//exibindo a m?dia das notas
			double media = soma/notas.size();
			System.out.println("\nA m?dia das notas ? igual a: " + media);
			
			//removendo a nota da posi??o 3
			notas.remove(3);
			System.out.println("\n" + notas);
			
			//removendo as notas menores que 7
			Iterator<Double> iterator1 = notas.iterator();
			while(iterator1.hasNext()){
				double next1 = iterator1.next();
				if(next1 < 7) iterator1.remove();
			}
			System.out.println("\n" +notas);
			
			//limpando a lista
			/*notas.clear();
			System.out.println("\n" + notas);
			*/
			boolean status2 = notas.isEmpty();
			System.out.println("\nA lista est? vazia? " + status2);
	
			List<Double> notas2 = new ArrayList<>();
			notas2.addAll(notas);
			
			System.out.println("\n" + notas2);
			
			notas2.remove(0);
			System.out.println("\n" + notas2);
	}
	
	
}
