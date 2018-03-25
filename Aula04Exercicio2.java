public class Aula04Exercicio2 {

	public static void main(String []args){
		
		int matriz[][] = {
		{0,1,2,3,4,5,6,7,8,9},
		{0,2,3,4,5,6,7,8,9,10},
		{0,2,4,5,6,7,8,9,10,11},
		{0,3,4,6,7,8,9,10,11,12},
		{0,3,5,6,8,9,10,11,12,13},
		{0,4,6,7,8,10,11,12,13,14},
		{0,4,6,8,9,10,12,13,14,15},
		{0,5,7,9,10,11,12,14,15,16},
		{0,5,8,9,11,12,13,14,16,17},
		{0,6,8,10,12,13,14,15,16,18}
		};
		//declarando os valores de uma matriz com 10 linhas e 10 colunas

		int linhaMaior  = 0;
		int colunaMaior = 0;
		//variáveis para guardarmos a posição do maior valor da matriz

		for(int i = 0; i < 10; i++){
		//laço para varrer as linhas da matriz
			for(int j = 0; j<10 ; j++){
			//laço para varrer as colunas da matriz

				if(matriz[i][j] > matriz[linhaMaior][colunaMaior]){
				//comparando se o valor da posição atual da matriz é maior que o valor da maior posição encontrada até agora	
					linhaMaior = i;
					colunaMaior = j;
					//caso seja maior, atualizamos nossas variáveis que guardam essa posição
				}
			}
		}

		System.out.println("O maior valor está na posição (" + linhaMaior +","+ colunaMaior + ") da matriz");
	}


}

	