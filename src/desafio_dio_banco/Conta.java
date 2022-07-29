package desafio_dio_banco;

public abstract class Conta implements IConta{
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	
	protected double saldo;
	
	protected Cliente cliente;

	public Conta(Cliente cli) {
		cliente = cli;
		agencia = AGENCIA_PADRAO;
		numero = SEQUENCIAL++;
	}
	
	public int getAgencia() {
		return agencia;
	}

	
	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public boolean sacar(double valor) {
		if(saldo > valor) {
			saldo-=valor;
			return true;
		}
		return false;
	}

	@Override
	public boolean depositar(double valor) {
		saldo+=valor;
		return true;
	}

	@Override
	public boolean transferir(Conta contaDestino, double valor) {
		if(sacar(valor)) {
			return contaDestino.depositar(valor);
		}
		return false;
	}
	
	protected void imprimirAtributosComuns() {
		System.out.println(String.format("Agência: %d", agencia));
		System.out.println(String.format("Número: %d", numero));
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println(String.format("Saldo: %.2f", saldo));
	}
}
