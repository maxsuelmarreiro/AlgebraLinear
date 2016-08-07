
public class matriz {

	private String[][] matriz;

	public matriz(String[][] m) {
		this.matriz = m;
	}

	public void MatrizDiagonal() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					System.out.print(matriz[i][j]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public void MatrizSuperior() {

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i >= j) {
					System.out.print(" ");
				} else {
					System.out.print(matriz[i][j]);
				}
			}
			System.out.println();
		}

	}

	public void MatrizInferior() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i > j) {
					System.out.print(matriz[i][j]);
				}
				System.out.print("");
			}
			System.out.println();
		}
	}

	public void ImprimirMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println("");
		}
	}
}
