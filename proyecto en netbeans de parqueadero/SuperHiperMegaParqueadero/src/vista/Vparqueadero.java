/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import controlador.Lista;
import controlador.Nodo;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import util.Util;

/**
 *
 * @author ANDRES ROMERO
 */
public class Vparqueadero extends javax.swing.JFrame {

    Lista listasencilla = new Lista();
    Nodo nodo1 = null;

    final String NOM_ARCHIVO_Lista = "lista.dat";
    util.Util util = new Util();
    ArrayList<Object> objetosLista = new ArrayList<>();

    public Vparqueadero() {
        initComponents();
        fondo();
        getObjetos();
        vehiculosEstacionados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCerrar = new javax.swing.JButton();
        btnRetirarVehiculo = new javax.swing.JButton();
        btnIngresarVehiculo = new javax.swing.JButton();
        panelBotones = new javax.swing.JPanel();
        btnPlanilla = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnRetirarVehiculo.setText("Retirar vehiculo");
        btnRetirarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarVehiculoActionPerformed(evt);
            }
        });

        btnIngresarVehiculo.setText("IngresarVehiculo");
        btnIngresarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarVehiculoActionPerformed(evt);
            }
        });

        panelBotones.setOpaque(false);

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        btnPlanilla.setText("Planilla");
        btnPlanilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanillaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPlanilla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresarVehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRetirarVehiculo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(btnRetirarVehiculo)
                    .addComponent(btnIngresarVehiculo)
                    .addComponent(btnPlanilla))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(-1);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnIngresarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarVehiculoActionPerformed
        Controlador controlador = new Controlador();
        if (controlador.horarioFueraDeServicio()) {
            VIngreso ingreso = new VIngreso();
            ingreso.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "El parqueadero esta cerrado");
        }
    }//GEN-LAST:event_btnIngresarVehiculoActionPerformed

    private void btnRetirarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarVehiculoActionPerformed
        Controlador controlador = new Controlador();
        if (controlador.horarioFueraDeServicio()) {
            VSalida salida = new VSalida();
            salida.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "El parqueadero esta cerrado");
        }

    }//GEN-LAST:event_btnRetirarVehiculoActionPerformed

    private void btnPlanillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanillaActionPerformed
        parqueadosHoy planilla = new parqueadosHoy();
        planilla.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPlanillaActionPerformed

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
            java.util.logging.Logger.getLogger(Vparqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vparqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vparqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vparqueadero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vparqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIngresarVehiculo;
    private javax.swing.JButton btnPlanilla;
    private javax.swing.JButton btnRetirarVehiculo;
    private javax.swing.JPanel panelBotones;
    // End of variables declaration//GEN-END:variables
    private void fondo() {
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/carro.jpg")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/Fondo.png"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }

    public void getObjetos() {
        if (util.desSerializar(NOM_ARCHIVO_Lista) != null) {
            objetosLista = (ArrayList<Object>) util.desSerializar(NOM_ARCHIVO_Lista);
            listasencilla = (Lista) objetosLista.get(0);
            objetosLista.clear();

        }

    }

    public void vehiculosEstacionados() {
        int[] b = listasencilla.vehiculosParqueados(nodo1);
        for (int i = 0; i < b.length; i++) {
            int a = b[i];
            JButton boton = new JButton();
            if (a <= 10) {
                boton.setBounds((a - 1) * 45 + 10, 0, 30, 70);
                boton.setVisible(true);
                this.panelBotones.add(boton);
            }
            if (a > 10 && a <= 20) {
                boton.setBounds(((a - 10) - 1) * 45 + 10, 141, 30, 70);
                boton.setVisible(true);
                this.panelBotones.add(boton);
            }
        }
    }

}
