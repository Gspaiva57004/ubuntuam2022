programa
{
	
	funcao inicio()
	{
		//variaveis
		inteiro num1
		inteiro num2 
		inteiro num3 , aux
		
		//entrada
		
		escreva("Digite o primeiro numero:")
		leia (num1)
		escreva("Digite o segundo numero:")
		leia (num2)
		escreva("Digite o terceiro numero:")
		leia (num3)
		
		//processamento + saida

		se(num1>=num2 e num1>=num3){
			escreva(num1, " é o maior numero")
		} senao se (num2>num1 e num2>num3){
			escreva(num2, " é o maior numero")
		} senao se (num3>num1 e num3>num2){
			escreva (num3, " é o maior numero")}
		se(num1<num3){
			aux = num1
			num1 = num2
			num2 = aux
		}se(num1<num2){
			aux = num1
			num1 = num2
			num2 = aux
		}se (num1<num2){
			aux = num2
			num2 = num3
			num3 = aux	
		}
		//saida
		escreva ("\n A ordem numerica é:", num3, "\n", num2, "\n", num1)
		}		

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 578; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */