package Examen1;

public class Ex4 {

	public static void main(String[] args) {

		int[] vector1 = { 1, 3, 4, 5, 7, 5, 3, 0 };

		int[] vector2 = { 1, 7, 4, 3, 5, 3, 0 };

		merge(vector1, vector2);

		// Escriu la sortida per pantalla, amb el format de l'exercici 3
		// {0,0,1,1,3,3,3,3,4,4,5,5,5,7,7} <-- Exemple de sortida
		print(merge(vector1, vector2));
	}

	public static int[] merge(int[] vector1, int[] vector2) {

		int[] merged;

		// Escriu aquí el teu codi
		// dimensionar el vector marged
		merged = new int[vector1.length+vector2.length];
		// relleno el vector marged con los valores del vector1 y vector2
		// de forma que los primeros valores son del vector1 y el resto son valores del vector2
		for(int i=0; i<vector1.length+vector2.length; i++){
			if(i<=vector1.length-1){
				merged[i]=vector1[i];
			}else{
				merged[i]=vector2[i-vector1.length];
			}
		}
		// llamo a la funcio ordenar que ordena el vector merged
		ordenar(merged);
		// devuelve el vector merged ordenado
		return merged;

	}
	// esta funcion ordena un vector
	public static void ordenar(int[] vector) {
		// 
		for (int i = 0; i < (vector.length - 1); i++) {
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[i] > vector[j]) {

					int aux = vector[i];
					vector[i] = vector[j];
					vector[j] = aux;
				}
			}
		}
	}
	// funcion para imprimer cualquier vector dado
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
