
package View;

/**
 *
 * @author Usuario
 */
public class AdminPanel extends javax.swing.JPanel {

    private MainFrame parentFrame;

    /**
     * Tabla de administración de productos Botones CRUD (Crear, Leer,
     * Actualizar, Eliminar)
     */
    public AdminPanel() {
        initComponents();
    }

    public AdminPanel(MainFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
    }

    public void setAdminParentFrame(MainFrame parentMainFrame) {
        this.parentFrame = parentFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        administradorLabelAdminPanel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTableAdminPanel = new javax.swing.JTable();
        crearProductoButtonAdminPanel = new javax.swing.JButton();
        editarButtonAdminPanel = new javax.swing.JButton();
        eliminarButtonAdminPanel = new javax.swing.JButton();
        volverAlInicioButtonAdminPanel = new javax.swing.JButton();
        editarImagenAdminPanel = new javax.swing.JButton();
        deshacerButtonAdminPanel = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        administradorLabelAdminPanel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        administradorLabelAdminPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        administradorLabelAdminPanel.setText("Administrador");
        administradorLabelAdminPanel.setPreferredSize(new java.awt.Dimension(364, 50));

        tablaTableAdminPanel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tablaTableAdminPanel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripción", "Precio", "Cantidad", "ID"
            }
        ));
        tablaTableAdminPanel.setMinimumSize(new java.awt.Dimension(1208, 435));
        tablaTableAdminPanel.setPreferredSize(new java.awt.Dimension(1366, 768));
        jScrollPane1.setViewportView(tablaTableAdminPanel);
        if (tablaTableAdminPanel.getColumnModel().getColumnCount() > 0) {
            tablaTableAdminPanel.getColumnModel().getColumn(0).setResizable(false);
            tablaTableAdminPanel.getColumnModel().getColumn(1).setResizable(false);
            tablaTableAdminPanel.getColumnModel().getColumn(2).setResizable(false);
            tablaTableAdminPanel.getColumnModel().getColumn(3).setResizable(false);
            tablaTableAdminPanel.getColumnModel().getColumn(4).setResizable(false);
        }

        crearProductoButtonAdminPanel.setText("Crear Producto");
        crearProductoButtonAdminPanel.setPreferredSize(new java.awt.Dimension(142, 77));
        crearProductoButtonAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearProductoButtonAdminPanelActionPerformed(evt);
            }
        });

        editarButtonAdminPanel.setText("Editar");
        editarButtonAdminPanel.setPreferredSize(new java.awt.Dimension(142, 77));
        editarButtonAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonAdminPanelActionPerformed(evt);
            }
        });

        eliminarButtonAdminPanel.setText("Eliminar");
        eliminarButtonAdminPanel.setPreferredSize(new java.awt.Dimension(142, 77));
        eliminarButtonAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonAdminPanelActionPerformed(evt);
            }
        });

        volverAlInicioButtonAdminPanel.setText("Volver al inicio");
        volverAlInicioButtonAdminPanel.setMaximumSize(new java.awt.Dimension(241, 67));
        volverAlInicioButtonAdminPanel.setMinimumSize(new java.awt.Dimension(241, 67));
        volverAlInicioButtonAdminPanel.setPreferredSize(new java.awt.Dimension(142, 77));
        volverAlInicioButtonAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverAlInicioButtonAdminPanelActionPerformed(evt);
            }
        });

        editarImagenAdminPanel.setText("Editar Imagen");
        editarImagenAdminPanel.setPreferredSize(new java.awt.Dimension(142, 77));
        editarImagenAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarImagenAdminPanelActionPerformed(evt);
            }
        });

        deshacerButtonAdminPanel.setText("Deshacer");
        deshacerButtonAdminPanel.setPreferredSize(new java.awt.Dimension(142, 77));
        deshacerButtonAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deshacerButtonAdminPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(crearProductoButtonAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editarButtonAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editarImagenAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarButtonAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deshacerButtonAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volverAlInicioButtonAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(327, 327, 327)
                        .addComponent(administradorLabelAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(503, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(administradorLabelAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volverAlInicioButtonAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearProductoButtonAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarButtonAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarButtonAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarImagenAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deshacerButtonAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        crearProductoButtonAdminPanel.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1342, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarButtonAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonAdminPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarButtonAdminPanelActionPerformed

    private void crearProductoButtonAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearProductoButtonAdminPanelActionPerformed
        parentFrame.showCard(MainFrame.CREAR_PRODUCTO_CARD);
    }//GEN-LAST:event_crearProductoButtonAdminPanelActionPerformed

    private void editarButtonAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonAdminPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarButtonAdminPanelActionPerformed

    private void editarImagenAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarImagenAdminPanelActionPerformed
       parentFrame.showCard(MainFrame.EDITAR_IMAGEN_CARD);
    }//GEN-LAST:event_editarImagenAdminPanelActionPerformed

    private void volverAlInicioButtonAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverAlInicioButtonAdminPanelActionPerformed
        if (parentFrame != null) {
            parentFrame.showCard(MainFrame.LOGIN_CARD);
        } else {
            System.err.println("Error: No se ha establecido referencia al MainFrame");
        }
    }//GEN-LAST:event_volverAlInicioButtonAdminPanelActionPerformed

    private void deshacerButtonAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deshacerButtonAdminPanelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deshacerButtonAdminPanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel administradorLabelAdminPanel;
    private javax.swing.JButton crearProductoButtonAdminPanel;
    private javax.swing.JButton deshacerButtonAdminPanel;
    private javax.swing.JButton editarButtonAdminPanel;
    private javax.swing.JButton editarImagenAdminPanel;
    private javax.swing.JButton eliminarButtonAdminPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaTableAdminPanel;
    private javax.swing.JButton volverAlInicioButtonAdminPanel;
    // End of variables declaration//GEN-END:variables
}
