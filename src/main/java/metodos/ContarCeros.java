package metodos;

import javax.swing.JTextArea;

public class ContarCeros extends operacionesDeMatrices{

    private final int[][] arreglo = {
        {0, 2, 5, 7, 6},
        {0, 0, 0, 3, 8},
        {2, 9, 6, 3, 4},
        {1, 5, 6, 1, 4},
        {0, 9, 2, 5, 0}
    };

    public void mostrarMatriz(JTextArea area) {
        area.setText("");
        imprimirMatriz(arreglo,area);
        area.append("\nLa cantidad de ceros de la matriz es: " + contarCeros());
    }

    private int contarCeros() {
        int contador = 0;

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] == 0) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
