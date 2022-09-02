import java.util.Locale;
import java.util.Scanner;

public class Exerc {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double preço = 0;
		double soma = 0;
		double dinheiro = 0;
		double troco = 0;
		String continuarComprando;
		boolean valido = false;

		do {
			System.out.println("Deseja informar uma nova compra ? S/N");
			continuarComprando = sc.next();
			if (continuarComprando.equalsIgnoreCase("s")) {
				System.out.println("Lojas Tabajara");
				System.out.println("Digite o valor do produto :");
				int produto = sc.nextInt();
				for (int i = 0; i < produto; i++) {
					System.out.print("Produto " + (i + 1) + ": R$");
					preço = sc.nextDouble();
					soma += preço;

				}

				System.out.println("Total " + soma);
				System.out.println();
				System.out.print("Entre com o troco : R$");
				dinheiro = sc.nextDouble();
				troco = dinheiro - soma;
				System.out.println("Troco : R$ " + troco);

			} else {
				valido = true;
			}

		} while (!valido);
	}
}
