package edu.impacta.gcmaula11;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContaBancariaTest {
	@Test
	public void testSaldo() {
		long saldoEsperado = (long) (Math.random() * Long.MAX_VALUE);
		ContaBancaria c = new ContaBancaria(saldoEsperado);
		long saldoObtido = c.getSaldo();
		assertEquals(saldoEsperado, saldoObtido);
	}
	@Test
	public void testDeposito() {
		long saldoInicial = (long) (Math.random() * 0.5 * Long.MAX_VALUE);
		long deposito = (long) (Math.random() * 0.5 * Long.MAX_VALUE);
		ContaBancaria c = new ContaBancaria(saldoInicial);
		c.depositar(deposito);
		long saldoEsperado = saldoInicial + deposito;
		long saldoObtido = c.getSaldo();
		assertEquals(saldoEsperado, saldoObtido);
	}
	@Test
	public void testSaque() {
		long saldoInicial = (long) (Math.random() * 0.5 * Long.MAX_VALUE);
		long saque = (long) (Math.random() * Long.MAX_VALUE);
		ContaBancaria c = new ContaBancaria(saldoInicial);
		boolean sucessoObtido = c.sacar(saque);
		boolean sucessoEsperado = (saldoInicial >= saque);
		assertEquals(sucessoEsperado, sucessoObtido);
		if (sucessoEsperado) {
			long saldoEsperado = saldoInicial - saque;
			long saldoObtido = c.getSaldo();
			assertEquals(saldoEsperado, saldoObtido);
		}
		else {
			long saldoEsperado = saldoInicial;
			long saldoObtido = c.getSaldo();
			assertEquals(saldoEsperado, saldoObtido);
		}
	}
}
