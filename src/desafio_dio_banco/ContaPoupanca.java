package desafio_dio_banco;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		super.saldo = 0f;
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrato conta poupança ***");
		super.imprimirAtributosComuns();
	}
}
