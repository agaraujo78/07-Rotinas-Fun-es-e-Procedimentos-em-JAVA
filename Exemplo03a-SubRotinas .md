**EXEMPLO 03**

//Criar um método que preencha um vetor (objeto) de inteiros de 10 valores,
//utilizando o Scanner. Um seguida crie um programa que utilize o método para preencher 
//o vetor e, logo depois Imprima a somatória, dos valores do vetor. 



	import java.util.Scanner;
	
	public class Exemplo03 {
	
	public static void main(String[] args) {
	
		int numeros[] = new int[10];
		
		preencherVetor(numeros);
		
			int somatorio = 0;
			
				for(int i = 0; i < numeros.length; i++) {
			somatorio = somatorio + numeros[i];
		}
			System.out.printf("A somatória dos valores do vetor é: %d", somatorio);
		}
	
	
		
		public static void preencherVetor(int vetor[]) {
			Scanner leitor = new Scanner(System.in);
			
			for( int i = 0; i < vetor.length; i++){
			System.out.printf("V[%d] = ", i);
			vetor[i] = leitor.nextInt();
			}
			
			leitor.close();
		
		}
		
	}
	






 ![img](file:///C:\Users\Agara\AppData\Local\Temp\msohtmlclip1\01\clip_image002.png)