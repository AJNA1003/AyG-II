/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ollamamaven;

/**
 *
 * @author ABRAHAM
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.net.URL;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import org.json.JSONObject;

public class Ollama extends javax.swing.JFrame {

    private JTextField textInputField;
    private JLabel responseLabel;
    int i = 0, j = 0, t = 0, cnt = 0;
    boolean ch = false;

    String[][] text = new String[100][100];
    int[] tcolumn = new int[100];
    String[] chatlist = new String[10];
    int indice;
    String cl;

    public Ollama() {
        super("Ollama");
        //setIconImage(new ImageIcon(getClass().getResource("Unallama.png")).getImage());
        //Ollama frame=new Ollama();
        //frame.setVisible(true);
        initComponents();
        // Agregando un borde compuesto: EmptyBorder + LineBorder
        jList1.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.BLACK, 2), // Borde negro de 2 píxeles
                new EmptyBorder(10, 10, 10, 10) // Espacio de 10 píxeles en todos los lados
        ));
        jList2.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(Color.BLACK, 2), // Borde negro de 2 píxeles
                new EmptyBorder(10, 10, 10, 10) // Espacio de 10 píxeles en todos los lados
        ));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jList1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(jList1);

        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setFont(new java.awt.Font("HP Simplified Light", 3, 24)); // NOI18N
        jLabel1.setText("ARENOSA");

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setFont(new java.awt.Font("HP Simplified Light", 3, 24)); // NOI18N
        jLabel2.setText("Historial");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jButton1.setFont(new java.awt.Font("HP Simplified Light", 0, 12)); // NOI18N
        jButton1.setText("New Chat");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("HP Simplified Light", 1, 12)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Escribe un mensaje a arenosa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(327, 327, 327)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked

        String textomodelo = jTextField1.getText();
        String nombremodelo = "gemma2:2b";

        if (textomodelo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, escribe un mensaje antes de enviar.", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        HttpURLConnection conexion = crearConexion(nombremodelo, textomodelo);
        if (conexion == null) {
            return;
        }

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null, "Respuesta completada", "Respuesta tardía, espere..", JOptionPane.INFORMATION_MESSAGE);
            }
        }, 10000);

        String response = obtenerRespuesta(conexion, timer);
        if (response == null) {
            return;
        }

        procesarRespuesta(response, textomodelo);
    }

    private HttpURLConnection crearConexion(String nombremodelo, String textomodelo) {
        URL url;
        try {
            url = new URL("http://localhost:11434/api/generate");
        } catch (MalformedURLException ex) {
            JOptionPane.showMessageDialog(null, "Error: La URL es inválida.", "Error de URL", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Ollama.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        HttpURLConnection conexion;
        try {
            conexion = (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("POST");
            conexion.setRequestProperty("Content-Type", "application/json; utf-8");
            conexion.setRequestProperty("Accept", "application/json");
            conexion.setDoOutput(true);

            String jsonInputString = String.format(
                    "{\"model\": \"%s\", \"prompt\":\"%s\", \"stream\": false}", nombremodelo, textomodelo
            );

            try (OutputStream os = conexion.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo conectar con la API. Verifique la conexión y que el servidor esté disponible.", "Error de Conexión", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Ollama.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        return conexion;
    }

    private String obtenerRespuesta(HttpURLConnection conexion, Timer timer) {
        int code;
        try {
            code = conexion.getResponseCode();
            timer.cancel();
        } catch (IOException ex) {
            timer.cancel();
            JOptionPane.showMessageDialog(null, "Error: No se pudo obtener respuesta de la API.", "Error de Respuesta", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Ollama.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        if (code != HttpURLConnection.HTTP_OK) {
            JOptionPane.showMessageDialog(null, "Error: Código de respuesta " + code, "Error de Respuesta", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        StringBuilder response = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream(), StandardCharsets.UTF_8))) {
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error: No se pudo leer la respuesta de la API.", "Error de Lectura", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Ollama.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        return response.toString();
    }

    private void procesarRespuesta(String response, String textomodelo) {
        JSONObject jsonResponse = new JSONObject(response);
        String responseText = jsonResponse.getString("response");

        text[i][j] = textomodelo;
        j++;
        text[i][j] = responseText;
        j++;

        jList1.setListData(text[i]);
        //Ollama frame = new Ollama();
        //frame.setVisible(true);


    }//GEN-LAST:event_btnIngresarMouseClicked

    public class CustomListCellRenderer extends DefaultListCellRenderer {

        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

            Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (index % 2 == 0) {

                c.setBackground(Color.LIGHT_GRAY);
            } else {

                c.setBackground(Color.WHITE);
            }

            if (isSelected) {
                c.setBackground(Color.BLUE);
                c.setForeground(Color.WHITE);
            } else {
                c.setForeground(Color.BLACK);
            }

            return c;
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (!ch) {
            chatlist[cnt] = "Chat " + (cnt + 1);
            jList2.setListData(chatlist);
            j = 0;
            cnt = cnt + 1;

            i = cnt;
        } else {
            j = 0;
            i = cnt;
        }

        ch = false;

        jList1.setListData(new String[0]);
        jTextField1.setText("");

    }//GEN-LAST:event_jButton1MouseClicked

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        ch = true;
        indice = jList2.getSelectedIndex();
        i = indice;
        j = tcolumn[indice];
        jList1.setListData(text[indice]);


    }//GEN-LAST:event_jList2MouseClicked
    public static void guardarchat() {

    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
