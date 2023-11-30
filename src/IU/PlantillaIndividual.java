
package IU;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import proyectoempleados.Clases.Modulosdaoo;

/**
 *
 * @author wendy_6rrub
 */
public class PlantillaIndividual extends javax.swing.JFrame {

    public PlantillaIndividual() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        // Configurar el combo de meses 
        combitoMes.setModel(new DefaultComboBoxModel<>(Modulosdaoo.obtenerMes().toArray(new String[0])));
            String mesInicial = (String) combitoMes.getSelectedItem(); 
            llenarLabelsMes(mesInicial, tfId.getText());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tfId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        combitoMes = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        belDesconta = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        belRebaja = new javax.swing.JLabel();
        belPorHora = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelTotalHorasTrabajadas = new javax.swing.JLabel();
        labelTotalHorasJustificadas = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        reteBanco = new javax.swing.JLabel();
        reteCapi = new javax.swing.JLabel();
        retePen = new javax.swing.JLabel();
        reteIns = new javax.swing.JLabel();
        reteSem = new javax.swing.JLabel();
        reteIvm = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        reteTotal = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        belBruto = new javax.swing.JLabel();
        belTotRetenciones = new javax.swing.JLabel();
        belLiquido = new javax.swing.JLabel();
        belCedu = new javax.swing.JLabel();
        belNom = new javax.swing.JLabel();
        belPues = new javax.swing.JLabel();
        belFech = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Planilla Individual");

        jButton1.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tfId.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(136, 136, 136));

        jLabel2.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Detalles sobre el mes");

        combitoMes.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        combitoMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combitoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combitoMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combitoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combitoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jButton3.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jButton3.setText("Imprimir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Cédula:");

        jLabel4.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Puesto:");

        jLabel6.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fecha de Ingreso:");

        jPanel4.setBackground(new java.awt.Color(151, 150, 150));

        jLabel7.setBackground(new java.awt.Color(27, 28, 28));
        jLabel7.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Horas de Trabajo Mensuales:");

        jLabel8.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("160");

        jLabel9.setBackground(new java.awt.Color(27, 28, 28));
        jLabel9.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Horas descontadas:");

        belDesconta.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        belDesconta.setForeground(new java.awt.Color(0, 0, 0));
        belDesconta.setText("0");

        jLabel11.setBackground(new java.awt.Color(27, 28, 28));
        jLabel11.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Salario por hora:");

        jLabel12.setBackground(new java.awt.Color(27, 28, 28));
        jLabel12.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Rebaja inasistencia:");

        belRebaja.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        belRebaja.setForeground(new java.awt.Color(0, 0, 0));
        belRebaja.setText("0");

        belPorHora.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        belPorHora.setForeground(new java.awt.Color(0, 0, 0));
        belPorHora.setText("0");

        jLabel10.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Horas Trabajadas:");

        jLabel13.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Horas Justificadas:");

        labelTotalHorasTrabajadas.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        labelTotalHorasTrabajadas.setForeground(new java.awt.Color(0, 0, 0));
        labelTotalHorasTrabajadas.setText("0");

        labelTotalHorasJustificadas.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        labelTotalHorasJustificadas.setForeground(new java.awt.Color(0, 0, 0));
        labelTotalHorasJustificadas.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(belPorHora, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelTotalHorasTrabajadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(129, 129, 129)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(belRebaja))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(labelTotalHorasJustificadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(belDesconta))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {belDesconta, belPorHora, belRebaja});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(labelTotalHorasJustificadas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(belPorHora)
                    .addComponent(jLabel9)
                    .addComponent(belDesconta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(belRebaja)
                    .addComponent(jLabel10)
                    .addComponent(labelTotalHorasTrabajadas))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(177, 212, 235));

        jLabel15.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Retenciones de Ley");

        jLabel20.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Aporte Patronal LPT");

        jLabel21.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Aporte Laboral CCSS");

        jLabel22.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("SEM,  9,25 %:");

        jLabel23.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Aporte Banco,  0.25 %:");

        jLabel24.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Capitalizacion Laboral,  3 %:");

        jLabel25.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Pensiones Complementarias, 0.50 %:");

        jLabel26.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("INS,  1 %:");

        jLabel27.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("IVM,  5,08 %:");

        reteBanco.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        reteBanco.setForeground(new java.awt.Color(0, 0, 0));
        reteBanco.setText("banco");

        reteCapi.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        reteCapi.setForeground(new java.awt.Color(0, 0, 0));
        reteCapi.setText("capi");

        retePen.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        retePen.setForeground(new java.awt.Color(0, 0, 0));
        retePen.setText("pen");

        reteIns.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        reteIns.setForeground(new java.awt.Color(0, 0, 0));
        reteIns.setText("ins");

        reteSem.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        reteSem.setForeground(new java.awt.Color(0, 0, 0));
        reteSem.setText("sem");

        reteIvm.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        reteIvm.setForeground(new java.awt.Color(0, 0, 0));
        reteIvm.setText("ivm");

        jLabel42.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(51, 51, 51));
        jLabel42.setText("Total Retenciones:");

        reteTotal.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        reteTotal.setForeground(new java.awt.Color(0, 0, 0));
        reteTotal.setText("total");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reteBanco)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(reteSem)
                                    .addComponent(reteIvm)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reteTotal)))
                        .addGap(174, 174, 174))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reteIns))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reteCapi))
                            .addComponent(jLabel15)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(retePen)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(reteBanco)
                    .addComponent(reteSem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27)
                    .addComponent(reteCapi)
                    .addComponent(reteIvm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(retePen))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(reteIns))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(reteTotal))
                        .addGap(15, 15, 15))))
        );

        jPanel6.setBackground(new java.awt.Color(177, 212, 235));

        jLabel34.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setText("SALARIO BRUTO:");

        jLabel35.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("TOTAL DEDUCCIONES:");

        jLabel36.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(51, 51, 51));
        jLabel36.setText("SALARIO LIQUIDO:");

        belBruto.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        belBruto.setForeground(new java.awt.Color(0, 0, 0));
        belBruto.setText("0");

        belTotRetenciones.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        belTotRetenciones.setForeground(new java.awt.Color(0, 0, 0));
        belTotRetenciones.setText("0");

        belLiquido.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        belLiquido.setForeground(new java.awt.Color(0, 0, 0));
        belLiquido.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(belTotRetenciones)
                    .addComponent(belLiquido)
                    .addComponent(belBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {belBruto, belLiquido, belTotRetenciones});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(belBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(belTotRetenciones, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(belLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        belCedu.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        belCedu.setForeground(new java.awt.Color(0, 0, 0));

        belNom.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        belNom.setForeground(new java.awt.Color(0, 0, 0));

        belPues.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        belPues.setForeground(new java.awt.Color(0, 0, 0));

        belFech.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        belFech.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(belFech))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(belCedu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(belPues)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(belNom, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(406, 406, 406))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {belCedu, belFech, belNom, belPues});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(belCedu))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(belNom))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(belPues))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(belFech))
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(55, 55, 55))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String cedula = belCedu.getText();
    String nombre = belNom.getText();
    String puesto = belPues.getText();
    String fecha = belFech.getText();
    String horasTrabajadas = labelTotalHorasTrabajadas.getText();
    String horasNoTrabajadas = belDesconta.getText();
    String horasJustificadas = labelTotalHorasJustificadas.getText();
    String salarioBruto = belBruto.getText();
    String totalRetenciones = belTotRetenciones.getText();    
    String retenciones = reteTotal.getText();
    String salarioNeto = belLiquido.getText();
    String aporteBancoPopular = reteBanco.getText();
    String aporteFondoCapitalizacion = reteCapi.getText();
    String aporteFondoPensiones = retePen.getText();
    String invalidezVejezMuerte = reteIvm.getText();
    String aporteINS = reteIns.getText();
    String salarioPorHora = belPorHora.getText();
    String seguroEnfermedadMaternidad = reteSem.getText();
    String mesSeleccionado = combitoMes.getSelectedItem().toString();

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("ReporteIndividual.txt"))) {
        writer.write("Mes del reporte: " + mesSeleccionado + " de 2023\n");
        writer.write("Cédula: " + cedula + "\n");
        writer.write("Nombre: " + nombre + "\n");
        writer.write("Puesto: " + puesto + "\n");
        writer.write("Fecha: " + fecha + "\n");
        writer.write("Horas Trabajadas: " + horasTrabajadas + "\n");
        writer.write("Horas No Trabajadas: " + horasNoTrabajadas + "\n");
        writer.write("Horas Justificadas: " + horasJustificadas + "\n");
        writer.write("Retenciones: " + retenciones + "\n");
        writer.write("Aporte Banco Popular: " + aporteBancoPopular + "\n");
        writer.write("Aporte Fondo Capitalización: " + aporteFondoCapitalizacion + "\n");
        writer.write("Aporte Fondo Pensiones: " + aporteFondoPensiones + "\n");
        writer.write("Invalidez Vejez Muerte: " + invalidezVejezMuerte + "\n");
        writer.write("Seguro Enfermedad Maternidad: " + seguroEnfermedadMaternidad + "\n");
        writer.write("Aporte INS: " + aporteINS + "\n");
        writer.write("Salario Por Hora: " + salarioPorHora + "\n");
        writer.write("Salario Bruto: " + salarioBruto + "\n");
        writer.write("Total Deducciones: " + totalRetenciones + "\n");
        writer.write("Salario Neto: " + salarioNeto + "\n");

        

        // Cierra el BufferedWriter para asegurar que los datos se escriban en el archivo
        writer.close();

        JOptionPane.showMessageDialog(this, "Reporte impreso exitosamente en 'ReporteIndividual.txt'", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    } catch (IOException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void combitoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combitoMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combitoMesActionPerformed

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        llenarLabelsMes((String) combitoMes.getSelectedItem(), tfId.getSelectedText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Plantilla platill= new Plantilla();
        platill.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void llenarLabelsMes(String mes, String cedula) {
    cedula = tfId.getText();

    try (BufferedReader br = new BufferedReader(new FileReader("Empleados.txt"))) {
        String linea;
        boolean encontrado = false; // variable para indicar que se encontró una coincidencia en las cedulas

        while ((linea = br.readLine()) != null) {
            String[] elementos = linea.split(",");

            // Verificar si hay al menos 12 elementos y, si el segundo elemento coincide con la cedula, se llenan los espacios personales
            if (elementos.length >= 12 && elementos[2].equals(cedula)) {
                belCedu.setText(elementos[2]);
                belNom.setText(elementos[0] + " " + elementos[1]);
                belPues.setText(elementos[8]);
                belFech.setText(elementos[7]);

                double salario = Double.parseDouble(elementos[12]);

                llenarHoras(cedula, mes, salario);
            }
        }

    } catch (IOException e) {
        e.printStackTrace();
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
    
public void llenarHoras(String cedd, String mese, double salario) {
    List<String> faltas = leerArchivo("Faltas.txt");

    // Suma de horas para las diferentes categorías
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
    String mesNumerico = meses.get(mese.toLowerCase());

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
        if (cedd.equals(cedulaFalta) && mesNumerico.equals(mesFalta)) {
            if (tipoFalta.equals("Justificada")) {
                contadorFaltasJustificadas++;
                if (contadorFaltasJustificadas <= 3) {
                    totalHorasJustificadas += horas;
                }
            } else if (tipoFalta.equals("Injustificada") || tipoFalta.equals("Tardia")) {
                contadorFaltasInjustificadas++;
                totalHorasNoTrabajadas += horas;
            }
        }
    }

    int totalHorasTrabajadas = 160 - totalHorasNoTrabajadas;
    double salarioHora = salario / 160.0;

        // Calcular retenciones
        Map<String, Double> detallesCCSS = calcularAportePatronalCCSS(salario);
        double seguroEnfermedadMaternidad = detallesCCSS.get("seguroEnfermedadMaternidad");
        double invalidezVejezMuerte = detallesCCSS.get("invalidezVejezMuerte");

        Map<String, Double> detallesRetenciones = calcularRetenciones(salario, totalHorasNoTrabajadas);
        double aporteBancoPopular = detallesRetenciones.get("aporteBancoPopular");
        double aporteFondoCapitalizacion = detallesRetenciones.get("aporteFondoCapitalizacion");
        double aporteFondoPensiones = detallesRetenciones.get("aporteFondoPensiones");
        double aporteINS = detallesRetenciones.get("aporteINS");

        double reduccion = totalHorasNoTrabajadas * salarioHora;

        // Calcular salario neto
        double salarioNeto = salario - (aporteBancoPopular + aporteFondoCapitalizacion + aporteFondoPensiones + aporteINS + reduccion +seguroEnfermedadMaternidad + invalidezVejezMuerte);

        // Actualizar las etiquetas con los totales
        labelTotalHorasTrabajadas.setText(Integer.toString(totalHorasTrabajadas));
        belDesconta.setText(Integer.toString(totalHorasNoTrabajadas));
        labelTotalHorasJustificadas.setText(Integer.toString(totalHorasJustificadas));
        belTotRetenciones.setText(String.format("%.2f", aporteBancoPopular + aporteFondoCapitalizacion + aporteFondoPensiones + aporteINS + seguroEnfermedadMaternidad + invalidezVejezMuerte + reduccion));
        belLiquido.setText(String.format("%.2f", salarioNeto));
        belBruto.setText(String.format("%.2f", salario));
        belRebaja.setText(String.format("%.2f", reduccion));
        reteBanco.setText(String.format("%.2f", aporteBancoPopular));
        reteCapi.setText(String.format("%.2f", aporteFondoCapitalizacion));
        retePen.setText(String.format("%.2f", aporteFondoPensiones));
        reteIvm.setText(String.format("%.2f", invalidezVejezMuerte));
        reteIns.setText(String.format("%.2f", aporteINS));
        belPorHora.setText(String.format("%.2f", salarioHora));
        reteSem.setText(String.format("%.2f", seguroEnfermedadMaternidad));
        reteTotal.setText(String.format("%.2f", aporteBancoPopular + aporteFondoCapitalizacion + aporteFondoPensiones + aporteINS + seguroEnfermedadMaternidad + invalidezVejezMuerte));
}
    
    public Map<String, Double> calcularAportePatronalCCSS(double salario) {
    Map<String, Double> detallesCCSS = new HashMap<>();

    double seguroEnfermedadMaternidad = salario * 0.0925;
    double invalidezVejezMuerte = salario * 0.0508;

    detallesCCSS.put("seguroEnfermedadMaternidad", seguroEnfermedadMaternidad);
    detallesCCSS.put("invalidezVejezMuerte", invalidezVejezMuerte);

    return detallesCCSS;
}

public Map<String, Double> calcularRetenciones(double salario, int horasNoTrabajadas) {
    Map<String, Double> detallesRetenciones = new HashMap<>();

    double aporteBancoPopular = salario * 0.0025;
    double aporteFondoCapitalizacion = salario * 0.03;
    double aporteFondoPensiones = salario * 0.005;
    double aporteINS = salario * 0.01 * horasNoTrabajadas;

    detallesRetenciones.put("aporteBancoPopular", aporteBancoPopular);
    detallesRetenciones.put("aporteFondoCapitalizacion", aporteFondoCapitalizacion);
    detallesRetenciones.put("aporteFondoPensiones", aporteFondoPensiones);
    detallesRetenciones.put("aporteINS", aporteINS);

    return detallesRetenciones;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel belBruto;
    private javax.swing.JLabel belCedu;
    private javax.swing.JLabel belDesconta;
    private javax.swing.JLabel belFech;
    private javax.swing.JLabel belLiquido;
    private javax.swing.JLabel belNom;
    private javax.swing.JLabel belPorHora;
    private javax.swing.JLabel belPues;
    private javax.swing.JLabel belRebaja;
    private javax.swing.JLabel belTotRetenciones;
    private javax.swing.JComboBox<String> combitoMes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTotalHorasJustificadas;
    private javax.swing.JLabel labelTotalHorasTrabajadas;
    private javax.swing.JLabel reteBanco;
    private javax.swing.JLabel reteCapi;
    private javax.swing.JLabel reteIns;
    private javax.swing.JLabel reteIvm;
    private javax.swing.JLabel retePen;
    private javax.swing.JLabel reteSem;
    private javax.swing.JLabel reteTotal;
    private javax.swing.JTextField tfId;
    // End of variables declaration//GEN-END:variables
}
