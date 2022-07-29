package desafio_dio_banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta> contas = new ArrayList<Conta>();
	
	public Banco(String nomeBanco) {
		nome = nomeBanco;
	}
	
	public boolean adicionarConta(Conta c) {
		if(!contas.contains(c))
			return contas.add(c);
		return false;
	}
	
	public boolean removerConta(Conta c) {
		return contas.remove(c);
	}
	
	public void listarContas() {
		for(Conta c: contas) {
			c.imprimirExtrato();
		}
	}
	
	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
