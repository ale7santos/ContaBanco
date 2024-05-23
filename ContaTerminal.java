import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int conta = 0;
		String agencia = " ";
		String nomeCliente = " ";
		Double saldo = 0.0;

		System.out.println("Por favor, digite o número da Agência !");
		agencia = sc.nextLine();
		
		System.out.println("Por favor, digite o número da sua Conta: ");
		conta = sc.nextInt();
		
		System.out.println("Por favor, digite o seu nome completo: ");
		nomeCliente = sc.nextLine();
		
		System.out.println("Usuário: " + agencia);
		System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + 
							agencia + ", conta " + " e seu saldo "+ saldo + " já está disponível para saque.");
		sc.close();
	}
}
