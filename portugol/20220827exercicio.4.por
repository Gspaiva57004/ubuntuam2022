programa
{
	
	funcao inicio()
	{	
		cadeia matricula[4]
		cadeia nome[4]
		caracter genero[4]
		inteiro ano[4]
		real nota[4]
		inteiro idade=0
		cadeia aprovacao=" "
		cadeia mat = " "

			matricula[0]="MAT-1"
			matricula[1]="MAT-2"
			matricula[2]="MAT-3"
			matricula[3]="MAT-4"
			
			nome[0]="Maria"
			nome[1]="Marcos"
			nome[2]="Paulo"
			nome[3]="Carla"

			genero[0]='F'
			genero[1]='M'
			genero[2]='M'
			genero[3]='F'

			ano[0]=2000
			ano[1]=2002
			ano[2]=1999
			ano[3]=2004

			para(inteiro i=0; i<4; i++){
				escreva(matricula[i]," ", nome[i])
				escreva(" Digite a nota: ")
				leia(nota[i])
			}
			para(inteiro x=0; x<4; x++){
				idade = 2022 - ano[x]
				
				se(nota[x]<6){
					
					se(genero[x]=='F'){
						aprovacao = "reprovada"
					}senao{
						aprovacao = "reprovado"
					}
				}senao{
					se(genero[x]=='F'){
						aprovacao = "aprovada"
					}senao{
						aprovacao = "aprovado"
					}
					
				}
				escreva("matricula: ", matricula[x], " nome: ", nome[x]," idade: ", idade, " status: ", aprovacao, "\n")
			}	
			escreva("Matricula: ")
			leia(mat)

			para(inteiro z=0; z<4; z++){
				idade = 2022 - ano[z]
				
				se(nota[z]<6){
					
					se(genero[z]=='F'){
						aprovacao = "reprovada"
					}senao{
						aprovacao = "reprovado"
					}
				}senao{
					se(genero[z]=='F'){
						aprovacao = "aprovada"
					}senao{
						aprovacao = "aprovado"
					}
					
				}
				
				se(mat==matricula[z]){
				escreva("matricula: ", matricula[z], " nome: ", nome[z]," idade: ", idade, " status: ", aprovacao, "\n")
			}
			}// matricula nome idade, nota, aprovado
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */