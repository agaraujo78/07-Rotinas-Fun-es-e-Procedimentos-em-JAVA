import java.util.Scanner;

//1) Criar um m�todo que imprima o valores de um vetor de inteiros. 
//2) Copiar o m�todo da preenchimento de vetor do exemplo anterior. 
//3) Em seguida crie um programa que preencha um vetor de 10 posi��es
//e imprima os seus valores 

public class Exemplo04 {

	public static void main(String[] args) {
		
		int numeros[] = new int[10];
		
		preencherVetor(numeros);
		
		imprimirVetor(numeros);
		
	}

	
	
	public static void preencherVetor(int vetor[]) {
		Scanner leitor = new Scanner(System.in);
		
		for( int i = 0; i < vetor.length; i++){
		System.out.printf("V[%d] = ", i);
		vetor[i] = leitor.nextInt();
		}
		
		leitor.close();
	
	}
	
	
	public static void imprimirVetor(int vetor[]) {
	
	for (int i = 0; i < vetor.length; i++) {
		
		if (i > 0) System.out.print(", ");
		
		System.out.print(vetor[i] + ", ");
		
	}
	}
}
