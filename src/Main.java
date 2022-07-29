import desafio_dio_banco.Banco;
import desafio_dio_banco.Cliente;
import desafio_dio_banco.Conta;
import desafio_dio_banco.ContaCorrente;
import desafio_dio_banco.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		Cliente c = new Cliente("Caio Orleans");
		
		Conta cc = new ContaCorrente(c);
		Conta cp = new ContaPoupanca(c);
		
		Banco b = new Banco("Orleans Bank");
		
		b.adicionarConta(cc);
		b.adicionarConta(cp);
		
		cc.transferir(cp, 10f);
		
		b.listarContas();
		
		b.removerConta(cc);
		
		b.listarContas();
	}

}
