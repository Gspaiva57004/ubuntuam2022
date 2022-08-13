programa
{
	
	funcao inicio()
	{
	//variaveis
		inteiro numero=0
		inteiro totalPares=0
		escreva("Digite o numero:")
		leia(numero)
	//processamento
		enquanto(numero%2==0)
		{
			totalPares= totalPares + numero
			escreva("Digite o numero:")
			leia(numero)
		
		}
		escreva("Total de pares:", totalPares)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 246; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */