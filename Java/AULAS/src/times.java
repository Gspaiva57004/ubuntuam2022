import java.util.Scanner;

public class times {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String time[] = new String [4];
		int pontos[] = new int[4];
		char resultado[] = new char[4];
		String nomeTime[] = new String[4];
		
		time[0]="São Paulo";
		time[1]="Palmeiras";
		time[2]="Corinthians";
		time[3]="Santos";
		
		for(int y=0; y<3; y++) {
			System.out.println("Rodada: "+ y);
			for(int i=0; i<4; i++) {
				System.out.print(time[i] + "\n");
				System.out.print("Ganhou, Empatou ou Perdeu: ");
				resultado[i] = leia.next().charAt(0);
				if(resultado[i] == 'G' || resultado[i] == 'g' ) {
					pontos[i] = pontos[i] + 3;
				}
				else if(resultado[i] == 'E' || resultado[i] == 'e'){
					pontos[i] = pontos[i] + 1;
				}
				else {
					pontos[i] = pontos[i] + 0 ;
				}
			}
			
		}
		System.out.println("tabela");
		for(int x=0; x<4; x++) {
			System.out.println(time[x] + " - "+ pontos[x]);
		}
	}

}
