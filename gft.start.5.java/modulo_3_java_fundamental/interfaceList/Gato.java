package interfaceList;

import java.util.Comparator;

public class Gato implements Comparable<Gato>{
	
	private String nome;
	private int idade;
	private String raca;

	
	public Gato(String nome, int idade, String raca) {
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", idade=" + idade + ", raca=" + raca + "]";
	}

	@Override
	public int compareTo(Gato gato) {
		// TODO Auto-generated method stub
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}	
}

class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		// TODO Auto-generated method stub
		return Integer.compare(g1.getIdade(), g2.getIdade());
	}
}
class ComparatorRaca implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		// TODO Auto-generated method stub
		return g1.getRaca().compareToIgnoreCase(g2.getRaca());
	}
	
}

class ComparatorFull implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		// TODO Auto-generated method stub
		
	int compareNome = g1.getNome().compareToIgnoreCase(g2.getNome());
		if(compareNome !=0)
			return compareNome;
	int compareIdade = Integer.compare(g1.getIdade(), g2.getIdade());	
		if(compareIdade !=0)
			return compareIdade;
	int compareRaca = g1.getRaca().compareToIgnoreCase(g2.getRaca());
			return compareRaca;
	}
	
}


