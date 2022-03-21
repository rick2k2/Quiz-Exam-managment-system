/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ricks
 */

//all important package
import Project.ConnectionProvider;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;
import java.text.*;
import javax.swing.JOptionPane;


public class examprotal extends javax.swing.JFrame {
     /**
     * Creates new form examprotal
     */
    
    public String questionid = "1";
    public String answer;
    public int min = 0;
    public int sec = 0;
    public int marks = 0;
    
          
//    answer check methode
    public void answerCheck()
      {
          String studentanswer ="";
          
//          collect answer from option and store in student answer
          if(op1.isSelected())
          {
              studentanswer = op1.getText();
              
          }
          else if(op2.isSelected())
          {
              studentanswer = op2.getText();
              
          }
          else if(op3.isSelected())
          {
              studentanswer = op3.getText();
              
          }
          else if(op4.isSelected())
          {
              studentanswer = op4.getText();
              
          }
          
//          Checked correct answer and give one mark added on it
          if(studentanswer.equals(answer))
          {
              marks=marks+1;
              String marks1=String.valueOf(marks);
              sm.setText(marks1);
          }
          
          
//          clear radio button
            op1.setSelected(false);
            op2.setSelected(false);
            op3.setSelected(false);
            op4.setSelected(false);
          
//          changed question id
            int questionId1 = Integer.parseInt(questionid);
            questionId1=questionId1+1;
            questionid=String.valueOf(questionId1);
            
//            last question hide next button
           if(questionid.equals("10"))
           {
               next.setVisible(false);
           }
      }
      
//     question methode
      public void question(){
          try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();   
            
//          question from db
            ResultSet rs1 = st.executeQuery("select * from question where id='"+questionid+"'");
            while (rs1.next()) {
                qn.setText(rs1.getString(1));
                ques.setText(rs1.getString(2));
                op1.setText(rs1.getString(3));
                op2.setText(rs1.getString(4));
                op3.setText(rs1.getString(5));
                op4.setText(rs1.getString(6));
                answer = rs1.getString(7);
            }
        } 
          catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
      }
      
//      submit methode
      public void submit(){
          String rollno = rollnos.getText();
          answerCheck();
          try{
              Connection con = ConnectionProvider.getCon();
              Statement st =  con.createStatement();
              st.executeUpdate("update student set marks='"+marks+"' where rollno='"+rollno+"'");
              String marks1=String.valueOf(marks);
//              JOptionPane.showMessageDialog(null,marks1);  
              setVisible(false);
              new successfullysubmited(marks1).setVisible(true);
          }
          catch(Exception e)
          {
             JOptionPane.showMessageDialog(null,e); 
          }
      }
      
   
    public examprotal() {
        initComponents();
    }
      Timer time;
      
    public examprotal(String rollNo, String sname) {
        initComponents();
        
        JOptionPane.showMessageDialog(null, "Name:- " + sname + "\nRoll No:- " + rollNo + "\nYour Exam Start Now!");
        //name
        studentnameshow.setText(sname);
        
        //roll
        rollnos.setText(rollNo);

        //date
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        DateFields.setText(dFormat.format(date));
        
          //first question
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();

        //name form db
            ResultSet rs = st.executeQuery("select * from student where rollno='"+rollNo+"'");

            while (rs.next()) {
                names.setText(rs.getString(2));

            }

//          question from db
            ResultSet rs1 = st.executeQuery("SELECT * FROM question where id='"+questionid+"'");
            while (rs1.next()) {
                qn.setText(rs1.getString(1));
                ques.setText(rs1.getString(2));
                op1.setText(rs1.getString(3));
                op2.setText(rs1.getString(4));
                op3.setText(rs1.getString(5));
                op4.setText(rs1.getString(6));
                answer = rs1.getString(7);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        //time program here
        setLocationRelativeTo(this);
        time = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                second.setText(String.valueOf(sec));
                minute.setText(String.valueOf(min));

                if (sec==60) {
                    sec=0;
                    min++;
                    if (min==10) 
                    {
                        time.stop();
                        answerCheck();
                        submit();
                    }                   
                }
                 sec++;
            }
        });
        time.start();
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
        studentnameshow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DateFields = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        minute = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rollnos = new javax.swing.JLabel();
        names = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        qn = new javax.swing.JLabel();
        sm = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ques = new javax.swing.JLabel();
        op1 = new javax.swing.JRadioButton();
        op2 = new javax.swing.JRadioButton();
        op3 = new javax.swing.JRadioButton();
        op4 = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));

        studentnameshow.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        studentnameshow.setText("DEFAULT NAME");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/index student.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Date:");

        DateFields.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DateFields.setText("DD/MM/YYYY");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel21.setText("Total Time: 10 Min");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel15.setText("Time Taken:");

        second.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        second.setForeground(new java.awt.Color(255, 51, 0));
        second.setText("00");

        minute.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        minute.setForeground(new java.awt.Color(255, 51, 0));
        minute.setText("00");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText(":");

        jLabel11.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel11.setText("WELCOME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 228, Short.MAX_VALUE)
                .addComponent(studentnameshow, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(jLabel13)
                .addGap(10, 10, 10)
                .addComponent(DateFields, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minute)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(second)))
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(105, 105, 105)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1024, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(minute)
                            .addComponent(jLabel8)
                            .addComponent(second)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(DateFields)
                            .addComponent(studentnameshow))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(38, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(11, 11, 11)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, -1));

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Roll Number:");

        rollnos.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        rollnos.setText("10000");

        names.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        names.setText("Default name ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Total Question:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("10");

        qn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        qn.setForeground(new java.awt.Color(255, 51, 51));
        qn.setText("00");

        sm.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        sm.setForeground(new java.awt.Color(51, 51, 255));
        sm.setText("00");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Question Number:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Your Marks:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(129, 129, 129)
                        .addComponent(names, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(67, 67, 67)
                                .addComponent(rollnos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(19, 19, 19)
                                .addComponent(qn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(78, 78, 78)
                                .addComponent(sm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(rollnos))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(names))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(qn))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(sm))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, -1, 680));

        ques.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        ques.setForeground(new java.awt.Color(255, 51, 51));
        ques.setText("Question Demo Here?");
        getContentPane().add(ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 183, 750, -1));

        op1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        op1.setForeground(new java.awt.Color(51, 0, 204));
        op1.setText("jRadioButton1");
        op1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op1ActionPerformed(evt);
            }
        });
        getContentPane().add(op1, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 274, -1, -1));

        op2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        op2.setForeground(new java.awt.Color(51, 0, 204));
        op2.setText("jRadioButton1");
        op2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op2ActionPerformed(evt);
            }
        });
        getContentPane().add(op2, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 342, -1, -1));

        op3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        op3.setForeground(new java.awt.Color(51, 0, 204));
        op3.setText("jRadioButton1");
        op3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op3ActionPerformed(evt);
            }
        });
        getContentPane().add(op3, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 420, -1, -1));

        op4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        op4.setForeground(new java.awt.Color(51, 0, 204));
        op4.setText("jRadioButton1");
        op4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                op4ActionPerformed(evt);
            }
        });
        getContentPane().add(op4, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 507, -1, -1));

        next.setBackground(new java.awt.Color(102, 204, 255));
        next.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Next.png"))); // NOI18N
        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 648, -1, -1));

        submit.setBackground(new java.awt.Color(51, 255, 51));
        submit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 648, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pages background student.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void op1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op1ActionPerformed
        // TODO add your handling code here:
        if(op1.isSelected())
        {
            op2.setSelected(false);
            op3.setSelected(false);
            op4.setSelected(false);
        }
    }//GEN-LAST:event_op1ActionPerformed

    private void op2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op2ActionPerformed
        // TODO add your handling code here:
        if(op2.isSelected())
        {
            op1.setSelected(false);
            op3.setSelected(false);
            op4.setSelected(false);
        }
    }//GEN-LAST:event_op2ActionPerformed

    private void op3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op3ActionPerformed
        // TODO add your handling code here:
        if(op3.isSelected())
        {
            op1.setSelected(false);
            op2.setSelected(false);
            op4.setSelected(false);
        }
    }//GEN-LAST:event_op3ActionPerformed

    private void op4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_op4ActionPerformed
        // TODO add your handling code here:
        if(op4.isSelected())
        {
            op1.setSelected(false);
            op2.setSelected(false);
            op3.setSelected(false);
        }
    }//GEN-LAST:event_op4ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        answerCheck();
        question();

    }//GEN-LAST:event_nextActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to submit","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            answerCheck();
            submit();
        }
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(examprotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(examprotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(examprotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(examprotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new examprotal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DateFields;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minute;
    private javax.swing.JLabel names;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton op1;
    private javax.swing.JRadioButton op2;
    private javax.swing.JRadioButton op3;
    private javax.swing.JRadioButton op4;
    private javax.swing.JLabel qn;
    private javax.swing.JLabel ques;
    private javax.swing.JLabel rollnos;
    private javax.swing.JLabel second;
    private javax.swing.JLabel sm;
    private javax.swing.JLabel studentnameshow;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
