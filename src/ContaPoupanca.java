
public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(String nomeCliente) {
		super(nomeCliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirSaldoConta();
	}
	


}
