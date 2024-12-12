/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cl.duoc.matiacornejoc.view;
import cl.duoc.matiacornejoc.model.Alquiler;
import cl.duoc.matiacornejoc.model.AlquilerDAO;
import cl.duoc.matiacornejoc.model.Cliente;
import cl.duoc.matiacornejoc.model.ClienteDAO;
import cl.duoc.matiacornejoc.model.Vehiculo;
import cl.duoc.matiacornejoc.model.VehiculoDAO;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class frmMenu extends javax.swing.JFrame {
    
    public frmMenu() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCliente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanelVehiculo = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Disponible = new javax.swing.JRadioButton();
        jPanelReporte = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jPanelAlquiler = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextFieldFechaAlquiler = new javax.swing.JTextField();
        jTextFieldIDCliente = new javax.swing.JTextField();
        jTextFieldPatenteVehiculo = new javax.swing.JTextField();
        jTextFieldDuracionAlquiler = new javax.swing.JTextField();
        jTextFieldCostoTotal = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Gestion = new javax.swing.JMenu();
        MnuCliente = new javax.swing.JMenuItem();
        MnuVehiculo = new javax.swing.JMenuItem();
        mnuAlquiler = new javax.swing.JMenuItem();
        mnuReporte = new javax.swing.JMenuItem();

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel3.setText("ID:                      ");

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel4.setText("Nombre completo:");

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel5.setText("Télefono:");

        jLabel6.setFont(new java.awt.Font("Dubai", 1, 12)); // NOI18N
        jLabel6.setText("Correo electrónico:");

        jLabel7.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel7.setText("Clientes");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Telefono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton4.setText("Listar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addGroup(jPanelClienteLayout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(19, 19, 19))
        );

        jLabel8.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel8.setText("Vehiculo");

        jLabel9.setText("Patente:");

        jLabel10.setText("Marca:");

        jLabel11.setText("Modelo:");

        jLabel12.setText("Año:");

        jLabel13.setText("Tipo:");

        jLabel14.setText("Estado:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patente", "Marca", "Modelo", "Año", "Tipo", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButton5.setText("Registrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Editar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Listar");

        Disponible.setText("Disponible");

        javax.swing.GroupLayout jPanelVehiculoLayout = new javax.swing.GroupLayout(jPanelVehiculo);
        jPanelVehiculo.setLayout(jPanelVehiculoLayout);
        jPanelVehiculoLayout.setHorizontalGroup(
            jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVehiculoLayout.createSequentialGroup()
                .addGroup(jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelVehiculoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jButton7))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelVehiculoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField6)
                            .addComponent(Disponible)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelVehiculoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVehiculoLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelVehiculoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addGap(22, 22, 22))))
        );
        jPanelVehiculoLayout.setVerticalGroup(
            jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVehiculoLayout.createSequentialGroup()
                .addGroup(jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVehiculoLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelVehiculoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)
                        .addGroup(jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(Disponible))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanelVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addGap(22, 22, 22))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Cliente ", "Correo", "Costo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel21.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel21.setText("Reportes");

        javax.swing.GroupLayout jPanelReporteLayout = new javax.swing.GroupLayout(jPanelReporte);
        jPanelReporte.setLayout(jPanelReporteLayout);
        jPanelReporteLayout.setHorizontalGroup(
            jPanelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReporteLayout.createSequentialGroup()
                .addGroup(jPanelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelReporteLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelReporteLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel21)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanelReporteLayout.setVerticalGroup(
            jPanelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelReporteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel21)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jLabel15.setText("Alquiler");

        jLabel16.setText("Fecha:");

        jLabel17.setText("Cliente ID:");

        jLabel18.setText("Vehiculo Patente:");

        jLabel19.setText("Duracion en dias:");

        jLabel20.setText("Costo total:");

        jButton9.setText("Almacenar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlquilerLayout = new javax.swing.GroupLayout(jPanelAlquiler);
        jPanelAlquiler.setLayout(jPanelAlquilerLayout);
        jPanelAlquilerLayout.setHorizontalGroup(
            jPanelAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlquilerLayout.createSequentialGroup()
                .addGroup(jPanelAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAlquilerLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel15))
                    .addGroup(jPanelAlquilerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldIDCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jTextFieldFechaAlquiler)
                            .addComponent(jTextFieldPatenteVehiculo)
                            .addComponent(jTextFieldDuracionAlquiler)
                            .addComponent(jTextFieldCostoTotal))))
                .addContainerGap(168, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlquilerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(29, 29, 29))
        );
        jPanelAlquilerLayout.setVerticalGroup(
            jPanelAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlquilerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(26, 26, 26)
                .addGroup(jPanelAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldFechaAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldPatenteVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldDuracionAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAlquilerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jTextFieldCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(25, 25, 25))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("¡Bienvenido! ");

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel2.setText("Haga click en gestión para ver sus opciones");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        Gestion.setText("Gestion");

        MnuCliente.setText("Cliente");
        MnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuClienteActionPerformed(evt);
            }
        });
        Gestion.add(MnuCliente);

        MnuVehiculo.setText("Vehículo");
        MnuVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnuVehiculoActionPerformed(evt);
            }
        });
        Gestion.add(MnuVehiculo);

        mnuAlquiler.setText("Alquiler");
        mnuAlquiler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAlquilerActionPerformed(evt);
            }
        });
        Gestion.add(mnuAlquiler);

        mnuReporte.setText("Reporte");
        mnuReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReporteActionPerformed(evt);
            }
        });
        Gestion.add(mnuReporte);

        jMenuBar1.add(Gestion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuClienteActionPerformed
    this.setContentPane(jPanelCliente); 
    this.revalidate();
    this.repaint();
    }//GEN-LAST:event_MnuClienteActionPerformed

    private void MnuVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnuVehiculoActionPerformed
        this.setContentPane(jPanelVehiculo); 
    this.revalidate();
    this.repaint();
    }//GEN-LAST:event_MnuVehiculoActionPerformed

    private void mnuAlquilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAlquilerActionPerformed
    this.setContentPane(jPanelAlquiler); 
    this.revalidate();
    this.repaint();
    }//GEN-LAST:event_mnuAlquilerActionPerformed

    private void mnuReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReporteActionPerformed
    this.setContentPane(jPanelReporte); 
    this.revalidate();
    this.repaint();
    }//GEN-LAST:event_mnuReporteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String id = jTextField1.getText().trim();
    String nombre = jTextField2.getText().trim();
    String telefono = jTextField3.getText().trim();
    String correo = jTextField4.getText().trim();  
    
    Cliente cliente = new Cliente();
    cliente.setID(id);
    cliente.setNombre_completo(nombre);
    cliente.setTelefono(telefono);
    cliente.setCorreo(correo);
    
     ClienteDAO clienteDAO = new ClienteDAO();
    if (clienteDAO.agregarCliente(cliente)) {
        JOptionPane.showMessageDialog(this, "Cliente registrado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al registrar el cliente.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String id = jTextField1.getText().trim();
    String nombre = jTextField2.getText().trim();
    String telefono = jTextField3.getText().trim();
    String correo = jTextField4.getText().trim();  
    
    Cliente cliente = new Cliente();
    cliente.setID(id);
    cliente.setNombre_completo(nombre);
    cliente.setTelefono(telefono);
    cliente.setCorreo(correo);
    
    ClienteDAO clienteDAO = new ClienteDAO();
    if (clienteDAO.editarCliente(cliente)) { 
        JOptionPane.showMessageDialog(this, "Cliente editado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al editar el cliente.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     String ID = jTextField1.getText().trim();
    ClienteDAO clienteDAO = new ClienteDAO();
    if (clienteDAO.eliminarCliente(ID)) {
        JOptionPane.showMessageDialog(this, "Cliente eliminado exitosamente."); 
    } else {
        JOptionPane.showMessageDialog(this, "Error al eliminar el cliente.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   String patente = jTextField5.getText().trim(); 
    String marca = jTextField6.getText().trim(); 
    String modelo = jTextField7.getText().trim(); 
    String tipo = jTextField8.getText().trim(); 
    String año = jTextField9.getText().trim();
    boolean estado;

    estado = Disponible.isSelected();

    Vehiculo vehiculo = new Vehiculo(patente, marca, modelo, año, tipo, estado);

    VehiculoDAO vehiculoDAO = new VehiculoDAO();
    if (vehiculoDAO.editarVehiculo(vehiculo)) {
        JOptionPane.showMessageDialog(this, "Vehículo editado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al editar el vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    String patente = jTextField5.getText().trim();
    String marca = jTextField6.getText().trim();
    String modelo = jTextField7.getText().trim();
    String tipo = jTextField8.getText().trim();
    int año;
    boolean estado;

    try {
        año = Integer.parseInt(jTextField9.getText().trim());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "El año debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    estado = Disponible.isSelected();

    Vehiculo vehiculo = new Vehiculo(patente, marca, modelo, año, tipo, estado);
    VehiculoDAO vehiculoDAO = new VehiculoDAO();
    if (vehiculoDAO.editarVehiculo(vehiculo)) {
        JOptionPane.showMessageDialog(this, "Vehículo editado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al editar el vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       String patente = jTextField5.getText().trim();

    if (patente.isEmpty()) {
        JOptionPane.showMessageDialog(this, "La patente debe ser completada para eliminar el vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    VehiculoDAO vehiculoDAO = new VehiculoDAO();
    if (vehiculoDAO.eliminarVehiculo(patente)) {
        JOptionPane.showMessageDialog(this, "Vehículo eliminado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al eliminar el vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        String fechaAlquiler = jTextFieldFechaAlquiler.getText();
    String idCliente = jTextFieldIDCliente.getText();
    String patenteVehiculo = jTextFieldPatenteVehiculo.getText();
    int duracionAlquiler = Integer.parseInt(jTextFieldDuracionAlquiler.getText()); 
    double costoTotal = Double.parseDouble(jTextFieldCostoTotal.getText()); 

    Alquiler alquiler = new Alquiler();
    alquiler.setFecha(Date.valueOf(fechaAlquiler)); 
    alquiler.setID_cliente(idCliente);
    alquiler.setPatente_vehiculo(patenteVehiculo);
    alquiler.setDuracion_Alquiler(duracionAlquiler);
    alquiler.setCosto_total(costoTotal);

    AlquilerDAO alquilerDAO = new AlquilerDAO();
    boolean exito = alquilerDAO.registrarAlquiler(alquiler);

    if (exito) {
        JOptionPane.showMessageDialog(this, "Alquiler registrado exitosamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al registrar el alquiler. Inténtalo de nuevo.");
    }
    }//GEN-LAST:event_jButton9ActionPerformed
    
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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton Disponible;
    private javax.swing.JMenu Gestion;
    private javax.swing.JMenuItem MnuCliente;
    private javax.swing.JMenuItem MnuVehiculo;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelAlquiler;
    public javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelReporte;
    private javax.swing.JPanel jPanelVehiculo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    public javax.swing.JTextField jTextField4;
    public javax.swing.JTextField jTextField5;
    public javax.swing.JTextField jTextField6;
    public javax.swing.JTextField jTextField7;
    public javax.swing.JTextField jTextField8;
    public javax.swing.JTextField jTextField9;
    public javax.swing.JTextField jTextFieldCostoTotal;
    public javax.swing.JTextField jTextFieldDuracionAlquiler;
    public javax.swing.JTextField jTextFieldFechaAlquiler;
    public javax.swing.JTextField jTextFieldIDCliente;
    public javax.swing.JTextField jTextFieldPatenteVehiculo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuItem mnuAlquiler;
    private javax.swing.JMenuItem mnuReporte;
    // End of variables declaration//GEN-END:variables

 /*public void addActionListenerMenuItemCliente(ActionListener ac) {
        MnuCliente.addActionListener(ac);
    }

    public void addActionListenerMenuItemVehiculo(ActionListener ac) {
        MnuVehiculo.addActionListener(ac);
    }

    public void addActionListenerMenuItemAlquiler(ActionListener ac) {
        mnuAlquiler.addActionListener(ac);
    }

    public void addActionListenerMenuItemReporte(ActionListener ac) {
        mnuReporte.addActionListener(ac);
    }

    public void setVisibleMnuCliente() {
        removeComponentsMainPanel();
        mainPanel.add(jPanelCliente, "CardLayout");
        mainPanel.setVisible(true);
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    public void removeComponentsMainPanel() {
        mainPanel.removeAll();
        mainPanel.revalidate();
        mainPanel.repaint();
    }*/
}

