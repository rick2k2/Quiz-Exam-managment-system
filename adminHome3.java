/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ricks
 */
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class adminHome3 extends javax.swing.JFrame {
//This variable used in next page....
public static int open = 0; //Rick saha says above line
    /**
     * Creates new form adminHome
     */
    public adminHome3() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        AddnewQuestionmenu = new javax.swing.JMenu();
        updatequestionmenu = new javax.swing.JMenu();
        allquestionmenu = new javax.swing.JMenu();
        deletequestionmenu = new javax.swing.JMenu();
        allstudentresultmenu = new javax.swing.JMenu();
        logoutmenu = new javax.swing.JMenu();
        exitmenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/index background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navigation Bar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(255, 0, 0))); // NOI18N

        AddnewQuestionmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add new question.png"))); // NOI18N
        AddnewQuestionmenu.setText("Add New Question");
        AddnewQuestionmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AddnewQuestionmenu.setMargin(new java.awt.Insets(0, 5, 0, 30));
        AddnewQuestionmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddnewQuestionmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(AddnewQuestionmenu);

        updatequestionmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Update Question.png"))); // NOI18N
        updatequestionmenu.setText("Update Question");
        updatequestionmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updatequestionmenu.setMargin(new java.awt.Insets(0, 5, 0, 30));
        updatequestionmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatequestionmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(updatequestionmenu);

        allquestionmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/all questions.png"))); // NOI18N
        allquestionmenu.setText("All Question");
        allquestionmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allquestionmenu.setMargin(new java.awt.Insets(0, 5, 0, 30));
        allquestionmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allquestionmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(allquestionmenu);

        deletequestionmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete Question.png"))); // NOI18N
        deletequestionmenu.setText("Delete Question");
        deletequestionmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletequestionmenu.setMargin(new java.awt.Insets(0, 5, 0, 30));
        deletequestionmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletequestionmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(deletequestionmenu);

        allstudentresultmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/all student result.png"))); // NOI18N
        allstudentresultmenu.setText("All Student Result");
        allstudentresultmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allstudentresultmenu.setMargin(new java.awt.Insets(0, 5, 0, 30));
        allstudentresultmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allstudentresultmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(allstudentresultmenu);

        logoutmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logout.png"))); // NOI18N
        logoutmenu.setText("Logout");
        logoutmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutmenu.setMargin(new java.awt.Insets(0, 5, 0, 30));
        logoutmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(logoutmenu);

        exitmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Close.png"))); // NOI18N
        exitmenu.setText("Exit");
        exitmenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitmenu.setMargin(new java.awt.Insets(0, 5, 0, 5));
        exitmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitmenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(exitmenu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutmenuMouseClicked
        // TODO add your handling code here:
        JFrame jf= new JFrame();
        jf.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(jf, "Do you really want to Logout", "Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new loginAdmin2().setVisible(true);
        }
    }//GEN-LAST:event_logoutmenuMouseClicked

    private void exitmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitmenuMouseClicked
        // TODO add your handling code here:
        JFrame jf = new JFrame();
        jf.setAlwaysOnTop(true);
        int a = JOptionPane.showConfirmDialog(jf,"Do you really want tot Exit Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            System.exit(0);
        }
    }//GEN-LAST:event_exitmenuMouseClicked

    private void AddnewQuestionmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddnewQuestionmenuMouseClicked
        // TODO add your handling code here:
        if(open==0)
        {
            new addNewQuestion4().setVisible(true);
            open=1;
        }
        else{
            JFrame jf= new JFrame();
            jf.setAlwaysOnTop(true);;
            JOptionPane.showMessageDialog(jf,"One Form Already Opned");
        }
    }//GEN-LAST:event_AddnewQuestionmenuMouseClicked

    private void updatequestionmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatequestionmenuMouseClicked
        // TODO add your handling code here:
        if(open==0)
        {
            new updateQuestion5().setVisible(true);
            open=1;
        }
        else{
            JFrame jf= new JFrame();
            jf.setAlwaysOnTop(true);;
            JOptionPane.showMessageDialog(jf,"One Form Already Opned");
        }
    }//GEN-LAST:event_updatequestionmenuMouseClicked

    private void allquestionmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allquestionmenuMouseClicked
        // TODO add your handling code here:
         if(open==0)
        {
            new allQuestion6().setVisible(true);
            open=1;
        }
        else{
            JFrame jf= new JFrame();
            jf.setAlwaysOnTop(true);;
            JOptionPane.showMessageDialog(jf,"One Form Already Opned");
        }
    }//GEN-LAST:event_allquestionmenuMouseClicked

    private void deletequestionmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletequestionmenuMouseClicked
        // TODO add your handling code here:
        if(open==0)
        {
            new deletequestion7().setVisible(true);
            open=1;
        }
        else{
            JFrame jf= new JFrame();
            jf.setAlwaysOnTop(true);;
            JOptionPane.showMessageDialog(jf,"One Form Already Opned");
        }
    }//GEN-LAST:event_deletequestionmenuMouseClicked

    private void allstudentresultmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allstudentresultmenuMouseClicked
        // TODO add your handling code here:
          if(open==0)
        {
            new allstudentResult().setVisible(true);
            open=1;
        }
        else{
            JFrame jf= new JFrame();
            jf.setAlwaysOnTop(true);;
            JOptionPane.showMessageDialog(jf,"One Form Already Opned");
        }
    }//GEN-LAST:event_allstudentresultmenuMouseClicked

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
            java.util.logging.Logger.getLogger(adminHome3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AddnewQuestionmenu;
    private javax.swing.JMenu allquestionmenu;
    private javax.swing.JMenu allstudentresultmenu;
    private javax.swing.JMenu deletequestionmenu;
    private javax.swing.JMenu exitmenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu logoutmenu;
    private javax.swing.JMenu updatequestionmenu;
    // End of variables declaration//GEN-END:variables
}
