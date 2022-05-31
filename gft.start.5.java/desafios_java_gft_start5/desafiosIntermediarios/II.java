package desafiosIntermediarios;

import java.util.Scanner;

public class II {

	public static void main(String[] args) {
	  	Scanner sc = new Scanner(System.in);
	  		double pi = 3.14159;
	  		double R = sc.nextDouble();
	  		double volume = (4.0/3) * pi * (Math.pow(R, 3.0));
	  		System.out.printf("VOLUME = %.3f%n", volume);
	  	sc.close();
	}
}