package conprob;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adrian Luna
 */
public class VentanaMain extends javax.swing.JFrame {

    public static int index1, index2, index3, index4, index5, index6, index7, index8, index9;
    String finalResultado;
    public static String info;

    // constructor

    public VentanaMain() {

        this.setResizable(false);
        this.setTitle("ConProb");
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pregunta1 = new javax.swing.JLabel();
        respuesta1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        pregunta2 = new javax.swing.JLabel();
        respuesta2 = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        pregunta3 = new javax.swing.JLabel();
        respuesta3 = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        preunta4 = new javax.swing.JLabel();
        respuesta4 = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        pregunta5 = new javax.swing.JLabel();
        respuesta5 = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        pregunta6 = new javax.swing.JLabel();
        respuesta6 = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        pregunta7 = new javax.swing.JLabel();
        respuesta7 = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        pregunta8 = new javax.swing.JLabel();
        respuesta8 = new javax.swing.JComboBox<>();
        jSeparator8 = new javax.swing.JSeparator();
        pregunta9 = new javax.swing.JLabel();
        respuesta9 = new javax.swing.JComboBox<>();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        areaResultado = new javax.swing.JPanel();
        resultadoLabel = new javax.swing.JLabel();
        botonAnalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoArea = new javax.swing.JTextArea();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pregunta1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pregunta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta1.setText("??Que tipo de trade es?");

        respuesta1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        respuesta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V1", "V2", "V2/V3", "T1" }));
        respuesta1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        respuesta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta1ActionPerformed(evt);
            }
        });

        pregunta2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pregunta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta2.setText("??Que posicion de trade en la tendencia es?");

        respuesta2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        respuesta2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));

        pregunta3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pregunta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta3.setText("Caja Millonaria");

        respuesta3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        respuesta3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-30", "30", "40" }));
        respuesta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta3ActionPerformed(evt);
            }
        });

        preunta4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        preunta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preunta4.setText("Impulso de la FYL");

        respuesta4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        respuesta4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fuerte", "Normal", "Bajo" }));
        respuesta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respuesta4ActionPerformed(evt);
            }
        });

        pregunta5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pregunta5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta5.setText("Impuso de las BB'S");

        respuesta5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        respuesta5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Bajo", "Fuerte" }));

        pregunta6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pregunta6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta6.setText("Antes de iniciar la tendencia...");

        respuesta6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        respuesta6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consolidacion y cambio",
                "Consolidacion y continuacion", "Cambio de tendencia", "Continuacion de la tendencia" }));

        pregunta7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pregunta7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta7.setText("??Hubo un previo rompimiento de areas?");

        respuesta7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        respuesta7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        pregunta8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pregunta8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta8.setText("??La expectativa esta a favor?");

        respuesta8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        respuesta8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Si" }));

        pregunta9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pregunta9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pregunta9.setText("En la entrada al trade,?? existe un area?");

        respuesta9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        respuesta9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jLabel2.setText("Resultado:");

        areaResultado.setBackground(new java.awt.Color(255, 255, 102));
        areaResultado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        resultadoLabel.setFont(new java.awt.Font("Alfphabet", 0, 24)); // NOI18N
        resultadoLabel.setForeground(new java.awt.Color(102, 102, 102));
        resultadoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultadoLabel.setText("Resultado");

        javax.swing.GroupLayout areaResultadoLayout = new javax.swing.GroupLayout(areaResultado);
        areaResultado.setLayout(areaResultadoLayout);
        areaResultadoLayout.setHorizontalGroup(
                areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(resultadoLabel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        areaResultadoLayout.setVerticalGroup(
                areaResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(resultadoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        botonAnalizar.setBackground(new java.awt.Color(204, 208, 227));
        botonAnalizar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        botonAnalizar.setText("Analizar oportunidad");
        botonAnalizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAnalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //Action listener al boton de anlizar revisar estas lineas junto con el metodo boton analizar
        botonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnalizarActionPerformed(evt);
            }
        });

        infoArea.setEditable(false);
        infoArea.setColumns(20);
        infoArea.setRows(5);
        jScrollPane1.setViewportView(infoArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jSeparator9)
                                        .addComponent(jSeparator4)
                                        .addComponent(respuesta4, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jSeparator2)
                                        .addComponent(respuesta1, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jSeparator1)
                                        .addComponent(respuesta2, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(respuesta3, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jSeparator3)
                                        .addComponent(respuesta5, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jSeparator5)
                                        .addComponent(respuesta6, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jSeparator6)
                                        .addComponent(respuesta7, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jSeparator7)
                                        .addComponent(respuesta8, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(jSeparator8)
                                        .addComponent(respuesta9, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(areaResultado, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonAnalizar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pregunta6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pregunta9, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pregunta8, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pregunta7, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pregunta5, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(preunta4, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pregunta3, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pregunta2, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                        .addComponent(pregunta1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pregunta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(respuesta1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pregunta2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(respuesta2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pregunta3, javax.swing.GroupLayout.PREFERRED_SIZE, 17,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(respuesta3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(preunta4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(respuesta4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pregunta5, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(respuesta5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pregunta6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(respuesta6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pregunta7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(respuesta7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pregunta8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(respuesta8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pregunta9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(respuesta9, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 7,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(areaResultado, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonAnalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_botonAnalizarActionPerformed
        index1 = respuesta1.getSelectedIndex();
        index2 = respuesta2.getSelectedIndex();
        index3 = respuesta3.getSelectedIndex();
        index4 = respuesta4.getSelectedIndex();
        index5 = respuesta5.getSelectedIndex();
        index6 = respuesta6.getSelectedIndex();
        index7 = respuesta7.getSelectedIndex();
        index8 = respuesta8.getSelectedIndex();
        index9 = respuesta9.getSelectedIndex();

        Prediccion predict = new Prediccion();

        try {
            finalResultado = predict.getPrediccion();
        } catch (Exception ex) {
            Logger.getLogger(VentanaMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.resultadoLabel.setText(finalResultado);

        if ("Positivo".equals(finalResultado)) {
            areaResultado.setBackground(Color.BLUE);
            areaResultado.setBackground(Color.GREEN);

        } else if ("Negativo".equals(finalResultado)) {
            areaResultado.setBackground(Color.RED);

        }
        this.infoArea.setText("Cargando...");
        this.infoArea.setText(info);

    }// GEN-LAST:event_botonAnalizarActionPerformed

    private void respuesta4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_respuesta4ActionPerformed

    }// GEN-LAST:event_respuesta4ActionPerformed

    private void respuesta3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_respuesta3ActionPerformed

    }// GEN-LAST:event_respuesta3ActionPerformed

    private void respuesta1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_respuesta1ActionPerformed

    }// GEN-LAST:event_respuesta1ActionPerformed

    public void setResultado(String resul) {
        this.finalResultado = resul;
    }

 






    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMain.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaResultado;
    private javax.swing.JButton botonAnalizar;
    private javax.swing.JTextArea infoArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel pregunta1;
    private javax.swing.JLabel pregunta2;
    private javax.swing.JLabel pregunta3;
    private javax.swing.JLabel pregunta5;
    private javax.swing.JLabel pregunta6;
    private javax.swing.JLabel pregunta7;
    private javax.swing.JLabel pregunta8;
    private javax.swing.JLabel pregunta9;
    private javax.swing.JLabel preunta4;
    private javax.swing.JComboBox<String> respuesta1;
    private javax.swing.JComboBox<String> respuesta2;
    private javax.swing.JComboBox<String> respuesta3;
    private javax.swing.JComboBox<String> respuesta4;
    private javax.swing.JComboBox<String> respuesta5;
    private javax.swing.JComboBox<String> respuesta6;
    private javax.swing.JComboBox<String> respuesta7;
    private javax.swing.JComboBox<String> respuesta8;
    private javax.swing.JComboBox<String> respuesta9;
    private javax.swing.JLabel resultadoLabel;
    // End of variables declaration//GEN-END:variables

}
