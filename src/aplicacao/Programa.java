package aplicacao;

import entidades.ContaJuridica;

public class Programa {

	public static void main(String[] args) {
		ContaJuridica cj = new ContaJuridica(123,"Lojas Renner",500000.00, 50000.00);
		System.out.println("Saldo da Conta = "+cj.getSaldo());
	}

}
