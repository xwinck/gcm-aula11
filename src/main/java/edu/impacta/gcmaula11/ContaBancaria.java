package edu.impacta.gcmaula11;

public class ContaBancaria {
	private long saldo;
	public ContaBancaria() { saldo = 0; }
	public ContaBancaria(long s) { saldo = s; }
	
	public void depositar(long valor) {
		
	}
	
	public boolean sacar(long valor) {
		if(valor <= saldo) {
			saldo -= valor;	
			return true;
		} 
		return false;
	}
	
	public long getSaldo() {
		return saldo;
	}
	
}
 
