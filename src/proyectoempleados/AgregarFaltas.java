
package proyectoempleados;

import proyectoempleados.Clases.Modulosdaoo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author wendy_6rrub
 */
public class AgregarFaltas extends javax.swing.JFrame {

    private Modulosdaoo modulos; //instancia para llamar métodos
    private String tipoFaltaSeleccionada;
    public AgregarFaltas() {
        initComponents();
        
        modulos = new Modulosdaoo();
        //Configura el ComboBox de Mes
        comboMes.setModel(new DefaultComboBoxModel<>(Modulosdaoo.obtenerMes().toArray(new String[0])));
        comboDia.setModel(new DefaultComboBoxModel<>(Modulosdaoo.obtenerDiasOctubre().toArray(new String[0])));
        comboHoras.setModel(new DefaultComboBoxModel<>(Modulosdaoo.obtenerHorasAusente().toArray(new String[0])));

        comboMes.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Al seleccionar un mes, llenar el ComboBox de Día
            String mesSeleccionado = (String) comboMes.getSelectedItem();
            if (mesSeleccionado != null) {
                llenarDiasComboBox(mesSeleccionado);
            }   
        }
    });
        
        
        initRadioButtons();
    }
    
        private void initRadioButtons() {
            
        // Agrega ActionListener a los RadioButtons
        bttInjusti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipoFaltaSeleccionada = "Injustificada";
            if (bttInjusti.isSelected()) {
                comboHoras.setEnabled(false);
                comboHoras.setSelectedItem("8");
            }
            }
        });

        bttJusti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipoFaltaSeleccionada = "Justificada";
            if (bttJusti.isSelected()) {
                comboHoras.setEnabled(false);
                comboHoras.setSelectedItem("8");
            }
            }
        });

        bttTardia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tipoFaltaSeleccionada = "Tardia"; //se añade esta variable string para pasarla al metodo y dependiendo de su nombre, coincidirá con una posición de Faltas.txt
            if (bttTardia.isSelected()) {
                comboHoras.setEnabled(true);
                comboHoras.setSelectedItem("1");
            }
            }
        });

    }
        
    private void llenarDiasComboBox(String mes) {
        //llena el ComboBox de Día según el mes seleccionado
        if (mes.equals("Octubre")) {
            comboDia.setModel(new DefaultComboBoxModel<>(Modulosdaoo.obtenerDiasOctubre().toArray(new String[0])));
        } else if (mes.equals("Noviembre")) {
            comboDia.setModel(new DefaultComboBoxModel<>(Modulosdaoo.obtenerDiasNoviembre().toArray(new String[0])));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCed = new javax.swing.JTextField();
        bttJusti = new javax.swing.JRadioButton();
        bttInjusti = new javax.swing.JRadioButton();
        bttTardia = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboMes = new javax.swing.JComboBox<>();
        comboDia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboHoras = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AtxtDetalles = new javax.swing.JTextArea();
        bottAgregar = new javax.swing.JButton();
        volverFaltas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Cédula del empleado:");

        bttJusti.setBackground(new java.awt.Color(153, 204, 255));
        grupo1.add(bttJusti);
        bttJusti.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        bttJusti.setForeground(new java.awt.Color(51, 51, 51));
        bttJusti.setText("Ausencia Justificada");

        bttInjusti.setBackground(new java.awt.Color(153, 204, 255));
        grupo1.add(bttInjusti);
        bttInjusti.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        bttInjusti.setForeground(new java.awt.Color(51, 51, 51));
        bttInjusti.setText("Ausencia Injustificada");

        bttTardia.setBackground(new java.awt.Color(153, 204, 255));
        grupo1.add(bttTardia);
        bttTardia.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        bttTardia.setForeground(new java.awt.Color(51, 51, 51));
        bttTardia.setText("Llegada tardía");
        bttTardia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttTardiaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Tipo de Falta");

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Fecha de la falta");

        comboMes.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        comboMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboDia.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        comboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Día");

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Mes");

        jLabel8.setFont(new java.awt.Font("Leelawadee", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Horas de inasistencia");

        comboHoras.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        comboHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        comboHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboHorasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bttTardia, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bttInjusti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bttJusti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(68, 68, 68))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(comboHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(comboHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttJusti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttInjusti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bttTardia)))
                .addGap(38, 38, 38))
        );

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR FALTAS ");

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setForeground(new java.awt.Color(153, 204, 255));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Observaciones:");

        AtxtDetalles.setColumns(20);
        AtxtDetalles.setRows(5);
        jScrollPane1.setViewportView(AtxtDetalles);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        bottAgregar.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        bottAgregar.setText("Agregar");
        bottAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottAgregarActionPerformed(evt);
            }
        });

        volverFaltas.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        volverFaltas.setText("Regresar");
        volverFaltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverFaltasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverFaltas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(bottAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volverFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bottAgregar)
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void bttTardiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttTardiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttTardiaActionPerformed

    private void comboHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboHorasActionPerformed

    private void bottAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottAgregarActionPerformed
        String cedula = txtCed.getText();

        if(tipoFaltaSeleccionada == null || tipoFaltaSeleccionada.isEmpty()){ //revisa que el tipo de falta se seleccione para agregar una falta
            JOptionPane.showMessageDialog(this, "No se seleccionó el tipo de falta", "Error", JOptionPane.ERROR_MESSAGE);
        }else if(cedula.isEmpty()){
            JOptionPane.showMessageDialog(this, "No se ingresó una cedula", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            // Obtener día, mes y año seleccionados
            int diaSeleccionado = Integer.parseInt((String) comboDia.getSelectedItem());
            String mesSeleccionado = (String) comboMes.getSelectedItem();
            int añoPredeterminado = 2023;

            // Armar la cadena de fecha en formato "dia/mes/año"
            String fechaString = String.format("%02d/%s/%d", diaSeleccionado, modulos.obtenerNumeroMes(mesSeleccionado), añoPredeterminado);//el nombre del mes lo sustituye por su respectivo número para que la fecha quede en formato numérico

            LocalDate fecha = LocalDate.parse(fechaString, DateTimeFormatter.ofPattern("dd/MM/yyyy")); //crea una fecha que se puede separar según mes, dia o año

            String horasInasistencia = comboHoras.getSelectedItem().toString();

            String detalles = AtxtDetalles.getText().trim();

            // Si el TextArea está vacío, colocar un punto
            if (detalles.isEmpty()) {
                detalles = ".";
            }

            // Verificar si la cédula existe en Empleados.txt
            if (modulos.existeCedula(cedula) && tipoFaltaSeleccionada != null) {
                // Si existe, agregar el detalle de la falta
                modulos.agregarFalta(cedula, fecha, tipoFaltaSeleccionada, horasInasistencia, detalles);
                JOptionPane.showMessageDialog(this, "Falta agregada correctamente.");

                RegistroIncidencias aus = new RegistroIncidencias();
                aus.setVisible(true);
                aus.setLocationRelativeTo(null); //posiciona la próxima ventana en el centro
                dispose(); //sale de la ventana
            } else {
                JOptionPane.showMessageDialog(this, "La cédula " + cedula + " no está registrada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_bottAgregarActionPerformed

    private void volverFaltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverFaltasActionPerformed
        RegistroIncidencias ausen = new RegistroIncidencias();
        ausen.setVisible(true);
        ausen.setLocationRelativeTo(null); //posiciona la ventana en el centro
        dispose();
    }//GEN-LAST:event_volverFaltasActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AtxtDetalles;
    private javax.swing.JButton bottAgregar;
    private javax.swing.JRadioButton bttInjusti;
    private javax.swing.JRadioButton bttJusti;
    private javax.swing.JRadioButton bttTardia;
    private javax.swing.JComboBox<String> comboDia;
    private javax.swing.JComboBox<String> comboHoras;
    private javax.swing.JComboBox<String> comboMes;
    private javax.swing.ButtonGroup grupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCed;
    private javax.swing.JButton volverFaltas;
    // End of variables declaration//GEN-END:variables
}
