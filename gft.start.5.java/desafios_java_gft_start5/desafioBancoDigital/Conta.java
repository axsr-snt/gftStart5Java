package desafioBancoDigital;

public abstract class Conta {

	protected int numeroAgencia;
	protected int numeroContaCorrente;
	protected double valorSaldo;
	//protected Cliente cliente;
	
	public int getNumeroAgencia() {
		return numeroAgencia;
	}

	public int getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	public double getValorSaldo() {
		return valorSaldo;
	}

	public void sacar(double valor) {
		this.valorSaldo -= valor;
	}
	
	public void depositar(double valor) {
		this.valorSaldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	private static int SEQUENCIAL = 100001;
	
	protected static final int AGENCIA_PADRAO = 1;
	
	public Conta() {
		this.numeroAgencia = Conta.AGENCIA_PADRAO;
		this.numeroContaCorrente = SEQUENCIAL++;
	}

	protected void imprimirExtrato() {
		System.out.println(String.format("Agencia: %d", this.numeroAgencia));
		System.out.println(String.format("Conta: %d", this.numeroContaCorrente));
		System.out.println(String.format("Saldo: %.2f", this.valorSaldo));
	}
	
}
