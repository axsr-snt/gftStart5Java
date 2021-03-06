package interfaceList;

public class Tempo {

	private String mes;
	private double temp;
	
	public Tempo(String mes, double temp)  {
		this.mes = mes;
		this.temp = temp;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return "[mes=" + mes + ", temp=" + temp + "]";
	}
}
