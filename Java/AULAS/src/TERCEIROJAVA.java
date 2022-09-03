import java.util.Scanner;

public class TERCEIROJAVA {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroInteiro = 0;
		double numeroReal = 0.0;
		char caracter = ' ';
		String cadeiaCaracter = " ";
		
		System.out.print("Digite um numero inteiro: ");
		numeroInteiro =leia.nextInt();
		System.out.print("Digite um numero real: ");
		numeroReal = leia.nextDouble();
		System.out.print("Digite um caracter: ");
		caracter = leia.next().charAt(0);
		System.out.print("Digite uma palavra: ");
		cadeiaCaracter = leia.next();
		
		System.out.println("O numero inteiro digitado foi: "+ numeroInteiro);
		System.out.println("O numero real digitado foi: "+ numeroReal);
		System.out.println("O caracter digitado foi: "+ caracter);
		System.out.println("A palavra digitado foi: "+ cadeiaCaracter);
		
	}

}
