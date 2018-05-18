
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yogesh
 */
public class DecryptFrame extends javax.swing.JFrame {
private JFileChooser fileChooser = new JFileChooser();
	private BufferedImage imgOverlay = null;
	private BufferedImage imgClean = null;
	File fKeyFile = null;
	File fEncrFile = null;
   
    /**
     * Creates new form DecryptFrame
     */
    public DecryptFrame() {
        initComponents();
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
        tfKey = new javax.swing.JTextField();
        tfEncr = new javax.swing.JTextField();
        btnDecrypt = new javax.swing.JButton();
        btnSelectKey = new javax.swing.JButton();
        btnEncry = new javax.swing.JButton();
        lblOverlay = new javax.swing.JLabel();
        btnSaveClean = new javax.swing.JButton();
        lblClean = new javax.swing.JLabel();
        btnSaveOverlay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Decryption ");
        setMaximumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(836, 838));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 800));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnDecrypt.setBackground(new java.awt.Color(198, 40, 40));
        btnDecrypt.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDecrypt.setForeground(new java.awt.Color(255, 255, 255));
        btnDecrypt.setText("Decrypt");
        btnDecrypt.setBorder(null);
        btnDecrypt.setEnabled(false);
        btnDecrypt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDecryptMouseClicked(evt);
            }
        });

        btnSelectKey.setBackground(new java.awt.Color(198, 40, 40));
        btnSelectKey.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSelectKey.setForeground(new java.awt.Color(255, 255, 255));
        btnSelectKey.setText("Select Key File");
        btnSelectKey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectKeyMouseClicked(evt);
            }
        });

        btnEncry.setBackground(new java.awt.Color(198, 40, 40));
        btnEncry.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEncry.setForeground(new java.awt.Color(255, 255, 255));
        btnEncry.setText("Select Encrypted Image");
        btnEncry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEncryMouseClicked(evt);
            }
        });

        lblOverlay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnSaveClean.setBackground(new java.awt.Color(198, 40, 40));
        btnSaveClean.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSaveClean.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveClean.setText("Save Decrypted Image");
        btnSaveClean.setEnabled(false);
        btnSaveClean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveCleanMouseClicked(evt);
            }
        });

        lblClean.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnSaveOverlay.setBackground(new java.awt.Color(198, 40, 40));
        btnSaveOverlay.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSaveOverlay.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveOverlay.setText("Save Overlayed Image");
        btnSaveOverlay.setBorder(null);
        btnSaveOverlay.setEnabled(false);
        btnSaveOverlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveOverlayMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encryption.png"))); // NOI18N
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOverlay, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnSaveOverlay, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(183, 183, 183)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblClean, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSaveClean, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tfKey, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSelectKey, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tfEncr, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEncry, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSelectKey, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEncry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEncr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblOverlay, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnDecrypt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClean, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaveClean, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveOverlay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveOverlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveOverlayMouseClicked
        // TODO add your handling code here:
        if (imgOverlay == null) return;
        fileChooser.setSelectedFile(new File(""));
        fileChooser.setDialogTitle("Save overlay as..");
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = fileChooser.getSelectedFile();
            if (!f.toString().endsWith(".png")) {
                f = new File(f.toString() + ".png");
            }
            try {
                ImageIO.write(imgOverlay, "png", f);
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(this, "Could not Save file because: " + e1.getLocalizedMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnSaveOverlayMouseClicked
    }
    private void btnSaveCleanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveCleanMouseClicked
        // TODO add your handling code here:
        if (imgClean == null) return;
        fileChooser.setSelectedFile(new File(""));
        fileChooser.setDialogTitle("Save decrypted image as..");
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File f = fileChooser.getSelectedFile();
            if (!f.toString().endsWith(".png")) {
                f = new File(f.toString() + ".png");
            }
            try {
                ImageIO.write(imgClean, "png", f);
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(this, "Could not Save file because: " + e1.getLocalizedMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_btnSaveCleanMouseClicked
    }
    private void btnEncryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncryMouseClicked
        // TODO add your handling code here:
        fileChooser.setDialogTitle("Open source image..");
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            if (!fileChooser.getSelectedFile().exists()) return;
            if (!fileChooser.getSelectedFile().getName().endsWith(".png")) return;
            fEncrFile = fileChooser.getSelectedFile();
            tfEncr.setText(fEncrFile.toString());
            btnDecrypt.setEnabled(true);
        }
    }//GEN-LAST:event_btnEncryMouseClicked

    private void btnSelectKeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectKeyMouseClicked
        // TODO add your handling code here:
        fileChooser.setDialogTitle("Open keyfile..");
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            if (!fileChooser.getSelectedFile().exists()) return;
            if (!fileChooser.getSelectedFile().getName().endsWith(".png")) return;
            fKeyFile = fileChooser.getSelectedFile();
            tfKey.setText(fKeyFile.toString());
    }//GEN-LAST:event_btnSelectKeyMouseClicked
    }
    private void btnDecryptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecryptMouseClicked
        // TODO add your handling code here:
        if (fKeyFile == null || !fKeyFile.exists() || fEncrFile == null || !fEncrFile.exists()) {
            JOptionPane.showMessageDialog(this, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        BufferedImage imgKey = Crypting.loadAndCheckEncrFile(fKeyFile);
        if (imgKey == null) {
            JOptionPane.showMessageDialog(this, fKeyFile.getName() + " is not a valid key file", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        BufferedImage imgEnc = Crypting.loadAndCheckEncrFile(fEncrFile);
        if (imgEnc == null) {
            JOptionPane.showMessageDialog(this, fEncrFile.getName() + " is not an encrypted image", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        imgOverlay = Crypting.overlayImages(imgKey, imgEnc);
        if (imgOverlay == null) {
            JOptionPane.showMessageDialog(this, "Decryption failed - key and encrypted image not the same size?", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        imgClean = Crypting.decryptImage(imgOverlay);
        if (imgClean == null) {
            JOptionPane.showMessageDialog(this, "Decryption failed - key and encrypted image not the same size?", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        lblOverlay.setIcon(new ImageIcon(imgOverlay));
        lblClean.setIcon(new ImageIcon(imgClean));

        btnSaveOverlay.setEnabled(true);
        btnSaveClean.setEnabled(true);
    }//GEN-LAST:event_btnDecryptMouseClicked
      

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
            java.util.logging.Logger.getLogger(DecryptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DecryptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DecryptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DecryptFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DecryptFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecrypt;
    private javax.swing.JButton btnEncry;
    private javax.swing.JButton btnSaveClean;
    private javax.swing.JButton btnSaveOverlay;
    private javax.swing.JButton btnSelectKey;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClean;
    private javax.swing.JLabel lblOverlay;
    private javax.swing.JTextField tfEncr;
    private javax.swing.JTextField tfKey;
    // End of variables declaration//GEN-END:variables
}
