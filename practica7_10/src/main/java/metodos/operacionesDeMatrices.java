package metodos;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class operacionesDeMatrices {

    public void imprimirMatriz(int[][] arreglo, JTextArea area) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                area.append(" [ " + arreglo[i][j] + " ] ");
            }
            area.append("\n");
        }

    }

    public void imprimirMatriz(double[][] arreglo, JTextArea area) {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                area.append(" [ " + arreglo[i][j] + " ] ");
            }
            area.append("\n");
        }

    }

    public boolean verificarDatos(String entrada) {
        if (entrada != null) {
            try {
                double dato = Double.parseDouble(entrada);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    public boolean verificarDatosInt(String entrada) {
        if (entrada != null) {
            try {
                int dato = Integer.parseInt(entrada);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    public int[][] llenarMatrizCuadrada(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String valor = JOptionPane.showInputDialog("Ingrese el valor para la posición [" + i + "][" + j + "]:");

                // Verificar si el usuario ha cancelado el diálogo
                if (valor == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada. No se guardaron los datos.");
                    return matriz; // Salir del método sin guardar cambios
                }

                int dato = 0;
                try {
                    dato = Integer.parseInt(valor);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo se aceptan valores enteros. Se asignó cero en la posición.");
                }
                matriz[i][j] = dato; // Asignar el dato (que puede ser cero en caso de error)
            }
        }
        return matriz;
    }

    public double[][] llenarMatrizCuadrada(double matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                String valor = JOptionPane.showInputDialog("Ingrese el valor para la posición [" + i + "][" + j + "]:");

                // Verificar si el usuario ha cancelado el diálogo
                if (valor == null) {
                    JOptionPane.showMessageDialog(null, "Operación cancelada. No se guardaron los datos.");
                    return matriz; // Salir del método sin guardar cambios
                }

                int dato = 0;
                try {
                    dato = Integer.parseInt(valor);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo se aceptan valores enteros. Se asignó cero en la posición.");
                }
                matriz[i][j] = dato; // Asignar el dato (que puede ser cero en caso de error)
            }
        }
        return matriz;
    }
}
