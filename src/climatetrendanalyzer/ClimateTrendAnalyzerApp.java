package climatetrendanalyzer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author chris
 */
public class ClimateTrendAnalyzerApp extends javax.swing.JFrame {

    /**
     * Creates new form ClimateTrendAnalyzerApp
     */
    public ClimateTrendAnalyzerApp() {
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

        btnTemperatureTrends = new javax.swing.JButton();
        btnStationComparison = new javax.swing.JButton();
        btnTemperatureDeviation = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 400, 300));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTemperatureTrends.setText("Temperature Trends");
        btnTemperatureTrends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemperatureTrendsActionPerformed(evt);
            }
        });
        getContentPane().add(btnTemperatureTrends, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 156, 309, -1));

        btnStationComparison.setText("Station Comparison");
        btnStationComparison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStationComparisonActionPerformed(evt);
            }
        });
        getContentPane().add(btnStationComparison, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 201, 309, -1));

        btnTemperatureDeviation.setText("Temperature Deviation Analysis");
        btnTemperatureDeviation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemperatureDeviationActionPerformed(evt);
            }
        });
        getContentPane().add(btnTemperatureDeviation, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 246, 309, -1));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Climate Trend Analyzer");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 78, -1, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/climatetrendanalyzer/pexels-lukas-kloeppel-2416585.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 520, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTemperatureTrendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemperatureTrendsActionPerformed
        // TODO add your handling code here:
        TemperatureTrendsForm tempTrendsForm = new TemperatureTrendsForm();
        tempTrendsForm.setVisible(true);
        this.dispose(); // To close the main page when opening the new form
    }//GEN-LAST:event_btnTemperatureTrendsActionPerformed

    private void btnStationComparisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStationComparisonActionPerformed
        // TODO add your handling code here:
        StationComparisonForm stationComparisonForm = new StationComparisonForm();
        stationComparisonForm.setVisible(true);
        this.dispose(); // Close the main page,
    }//GEN-LAST:event_btnStationComparisonActionPerformed

    private void btnTemperatureDeviationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemperatureDeviationActionPerformed
        // TODO add your handling code here:
        TemperatureDeviationForm temperatureDeviationForm = new TemperatureDeviationForm();
        temperatureDeviationForm.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_btnTemperatureDeviationActionPerformed

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
            java.util.logging.Logger.getLogger(ClimateTrendAnalyzerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClimateTrendAnalyzerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClimateTrendAnalyzerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClimateTrendAnalyzerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClimateTrendAnalyzerApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStationComparison;
    private javax.swing.JButton btnTemperatureDeviation;
    private javax.swing.JButton btnTemperatureTrends;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
