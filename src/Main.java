
public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente("Joao");
		Conta cp = new ContaPoupanca("Pedro");
		
		cc.depositar(100);
		cc.transferir(50, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}

}
