package Ejemplos;

import java.util.Scanner;

public class SerieFibonacci {

	public static void main (String[] args ){
		int num=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		num = scanner.nextInt();
		
		int resultado = fibonacci(num);
		System.out.println(resultado);
		
	}
	
	private static int fibonacci(int num){
		
		if (num==0) return 0;
		if (num==1) return 1;
		
		return fibonacci(num-1)+fibonacci(num-2);
	}
	
}
