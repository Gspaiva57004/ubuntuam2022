package AULAS;
import java.util.Scanner;

public class Baratix {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	//variaveis
		String codigo[] = {"GRP04-01","GRP04-02","GRP04-03","GRP04-04","GRP04-05","GRP04-06","GRP04-07","GRP04-08","GRP04-09","GRP04-10",};
		String produto[] = new String[10];
		produto[0]="Arroz           ";
		produto[1]="Feijão          ";
		produto[2]="Macarrão        ";
		produto[3]="Café            ";
		produto[4]="Leite           ";
		produto[5]="Suco            ";
		produto[6]="Banana          ";
		produto[7]="Maça            ";
		produto[8]="Filé de frango  ";
		produto[9]="Papel Higienico ";
		double valor[] = {19.99 , 12.49 , 1.99 , 18.99 , 16.44 , 0.99 , 7.99 , 4.99 , 18.99 , 11.99 };
		int estoque[] = {10 , 10 ,10 ,10 ,10 ,10 ,10 ,10 ,10 ,10};
		int quantidade = 0;
		char resposta = 'n';
		
		//tela inicial
		System.out.println("Supermercado BARATIX onde o seu dinheiro é valorizado ");
		System.out.print("Deseja fazer compras? (S para sim ou N para não): ");
		resposta = leia.next().charAt(0);
		
		if(resposta == 'S' || resposta == 's') {
			System.out.println("Codigo\t\t | Produtos\t\t | Estoque\t | valores");
		System.out.println("-------------------------------------------------------------------");
			
			for (int i = 0; i < 10; i++) {
		System.out.printf(codigo[i] + "\t | " + produto[i] + "\t | " + estoque[i] + "\t\t | " + valor[i] + "\n" );
		System.out.println("-------------------------------------------------------------------");
			}
			
				for (int i = 0; i < 1; i++) {
					System.out.println("Selecione do codigo do produto (exerplo: GRP04-xx): ");
					codigo[i] = leia.next();
					System.out.println("Digite a quantidade: ");
					quantidade = leia.nextInt();
				}
				System.out.println("Deseja continuar a compra? ");
				resposta = leia.next().charAt(0);
				
					if(resposta == 's' || resposta == 'S') {
						System.out.println("Codigo\t\t | Produtos\t\t | Estoque\t | valores");
						System.out.println("-------------------------------------------------------------------");
							
							for (int i = 0; i < 10; i++) {
						System.out.printf((codigo[i] + "\t | " + produto[i] + "\t | " + (estoque[i] - quantidade) + "\t\t | " + valor[i] + "\n" ));
						System.out.println("-------------------------------------------------------------------");
							}
							
					}
		}
		
		else {
		 System.out.println("Até breve");
		}
		
	}

}
