import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		String usuario = " ";
		int conta = 0;
		String agencia = " ";
		String nomeCliente = " ";
		Double saldo = 237.48;
		
		System.out.println("Por favor, digite o seu usário: ");
		usuario = sc.next();

		System.out.println("Por favor, digite o número da Agência: ");
		agencia = sc.next();
		
		System.out.println("Por favor, digite o número da sua Conta: ");
		conta = sc.nextInt();
		
		System.out.println("Por favor, digite o seu nome completo: ");
		nomeCliente = sc.next();
		
		System.out.println("Usuário: " + usuario);
		System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + 
							agencia + ", conta " + conta + " e seu saldo de R$"+ saldo + " já está disponível para saque.");
		sc.close();
	}
}
