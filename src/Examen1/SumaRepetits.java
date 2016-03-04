package Examen1;

public class SumaRepetits {
	/**
	 * Es valorará l'eficiencia de la solució
	 * 
	 * @param llista
	 *            Llista d'enters ordenada, amb almenys 2 elements
	 * @param k
	 *            Un número enter major que 1
	 * @return La suma dels elements de la llista repetits k o més vegades
	 */
	static int sumaRepetits(int[] llista, int k) {

		int suma = 0;
		// Implementeu aquí la vostra solució
		int cont=1;
		for (int i=1; i<llista.length; i++){
			if(llista[i]==llista[i-1]){
				//el variable cont cuenta cuantas veces se repeta un numero
				cont++;
			}else{
				//aqui es cuando se reinicia el cont cuando ya nos iguales
				cont=1;
			}
			if(cont==k){
				suma=suma+llista[i];
			}
		}
		return suma;
		// he usado solo un variable que es el cont ;D
	}

	public static void main(String[] args) {
		// Si modifiqueu les llistes teniu en compte que:
		// llistes.length == ks.length
		int[][] llistes = { { 1, 1, 3, 5, 5, 5, 6, 7, 7, 7, 7, 8, 8, 9, 9, 9 },
				{ 1, 2, 2, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 7, 9, 9, 10 } };
		int[] ks = { 3, 2 };

		for (int i = 0; i < llistes.length; i++) {
			System.out.println(sumaRepetits(llistes[i], ks[i]));
		}
		// Sortida detallada:
		// 5 + 7 + 9 = 21
		// 2 + 3 + 5 + 6 + 7 + 9 = 32
	}
	
	
}
