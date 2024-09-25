package metodos;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AritmeticaDeMatrices extends operacionesDeMatrices {

    public void sumarMatrices(int[][] matriz1, int[][] matriz2, JTextArea area) {
        int[][] matriz3 = new int[2][2];
        sumarMatricesRecursivo(matriz1, matriz2, matriz3, 0, 0);
        imprimirMatriz(matriz3, area);
    }

    private void sumarMatricesRecursivo(int[][] matriz1, int[][] matriz2, int[][] matriz3, int fila, int col) {
        // Base case: si hemos procesado todas las filas
        if (fila >= 2) {
            return;
        }

        // Sumar los elementos
        matriz3[fila][col] = matriz1[fila][col] + matriz2[fila][col];

        // Calcular la siguiente posición
        if (col < 1) {
            sumarMatricesRecursivo(matriz1, matriz2, matriz3, fila, col + 1);
        } else {
            sumarMatricesRecursivo(matriz1, matriz2, matriz3, fila + 1, 0);
        }
    }

    public void restarMatrices(int[][] matriz1, int[][] matriz2, JTextArea area) {
        int[][] matriz3 = new int[2][2];
        restarMatricesRecursivo(matriz1, matriz2, matriz3, 0, 0);
        imprimirMatriz(matriz3, area);
    }

    private void restarMatricesRecursivo(int[][] matriz1, int[][] matriz2, int[][] matriz3, int fila, int col) {
        // Caso base: si hemos procesado todas las filas
        if (fila >= 2) {
            return;
        }

        // Restar los elementos
        matriz3[fila][col] = matriz1[fila][col] - matriz2[fila][col];

        // Calcular la siguiente posición
        if (col < 1) {
            restarMatricesRecursivo(matriz1, matriz2, matriz3, fila, col + 1);
        } else {
            restarMatricesRecursivo(matriz1, matriz2, matriz3, fila + 1, 0);
        }
    }

    public void multiplicarMatrices(int[][] matriz1, int[][] matriz2, JTextArea area) {
        int[][] matriz3 = new int[2][2];
        multiplicarMatricesRecursivo(matriz1, matriz2, matriz3, 0, 0);
        imprimirMatriz(matriz3, area);
    }

    private void multiplicarMatricesRecursivo(int[][] matriz1, int[][] matriz2, int[][] matriz3, int fila, int col) {
        // Caso base: si hemos procesado todas las filas
        if (fila >= 2) {
            return;
        }

        // Multiplicar los elementos
        matriz3[fila][col] = matriz1[fila][col] * matriz2[fila][col];

        // Calcular la siguiente posición
        if (col < 1) {
            multiplicarMatricesRecursivo(matriz1, matriz2, matriz3, fila, col + 1);
        } else {
            multiplicarMatricesRecursivo(matriz1, matriz2, matriz3, fila + 1, 0);
        }
    }

    public void dividirMatrices(int[][] matriz1, int[][] matriz2, JTextArea area) {
        double[][] matriz3 = new double[2][2];
        try {
            dividirMatricesRecursivo(matriz1, matriz2, matriz3, 0, 0);
            imprimirMatriz(matriz3, area);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    private void dividirMatricesRecursivo(int[][] matriz1, int[][] matriz2, double[][] matriz3, int fila, int col) {
        // Caso base: si hemos procesado todas las filas
        if (fila >= 2) {
            return;
        }

        // Verificar si el divisor es cero antes de realizar la división
        if (matriz2[fila][col] == 0) {
            throw new ArithmeticException("División por cero en posición [" + fila + "][" + col + "]");
        }

        // Realizar la división
        matriz3[fila][col] = (double) matriz1[fila][col] / matriz2[fila][col];

        // Calcular la siguiente posición
        if (col < 1) {
            dividirMatricesRecursivo(matriz1, matriz2, matriz3, fila, col + 1);
        } else {
            dividirMatricesRecursivo(matriz1, matriz2, matriz3, fila + 1, 0);
        }
    }

}
