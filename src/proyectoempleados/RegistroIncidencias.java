
package proyectoempleados;

import proyectoempleados.Clases.Modulosdaoo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoempleados.AgregarFaltas;
import proyectoempleados.Justificaciones;
import proyectoempleados.Menu;

/**
 *
 * @author wendy_6rrub
 */
public class RegistroIncidencias extends javax.swing.JFrame {

    private Map<String, List<String>> horasPorMes = new HashMap<>();
    DefaultTableModel modelo; //crea el modelo que se utilizará
    List<String> dates; // lista para almacenar las fechas del archivo

    public RegistroIncidencias() {
        initComponents();
        this.setLocationRelativeTo(null); //inicia en el centro de la pantalla
        comboMonth.setModel(new DefaultComboBoxModel<>(Modulosdaoo.obtenerMes().toArray(new String[0])));
        modelo = new DefaultTableModel(){ //inicia el modelo de la tabla
        @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Todas las celdas no son editables
            }
        };
    
        modelo.addColumn("Fecha");  

            tblAusen.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
        tblAusen.setModel(modelo);
        
        String month = (String) comboMonth.getSelectedItem();
        llenarDatosSegunMes(month);
        
        dates = obtenerFechasMes(TextBuscar.getText(), month);
            
        comboMonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMonthItemStateChanged(evt);
            }
        });
        
        comboMonth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el mes seleccionado en el combo box
                String mesSeleccionado = (String) comboMonth.getSelectedItem();

                // Llamar al método que actualiza la tabla
                llenarCamposPersonales(TextBuscar.getText());
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BottAgregar = new javax.swing.JButton();
        BottJustificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        belNombre = new javax.swing.JLabel();
        belTelefono = new javax.swing.JLabel();
        belingreso = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        belinjusti = new javax.swing.JLabel();
        belJusti = new javax.swing.JLabel();
        belTardia = new javax.swing.JLabel();
        belTotal = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAusen = new javax.swing.JTable();
        belDepartamento = new javax.swing.JLabel();
        belPuesto = new javax.swing.JLabel();
        belEmail = new javax.swing.JLabel();
        belHoras = new javax.swing.JLabel();
        TextBuscar = new javax.swing.JTextField();
        BottBuscar = new javax.swing.JButton();
        comboMonth = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BottAgregar.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        BottAgregar.setForeground(new java.awt.Color(102, 102, 102));
        BottAgregar.setText("Agregar Falta");
        BottAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottAgregarActionPerformed(evt);
            }
        });

        BottJustificar.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        BottJustificar.setForeground(new java.awt.Color(102, 102, 102));
        BottJustificar.setText("Justificar Ausencia");
        BottJustificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottJustificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Nombre Completo:");

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Teléfono:");

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Fecha de ingreso:");

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Departamento:");

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Puesto:");

        jLabel13.setFont(new java.awt.Font("Leelawadee UI", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("RESUMEN");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel14.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Ausencias injustificadas");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel15.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Ausencias justificadas");
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel16.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Llegadas tardías");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        belinjusti.setText("cantidad");

        belJusti.setText("cantidad");

        belTardia.setText("cantidad");

        belTotal.setText("total");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(belJusti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(belTardia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(belTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(belinjusti, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(belinjusti)
                .addGap(18, 18, 18)
                .addComponent(belJusti)
                .addGap(18, 18, 18)
                .addComponent(belTardia)
                .addGap(18, 18, 18)
                .addComponent(belTotal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("FALTAS TOTALES DEL MES");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Horas descontadas:");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        tblAusen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAusen);

        belHoras.setForeground(new java.awt.Color(102, 102, 102));
        belHoras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(belNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(belTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(belingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(belDepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(belPuesto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(belEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addGap(47, 47, 47))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(belHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BottAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BottJustificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(belDepartamento))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(belPuesto))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(belEmail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(belNombre))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(belTelefono))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(belingreso))
                                .addGap(58, 58, 58)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 35, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(belHoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BottAgregar)
                    .addComponent(BottJustificar))
                .addGap(38, 38, 38))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {belDepartamento, belEmail, belPuesto});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {belHoras, jLabel7});

        TextBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextBuscarFocusLost(evt);
            }
        });
        TextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextBuscarActionPerformed(evt);
            }
        });

        BottBuscar.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        BottBuscar.setForeground(new java.awt.Color(102, 102, 102));
        BottBuscar.setText("Buscar");
        BottBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BottBuscarActionPerformed(evt);
            }
        });

        comboMonth.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        comboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Octubre", "Noviembre" }));

        jLabel22.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("REGISTRO DE FALTAS");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(352, 352, 352)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BottBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel22)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottBuscar)
                    .addComponent(comboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BottAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottAgregarActionPerformed
        AgregarFaltas falt = new AgregarFaltas();
        falt.setVisible(true);
        falt.setLocationRelativeTo(null); //posiciona la ventana en el centro
        dispose();
    }//GEN-LAST:event_BottAgregarActionPerformed

    private void BottJustificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottJustificarActionPerformed
        Justificaciones justif = new Justificaciones();
        justif.setVisible(true);
        dispose();
    }//GEN-LAST:event_BottJustificarActionPerformed

    private void TextBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextBuscarFocusGained
        if (TextBuscar.getText().equals("Búsqueda por cédula")){
            TextBuscar.setText("");
            TextBuscar.setForeground(new Color(102,102,102)); //cuando gana el focus, se vacía, y viceversa
        }
    }//GEN-LAST:event_TextBuscarFocusGained

    private void TextBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextBuscarFocusLost
        if (TextBuscar.getText().equals("")){
            TextBuscar.setText("Búsqueda por cédula");
            TextBuscar.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_TextBuscarFocusLost

    private void TextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBuscarActionPerformed

    private void BottBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BottBuscarActionPerformed
        llenarCamposPersonales(BottBuscar.getText()); //llama al método que llena los espacios en función de la cédula
    }//GEN-LAST:event_BottBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu meee= new Menu();
        meee.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private String obtenerDetallesFalta(String cedula, String fechaSeleccionada) {
        String detalles = " ";

        try (BufferedReader br = new BufferedReader(new FileReader("Faltas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] elementos = linea.split(",");
                if (elementos.length == 5 && elementos[0].equals(cedula) && elementos[1].equals(fechaSeleccionada)) {
                    // Verificar si el campo de detalles no está vacío antes de asignarlo
                    if (elementos[4].equals(".")) {
                        detalles = "Nada que mostrar";

                    }else{
                        detalles=elementos[4];
                    }
                    break; // Salir del bucle una vez que se haya encontrado la fecha
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return detalles;
    }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        String ced = TextBuscar.getText();
        int filaSeleccionada = tblAusen.getSelectedRow();
    if (filaSeleccionada != -1) {
        String fechaSeleccionada = tblAusen.getValueAt(filaSeleccionada, 0).toString();
        String detalles = obtenerDetallesFalta(ced,fechaSeleccionada);
        JOptionPane.showMessageDialog(this, detalles, "Detalles de la falta", JOptionPane.INFORMATION_MESSAGE);
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
    
private void llenarTablaFechas(List<String> fechas, String mesSeleccionado) {
    // Limpiar la tabla antes de agregar nuevas fechas
    modelo.setRowCount(0);

    // Filtrar las fechas según el mes seleccionado
    List<String> fechasFiltradas = new ArrayList<>();
    for (int i = 0; i < fechas.size(); i++) {
        LocalDate fecha = LocalDate.parse(fechas.get(i));
        String nombreMes = obtenerNombreMes(fecha.getMonthValue());
        if (nombreMes.equalsIgnoreCase(mesSeleccionado)) {
            fechasFiltradas.add(fechas.get(i));
        }
    }

    // Agregar las fechas filtradas a la tabla
    for (int i = 0; i < fechasFiltradas.size(); i++) {
        modelo.addRow(new Object[]{fechasFiltradas.get(i)});
    }
    
    tblAusen.repaint();
}


    
       private void llenarCamposPersonales(String identificationNumber) { //llena los espacios personales según la cédula
        identificationNumber = TextBuscar.getText();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("Empleados.txt"));
            String linea;
            boolean encontrado = false; // variable para indicar que se encontro una coincidencia en las cedulas 
            
            while ((linea = br.readLine()) != null) { // Iterar sobre cada línea del archivo.
                String[] elementos = linea.split(","); 
                // Verificar si hay al menos 12 elementos y, si el segundo elemento coincide con la cedula, se llenan los espacios personales
                if (elementos.length >= 12 && elementos[2].equals(identificationNumber)) {  
                    // para que se muestren los datos del empleado
                    belNombre.setText(elementos[0] + " " + elementos[1]);
                    belTelefono.setText(elementos[5]);
                    belEmail.setText(elementos[6]);
                    belingreso.setText(elementos[7]);
                    belPuesto.setText(elementos[8]);
                    belDepartamento.setText(elementos[9]);
            

            br.close();// Cerrar el lector de empleados
            
            llenarFaltasSegunMes(identificationNumber, (String)comboMonth.getSelectedItem()); //aprovecha para llenar los espacios relacionados a las faltas, dependiendo del mes
            
                    List<String> fechas = obtenerFechas(identificationNumber); //si la cedula se encuentra, llenar la tabla con las fechas de sus faltas que están en esta lista
                    llenarTablaFechas(fechas, (String)comboMonth.getSelectedItem()); //estos argumentos en forma de lista, llenan la primera y segunda columna respectivamente
                    
                    //indicar que se encontró el empleado
                    encontrado = true;
                    break; // salir del bucle
                }
            }
             
            //si no se encontro la cedula, entonces limpia los espacios
            if (!encontrado) {
                    belNombre.setText("");
                    belTelefono.setText("");
                    belEmail.setText("");
                    belingreso.setText("");
                    belPuesto.setText("");
                    belDepartamento.setText("");
                    belTardia.setText("");
                    belinjusti.setText("");
                    belJusti.setText("");
                    belTotal.setText("");
                    belHoras.setText("");
                    modelo.setRowCount(0);

                JOptionPane.showMessageDialog(this, "Identificación no encontrada. \nDebe llenar el espacio con su identificacion y estar registrado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void llenarFaltas(String identificationNumber) {
    identificationNumber = TextBuscar.getText();
    int totalInjustificadas = 0;
    int totalJustificadas = 0;
    int totalTardias = 0;
    int totalHorasDescontadas = 0;

    Map<String, List<String>> faltasPorCedula = new HashMap<>();

    try (BufferedReader br = new BufferedReader(new FileReader("Faltas.txt"))) {
        String linea;
        while ((linea = br.readLine()) != null ) {
            String[] elementos = linea.split(",");
            if (elementos.length == 5 && elementos[0].equals(identificationNumber)) {
                String cedula = elementos[0];
                String tipoFalta = elementos[2];
                int horas = Integer.parseInt(elementos[3]);

                // Almacenar la falta en la estructura de datos
                faltasPorCedula.computeIfAbsent(cedula, k -> new ArrayList<>()).add(tipoFalta);

                // Contar las faltas y sumar las horas descontadas
                if ("Justificada".equals(tipoFalta)) {
                    totalJustificadas++;
                } else if ("Injustificada".equals(tipoFalta)) {
                    totalInjustificadas++;
                } else if ("Tardia".equals(tipoFalta)) {
                    totalTardias++;
                }

                totalHorasDescontadas += horas;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    int total = totalInjustificadas + totalJustificadas + totalTardias;

    belinjusti.setText(String.valueOf(totalInjustificadas));
    belJusti.setText(String.valueOf(totalJustificadas));
    belTardia.setText(String.valueOf(totalTardias));
    belTotal.setText(String.valueOf(total));
    belHoras.setText(String.valueOf(totalHorasDescontadas));
}

      
    private int obtenerHorasDescontadas(String cedula) {
    int totalHoras = 0;

    try (BufferedReader br = new BufferedReader(new FileReader("Faltas.txt"))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] elementos = linea.split(",");
            if (elementos.length == 5 && elementos[0].equals(cedula)) {
                totalHoras += Integer.parseInt(elementos[3]); 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return totalHoras;
    }
    
    private void llenarDatosSegunMes(String mesSeleccionado) {
        // Obtener las fechas según el mes seleccionado
        List<String> fechas = obtenerFechas(mesSeleccionado);

        // Llenar la tabla con las fechas y horas
        llenarTablaFechas(fechas, (String)comboMonth.getSelectedItem());

        // Actualizar los JLabel con la información de faltas
        llenarFaltasSegunMes(TextBuscar.getText(), mesSeleccionado); 
    }
    
    private void comboMonthItemStateChanged(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String mesSeleccionado = (String) comboMonth.getSelectedItem();
            llenarDatosSegunMes(mesSeleccionado);
        }
    }

private List<String> obtenerFechasMes(String identificationNumber, String mesSeleccionado) {
    identificationNumber = TextBuscar.getText();
    List<String> fechas = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader("Faltas.txt"))) {
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] elementos = linea.split(",");
            if (elementos.length == 5 && elementos[0].equals(identificationNumber)) {
                // Obtener las fechas y convertirlas a LocalDate
                String fechaString = elementos[1]; 
                LocalDate fecha = LocalDate.parse(fechaString);

                // Obtener el nombre del mes
                String nombreMes = obtenerNombreMes(fecha.getMonthValue());

                // Verificar si el mes de la fecha coincide con el mes seleccionado en el combo box
                if (nombreMes.equalsIgnoreCase(mesSeleccionado)) {
                    fechas.add(fechaString); // Agregar la fecha a la lista
                }
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }

    return fechas;
}
 
    private void llenarFaltasSegunMes(String identificationNumber, String mesSeleccionado) {
        identificationNumber = TextBuscar.getText();
        int totalInjustificadas = 0;
        int totalJustificadas = 0;
        int totalTardias = 0;
        int totalHorasDescontadas = 0;

        Map<String, List<String>> faltasPorCedula = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Faltas.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] elementos = linea.split(",");
                if (elementos.length == 5 && elementos[0].equals(identificationNumber)) {
                    String cedula = elementos[0];
                    String tipoFalta = elementos[2];
                    int horas = Integer.parseInt(elementos[3]);

                    // Obtener el número del mes
                    int numeroMes = Integer.parseInt(elementos[1].split("-")[1]); // Obtenemos el mes de la fecha

                    // Verificar el mes de la falta según el combo box
                    if (mesSeleccionado.equalsIgnoreCase("Octubre") && numeroMes == 10) {
                        // Procesar faltas para octubre
                        // Almacenar la falta en la estructura de datos
                        faltasPorCedula.computeIfAbsent(cedula, k -> new ArrayList<>()).add(tipoFalta);

                        // Contar las faltas y sumar las horas descontadas
                        if ("Justificada".equals(tipoFalta)) {
                            totalJustificadas++;
                        } else if ("Injustificada".equals(tipoFalta)) {
                            totalInjustificadas++;
                        } else if ("Tardia".equals(tipoFalta)) {
                            totalTardias++;
                        }

                        totalHorasDescontadas += horas;

                    } else if (mesSeleccionado.equalsIgnoreCase("Noviembre") && numeroMes == 11) {
                        // Procesar faltas para noviembre
                        // Almacenar la falta en la estructura de datos
                        faltasPorCedula.computeIfAbsent(cedula, k -> new ArrayList<>()).add(tipoFalta);

                        // Contar las faltas y sumar las horas descontadas
                        if ("Justificada".equals(tipoFalta)) {
                            totalJustificadas++;
                        } else if ("Injustificada".equals(tipoFalta)) {
                            totalInjustificadas++;
                        } else if ("Tardia".equals(tipoFalta)) {
                            totalTardias++;
                        }

                        totalHorasDescontadas += horas;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int total = totalInjustificadas + totalJustificadas + totalTardias;

        belinjusti.setText(String.valueOf(totalInjustificadas));
        belJusti.setText(String.valueOf(totalJustificadas));
        belTardia.setText(String.valueOf(totalTardias));
        belTotal.setText(String.valueOf(total));
        belHoras.setText(String.valueOf(totalHorasDescontadas));
    }

    
    private String obtenerNombreMes(int nunMes) {
        switch (nunMes) {
            case 10:
                return "Octubre";
            case 11:
                return "Noviembre";
            default:
                return "Desconocido";
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BottAgregar;
    private javax.swing.JButton BottBuscar;
    private javax.swing.JButton BottJustificar;
    private javax.swing.JTextField TextBuscar;
    private javax.swing.JLabel belDepartamento;
    private javax.swing.JLabel belEmail;
    private javax.swing.JLabel belHoras;
    private javax.swing.JLabel belJusti;
    private javax.swing.JLabel belNombre;
    private javax.swing.JLabel belPuesto;
    private javax.swing.JLabel belTardia;
    private javax.swing.JLabel belTelefono;
    private javax.swing.JLabel belTotal;
    private javax.swing.JLabel belingreso;
    private javax.swing.JLabel belinjusti;
    private javax.swing.JComboBox<String> comboMonth;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblAusen;
    // End of variables declaration//GEN-END:variables
}
