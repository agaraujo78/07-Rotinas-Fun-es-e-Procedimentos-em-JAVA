#**EXEMPLO 02**a

// Criar um programa que verifique e retorne o maior numero entre tres



	mport java.util.Scanner;
	
	public class Exemplo02 {
	
		public static void main(String[] args) {
			Scanner leitor = new Scanner(System.in);
			
			int a, b, c, res;
			
			System.out.print("Digite o valor A: ");
			a = leitor.nextInt();
			
			System.out.print("Digite o valor B:");
			b = leitor.nextInt();	
			
			System.out.print("Digite o valor C:");
			c = leitor.nextInt();	
			
		    res = maior (a, b, c);
			
		    System.out.printf("O maior valor é: %d", res);
			
			leitor.close();
		}
		
		public static int maior( int a, int b, int c) {
			
			int maior;
			
			if(a > b && a > c) {
				maior = a;	
		    }else if (b > c) {
		    	maior = b;
		    }else {
		    	maior = c;
		    }
			return maior;
		}
	}
	
	}

