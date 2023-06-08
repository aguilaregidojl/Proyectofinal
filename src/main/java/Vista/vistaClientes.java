/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ctrlTablaClientes;
import Modelo.clientes;
import Modelo.conexion;
import javax.swing.table.*;

/**
 *
 * @author java
 */
public class vistaClientes extends javax.swing.JFrame {

    DefaultTableModel modelotabla;

    /**
     * Creates new form CRUD
     */
    public vistaClientes() {
        initComponents();
        this.modelotabla = (DefaultTableModel) TablaDatos.getModel();
        //listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        panelActualizar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreActualizar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidoActualizar = new javax.swing.JTextField();
        btnGuardarActualizar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnCancelarActualizar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        intIdActualizar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        intTelefonoActualizar = new javax.swing.JTextField();
        intDniActualizar = new javax.swing.JTextField();
        panelCrear = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreCrear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidoCrear = new javax.swing.JTextField();
        btnGuardarCrear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnCancelarCrear = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        intTelefonoCrear = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        intDniCrear = new javax.swing.JTextField();
        panelBorrar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBorrarBorrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnCancelarBorrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        intIdBorrar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD MySQL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(733, 480));
        setPreferredSize(new java.awt.Dimension(733, 480));
        getContentPane().setLayout(null);

        jLabel1.setText("¿Qué quieres hacer?");
        Menu.add(jLabel1);

        btnCrear.setText("Crear");
        btnCrear.setMaximumSize(new java.awt.Dimension(83, 22));
        btnCrear.setMinimumSize(new java.awt.Dimension(83, 22));
        btnCrear.setPreferredSize(new java.awt.Dimension(83, 22));
        Menu.add(btnCrear);

        btnActualizar.setText("Actualizar");
        btnActualizar.setMaximumSize(new java.awt.Dimension(83, 22));
        btnActualizar.setMinimumSize(new java.awt.Dimension(83, 22));
        btnActualizar.setPreferredSize(new java.awt.Dimension(83, 22));
        Menu.add(btnActualizar);

        btnBorrar.setText("Borrar");
        btnBorrar.setMaximumSize(new java.awt.Dimension(83, 22));
        btnBorrar.setMinimumSize(new java.awt.Dimension(83, 22));
        btnBorrar.setPreferredSize(new java.awt.Dimension(83, 22));
        Menu.add(btnBorrar);

        getContentPane().add(Menu);
        Menu.setBounds(6, 6, 110, 120);

        panelActualizar.setVisible(false);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Apellido:");

        btnGuardarActualizar.setText("Guardar");
        btnGuardarActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Actualizar Cliente");

        btnCancelarActualizar.setText("Cancelar");
        btnCancelarActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("ID:");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Telefono");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("DNI");

        javax.swing.GroupLayout panelActualizarLayout = new javax.swing.GroupLayout(panelActualizar);
        panelActualizar.setLayout(panelActualizarLayout);
        panelActualizarLayout.setHorizontalGroup(
            panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(intIdActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(txtNombreActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnGuardarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnCancelarActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtApellidoActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(intTelefonoActualizar)
                    .addComponent(intDniActualizar)))
        );

        panelActualizarLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel15, jLabel16, jLabel2, jLabel3});

        panelActualizarLayout.setVerticalGroup(
            panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelActualizarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intIdActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(intTelefonoActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelActualizarLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel16))
                    .addGroup(panelActualizarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(intDniActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(panelActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarActualizar)
                    .addComponent(btnCancelarActualizar)))
        );

        jLayeredPane1.add(panelActualizar);
        panelActualizar.setBounds(6, 6, 250, 390);

        panelCrear.setVisible(false);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Apellido:");

        btnGuardarCrear.setText("Guardar");
        btnGuardarCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nuevo Cliente");

        btnCancelarCrear.setText("Cancelar");
        btnCancelarCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Teléfono:");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("DNI:");

        javax.swing.GroupLayout panelCrearLayout = new javax.swing.GroupLayout(panelCrear);
        panelCrear.setLayout(panelCrearLayout);
        panelCrearLayout.setHorizontalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnGuardarCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(btnCancelarCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreCrear)
                            .addComponent(txtApellidoCrear)
                            .addComponent(intTelefonoCrear)
                            .addComponent(intDniCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );

        panelCrearLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel13, jLabel14, jLabel5, jLabel6});

        panelCrearLayout.setVerticalGroup(
            panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel7)
                .addGap(46, 46, 46)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrearLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(txtNombreCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtApellidoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(intTelefonoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(intDniCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(65, 65, 65)
                .addGroup(panelCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardarCrear)
                    .addComponent(btnCancelarCrear)))
        );

        jLayeredPane1.add(panelCrear);
        panelCrear.setBounds(6, 6, 250, 390);

        panelBorrar.setVisible(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnBorrarBorrar.setText("Borrar");
        btnBorrarBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("Borrar Cliente");

        btnCancelarBorrar.setText("Cancelar");
        btnCancelarBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("ID:");

        javax.swing.GroupLayout panelBorrarLayout = new javax.swing.GroupLayout(panelBorrar);
        panelBorrar.setLayout(panelBorrarLayout);
        panelBorrarLayout.setHorizontalGroup(
            panelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorrarLayout.createSequentialGroup()
                .addGroup(panelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorrarLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel11))
                    .addGroup(panelBorrarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(intIdBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorrarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8))
                    .addGroup(panelBorrarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelBorrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBorrarBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelarBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        panelBorrarLayout.setVerticalGroup(
            panelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorrarLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(panelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(intIdBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addComponent(jLabel10)
                .addGap(141, 141, 141)
                .addGroup(panelBorrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarBorrar)
                    .addComponent(btnCancelarBorrar))
                .addContainerGap())
        );

        jLayeredPane1.add(panelBorrar);
        panelBorrar.setBounds(6, 6, 250, 390);

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Telefono", "DNI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDatos.setPreferredSize(new java.awt.Dimension(450, 300));
        jScrollPane1.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setResizable(false);
            TablaDatos.getColumnModel().getColumn(0).setPreferredWidth(50);
            TablaDatos.getColumnModel().getColumn(1).setPreferredWidth(100);
            TablaDatos.getColumnModel().getColumn(2).setPreferredWidth(100);
            TablaDatos.getColumnModel().getColumn(3).setPreferredWidth(100);
            TablaDatos.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(260, 0, 320, 400);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(124, 6, 600, 410);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(vistaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaClientes().setVisible(true);
            }

        });*/
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    public javax.swing.JTable TablaDatos;
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnBorrar;
    public javax.swing.JButton btnBorrarBorrar;
    public javax.swing.JButton btnCancelarActualizar;
    public javax.swing.JButton btnCancelarBorrar;
    public javax.swing.JButton btnCancelarCrear;
    public javax.swing.JButton btnCrear;
    public javax.swing.JButton btnGuardarActualizar;
    public javax.swing.JButton btnGuardarCrear;
    public javax.swing.JTextField intDniActualizar;
    public javax.swing.JTextField intDniCrear;
    public javax.swing.JTextField intIdActualizar;
    public javax.swing.JTextField intIdBorrar;
    public javax.swing.JTextField intTelefonoActualizar;
    public javax.swing.JTextField intTelefonoCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel panelActualizar;
    public javax.swing.JPanel panelBorrar;
    public javax.swing.JPanel panelCrear;
    public javax.swing.JTextField txtApellidoActualizar;
    public javax.swing.JTextField txtApellidoCrear;
    public javax.swing.JTextField txtNombreActualizar;
    public javax.swing.JTextField txtNombreCrear;
    // End of variables declaration//GEN-END:variables
}
