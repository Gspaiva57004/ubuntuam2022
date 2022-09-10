import java.util.Scanner;

public class somatorio {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		int x=0, contador=0, totalizador=0;
		
			System.out.print("Digite um numero: ");
			x = leia.nextInt();
			
		do {
			contador++;
			System.out.print(contador);
			if (contador<x) {
				System.out.print(" + ");
			}
			totalizador = totalizador + contador;
		}
		while(contador<x);
	
		System.out.println(" = "+totalizador);
	}
}
