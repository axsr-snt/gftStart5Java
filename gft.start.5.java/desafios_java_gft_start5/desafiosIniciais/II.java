package desafiosIniciais;

import java.util.Scanner;

public class II {

	  public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	    System.out.println("Digite a n?mero total de coxinhas consumidas"
	    		+ " e o numero \ntotal de participantes (ex: 80 60): ");
	    String input = leitor.nextLine();

	    String[] inputSplit = input.split(" ");
	    double media = 
	    		Double.parseDouble(inputSplit[0])/Double.parseDouble( inputSplit[1]);

	    System.out.printf("%.2f",media);
	    
	    leitor.close();
	  }
}
