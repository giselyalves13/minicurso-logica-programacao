

public class Aula04Exercicio1 {

	public static void main(String []args){
		double[] notas = {5.6,4.8,2,8,7,3.5,6.2,4.6,7.4,1.5};
		//O tipo double é o tipo mais usado de variáveis flutuantes por convenção no Java e em outras linguagem, por ele ter mais precisão(alocar um tamanho maior de memória)
		//Para usar o tipo float em Java é só reescrever o vetor acima dessa maneira:
		// float[] notas = {5.6f,4.8f,2f,8f,7f,3.5f,6.2f,4.6f,7.4f,1.5f};


		int quantAprovados = contarAprovados(notas);
		//Chamando a função contarAprovados e guardando o retorno dela na variável quantAprovados

		System.out.println("Temos " + quantAprovados + " alunos aprovados");
		//Exibindo na tela uma parte string ( com "") concatenada (juntando duas partes diferentes com +) com uma variável já declarada no programa (quantAprovados)
	}

	static int contarAprovados(double[] notas){
		int cont = 0;
		//Contador para saber a quantidade de alunos aprovados

		for(int i=0; i<10; i++){
		//laço para percorrer cada posição do vetor
			
			if(notas[i] >= 5){
			//verificando se a nota da posição atual(i) é de um aluno aprovado e incrementando o contador.	
				cont++;
			}
		}
		return cont;
	}
}

	