package metodos;

import javax.swing.JTextArea;

public class ContarCeros extends operacionesDeMatrices {

    private final int[][] arreglo = {
        {0, 2, 5, 7, 6},
        {0, 0, 0, 3, 8},
        {2, 9, 6, 3, 4},
        {1, 5, 6, 1, 4},
        {0, 9, 2, 5, 0}
    };

    public void mostrarMatriz(JTextArea area) {
        area.setText("");
        imprimirMatriz(arreglo, area);
        area.append("\nLa cantidad de ceros de la matriz es: " + contarCeros());
    }

    private int contarCeros() {
        return contarCerosRecursivo(0, 0);
    }

    private int contarCerosRecursivo(int fila, int col) {
        // Caso base: si hemos llegado al final del arreglo
        if (fila >= arreglo.length) {
            return 0;
        }

        // Si hemos procesado toda la fila actual, pasamos a la siguiente fila
        if (col >= arreglo[fila].length) {
            return contarCerosRecursivo(fila + 1, 0);
        }

        // Contar el cero en la posición actual y continuar recursivamente
        int contador = (arreglo[fila][col] == 0) ? 1 : 0;
        return contador + contarCerosRecursivo(fila, col + 1);
    }

}
