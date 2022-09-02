import java.util.Locale;
import java.util.Scanner;

public class mediaAcademia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigo = 0;
		double altura = 0;
		double peso = 0;
		String cod = null;
		boolean invalido = true;
		double maiorAltura = Integer.MIN_VALUE;
		double menorAltura = Integer.MAX_VALUE;
		double menorPeso = Integer.MAX_VALUE;
		double maiorPeso = Integer.MIN_VALUE;
		double somaAltura = 0;
		double somaPeso = 0;
		double mediaAltura = 0;
		double mediaPeso = 0;
		System.out.println("Numeros de clientes ?");
		int clientes = sc.nextInt();
		for (int i = 1; i <= clientes; i++) {
			System.out.println("Insira o codigo do cliente " + i);
			codigo = sc.nextInt();
			while (codigo == 0) {
				invalido = false;
				System.out.println("Insira o codigo novamente");
				codigo = sc.nextInt();
			}
			System.out.println("Insira altura do cliente " + i);
			altura = sc.nextDouble();
			System.out.println("Insira o peso do cliente " + i);
			peso = sc.nextDouble();
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			if (peso > maiorPeso) {
				maiorPeso = peso;
			}
			if (peso < menorPeso) {
				menorPeso = peso;
			}
			somaAltura += altura;
			somaPeso += peso;
			mediaAltura = somaAltura / clientes;
			mediaPeso = somaPeso / clientes;
		}

		System.out.println("O cliente que possui a maior altura " + maiorAltura);
		System.out.println("O cliente que possui a menor altura  " + menorAltura);
		System.out.printf("A media das alturas é %.1f%n", mediaAltura);
		System.out.println("O cliente que possui o maior peso " + maiorPeso);
		System.out.println("O cliente que possui o menor peso " + menorPeso);
		System.out.printf("A media das peso é %.1f%n", mediaPeso);
	}

}
