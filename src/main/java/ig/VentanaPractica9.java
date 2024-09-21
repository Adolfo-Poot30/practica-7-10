package ig;

import javax.swing.JOptionPane;
import metodos.AritmeticaDeMatrices;
import metodos.operacionesDeMatrices;

public class VentanaPractica9 extends javax.swing.JFrame {

    public VentanaPractica9() {
        initComponents();
        setTitle("Practica 9");
        setResizable(false);
        setLocationRelativeTo(null);
        jTextArea1.setEditable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonMatriz1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonMatriz2 = new javax.swing.JButton();
        jButtonResultados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonMatriz1.setText("Matriz 1");
        jButtonMatriz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatriz1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Llena las dos matrices 2x2 con números enteros");

        jButtonMatriz2.setText("Matriz 2");
        jButtonMatriz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatriz2ActionPerformed(evt);
            }
        });

        jButtonResultados.setText("Ver resultados");
        jButtonResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResultadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonMatriz1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMatriz2)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonResultados))
                    .addComponent(jLabel1))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMatriz1)
                    .addComponent(jButtonMatriz2)
                    .addComponent(jButtonResultados))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int matriz1[][] = new int[2][2];
    int matriz2[][] = new int[2][2];

    private void jButtonMatriz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatriz1ActionPerformed

        matriz1 = new operacionesDeMatrices().llenarMatrizCuadrada(matriz1, 2, 2);
    }//GEN-LAST:event_jButtonMatriz1ActionPerformed

    private void jButtonMatriz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatriz2ActionPerformed

        matriz2 = new operacionesDeMatrices().llenarMatrizCuadrada(matriz2, 2, 2);
    }//GEN-LAST:event_jButtonMatriz2ActionPerformed

    private void jButtonResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResultadosActionPerformed
        if (matriz1 != null & matriz2 != null) {
            AritmeticaDeMatrices operaciones = new AritmeticaDeMatrices();
            jTextArea1.setText("");
            jTextArea1.append("Matriz 1: \n");
            operaciones.imprimirMatriz(matriz1, jTextArea1);
            jTextArea1.append("\nMatriz 2: \n");
            operaciones.imprimirMatriz(matriz2, jTextArea1);
            jTextArea1.append("\nSuma: \n");
            operaciones.sumarMatrices(matriz1, matriz2, jTextArea1);
            jTextArea1.append("\nResta: \n");
            operaciones.restarMatrices(matriz1, matriz2, jTextArea1);
            jTextArea1.append("\nMultiplicación: \n");
            operaciones.multiplicarMatrices(matriz1, matriz2, jTextArea1);
            jTextArea1.append("División: \n");
            operaciones.dividirMatrices(matriz1, matriz2, jTextArea1);

        } else {
            JOptionPane.showInputDialog("Una de las matrices está vacia");
        }
    }//GEN-LAST:event_jButtonResultadosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMatriz1;
    private javax.swing.JButton jButtonMatriz2;
    private javax.swing.JButton jButtonResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
