package desafioBancoDigital;

public class Main {

	public static void main(String[] args) {

		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.depositar(1650);
		cc.transferir(100, cp);

		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		

		
	}
}
