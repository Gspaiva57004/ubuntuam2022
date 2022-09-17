import java.util.Scanner;
public class LojaeCommerce {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	//variaveis
	
	String codigo[] = {"GRPO4-01","GRPO4-02","GRPO4-03","GRPO4-04","GRPO4-05","GRPO4-06","GRPO4-07","GRPO4-08","GRPO4-09","GRPO4-10"};
	String produtos[] = {"Arroz", "Feijão","Macarrão", "Café","Leite","Suco", "Banana","Maça","File de frango", "Papel Higienico"};
	double valor[] = {19.99, 12.49, 1.99, 18.99 , 16.44, 0.99, 7.99, 4.99, 18.99, 11.99};
	int estoque[] = {10,10,10,10,10,10,10,10,10,10};
	
	//pergunta
	
	System.out.println("Supermercado BARATIX onde o seu dinheiro é valorizado");
	System.out.println("codigo produto valor estoque");
		for(int i =0;i<10;i++){
		
			System.out.printf("%s %s %.2f %d \n",codigo[i],produtos[i],valor[i],estoque[i] );
	
		}
		
	
	}

}
