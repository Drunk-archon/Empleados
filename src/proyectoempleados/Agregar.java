
package proyectoempleados;

import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import proyectoempleados.Clases.Empleados;
import proyectoempleados.Clases.EmpleadosDao;

/**
 *
 * @author Jordy vindas
 */
public class Agregar extends javax.swing.JFrame {


   private static final double SALARIO_NO_CALIFICADO = 352464.91;
    private static final double SALARIO_SEMICALIFICADO = 381433.12;
    private static final double SALARIO_CALIFICADO = 396210.87;
    private static final double SALARIO_TECNICO_MEDIO = 415200.76;
    private static final double SALARIO_ESPECIALIZADO = 452407.20;
    private static final double SALARIO_BACHILLER = 626828.55;
    private static final double SALARIO_LICENCIADO = 752220.04;
    
    public Agregar() {
        initComponents();
        llenarComboBox();
        
    }
     
        private double asignarSalarioSegunCategoria(String categoria) {
        // Normaliza la cadena eliminando espacios al principio y al final
        categoria = categoria.trim();

        // Devuelve el salario mínimo según la categoría académica
        switch (categoria) {
            case "Trabajador en ocupacion no calificada":
                return SALARIO_NO_CALIFICADO;
            case "Trabajador en ocupacion semicalificada":
                return SALARIO_SEMICALIFICADO;
            case "Trabajador en ocupacion calificada":
                return SALARIO_CALIFICADO;
            case "Tecnico medio":
                return  SALARIO_TECNICO_MEDIO;
            case "Diplomado en educacion superior":
                return  SALARIO_ESPECIALIZADO;
            case "Bachiller universitario":
                return  SALARIO_BACHILLER;
            case "Licenciado universitario":
                return  SALARIO_LICENCIADO;    
            default:
           
                return 0.0;
        }
    }
    
    
    private void llenarComboBox() {
    // Llena el combo box de puestos
    puesto.setModel(new javax.swing.DefaultComboBoxModel<>(EmpleadosDao.obtenerPuestosDisponibles().toArray(new String[0])));

    // Llena el combo box de departamentos
    Departamento.setModel(new javax.swing.DefaultComboBoxModel<>(EmpleadosDao.obtenerDepartamentosDisponibles().toArray(new String[0])));

    // Llena el combo box de contratos
    contrato.setModel(new javax.swing.DefaultComboBoxModel<>(EmpleadosDao.obtenerContratosDisponibles().toArray(new String[0])));
    
    
     academico.setModel(new javax.swing.DefaultComboBoxModel<>(EmpleadosDao.CargosAcademicos().toArray(new String[0])));
    
}
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        cedula = new javax.swing.JTextField();
        nacimiento = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        tele = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        Ingreso = new javax.swing.JTextField();
        sueldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        puesto = new javax.swing.JComboBox<>();
        Departamento = new javax.swing.JComboBox<>();
        contrato = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        academico = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registrar nuevos empleados");

        jLabel2.setText("INGRESO DE DATOS");

        nombre.setText("Nombre");
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });

        apellidos.setText("Apellidos");
        apellidos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                apellidosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidosFocusLost(evt);
            }
        });

        cedula.setText("Cedula");
        cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cedulaFocusLost(evt);
            }
        });
        cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedulaActionPerformed(evt);
            }
        });

        nacimiento.setText("Fecha de nacimiento");
        nacimiento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nacimientoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nacimientoFocusLost(evt);
            }
        });

        Direccion.setText("Direccion");
        Direccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                DireccionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                DireccionFocusLost(evt);
            }
        });
        Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionActionPerformed(evt);
            }
        });

        tele.setText("Telefono");
        tele.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                teleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                teleFocusLost(evt);
            }
        });
        tele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        email.setText("Email");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });

        Ingreso.setText("Fecha de ingreso");
        Ingreso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IngresoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IngresoFocusLost(evt);
            }
        });

        sueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sueldoActionPerformed(evt);
            }
        });

        jLabel3.setText("FORMATO DE FECHAS: 00/00/0000");

        puesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Departamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartamentoActionPerformed(evt);
            }
        });

        contrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Departamento:");

        jLabel5.setText("Puesto");

        jLabel6.setText("Contrato ");

        jLabel7.setText("Cargo academico");

        academico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        academico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                academicoActionPerformed(evt);
            }
        });

        jLabel8.setText("Salario recomendado");

        jButton3.setText("Generar salario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(162, 162, 162)
                                        .addComponent(Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nacimiento, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cedula, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(apellidos, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nombre))
                                        .addGap(85, 85, 85)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(contrato, javax.swing.GroupLayout.Alignment.TRAILING, 0, 190, Short.MAX_VALUE)
                                            .addComponent(Departamento, javax.swing.GroupLayout.Alignment.TRAILING, 0, 190, Short.MAX_VALUE)
                                            .addComponent(puesto, javax.swing.GroupLayout.Alignment.TRAILING, 0, 190, Short.MAX_VALUE)
                                            .addComponent(academico, javax.swing.GroupLayout.Alignment.TRAILING, 0, 190, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                            .addComponent(sueldo)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(240, 240, 240)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(academico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teleActionPerformed

    private void DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionActionPerformed

    private void sueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sueldoActionPerformed
       
        
       
    }//GEN-LAST:event_sueldoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Modulouno uno = new Modulouno();
        dispose ();
        uno.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
            String nombree = nombre.getText();
            String apellidoos = apellidos.getText();
            String cedulaa = cedula.getText();
            String fechaNacimiento = nacimiento.getText();
            String direccion = Direccion.getText();
            String telefono = tele.getText();
            String emaiil = email.getText();
            String fechaIngreso = Ingreso.getText();
            String puestoo = (String) puesto.getSelectedItem();
            String departamento = (String) Departamento.getSelectedItem();
            String tipoContrato = (String) contrato.getSelectedItem();
             String Cargo = (String)academico.getSelectedItem();
            String salario = sueldo.getText();
            if (!EmpleadosDao.cedulaRegistrada(cedulaa)) {
                   // Verificar que la cédula tenga exactamente 9 dígitos
                   if (cedulaa.matches("\\d{9}")) {
                       // Verificar el formato de la fecha
                       if (formatoFechaValido(fechaNacimiento)) {
                        // Crear un objeto Empleados con los datos
                        Empleados nuevoEmpleado = new Empleados(nombree, apellidoos, cedulaa, fechaNacimiento, direccion,
                                telefono, emaiil, fechaIngreso, puestoo, departamento, tipoContrato, Cargo ,salario);

                        // Mostrar un cuadro de diálogo de confirmación
                        int opcion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de agregar este empleado?", "Confirmar", JOptionPane.YES_NO_OPTION);

                        if (opcion == JOptionPane.YES_OPTION) {
                            // Agregar el nuevo empleado a través de EmpleadosDao
                            EmpleadosDao.agregarNuevoEmpleado(nuevoEmpleado);

                            // Limpiar los campos después de agregar
                            limpiarCampos();
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "El formato de la fecha de nacimiento debe ser 00/00/0000.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La cédula debe contener exactamente 9 dígitos numéricos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La cédula ya está registrada para otro empleado.", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusGained
        if (nombre.getText().equals("Nombre")){
            nombre.setText("");
            nombre.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_nombreFocusGained

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
       if (nombre.getText().equals("")) {
            nombre.setText("Nombre");
            nombre.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_nombreFocusLost

    private void apellidosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidosFocusGained
      if (apellidos.getText().equals("Apellidos")){
        apellidos.setText("");
        apellidos.setForeground(Color.BLACK);
    }
    }//GEN-LAST:event_apellidosFocusGained

    private void apellidosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidosFocusLost
        if (apellidos.getText().equals("")) {
        apellidos.setText("Apellidos");
        apellidos.setForeground(new Color(204, 204, 204));
     }
    }//GEN-LAST:event_apellidosFocusLost

    private void cedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusGained
        if (cedula.getText().equals("Cedula")){
        cedula.setText("");
        cedula.setForeground(Color.BLACK);
     }
    }//GEN-LAST:event_cedulaFocusGained

    private void cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cedulaFocusLost
        if (cedula.getText().equals("")) {
        cedula.setText("Cedula");
        cedula.setForeground(new Color(204, 204, 204));
     }
    }//GEN-LAST:event_cedulaFocusLost

    private void nacimientoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nacimientoFocusGained
           if (nacimiento.getText().equals("Fecha de nacimiento")){
        nacimiento.setText("");
        nacimiento.setForeground(Color.BLACK);
    }

    }//GEN-LAST:event_nacimientoFocusGained

    private void nacimientoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nacimientoFocusLost
      if (nacimiento.getText().equals("")) {
        nacimiento.setText("Fecha de nacimiento");
        nacimiento.setForeground(new Color(204, 204, 204));
     }
    }//GEN-LAST:event_nacimientoFocusLost

    private void DireccionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DireccionFocusGained
       if (Direccion.getText().equals("Direccion")){
        Direccion.setText("");
        Direccion.setForeground(Color.BLACK);
     }
    }//GEN-LAST:event_DireccionFocusGained

    private void DireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DireccionFocusLost
        if (Direccion.getText().equals("")) {
        Direccion.setText("Direccion");
        Direccion.setForeground(new Color(204, 204, 204));
     }
    }//GEN-LAST:event_DireccionFocusLost

    private void teleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teleFocusGained
       if (tele.getText().equals("Telefono")){
        tele.setText("");
        tele.setForeground(Color.BLACK);
    }  // TODO add your handling code here:
    }//GEN-LAST:event_teleFocusGained

    private void teleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_teleFocusLost
       if (tele.getText().equals("")) {
        tele.setText("Telefono");
        tele.setForeground(new Color(204, 204, 204));
    } // TODO add your handling code here:
    }//GEN-LAST:event_teleFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
       if (email.getText().equals("Email")){
        email.setText("");
        email.setForeground(Color.BLACK);
    }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if (email.getText().equals("")) {
        email.setText("Email");
        email.setForeground(new Color(204, 204, 204));
    }
    }//GEN-LAST:event_emailFocusLost

    private void IngresoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IngresoFocusGained
       if (Ingreso.getText().equals("Fecha de ingreso")){
        Ingreso.setText("");
        Ingreso.setForeground(Color.BLACK);
    }

    }//GEN-LAST:event_IngresoFocusGained

    private void IngresoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IngresoFocusLost
      if (Ingreso.getText().equals("")) {
        Ingreso.setText("Fecha de ingreso");
        Ingreso.setForeground(new Color(204, 204, 204));
    }
    }//GEN-LAST:event_IngresoFocusLost

    private void cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedulaActionPerformed

    private void DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartamentoActionPerformed
        String departamentoSeleccionado = (String) Departamento.getSelectedItem();
        List<String> puestos = EmpleadosDao.obtenerPuestosPorDepartamento(departamentoSeleccionado);
        puesto.setModel(new javax.swing.DefaultComboBoxModel<>(puestos.toArray(new String[0])));
    
    }//GEN-LAST:event_DepartamentoActionPerformed

    private void academicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_academicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_academicoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String categoria = (String) academico.getSelectedItem();

        // Asigna el salario según la categoría académica
        double salarioRecomendado = asignarSalarioSegunCategoria(categoria);

        // Muestra el salario recomendado en el campo de texto
        sueldo.setText(String.valueOf(salarioRecomendado));
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    
    private void limpiarCampos() {
    nombre.setText("");
    apellidos.setText("");
    cedula.setText("");
    nacimiento.setText("");
    Direccion.setText("");
    tele.setText("");
    email.setText("");
    Ingreso.setText("");
    sueldo.setText("");
    // También puedes limpiar los JComboBox si es necesario
    // jComboBox1.setSelectedIndex(0);
    // jComboBox2.setSelectedIndex(0);
    // jComboBox3.setSelectedIndex(0);
}
    public static boolean formatoFechaValido(String fecha) {
    return fecha.matches("\\d{2}/\\d{2}/\\d{4}");
    
    
}
    
    
    
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Departamento;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Ingreso;
    private javax.swing.JComboBox<String> academico;
    private javax.swing.JTextField apellidos;
    private javax.swing.JTextField cedula;
    private javax.swing.JComboBox<String> contrato;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JTextField nacimiento;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> puesto;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTextField tele;
    // End of variables declaration//GEN-END:variables
}
