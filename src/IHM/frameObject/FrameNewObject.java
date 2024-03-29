/**
 * Frame to create a new object
 */
package IHM.frameObject;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import myObject.*;

/**
 *
 * @author lug13995
 */

public class FrameNewObject extends javax.swing.JFrame {

    MetaModelObject stat = new Segment();    
    
    /**
     * Creates new form FrameNewObject
     */
    public FrameNewObject() {
        initComponents();
        setIcon();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jComboBoxTypeObject = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jComboBoxTypeObject.setModel(new javax.swing.DefaultComboBoxModel(stat.getListOfTypeObject()));
        jComboBoxTypeObject.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxTypeObjectItemStateChanged(evt);
            }
        });
        jComboBoxTypeObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTypeObjectActionPerformed(evt);
            }
        });
        jComboBoxTypeObject.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxTypeObjectPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 107;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 58, 16, 0);
        getContentPane().add(jComboBoxTypeObject, gridBagConstraints);

        jLabel1.setText("Sélectionner le type d'objet que vous voulez créer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 10);
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Launch good frame to create a new object
     * @param evt 
     */
    private void jComboBoxTypeObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTypeObjectActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog (null, "Voulez vous vraiment créer un nouveau objet de type " + jComboBoxTypeObject.getSelectedItem() + " ?");
        if(dialogResult == JOptionPane.YES_OPTION){
            if(jComboBoxTypeObject.getSelectedItem().equals("Zone")){
                FrameSegment win = new FrameSegment();
                win.setVisible(true);
                win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            }
            else if(jComboBoxTypeObject.getSelectedItem().equals("Quartier") ||jComboBoxTypeObject.getSelectedItem().equals("Ilot")){
                FrameProcessOrCpability win = new FrameProcessOrCpability((String)jComboBoxTypeObject.getSelectedItem());
                win.setVisible(true);
                win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            }else if(jComboBoxTypeObject.getSelectedItem().equals("Application")){
                FrameApplication win = new FrameApplication();
                win.setVisible(true);
                win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            }else  if(jComboBoxTypeObject.getSelectedItem().equals("Responsible")){
                FrameResponsible win = new FrameResponsible();
                win.setVisible(true);
                win.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            }
        }
        this.dispose();
    }//GEN-LAST:event_jComboBoxTypeObjectActionPerformed

    private void jComboBoxTypeObjectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxTypeObjectItemStateChanged
        // TODO add your handling code here:
        //A supprmier
        
    }//GEN-LAST:event_jComboBoxTypeObjectItemStateChanged

    private void jComboBoxTypeObjectPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxTypeObjectPropertyChange
        // TODO add your handling code here:
        //A supprmier
    }//GEN-LAST:event_jComboBoxTypeObjectPropertyChange

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
            java.util.logging.Logger.getLogger(FrameNewObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameNewObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameNewObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameNewObject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameNewObject().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBoxTypeObject;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

   private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("usi.png")));
    }
}
