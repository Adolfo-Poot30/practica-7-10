package metodos;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AritmeticaDeMatrices extends operacionesDeMatrices{
    
    public void sumarMatrices(int[][] matriz1, int[][] matriz2, JTextArea area){
        
        
        int matriz3 [][] = new int[2][2];
        
        for(int i=0; i < 2; i++)
        {
            for(int j=0; j<2; j++)
            { 
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        imprimirMatriz(matriz3,area);
    }
    
    public void restarMatrices(int[][] matriz1, int[][] matriz2, JTextArea area){
        
        int matriz3 [][] = new int[2][2];
        
        for(int i=0; i < 2; i++)
        {
            for(int j=0; j<2; j++)
            { 
                matriz3[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }
        imprimirMatriz(matriz3,area);
    }
    
    public void multiplicarMatrices(int[][] matriz1, int[][] matriz2, JTextArea area){
        
        int matriz3 [][] = new int[2][2];
        
        for(int i=0; i < 2; i++)
        {
            for(int j=0; j<2; j++)
            { 
                matriz3[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        imprimirMatriz(matriz3,area);
    }
    
    public void dividirMatrices(int[][] matriz1, int[][] matriz2, JTextArea area){
        
        double matriz3 [][] = new double[2][2];
        try{
            for(int i=0; i < 2; i++)
            {
                for(int j=0; j<2; j++)
                { 
                    matriz3[i][j] = (double)matriz1[i][j] / matriz2[i][j];
                }
            }
            imprimirMatriz(matriz3,area);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
}
