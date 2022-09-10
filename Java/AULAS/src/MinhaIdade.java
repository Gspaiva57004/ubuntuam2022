import java.util.Scanner;
public class MinhaIdade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int anoNascimento, idade;
		
		System.out.print("Digit o seu nome: ");
		nome = leia.next();
		System.out.print("Digit o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		idade = 2022 - anoNascimento;
		
		System.out.print("oi "+nome+" sua idade é:"+idade+" anos");
		
	}
}