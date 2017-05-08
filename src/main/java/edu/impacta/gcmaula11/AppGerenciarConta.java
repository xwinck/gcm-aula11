package edu.impacta.gcmaula11;

import java.util.Scanner;
import static java.lang.System.out;
public class AppGerenciarConta {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		out.print("Saldo inicial da conta: ");
		long saldoInicial = Long.parseLong(entrada.nextLine());
		ContaBancaria conta = new ContaBancaria(saldoInicial);
		boolean sair = false;
		while(!sair) {
			out.println("\nEscolha uma das opções abaixo:");
			out.println("(1) Consultar o saldo");
			out.println("(2) Depositar R$ 10");
			out.println("(3) Sacar R$ 20");
			out.println("(4) Sair");
			out.print("Opção: ");
			int opcao = Integer.parseInt(entrada.nextLine());
			switch(opcao) {
			case 1:
				out.println("\nSaldo atual: R$ " + conta.getSaldo());
				break;
			case 2:
				conta.depositar(10);
				out.println("\nDepósito de R$ 10 efetuado!");
				break;
			case 3:
				boolean b = conta.sacar(20);
				out.println("\nSaque de R$ 20 " + (b?"efetuado com sucesso!":"falhou!"));
				break;
			case 4:
				sair = true;
				break;
			default:
				out.println("Opção inválida!");
				break;
			}
		}
		out.println("\nObrigado pela preferência!");
		entrada.close();
	}
}
