public class Main {
	public static void main(String[] args) {

		String matriz[][] = { 
				{ "1", "2", "3", "4", "5" }, 
				{ "1", "2", "3", "4", "5" }, 
				{ "1", "2", "3", "4", "5" },
				{ "1", "2", "3", "4", "5" }, 
				{ "1", "2", "3", "4", "5" } };
		
		matriz mat = new matriz(matriz);
		
		System.out.println("Matriz");
		mat.ImprimirMatriz();
		System.out.println("Diagonal");
		mat.MatrizDiagonal();
		System.out.println("Superior");
		mat.MatrizSuperior();
		System.out.println("Inferior");
		mat.MatrizInferior();

	}
}
