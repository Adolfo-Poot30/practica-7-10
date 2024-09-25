package metodos;

public class GaussJordan {

public static double[][] convertirAMatrizIdentidad(double[][] matriz) {
        int n = matriz.length;
        return gaussJordan(matriz, 0, n);
    }

    private static double[][] gaussJordan(double[][] matriz, int fila, int n) {
        if (fila >= n) {
            return matriz; // Caso base: todas las filas procesadas
        }

        // Hacer que el elemento en la posición (fila, fila) sea 1
        double divisor = matriz[fila][fila];
        if (divisor != 0) {
            for (int j = 0; j < n; j++) {
                matriz[fila][j] /= divisor; // Normalizar la fila
            }
        }

        // Hacer que los elementos en la columna 'fila' sean 0 en otras filas
        for (int i = 0; i < n; i++) {
            if (i != fila) {
                double factor = matriz[i][fila];
                for (int j = 0; j < n; j++) {
                    matriz[i][j] -= factor * matriz[fila][j]; // Eliminar elementos
                }
            }
        }

        // Llamada recursiva para la siguiente fila
        return gaussJordan(matriz, fila + 1, n);
    }
}