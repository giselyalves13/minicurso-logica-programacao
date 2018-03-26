public class Aula04Desafio1{

	public static void main(String []args){
	
		int[] vetor = {34,3,4,7,21,9,0,12,17,33};
		
		int[] vetorpares = devolvePares(vetor);
		//chamando a função que devolve os números pares do vetor.
		
		for(int numeroPar : vetorpares){
		//laço for each para percorrer o vetorpares e exibir cada elemento.
			System.out.print(numeroPar + " ");
		}
	}

	static int[] devolvePares (int[] vetor){
		int cont = 0;
		//contador para sabermos quantos pares temos no vetor.

		for(int i = 0; i < 10; i++){
			if(vetor[i] % 2 == 0 ){
				//quando é encontrado um número par(quando o resto da divisão desse número por 2 é 0) o contador é incrementado
				cont++;
			}	
		}

		int vetorpares[] = new int[cont];
		//criação de um novo vetorpares com o tamanho da quantidade de elementos pares do vetor

		int j = 0;
		//j será o índice utilizado para percorrer o vetor pares

		for(int i = 0; i< 10 ; i++){
		//esse for percorre o vetor e NÃO o vetorpares

			if(vetor[i] % 2 == 0 ){
				//verificamos novamente dentro do vetor quais são os números pares
				vetorpares[j] = vetor[i];
				//colocamos esse elemento do vetorpares com o indice j. Depois incrementamos j
				j++;
			}	
		}
		return vetorpares;
		
	}	

}

	
