
package proyectoempleados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoempleados.Clases.Empleados;
import proyectoempleados.Clases.EmpleadosDao;

/**
 *
 * @author franc
 */
public class registroPlanillas extends javax.swing.JFrame {

    public registroPlanillas() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameee = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        planillas = new javax.swing.JTextField();
        consultaPlanilla = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        namee = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPlan = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        TotalRegistro = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fono = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dir = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameee.setBackground(new java.awt.Color(255, 255, 255));
        nameee.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setForeground(new java.awt.Color(0, 0, 51));

        planillas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        planillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planillasActionPerformed(evt);
            }
        });

        consultaPlanilla.setText("Consultar");
        consultaPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaPlanillaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(planillas, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(consultaPlanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planillas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultaPlanilla))
                .addGap(20, 20, 20))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nombre:");

        namee.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        namee.setForeground(new java.awt.Color(153, 153, 153));
        namee.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Cedula:");

        id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(153, 153, 153));
        id.setText("jLabel3");

        tablaPlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaPlan);

        TotalRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TotalRegistro);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Registro del Empleado:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Telefono:");

        fono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fono.setForeground(new java.awt.Color(153, 153, 153));
        fono.setText("jLabel3");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Correo:");

        dir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dir.setForeground(new java.awt.Color(153, 153, 153));
        dir.setText("jLabel3");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Registro Total de Planillas:");

        javax.swing.GroupLayout nameeeLayout = new javax.swing.GroupLayout(nameee);
        nameee.setLayout(nameeeLayout);
        nameeeLayout.setHorizontalGroup(
            nameeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(nameeeLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(nameeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(nameeeLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fono, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(nameeeLayout.createSequentialGroup()
                        .addGroup(nameeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(nameeeLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namee, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(107, 107, 107)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        nameeeLayout.setVerticalGroup(
            nameeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nameeeLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(nameeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namee)
                    .addComponent(jLabel5)
                    .addComponent(dir))
                .addGap(18, 18, 18)
                .addGroup(nameeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id)
                    .addComponent(jLabel4)
                    .addComponent(fono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nameee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void planillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planillasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planillasActionPerformed
 
    
    
    // lectura del archivoo carga de planillas
       private void cargarDatosDesdeArchivo(String cedula) {
   try (BufferedReader lector = new BufferedReader(new FileReader("RegistroDePlanillas.txt"))) {
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Contrato");
        model.addColumn("Departamento");
        model.addColumn("Puesto");
        model.addColumn("Mes");
        model.addColumn("Salario Bruto");
        model.addColumn("Aporte CCSS");
        model.addColumn("Aporte LPT");
        model.addColumn("Horas Extras");
        model.addColumn("Tardias");
        model.addColumn("Ausencias");
        model.addColumn("Salario Neto");

        DefaultTableModel totalModel = new DefaultTableModel();
                
        totalModel.addColumn("Nombre");
        totalModel.addColumn("Cedula");
        totalModel.addColumn("Contrato");
        totalModel.addColumn("Departamento");
        totalModel.addColumn("Puesto");
        totalModel.addColumn("Mes");
        totalModel.addColumn("Salario Bruto");
        totalModel.addColumn("Aporte CCSS");
        totalModel.addColumn("Aporte LPT");
        totalModel.addColumn("Horas Extras");
        totalModel.addColumn("Tardias");
        totalModel.addColumn("Ausencias");
        totalModel.addColumn("Salario Neto");

        String line;
        while ((line = lector.readLine()) != null) {
            String[] datos = line.split(",");
            if (datos.length >= 6) {
              
                totalModel.addRow(new Object[]{
                       datos[0],datos[1], datos[2], datos[3], datos[4], datos[5], datos[7], datos[9], datos[11], datos[13], datos[15], datos[17], datos[19]
                });
                if (datos[1].equals(cedula)) {
                    model.addRow(new Object[]{
                            datos[2], datos[3], datos[4], datos[5], datos[7], datos[9], datos[11], datos[13], datos[15], datos[17], datos[19]
                    });
                }
            }
        }

        tablaPlan.setModel(model);
        TotalRegistro.setModel(totalModel);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    // se consulta la planillas que se solicita dentro de la interfaz
    private void consultaPlanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaPlanillaActionPerformed
 String cedulaIngresada = planillas.getText().trim();

    if (cedulaIngresada.equals("Ingrese Cedula") || cedulaIngresada.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Ingrese un número de cédula antes de cargar la planilla.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        Empleados empleado = EmpleadosDao.consultarEmpleados("cedula", cedulaIngresada);

        if (empleado != null) {
            namee.setText(empleado.getNombre() + " " + empleado.getApellido());
            id.setText(empleado.getCedula());
            fono.setText(empleado.getTeléfono());
            dir.setText(empleado.getEmail());
          
               cargarDatosDesdeArchivo(cedulaIngresada);
        } else {
            limpiarLabels();
            JOptionPane.showMessageDialog(null, "No se encontró un empleado con la cédula proporcionada.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Ingrese un número entero para las horas extras y ausencias.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_consultaPlanillaActionPerformed
 // instancias 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu menuu= new Menu();
        menuu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
     


            private void limpiarLabels() {
            namee.setText("");
            id.setText("");
           ;
          }
            
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registroPlanillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroPlanillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroPlanillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroPlanillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registroPlanillas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TotalRegistro;
    private javax.swing.JButton consultaPlanilla;
    private javax.swing.JLabel dir;
    private javax.swing.JLabel fono;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel namee;
    private javax.swing.JPanel nameee;
    private javax.swing.JTextField planillas;
    private javax.swing.JTable tablaPlan;
    // End of variables declaration//GEN-END:variables

  
}
