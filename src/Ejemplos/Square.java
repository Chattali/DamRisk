package Ejemplos;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int num = scanner.nextInt();
		square (num,num);
		
	}
	 private static void square(int num1, int num2){
		
		
		
		 if (num1==0 && num2==0){
			 System.out.print("matrice[0][0]");
		 }else{
			 for(int i=num1; i>=0; i--){
				System.out.println(square(i,));  
			 }
			 
		 }
	 }

}
