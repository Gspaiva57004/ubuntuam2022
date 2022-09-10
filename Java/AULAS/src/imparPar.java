import java.util.Scanner;
public class imparPar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um numero: ");
		numero = leia.nextInt();
		
		if (numero<0) {
			System.out.print("Você escreveu um numero negativo");
			
		} 
		else if (numero==0) {
			System.out.print("Você escreveu um numero neutro");
			
		} 
		else if ((numero%2)==0) {
			System.out.print("Você escreveu um numero par");
		
		}
		else {
			System.out.print("Você escreveu um numero impar");
		}
		
	}
}