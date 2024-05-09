package contaBanco;

import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

	public static void main(String[] args) {
		
		// TODO: importar a classe Scanner
		
		// TODO: exibir as mensagens ao usuário
		
		// TODO: Obter pelo scanner os valores digitados no terminal
		
		// TODO: Exibir mensagem final ao usuário
		
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Por favor, digite o número da sua agência: ");
		int agenciaNumero = scanner.nextInt();
		
		System.out.println("Digite a agência: ");
		String agencia = scanner.next();
		
		System.out.println("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		scanner.nextLine(); // pegar o buffer de memória para não ocorrer erro
		
		System.out.println("Digite seu saldo: ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco, "
				+ "sua agência é , " + agencia 
				+ " conta " + agenciaNumero + " e seu saldo "+ saldo + " já está disponível para saque");
		
		scanner.close();

	}

}
