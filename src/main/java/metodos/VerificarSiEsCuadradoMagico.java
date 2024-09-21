package metodos;

import javax.swing.JTextArea;

public class VerificarSiEsCuadradoMagico extends operacionesDeMatrices {

    
public void verificarCuadradoMagico(int matriz[][], JTextArea area) {
    area.setText("");

    // Verificar si la matriz está vacía
    if (matriz.length == 0 || matriz[0].length == 0) {
        area.setText("");
        area.append("La matriz está vacía.");
        return;
    }

    int constanteMagica = 0; 
    int sumaFilas;
    int sumaColumnas;
    int sumaDiagPrincipal = 0;
    int sumaDiagSec = 0;

    // Calcular la constante mágica a partir de la primera fila
    for (int i = 0; i < matriz.length; i++) {
        constanteMagica += matriz[0][i];
    }

    // Verificar filas y columnas
    for (int i = 0; i < matriz.length; i++) {
        sumaFilas = 0;
        sumaColumnas = 0;
        
        for (int j = 0; j < matriz.length; j++) {
            sumaFilas += matriz[i][j];
            sumaColumnas += matriz[j][i];
        }
        
        // Si alguna suma no coincide con la constante mágica, no es un cuadrado mágico
        if (sumaFilas != constanteMagica || sumaColumnas != constanteMagica) {
            area.setText("");
            imprimirMatriz(matriz, area);            
            area.append("\n \nNo es un cuadrado mágico :(");
            return;
        }
    }

    // Diagonal principal
    for (int i = 0; i < matriz.length; i++) {
        sumaDiagPrincipal += matriz[i][i];
    }

    // Diagonal secundaria
    for (int i = 0; i < matriz.length; i++) {
        sumaDiagSec += matriz[i][matriz.length - 1 - i];
    }

    // Verificar si las diagonales coinciden con la constante mágica
    if (constanteMagica == sumaDiagPrincipal && constanteMagica == sumaDiagSec) {
        area.setText("");
        imprimirMatriz(matriz, area);
        area.append("\n \n¡Es un cuadrado mágico! La constante mágica es: " + constanteMagica);
    } else {
        area.setText("");
        imprimirMatriz(matriz, area);
        area.append("\n \nNo es un cuadrado mágico :(");
    }
}

}
