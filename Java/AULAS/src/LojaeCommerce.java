import java.util.Scanner;
public class LojaeCommerce {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	//variaveis
	
	String espaco = " | ";
	String codigo[] = {"GRPO4-01","GRPO4-02","GRPO4-03","GRPO4-04","GRPO4-05","GRPO4-06","GRPO4-07","GRPO4-08","GRPO4-09","GRPO4-10","\t"};
	String produtos[] = {"Arroz", "Feijão","Macarrão", "Café","Leite","Suco", "Banana","Maça","File de frango", "Papel Higienico","\t"};
	double valor[] = {19.99, 12.49, 1.99, 18.99 , 16.44, 0.99, 7.99, 4.99, 18.99, 11.99, '\t'};
	int estoque[] = {10,10,10,10,10,10,10,10,10,10, '\t'};
	char resposta = 'n';
	//pergunta
	
	System.out.println("Supermercado BARATIX onde o seu dinheiro é valorizado");
	System.out.print("Deseja fazer a compra? ");
	resposta = leia.next().charAt(0);
		if(resposta == 'S' || resposta == 's') {
			for(int i =0;i<10;i++) {
				System.out.println("codigo produto valor estoque");
			System.out.printf(codigo[i] + espaco + produtos[i] + espaco +valor[i] + espaco + estoque[i] + "\n");
			System.out.print("-----------------------------------\n");
				
			}
		}else {
			System.out.println("Até breve.");
		}
			
	
	
		
		
	
	}

}
