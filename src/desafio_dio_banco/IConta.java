package desafio_dio_banco;

public interface IConta {
	boolean sacar(double valor);
	
	boolean depositar(double valor);
	
	boolean transferir(Conta contaDestino, double valor);
	
	void imprimirExtrato();
}
