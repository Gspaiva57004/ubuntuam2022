package AULAS;
import java.util.Scanner;

public class Baratix2 {

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
		double valor[] = { 19.99 , 12.49 , 1.99 , 18.99 , 16.44 , 0.99 , 7.99 , 4.99 , 18.99 , 11.99 };
		int estoque[] = { 10 , 10 ,10 ,10 ,10 ,10 ,10 ,10 ,10 ,10};
		int quantidade = 0;
		char resposta = 'n';
		String carrinho= "";
		double valorCarrinho = 0.0;
		
		
		//tela inicial
		System.out.println("Supermercado BARATIX onde o seu dinheiro é valorizado ");
		System.out.print("Deseja fazer compras? ");
		resposta = leia.next().charAt(0);
		
		if(resposta == 'S' || resposta == 's') {
			System.out.println("Codigo\t\t | Produtos\t\t | Estoque\t | valores");
			System.out.println("-------------------------------------------------------------------");
			
			/*for (int i = 0; i < 10; i++) {
			System.out.printf(codigo[i] + "\t | " + produto[i] + "\t | " + estoque[i] + "\t\t | " + valor[i] + "\n" );
			System.out.println("-------------------------------------------------------------------");
			}*/
			
				do {
					/*System.out.println("Codigo\t\t | Produtos\t\t | Estoque\t | valores");
					System.out.println("-------------------------------------------------------------------");*/
						
						for (int i = 0; i < 10; i++) {
					System.out.printf(codigo[i] + "\t | " + produto[i] + "\t | " + estoque[i] + "\t\t | " + valor[i] + "\n" );
					System.out.println("-------------------------------------------------------------------"); }
					System.out.println("Selecione do codigo do produto: ");
					int codigoEscolhido = leia.nextInt(); 
					System.out.println("Digite a quantidade: ");
					int quantidadeEscolhida = leia.nextInt();
					
					valorCarrinho += valor[codigoEscolhido-1]*quantidadeEscolhida;
					System.out.println("=====================Produtos adiconados===================");
					System.out.println("Codigo\t\t| Produto\t    | valor | qtde");					
					carrinho +=  (codigo[codigoEscolhido-1]+ "\t|  " + produto[codigoEscolhido-1]+ " | " + valor[codigoEscolhido-1] + " |  " +quantidadeEscolhida+"\n");// teste
					estoque[codigoEscolhido] = estoque[codigoEscolhido]-(quantidadeEscolhida);
					
					System.out.print(carrinho + "\n");
					System.out.printf("O valor da compra até o momento é R$ %.2f %n" , valorCarrinho);     
					 /*System.out.println("-----------------------");*/
					System.out.print("Deseja continuar a compra? s/n ");
					resposta = leia.next().charAt(0); 
					
				}				
					while(resposta != 'n');
					
		}
		 System.out.println("Carrinho de compras\n" + carrinho + "\n");
		 System.out.println("-----------------------------");
		 System.out.println("O valor total da sua compra é: R$" + valorCarrinho );
		 System.out.println("Formas de pagamento: \n");
		 //System.out.println("Até breve");
		}
		
	}

