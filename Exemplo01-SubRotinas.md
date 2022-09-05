**EXEMPLO 01**

	import java.util.Scanner; //(Ctrl + Shift + o);
	
	//Criar um programe que verifique e retorne o maior numero entre dois
	
	public class Exemplo01 {
	
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valorA = leitor.nextInt();
		
		System.out.print("Digite outro valor: ");
		int valorB = leitor.nextInt();	
		
		int res = Math.max(valorA, valorB);


		System.out.printf("O maior Valor é: %s", res);

		leitor.close();
	}
	}









 ![img](file:///C:\Users\Agara\AppData\Local\Temp\msohtmlclip1\01\clip_image002.png)