
package IU;

import proyectoempleados.RegistroIncidencias;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author wendy_6rrub
 */
public class Justificaciones extends javax.swing.JFrame {

    DefaultTableModel modelo2; //crea el modelo que se utilizará
    
    public Justificaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        modelo2 = new DefaultTableModel(){ //inicia el modelo de la tabla
        @Override
            public boolean isCellEditable(int row, int column) {
                return false; //vuelve las celdas no editables
            }
        };

        txtpaneJusti.setEnabled(false);
  
        // Agregar un listener para la selección de la tabla
        table2.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Verificar si hay una fila seleccionada
                if (table2.getSelectedRow() != -1) {
                    // Habilitar el área de texto si hay una fila seleccionada
                    txtpaneJusti.setEnabled(true);
                } else {
                    // Deshabilitar el área de texto si no hay ninguna fila seleccionada, porque solo se puede justificar una fecha existente en la tabla
                    txtpaneJusti.setEnabled(false);
                }
            }
        });
        modelo2.addColumn("Fecha");
        modelo2.addColumn("Tipo");
        
        table2.setModel(modelo2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        label1 = new javax.swing.JLabel();
        txtcedulaa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDepa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtpaneJusti = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnJusti = new javax.swing.JButton();
        regresar2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(table2);

        label1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        label1.setText("Cédula");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel3.setText("SELECCIONE LA FECHA A JUSTIFICAR");

        txtNombre.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel5.setText("Departamento:");

        txtDepa.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N

        jScrollPane2.setViewportView(txtpaneJusti);

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel1.setText("Justificación:");

        jButton1.setFont(new java.awt.Font("Leelawadee UI", 1, 11)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(label1)
                                .addGap(27, 27, 27)
                                .addComponent(txtcedulaa, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDepa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(45, 45, 45))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label1)
                            .addComponent(txtcedulaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDepa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnJusti.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        btnJusti.setText("JUSTIFICAR");
        btnJusti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJustiActionPerformed(evt);
            }
        });

        regresar2.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        regresar2.setText("Regresar");
        regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresar2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("JUSTIFICACIÓN DE FALTAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnJusti, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(320, 320, 320))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(regresar2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnJusti)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        llenarEspaciosPersonales(txtcedulaa.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnJustiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJustiActionPerformed

        if(txtpaneJusti.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "La justificación está vacía");
        }else{
            try {
                File archivo = new File("Faltas.txt");
                List<String> lineasFaltas = new ArrayList<>();

                //lee el contenido actual del archivo y almacenarlo en la lista
                try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                    String linea;
                    while ((linea = br.readLine()) != null) {
                        lineasFaltas.add(linea);
                    }
                }

                // Modifica la línea en la lista en memoria
                for (int i = 0; i < lineasFaltas.size(); i++) {
                    String[] elementos = lineasFaltas.get(i).split(",");
                    if (elementos.length == 5 && elementos[0].equals(txtcedulaa.getText()) && elementos[1].equals(table2.getValueAt(table2.getSelectedRow(), 0).toString())) {
                        // Modificar los elementos necesarios
                        elementos[4] = txtpaneJusti.getText();
                        elementos[2] = "Justificada";
                        // Actualizar la línea en la lista
                        lineasFaltas.set(i, String.join(",", elementos));
                        break;
                    }
                }

                // Escribir el contenido actualizado en el archivo de faltas
                try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
                    for (String linea : lineasFaltas) {
                        bw.write(linea);
                        bw.newLine();
                    }
                }
                 JOptionPane.showMessageDialog(this, "Justificación agregada correctamente.");

            } catch (IOException e) {
                e.printStackTrace();
            }

        RegistroIncidencias cias = new RegistroIncidencias();
        cias.setVisible(true);
        cias.setLocationRelativeTo(null);
        dispose();
        }
    }//GEN-LAST:event_btnJustiActionPerformed

    private void regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresar2ActionPerformed
        RegistroIncidencias cias = new RegistroIncidencias();
        cias.setVisible(true);
        cias.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_regresar2ActionPerformed

        private void llenarTablaFechas(List<String> fechas, List<String> tipos) {
        // Limpiar la tabla antes de agregar nuevas fechas
        modelo2.setRowCount(0);

        // Agregar las fechas y tipos a la tabla
        for (int i = 0; i < fechas.size(); i++) { 
            modelo2.addRow(new Object[]{fechas.get(i), tipos.get(i)});
        }
    }
        
    private List<String> obtenerFechas(String cedula) { //metodo para obtener todas las fechas de faltas pertenecientes a la cedula, en el txt
        List<String> fechas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Faltas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] elementos = linea.split(",");
                if (elementos.length == 5 && elementos[0].equals(cedula)) {
                    fechas.add(elementos[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fechas;
    }
    
        private List<String> obtenerTipos(String cedula) { //metodo para obtener los tipos de faltas pertenecientes a la cedula, en el txt
        List<String> tipos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Faltas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] elementos = linea.split(",");
                if (elementos.length == 5 && elementos[0].equals(cedula)) {
                    tipos.add(elementos[2]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tipos;
    }
        
    private void llenarEspaciosPersonales(String identificationNumber) { //llena los espacios personales según la cédula
        identificationNumber = txtcedulaa.getText();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("Empleados.txt"));
            BufferedReader brder = new BufferedReader(new FileReader("Faltas.txt"));
            String linea;
            boolean encontrado = false; 
            
            while ((linea = br.readLine()) != null) { 
                String[] elementos = linea.split(","); 
                if (elementos.length == 13 && elementos[2].equals(identificationNumber)) {  
                    txtNombre.setText(elementos[0] + " " + elementos[1]);
                    txtDepa.setText(elementos[9]);

                    encontrado = true;
                    break; 
                }
            }

            br.close();// Cerrar el lector de archivos después de leer
            List<String> fechas = obtenerFechas(identificationNumber); 
            List<String> tipos = obtenerTipos(identificationNumber);
            llenarTablaFechas(fechas, tipos);
            //si no se encontro la cedula, entonces limpia los espacios
            if (!encontrado) {
                    txtNombre.setText("");
                    txtDepa.setText("");

                JOptionPane.showMessageDialog(this, "Identificación no encontrada. \nDebe llenar el espacio con su identificacion y estar registrado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJusti;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JButton regresar2;
    private javax.swing.JTable table2;
    private javax.swing.JLabel txtDepa;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JTextField txtcedulaa;
    private javax.swing.JTextPane txtpaneJusti;
    // End of variables declaration//GEN-END:variables
}
