package desafiosIntermediarios;

import java.util.*;

public class IV {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		    List<Integer> numeros = new ArrayList<>();
		    for(int i = 0; i < 100; i++){
		      int numero = gerador.nextInt(999);
		      numeros.add(numero);
		    }
		    Integer max = Collections.max(numeros);
		    System.out.println(max);
		    int position = numeros.indexOf(max) +1;
		    System.out.println(position);
		    //scan.close();
		  }

}