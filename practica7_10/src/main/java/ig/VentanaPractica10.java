package ig;

import javax.swing.JOptionPane;
import metodos.GaussJordan;
import metodos.operacionesDeMatrices;

public class VentanaPractica10 extends javax.swing.JFrame {

    public VentanaPractica10() {
        initComponents();
        setTitle("Practica 10");
        setResizable(false);
        setLocationRelativeTo(null);
        jTextAreaResultados.setEditable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    private operacionesDeMatrices operar = new operacionesDeMatrices();
    private GaussJordan gauss = new GaussJordan();
    @SuppressWarnings("unchecked")
    
    private void hacerOperacion(){
        String entrada = jTextFieldFilasColumnas.getText();
        if(entrada != null){
        boolean esCorrectoElDato = operar.verificarDatosInt(entrada);
        int tamañoMatriz = 0;
        
        if(esCorrectoElDato){
            tamañoMatriz = Integer.parseInt(entrada);
            if(tamañoMatriz > 0){
            
            double matriz[][] = new double[tamañoMatriz][tamañoMatriz];    
            matriz = operar.llenarMatrizCuadrada(matriz);
            if(matriz != null){
            jTextAreaResultados.setText("");
            jTextAreaResultados.append("Matriz original: \n");
            operar.imprimirMatriz(matriz, jTextAreaResultados); 
            double matrizGauss[][] = gauss.convertirAMatrizIdentidad(matriz);
            jTextAreaResultados.append("\nMatriz resultante: \n");
            operar.imprimirMatriz(matrizGauss, jTextAreaResultados);
            }
            
            }else{
                JOptionPane.showMessageDialog(null,"Ingresar números enteros positivos");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Ingresar números enteros");
        }
        }else{
            //en caso de tener vacio el jtextfield
            JOptionPane.showMessageDialog(null,"Por favor ingresa un número entero");
        }
    } 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultados = new javax.swing.JTextArea();
        jButtonAceptar = new javax.swing.JButton();
        jTextFieldFilasColumnas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextAreaResultados.setColumns(20);
        jTextAreaResultados.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultados);

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jButtonAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAceptarKeyPressed(evt);
            }
        });

        jLabel1.setText("Número de filas y columnas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jTextFieldFilasColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jButtonAceptar)
                .addGap(49, 49, 49))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jTextFieldFilasColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButtonAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAceptarKeyPressed
        hacerOperacion();
    }//GEN-LAST:event_jButtonAceptarKeyPressed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed

        hacerOperacion();
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResultados;
    private javax.swing.JTextField jTextFieldFilasColumnas;
    // End of variables declaration//GEN-END:variables
}
