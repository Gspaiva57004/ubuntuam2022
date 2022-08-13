programa
{
	
	funcao inicio()
	{
		//variaveis
	inteiro numero
     	//Entradas e saidas
	escreva("Escreva um numero inteiro positivo: ")
	leia(numero)
	
	se(numero<0)
		escreva("Você digitou um numero negativo")
	senao se(numero==0){
	 escreva("Você digitou o numero 0, esse numero é neutro.")
	 }
	senao se((numero%2)==0){
	 	escreva("Você escreveu um numero par")
	 }
	 senao{
	 	escreva("Você ecreveu um numero impar")
	 }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */