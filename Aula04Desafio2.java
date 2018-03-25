public class Aula04Desafio2{

	public static void main(String []args){

		long[][] matriz = popularFibonacci(5,7);
		//Aqui vamos usar o tipo long int, que guarda valores inteiros mas aloca o dobro de memória comparado a um int comum
		//Ao utilizar matrizes grandes nesse exercicío o tipo long ainda fica pequeno para guardar os valores maiores de fibonacci.

		//for each para percorrer uma matriz e exibir.
		for(long[] linha : matriz){
		//primeiro for each pegando cada linha da matriz

			for(long elemento : linha){
			//segundo for each pegando cada elemento de uma linha da matriz
				System.out.print(elemento + " ");
			}
			System.out.println();
		}
	}

	static long[][] popularFibonacci (int altura, int largura){

		long[][] matrizFibonacci = new long[altura][largura];
		//instaciando uma matriz do tipo long com tamanho passado pelas variáveis altura e largura

		for(int i = 0; i < altura; i++){
		//for para percorrer as linhas

			for(int j = 0; j < largura; j++){
			//for para percorrer as colunas

				if(i == 0 && j == 0){
					matrizFibonacci[i][j] = 0;
				}else if(i == 0 && j == 1){
					matrizFibonacci[i][j] = 1;
				}else{
				//se o elemnto atual não for o primeiro nem o segundo da matriz, precisamos fazer algumas verificações


					if(i != 0 && j == 0){
					//se ele estiver na coluna 0 precisamos pegar os dois ultimos elementos da linha anterior (i-1). O último elemento da linha não pode ser da coluna com valor largura, porque largura é o tamanho das nossas colunas. Como nossos indices começam em 0, nosso último valor é largura -1;
						matrizFibonacci[i][j] = matrizFibonacci[i-1][largura-1] + matrizFibonacci[i-1][largura-2];
					}else if(i != 0 && j == 1){
					//caso estiver na coluna 1 precisamos pegar o valor anterior da linha atual e o ultimo valor da linha anterior.
						matrizFibonacci[i][j] = matrizFibonacci[i][j-1] + matrizFibonacci[i-1][largura-1];
					}else{
						matrizFibonacci[i][j] = matrizFibonacci[i][j-1] + matrizFibonacci[i][j-2];
					
					}
				}
			}
		}
		return matrizFibonacci;
	}	

}
	