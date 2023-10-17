package banco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome do cliente: ");
		String nome_cliente = scanner.nextLine();


		System.out.println("Digite numero da agencia: ");
		int numero_agencia = scanner.nextInt();

		System.out.println("Digite numero da conta: ");
		int agencia = scanner.nextInt();
		
		float saldo = 100;

		System.out.println("Olá " + nome_cliente + " obrigado por criar uma conta em nosso banco, " + "sua agência é "
				+ numero_agencia + " conta " + agencia + " e seu saldo " + saldo + " já está disponível para saque ");
	}

}
