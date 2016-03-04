package Examen1;

public class Invert {

	public static void main(String[] args) {
		int[] elements = {1,3,5,12,33,1,2,4,7,18,22,31,11,7};
		// El programa ha d'escriure per pantalla
		// {7,11,31,22,18,7,4,2,1,33,12,5,3,1}
		invert(elements);
	}

	private static void invert(int[] elements) {
	// Escriu aquí el teu codi, utilitza mètodes auxiliars si s'escau
		int ini=0;
		int fin= elements.length-1;
		invert2(elements, ini, fin);
		print(elements);
	}
	public static int[] invert2(int[] elements, int ini, int fin){
		while(ini<=fin){
			int joker = elements[fin];
			elements[fin]=elements[ini];
			elements[ini]=joker;
			return invert2(elements, ini++, fin--);
		}
		return elements;
		
	}
	//una funcion que imprime el resultado
	public static void print(int[] vector){
		System.out.print("{");
		for(int i=0; i<vector.length;i++){
			if(i!=vector.length-1){
		System.out.print(vector[i]+", ");
			}else{
		System.out.print(vector[i]);	
			}
		}
		System.out.print("}");
	}
}

