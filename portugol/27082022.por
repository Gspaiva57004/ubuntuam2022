programa
{
	
	funcao inicio()
	{
		inteiro x=0
		inteiro contador=0
		inteiro totalizador=0
			escreva("digite um numero: ")
			leia(x)
		faca{
			contador++
			escreva(contador)
			se(contador<x){
				escreva( " + ")
			}
			totalizador = totalizador + contador
			
		} enquanto(contador<x)
		 
		  
		  escreva(" = ", totalizador)
		
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 253; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */