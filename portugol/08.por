programa
{
	
	funcao inicio()
	{	
	//variaveis
		real numero=0
		real contador=0
		real media=0.0
		inteiro totalNumeros=0

	//entradas
	enquanto(numero>=-1){
		escreva("Digite um numero: ")
		leia(numero)
		se(numero>=-1){
			totalNumeros= (totalNumeros + numero)
			contador++
		}
	}
		media = totalNumeros / contador

		escreva("total de numeros: ", totalNumeros, "\n")
		escreva("somatorio: ", contador, "\n")
		escreva("media: ", media)
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */