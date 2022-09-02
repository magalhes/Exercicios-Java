import java.util.Locale;
import java.util.Scanner;

public class programaDeVotaçao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero de eleitores : ");
		int eleitores = sc.nextInt();
		int voto = 0;
		int jose =0;
		int carlos =0;
		int silvio =0;
		int lucas =0;
		int nulo =0;
		int branco =0;
		while( voto <= 0) {
			for(int i = 0; i<eleitores; i++) {
				System.out.println("Digite seu voto: ");
				voto = sc.nextInt();
				if(voto == 1) {
					jose++;
				}
				if(voto == 2) {
					carlos++;
				}
				if(voto == 3) {
					silvio++;
				}
				if(voto == 4) {
					lucas++;
				}
				if(voto == 5) {
					nulo++;
				}
				if(voto == 6) {
					branco++;
				}
			}
			System.out.println("O candidato josé recebeu " + jose + " votos ");
			System.out.println("O candidato Carlos recebeu " + carlos + " votos");
			System.out.println("O candidato Silvio recebeu " + silvio + " votos");
			System.out.println("O candidato Lucas recebeu " + lucas + " votos");
			System.out.println("Tiveram " + nulo + " votos nulos" );
			System.out.println("Tiveram " + branco+ " votos brancos " );
			double totalNulo = (nulo*100) / eleitores;
			System.out.println("A porcentagem de votos nulo é " +totalNulo);
			double totalBranco = (branco*100) / eleitores;
			System.out.println("A porcentagem de votos branco é " + totalBranco);

	}

}
