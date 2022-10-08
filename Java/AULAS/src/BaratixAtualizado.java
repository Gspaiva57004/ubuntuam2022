import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

	public class BaratixAtualizado{
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
			int carrinho2[] = new int[10];
			char resposta = 'n';
			char respostax = 'N';
			String carrinho= "";
			double valorCarrinho = 0.0;
			double imposto = 0.0, pgAvista = 0.0, pgCartao = 0.0, pgParcelado = 0.0, parcela = 0.0; 
			DecimalFormat formatador = new DecimalFormat("0.00");
			char ctzCliente = 'n';
			int opcao;
			int quantidadeEscolhida = 0;
			String codigoEscolhido = "";
			int posicao = 0;
			
					
			//tela inicial
			
			do {
				//zerando o carrinho para o proximo cliente!!!
				carrinho="";
				valorCarrinho= 0.0;	
				respostax='N'; //porque????
				System.out.println("Supermercado BARATIX onde o seu dinheiro é valorizado ");
				System.out.print("Deseja fazer compras? 'S' para sim ou 'N' para não: ");
				resposta = leia.next().toUpperCase().charAt(0);
				System.out.println();
			
				if(resposta == 'S') {
					do {
							//FLUXO DE ESCOLHE PRODUTOS E COLOCAR NO CARRINHO
						
							//cabeçalho
							System.out.println("Codigo\t\t | Produtos\t\t | Estoque\t | valores");
							System.out.println("-------------------------------------------------------------------");	
							for (int i = 0; i < 10; i++) {
									System.out.printf(codigo[i] + "\t | " + produto[i] + "\t | " + estoque[i] + "\t\t | " + valor[i] + "\n" );
									System.out.println("-------------------------------------------------------------------");
							}
							posicao=0;
							System.out.print("Digite do codigo do produto: ");
							codigoEscolhido = leia.next().toUpperCase();
							System.out.println();
							
							/*
							while (Arrays.asList(codigo).contains(codigoEscolhido)!=true) {
									System.out.println("Codigo inválido! Digite o código corretamente, por exemplo(GRP04-01)");
									System.out.print("Digite do codigo do produto: ");
									codigoEscolhido = leia.next();
							
							}
							*/
							
							do {
								for(int i=0; i<10; i++) {
									if(codigoEscolhido.equals(codigo[i])) {
										posicao = i;
										break;
									}
									else if (i==9) {
										System.out.println("Codigo inválido! Digite o código corretamente, por exemplo(GRP04-01)");
										System.out.print("Digite do codigo do produto: ");
										codigoEscolhido = leia.next();
									}
									posicao = i;
								}
							} while (posicao>=10);
							
							
							//CENARIO PERFEITO
							for(int i=0; i<10; i++) {
								if(codigoEscolhido.equals(codigo[i])) {
									posicao = i;
									break;
								}
								posicao=i;
							}
							
							if(carrinho2[posicao]>0) {
								System.out.println("Parece que você já utilizou este código.");
								System.out.println();
								System.out.println("Produto\t\t |     Valor\t | Estoque");
								System.out.println(produto[posicao] + " |     R$" + valor[posicao] + " \t |  " + quantidadeEscolhida + "\n");
								System.out.print("Digite a quantidade que você escolheu para manter,uma nova para alterar:");
								quantidadeEscolhida = leia.nextInt();
								
							}
							
							if(carrinho2[posicao]==0) {
							System.out.println();
							System.out.println("Produto\t\t |     Valor\t | Estoque");
							System.out.println(produto[posicao] + " |     R$" + valor[posicao] + " \t |  " + estoque[posicao] + "\n");
							System.out.print("Digite a quantidade: ");
							quantidadeEscolhida = leia.nextInt();  
							}
							
							
							
							//Validação da digitação da quantidade informada pelo usuario
							while (quantidadeEscolhida>estoque[posicao] || quantidadeEscolhida<0) {
										System.out.println("Digite um valor de acordo com o estoque!");
										System.out.println("Digite a quantidade: ");
										quantidadeEscolhida = leia.nextInt();  
							}
													
							carrinho2[posicao]=quantidadeEscolhida;
							valorCarrinho += valor[posicao]*quantidadeEscolhida; //totalizando para mostra ao usuario
							carrinho +=  (codigo[posicao]+ " \t|   " + produto[posicao]+ "\t| " + valor[posicao] + "\t| " +quantidadeEscolhida+"\n");
							
							
							System.out.println("=====================Produtos adiconados===================");
							System.out.println("Codigo\t\t|   Produto\t        | valor | qtde");		
							/*System.out.println(carrinho);*/
							
							for (posicao = 0; posicao < 10; posicao++)
								if(carrinho2[posicao]>0 ) {
									System.out.print(codigo[posicao]+ " \t|   " + produto[posicao]+ "\t| " + valor[posicao] + "\t| " +quantidadeEscolhida+"\n");
									valorCarrinho += valor[posicao]*quantidadeEscolhida;
								
								}
							System.out.println("O valor da compra até o momento é: R$" + formatador.format(valorCarrinho) ); 
							System.out.println();
							System.out.print("Deseja continuar a compra? 'S' para sim ou 'N' para não: ");
							resposta = leia.next().toUpperCase().charAt(0); 
							System.out.println();
							
							
							
					} while(resposta != 'N');
					
					// PROCESSO DE PAGAMENTO E FECHAMENTO
					
					
					pgAvista = valorCarrinho - (valorCarrinho*0.10);
					pgCartao = valorCarrinho*1.10;
					pgParcelado = valorCarrinho*1.15;
					parcela = pgParcelado/2;
						
					do {
						 System.out.println("Carrinho de compras\n" + carrinho + "\n");
						 System.out.println("----------------------------------------------");
						 System.out.println("O valor total da sua compra é: R$" + formatador.format(valorCarrinho) );
						 System.out.println("----------------------------------------------");
						 System.out.println("Formas de pagamento: \n");
						 System.out.println("(1)Pagamento à vista com 10% de desconto: R$"+ formatador.format(pgAvista));
						 System.out.println("--------------------------------------------------------------------------------------------");
						 System.out.println("(2)Pagamento à vista no cartão de crédito com acréscimo de 10%: R$"+ formatador.format(pgCartao));
						 System.out.println("--------------------------------------------------------------------------------------------");
						 System.out.println("(3)Pagamento parcelado em 2x no cartão com 15% de acréscimo: R$"+ formatador.format(pgParcelado)+" , serão 2x de: R$"+ formatador.format(parcela));
						 System.out.println("--------------------------------------------------------------------------------------------");
						 System.out.println("Digite o número da opção desejada(exemplo: 3): ");
						 opcao = leia.nextInt();
						 
						 while (opcao>3 || opcao<0) {
							 System.out.println("Opção invalida! Digite uma opção valida.");
							 System.out.println("Digite o número da opção desejada(exemplo: 3): ");
							 opcao = leia.nextInt();
						 }
						 
						System.out.println("Voce escolheu a opção: "+opcao+", se quiser confirmar aperte 'S' ou 'N' para voltar ao menu de opções.");
						ctzCliente = leia.next().toUpperCase().charAt(0);
						
					} while (ctzCliente != 'S'); 
						
						
			 		if (opcao == 1) {
			 			System.out.println("O valor de: R$"+formatador.format(pgAvista)+" ,referente a sua compra foi pago. Muito obrigado e volte sempre!");
			 		}	
			 		else if (opcao == 2) {
			 			System.out.println("O valor de: R$"+formatador.format(pgCartao)+" ,referente a sua compra foi pago, com acréscimo de 10% sobre o valor final. Muito obrigado e volte sempre!");
			 		}   
			 		else if (opcao == 3) {
			 			System.out.println("O valor de: R$"+formatador.format(pgParcelado)+" ,referente a sua compra foi pago e dividido em 2x de R$" + formatador.format(parcela) +". Muito obrigado e volte sempre!");
			 		}	
		
			 		System.out.println();
			 		System.out.println();
			 		System.out.println("                    Nota fiscal");
			 		System.out.println("Codigo\t\t|   Produto\t        | valor | qtde");
			 		System.out.println(carrinho);
			 		System.out.println("O valor total da sua compra é: R$" + formatador.format(valorCarrinho) );
			 		System.out.println("-------------------------------------------------------");
			 		System.out.println("-------------------------------------------------------");
			 		
			 		//tentando reiniciar o programa
			 		System.out.println("");
			 		System.out.println("");
					System.out.print("Temos um próximo cliente? 'S' para sim ou 'N' para não: ");
					respostax = leia.next().charAt(0);
					
					//atualizao do estoque
					for (int i = 0; i < 10; i++) {
					 	estoque[i]= estoque[i]-(carrinho2[i]); //atualizando o estoque após a compra
					 	carrinho2[i]=0; //zerando para o proximo cliente o carrinho
				 		System.out.println();
					}
					
					
				}//fim do primeiro if
				       
		    } while (respostax != 'N');
			
			System.out.println("Obrigado, até breve.");
			 
		} //fim main
		    
	        
	} // fim da classe-programa