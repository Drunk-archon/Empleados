
package IU;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectoempleados.Clases.Modulosdaoo;
import proyectoempleados.Menu;

/**
 *
 * @author wendy_6rrub
 */
public class Plantilla extends javax.swing.JFrame {

    DefaultTableModel modelito;

    public Plantilla() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        modelito = new DefaultTableModel(){ //inicia el modelo de la tabla
        @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Todas las celdas no son editables
            }
        };
        
        
        modelito.addColumn("Cédula");
        modelito.addColumn("Nombre");
        modelito.addColumn("Apellido");
        modelito.addColumn("Fch. Ingreso");
        modelito.addColumn("Puesto");
        modelito.addColumn("Departamento");
        modelito.addColumn("Crg. Académico");
        modelito.addColumn("Hrs. No Trabajadas");
        modelito.addColumn("Hrs. Justificadas");
        modelito.addColumn("Hrs. Trabajadas");
        modelito.addColumn("CCSS");
        modelito.addColumn("LPT");
        modelito.addColumn("Salario Bruto");
        modelito.addColumn("Rebajo Salarial");
        modelito.addColumn("Salario Neto");
        
        tblPlantilla.setModel(modelito);
    
    // Configurar el modelo de meses 
    combMes.setModel(new DefaultComboBoxModel<>(Modulosdaoo.obtenerMes().toArray(new String[0])));
    // Llenar la tabla con datos del mes actual (o cualquier otro mes inicial)
    String mesInicial = (String) combMes.getSelectedItem(); 
    llenarTablaSegunMes(mesInicial);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPlantilla = new javax.swing.JTable();
        combMes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 8, 62));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Plantilla Registro General");

        jButton2.setText("Registro Individual");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(79, 79, 79)
                .addComponent(jButton2)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27))
        );

        jPanel2.setBackground(new java.awt.Color(169, 204, 213));

        tblPlantilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15"
            }
        ));
        jScrollPane3.setViewportView(tblPlantilla);

        combMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combMesActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Retenciones de Ley");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Consulta por mes");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Información del Trabajador(a)");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Información Tiempo Laboral");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Información Salarial");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jButton3.setText("Imprimir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1507, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(15, 15, 15))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel4, jLabel5, jLabel6});

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combMesActionPerformed
        String mesSeleccionado = combMes.getSelectedItem().toString();
        llenarTablaSegunMes(mesSeleccionado);
    }//GEN-LAST:event_combMesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PlantillaIndividual plan = new PlantillaIndividual();
        plan.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        generarInformeGeneral();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu mu = new Menu();
        mu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void llenarTablaSegunMes(String mesSeleccionado) {
    // Obtener datos personales desde el archivo correspondiente
    List<String> datos = leerArchivo("Empleados.txt");

    // Limpiar la tabla antes de llenarla con nuevos datos
    modelito.setRowCount(0);

    // Iterar sobre los datos y llenar la tabla
    for (String dat : datos) {
        // Dividir las líneas del archivo y agregar una nueva fila a la tabla
        String[] datosArray = dat.split(",");
        if (datosArray.length >= 12) {
            double salario = Double.parseDouble(datosArray[12]); 
            String salal = String.format("%.2f", salario);
            double aporteCCSS = calcularAportePatronalCCSS(salario);
            String ccss = String.format("%.2f", aporteCCSS);
            double aporteLPT = calcularAportePatronalLPT(salario);
            String lpt = String.format("%.2f", aporteLPT);
            
            double salarioHora= salario/160; 
            
            // Calcular horas según la cédula y el mes seleccionado
            String cedula = datosArray[2];
            List<Integer> horas = calcularHoras(cedula, mesSeleccionado);
                double rebajas = aporteCCSS + aporteLPT + (salarioHora * ((horas.size() > 0) ? horas.get(1) : 0));
                String rebajasFormateadas = String.format("%.2f", rebajas);

                double neto= salario-rebajas;
                String netoFormat = String.format("%.2f", neto);
                
            // Calcular horas trabajadas restando las no trabajadas al total
            int horasTrabajadas = 160 - (horas.size() > 0 ? horas.get(1) : 0);


            // Llenar la fila con los datos y las horas calculadas
            modelito.addRow(new Object[]{
                datosArray[2], datosArray[0], datosArray[1], datosArray[7], datosArray[8],
                datosArray[9], datosArray[11], // Datos personales
                (horas.size() > 0) ? horas.get(1) : 0,  // Horas no trabajadas
                (horas.size() > 1) ? horas.get(0) : 0,  // Horas justificadas
                horasTrabajadas, // Horas trabajadas
                ccss, lpt, salal, rebajasFormateadas, netoFormat
            });
        }
    }
}


    private List<String> leerArchivo(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lineas;
    }

private List<Integer> calcularHoras(String cedula, String mesSeleccionado) {
    List<String> faltas = leerArchivo("Faltas.txt");

    // Suma de horas para las diferentes categorías
    int totalHorasTrabajadas = 0;
    int totalHorasNoTrabajadas = 0;
    int totalHorasJustificadas = 0;

    // Contadores de faltas justificadas e injustificadas
    int contadorFaltasJustificadas = 0;
    int contadorFaltasInjustificadas = 0;

    // Mapeo de nombres de mes a números
    Map<String, String> meses = new HashMap<>();
    meses.put("octubre", "10");
    meses.put("noviembre", "11");

    // Convertir el mes seleccionado a su equivalente numérico
    String mesNumerico = meses.get(mesSeleccionado.toLowerCase());

    for (String falta : faltas) {
        String[] faltaArray = falta.split(",");
        String cedulaFalta = faltaArray[0];
        String tipoFalta = faltaArray[2];
        String fechaFalta = faltaArray[1];
        int horas = Integer.parseInt(faltaArray[3]);

        // Obtener el mes de la fecha
        String[] fechaSplit = fechaFalta.split("-");
        String mesFalta = fechaSplit[1];

        // Verificar que la falta sea para la cédula y en el mes correcto
        if (cedula.equals(cedulaFalta) && mesNumerico.equals(mesFalta)) {
            if (tipoFalta.equals("Justificada")) {
                contadorFaltasJustificadas++;
                if (contadorFaltasJustificadas <= 3) {
                    totalHorasJustificadas += horas;
                    totalHorasTrabajadas += horas;
                } else {
                    totalHorasNoTrabajadas += horas;
                }
            } else if (tipoFalta.equals("Injustificada") || tipoFalta.equals("Tardia")) {
                contadorFaltasInjustificadas++;
                totalHorasNoTrabajadas += horas;
            }
        }
    }

    // Crear listas para devolver
    List<Integer> horasTotales = new ArrayList<>();
    horasTotales.add(totalHorasTrabajadas);
    horasTotales.add(totalHorasNoTrabajadas);
    horasTotales.add(totalHorasJustificadas);

    return horasTotales;
}

    public double calcularAportePatronalCCSS(double salario) {

        double seguroEnfermedadMaternidad = salario * 0.0925;
        double invalidezVejezMuerte = salario * 0.0508;
        return seguroEnfermedadMaternidad + invalidezVejezMuerte;
    }

    public double calcularAportePatronalLPT(double salario) {

        double aporteBancoPopular = salario * 0.0025;
        double aporteFondoCapitalizacion = salario * 0.03;
        double aporteFondoPensiones = salario * 0.005;
        double aporteINS = salario * 0.01;
        return aporteBancoPopular + aporteFondoCapitalizacion + aporteFondoPensiones + aporteINS;
    }

   private void generarInformeGeneral() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("InformeGeneral.txt"))) {
            
            // Obtener la fecha del informe (mes y año del ComboBox)
            String fechaInforme = (String) combMes.getSelectedItem() + " de 2023";

            // Escribir la fecha en el archivo
            writer.write("Informe generado en: " + fechaInforme);
            writer.newLine();
            
            // Escribir encabezados en el archivo
            writer.write("Cédula,Nombre,Apellido,Fch. Ingreso,Puesto,Departamento,Crg. Académico,Hrs. No Trabajadas," +
                    "Hrs. Justificadas,Hrs. Trabajadas,CCSS,LPT,Salario Bruto,Rebajo Salarial,Salario Neto");
            writer.newLine();

            // Obtener el número de filas en la tabla
            int rowCount = tblPlantilla.getRowCount();

            // Iterar sobre las filas de la tabla y escribir en el archivo
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < tblPlantilla.getColumnCount(); j++) {
                    writer.write(tblPlantilla.getValueAt(i, j).toString());
                    if (j < tblPlantilla.getColumnCount() - 1) {
                        writer.write(",");
                    }
                }
                writer.newLine();
            }

            // Mostrar mensaje de éxito
            JOptionPane.showMessageDialog(this, "Informe general generado exitosamente en InformeGeneral.txt", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al generar el informe general", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblPlantilla;
    // End of variables declaration//GEN-END:variables
}
