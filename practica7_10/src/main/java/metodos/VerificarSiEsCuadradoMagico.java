package metodos;

import javax.swing.JTextArea;

public class VerificarSiEsCuadradoMagico extends operacionesDeMatrices {

    public void verificarCuadradoMagico(int[][] matriz, JTextArea area) {
        area.setText("");

        // Verificar si la matriz está vacía
        if (matriz.length == 0 || matriz[0].length == 0) {
            area.append("La matriz está vacía.");
            return;
        }

        int constanteMagica = calcularConstanteMagica(matriz, 0);
        boolean esCuadradoMagico = verificarFilasYColumnas(matriz, constanteMagica, 0, 0);
        int sumaDiagPrincipal = calcularSumaDiagonal(matriz, 0, true);
        int sumaDiagSec = calcularSumaDiagonal(matriz, 0, false);

        // Verificar si las diagonales coinciden con la constante mágica
        if (esCuadradoMagico && constanteMagica == sumaDiagPrincipal && constanteMagica == sumaDiagSec) {
            area.append("¡Es un cuadrado mágico! La constante mágica es: " + constanteMagica+"\n");
        } else {
            area.append("No es un cuadrado mágico :( \n");
        }

        imprimirMatriz(matriz, area);
    }

    private int calcularConstanteMagica(int[][] matriz, int columna) {
        if (columna >= matriz[0].length) {
            return 0;
        }
        return matriz[0][columna] + calcularConstanteMagica(matriz, columna + 1);
    }

    private boolean verificarFilasYColumnas(int[][] matriz, int constanteMagica, int fila, int col) {
        if (fila >= matriz.length) {
            return true;
        }

        int sumaFilas = 0;
        int sumaColumnas = 0;

        // Sumar fila actual y columna actual
        for (int j = 0; j < matriz.length; j++) {
            sumaFilas += matriz[fila][j];
            sumaColumnas += matriz[j][fila];
        }

        // Verificar si alguna suma no coincide con la constante mágica
        if (sumaFilas != constanteMagica || sumaColumnas != constanteMagica) {
            return false;
        }

        // Continuar con la siguiente fila
        return verificarFilasYColumnas(matriz, constanteMagica, fila + 1, col);
    }

    private int calcularSumaDiagonal(int[][] matriz, int index, boolean principal) {
        if (index >= matriz.length) {
            return 0;
        }
        if (principal) {
            return matriz[index][index] + calcularSumaDiagonal(matriz, index + 1, principal);
        } else {
            return matriz[index][matriz.length - 1 - index] + calcularSumaDiagonal(matriz, index + 1, principal);
        }
    }
}
