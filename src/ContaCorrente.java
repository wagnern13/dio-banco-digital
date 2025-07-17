
public class ContaCorrente extends Conta {

	
	public ContaCorrente(String nomeCliente) {
		super(nomeCliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirSaldoConta();
	}

	


}
