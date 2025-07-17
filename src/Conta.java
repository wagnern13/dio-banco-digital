
public abstract class Conta implements IConta {
	
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;
	protected Banco banco;
	

	public Conta(String nomeCliente) {
		this.agencia = AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = new Cliente(nomeCliente);
		this.banco = new Banco();
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		
		this.saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirSaldoConta() {
		System.out.println(String.format("Banco: %s - %s", this.banco.getCodigoBanco(), this.banco.getNome()));
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.conta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));

	}
	


}
