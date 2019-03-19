package model.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.dto.VehiculoDTO;
import utils.JTableUtils;

/**
 * @author javadabadu.com
 *
 *
 * @see https://javadabadu.com/blog
 * @see https://github.com/javadabaduGitHub
 *
 * Listado los atributos de un vehículo (placa, marca y color) en un JTable
 *
 */
public class VehiculoView extends javax.swing.JFrame {

    public VehiculoView() {
        initComponents();
        init(); // !importante¡
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTVehiculo = new javax.swing.JTable();
        jBListar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jTVehiculo);

        jBListar.setText("Listar");
        jBListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jBListar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBListar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBListarActionPerformed
        listar();
    }//GEN-LAST:event_jBListarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBListar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTVehiculo;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel defalultTableModel;
    private Object[] head;
    private Object[] items;

    private void init() {
        setLocationRelativeTo(null);
        setTitle("Java Swing - JTable");
    }

    private void loadTabla() {

        // encabezado tabla
        head = new Object[]{"", "id", "PLACA", "MARCA", "MODELO"};
        items = new Object[head.length];

        // modelo
        defalultTableModel = new DefaultTableModel(null, head);

        // lista de vehículos que contendá la tabla
        List<VehiculoDTO> vehiculos = new ArrayList<>();

        // adicionar vehiculo 1 a la lista
        VehiculoDTO vehiculo1
                = new VehiculoDTO("HFG654", "MAZDA", "ROJO");
        vehiculos.add(vehiculo1);

        // adicionar vehiculo 2 a la lista
        VehiculoDTO vehiculo2
                = new VehiculoDTO("EFG743", "RENAULT", "AZUL");
        vehiculos.add(vehiculo2);

        // adicionar vehiculo 3 a la lista
        VehiculoDTO vehiculo3
                = new VehiculoDTO("VKH525", "AUDI", "NEGRO");
        vehiculos.add(vehiculo3);

        int contador = 0;
        for (VehiculoDTO vehiculo : vehiculos) {
            contador++;

            items[0] = vehiculo;

            items[1] = contador;

            // placa en primera columna
            items[2] = vehiculo.getPlaca();

            // marca en segunda columna
            items[3] = vehiculo.getMarca();

            // color en la tercera columna
            items[4] = vehiculo.getColor();

            // adicionar fila al modelo
            defalultTableModel.addRow(items);
        }

        // adicionar modelo a la tabla
        jTVehiculo.setModel(defalultTableModel);

        // ocultar columna
        JTableUtils.minMaxWidth(jTVehiculo, 0, 30, 400);
    }

    private void listar() {
        loadTabla();
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {// ignored
        }
        VehiculoView vehiculoView = new VehiculoView();
        vehiculoView.setVisible(true);
    }

}
