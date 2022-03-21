
import javax.swing.*;
import java.sql.*;
import Project.ConnectionProvider;
import java.awt.Color;
import java.text.*;
import java.util.Date;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ricks
 */
public class studentdetails8 extends javax.swing.JFrame {

    /**
     * Creates new form studentdetails8
     */
    public studentdetails8() {
        initComponents();
        message.setEditable(false);
        SimpleDateFormat dFormat= new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        date1.setText(dFormat.format(date));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        rollno = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        fathername = new javax.swing.JTextField();
        mothername = new javax.swing.JTextField();
        contactnumber = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        university10 = new javax.swing.JTextField();
        university12 = new javax.swing.JTextField();
        universityg = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        perg = new javax.swing.JTextField();
        per12 = new javax.swing.JTextField();
        per10 = new javax.swing.JTextField();
        year10 = new javax.swing.JTextField();
        year12 = new javax.swing.JTextField();
        yearg = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clear.setBackground(new java.awt.Color(255, 51, 51));
        clear.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear.png"))); // NOI18N
        clear.setText("Reset");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 680, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/index student.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel2.setText("FILL UP THE FORM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 16, 355, -1));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Close.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1246, 10, -1, -1));

        back.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back student.png"))); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1077, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Date:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 32, -1, -1));

        date1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        date1.setText("DD/MM/YYYY");
        getContentPane().add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(824, 32, 146, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, 1366, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setText("Roll No");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 128, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 174, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("Father Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 223, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("Mother Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 272, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 324, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("Contact Number");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 376, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel11.setText("Email");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 425, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel12.setText("10th");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 474, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel13.setText("12th");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 523, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setText("Gradution");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 572, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel15.setText("Address");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 621, -1, -1));

        gender.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select one", "Male", "Female", "Other" }));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 324, 300, -1));

        message.setBackground(new java.awt.Color(51, 255, 204));
        message.setColumns(20);
        message.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        message.setRows(5);
        message.setText("Examination Managment System is managing all the \nactivitoes related to examination managment right \nfrom reciept of enrollment forms and Enrollment froms \nthrough the processing of the results and Certificates \nand Grading Reports.");
        jScrollPane1.setViewportView(message);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 223, 779, 192));

        rollno.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 125, 300, -1));

        name.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 174, 300, -1));

        fathername.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(fathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 223, 300, -1));

        mothername.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(mothername, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 272, 300, -1));

        contactnumber.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(contactnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 373, 300, -1));

        email.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 422, 300, -1));

        university10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        university10.setForeground(new java.awt.Color(153, 153, 153));
        university10.setText("Enter University Name");
        university10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                university10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                university10FocusLost(evt);
            }
        });
        getContentPane().add(university10, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 471, 300, -1));

        university12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        university12.setForeground(new java.awt.Color(153, 153, 153));
        university12.setText("Enter University Name");
        university12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                university12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                university12FocusLost(evt);
            }
        });
        getContentPane().add(university12, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 520, 300, -1));

        universityg.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        universityg.setForeground(new java.awt.Color(153, 153, 153));
        universityg.setText("Enter University Name");
        universityg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                universitygFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                universitygFocusLost(evt);
            }
        });
        getContentPane().add(universityg, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 569, 300, -1));

        address.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 618, 1127, -1));

        perg.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        perg.setForeground(new java.awt.Color(153, 153, 153));
        perg.setText("Enter Percentage");
        perg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pergFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pergFocusLost(evt);
            }
        });
        getContentPane().add(perg, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 569, 431, -1));

        per12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        per12.setForeground(new java.awt.Color(153, 153, 153));
        per12.setText("Enter Percentage");
        per12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                per12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                per12FocusLost(evt);
            }
        });
        getContentPane().add(per12, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 520, 431, -1));

        per10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        per10.setForeground(new java.awt.Color(153, 153, 153));
        per10.setText("Enter Percentage");
        per10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                per10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                per10FocusLost(evt);
            }
        });
        getContentPane().add(per10, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 471, 431, -1));

        year10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        year10.setForeground(new java.awt.Color(153, 153, 153));
        year10.setText("Enter Passout Year");
        year10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                year10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                year10FocusLost(evt);
            }
        });
        getContentPane().add(year10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 471, 300, -1));

        year12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        year12.setForeground(new java.awt.Color(153, 153, 153));
        year12.setText("Enter Passout Year");
        year12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                year12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                year12FocusLost(evt);
            }
        });
        getContentPane().add(year12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 520, 300, -1));

        yearg.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        yearg.setForeground(new java.awt.Color(153, 153, 153));
        yearg.setText("Enter Passout Year");
        yearg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yeargFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                yeargFocusLost(evt);
            }
        });
        getContentPane().add(yearg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1024, 569, 300, -1));

        save.setBackground(new java.awt.Color(51, 255, 51));
        save.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/save.png"))); // NOI18N
        save.setText("Save and Next");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(538, 684, 486, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pages background student.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to exit Application","select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new index1().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        rollno.setText("");
        name.setText("");
        fathername.setText("");
        mothername.setText("");
        contactnumber.setText("");
        email.setText("");
        address.setText("");
        
        university10.setText("Enter University Name");
        university10.setForeground(new Color(153,153,153));
        university12.setText("Enter University Name");
        university12.setForeground(new Color(153,153,153));
        universityg.setText("Enter University Name");
        universityg.setForeground(new Color(153,153,153));
        per10.setText("Enter Percentage");
        per10.setForeground(new Color(153,153,153));
        per12.setText("Enter Percentage");
        per12.setForeground(new Color(153,153,153));
        perg.setText("Enter Percentage");
        perg.setForeground(new Color(153,153,153));
        year10.setText("Enter Passout Year");
        year10.setForeground(new Color(153,153,153));
        year12.setText("Enter Passout Year");
        year12.setForeground(new Color(153,153,153));
        yearg.setText("Enter Passout Year");
        yearg.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_clearActionPerformed

    private void university10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_university10FocusGained
        // TODO add your handling code here:
        if(university10.getText().equals("Enter University Name"))
         {
            university10.setText("");
            university10.setForeground(new Color(0,0,0));
         }
    }//GEN-LAST:event_university10FocusGained

    private void university12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_university12FocusGained
        // TODO add your handling code here:
         if(university12.getText().equals("Enter University Name"))
         {
            university12.setText("");
            university12.setForeground(new Color(0,0,0));
         }
    }//GEN-LAST:event_university12FocusGained

    private void universitygFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_universitygFocusGained
        // TODO add your handling code here:
         if(universityg.getText().equals("Enter University Name"))
         {
            universityg.setText("");
            universityg.setForeground(new Color(0,0,0));
         }
    }//GEN-LAST:event_universitygFocusGained

    private void per10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_per10FocusGained
        // TODO add your handling code here:
          if(per10.getText().equals("Enter Percentage"))
         {
            per10.setText("");
            per10.setForeground(new Color(0,0,0));
         }
    }//GEN-LAST:event_per10FocusGained

    private void per12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_per12FocusGained
        // TODO add your handling code here:
          if(per12.getText().equals("Enter Percentage"))
         {
            per12.setText("");
            per12.setForeground(new Color(0,0,0));
         }
    }//GEN-LAST:event_per12FocusGained

    private void pergFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pergFocusGained
        // TODO add your handling code here:
           if(perg.getText().equals("Enter Percentage"))
         {
            perg.setText("");
            perg.setForeground(new Color(0,0,0));
         }
    }//GEN-LAST:event_pergFocusGained

    private void year10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_year10FocusGained
        // TODO add your handling code here:
          if(year10.getText().equals("Enter Passout Year"))
         {
            year10.setText("");
            year10.setForeground(new Color(0,0,0));
         }
    }//GEN-LAST:event_year10FocusGained

    private void year12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_year12FocusGained
        // TODO add your handling code here:
          if(year12.getText().equals("Enter Passout Year"))
         {
            year12.setText("");
            year12.setForeground(new Color(0,0,0));
         }
    }//GEN-LAST:event_year12FocusGained

    private void yeargFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yeargFocusGained
        // TODO add your handling code here:
          if(yearg.getText().equals("Enter Passout Year"))
         {
            yearg.setText("");
            yearg.setForeground(new Color(0,0,0));
         }
        
    }//GEN-LAST:event_yeargFocusGained

    private void university10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_university10FocusLost
        // TODO add your handling code here:
         if(university10.getText().equals(""))
         {
            university10.setText("Enter University Name");
            university10.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_university10FocusLost

    private void university12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_university12FocusLost
        // TODO add your handling code here:
         if(university12.getText().equals(""))
         {
            university12.setText("Enter University Name");
            university12.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_university12FocusLost

    private void universitygFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_universitygFocusLost
        // TODO add your handling code here:
         if(universityg.getText().equals(""))
         {
            universityg.setText("Enter University Name");
            universityg.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_universitygFocusLost

    private void per10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_per10FocusLost
        // TODO add your handling code here:
         if(per10.getText().equals(""))
         {
            per10.setText("Enter Percentage");
            per10.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_per10FocusLost

    private void per12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_per12FocusLost
        // TODO add your handling code here:
         if(per12.getText().equals(""))
         {
            per12.setText("Enter Percentage");
            per12.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_per12FocusLost

    private void pergFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pergFocusLost
        // TODO add your handling code here:
         if(perg.getText().equals(""))
         {
            perg.setText("Enter Percentage");
            perg.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_pergFocusLost

    private void year10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_year10FocusLost
        // TODO add your handling code here:
         if(year10.getText().equals(""))
         {
            year10.setText("Enter Passout Year");
            year10.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_year10FocusLost

    private void year12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_year12FocusLost
        // TODO add your handling code here:
         if(year12.getText().equals(""))
         {
            year12.setText("Enter Passout Year");
            year12.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_year12FocusLost

    private void yeargFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yeargFocusLost
        // TODO add your handling code here:
         if(yearg.getText().equals(""))
         {
            yearg.setText("Enter Passout Year");
            yearg.setForeground(new Color(153,153,153));
         }
    }//GEN-LAST:event_yeargFocusLost

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
       String rno = rollno.getText();
        String sname = name.getText();
         String sfname = fathername.getText();
          String smname = mothername.getText();
           String gen = (String)gender.getSelectedItem();
            String cname = contactnumber.getText();
             String em = email.getText();
              String  teuname= university10.getText();
               String teper = per10.getText();
                String tepy = year10.getText();
                 String tuname = university12.getText();
                  String tper = per12.getText();
                   String tpy = year12.getText();
                    String gunname = universityg.getText();
                     String gunper = perg.getText();
                      String gunpy = yearg.getText();
                       String add = address.getText();
                        String marks = "0";
                        
                       try{
                           Connection con = ConnectionProvider.getCon();
                           PreparedStatement ps = con.prepareStatement("INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                           ps.setString(1,rno);
                           ps.setString(2,sname);
                           ps.setString(3,sfname);
                           ps.setString(4,smname);
                           ps.setString(5,gen);
                           ps.setString(6,cname);
                           ps.setString(7,em);
                           ps.setString(8,teuname);
                           ps.setString(9,teper);
                           ps.setString(10,tepy);
                           ps.setString(11,tuname);
                           ps.setString(12,tper);
                           ps.setString(13,tpy);
                           ps.setString(14,gunname);
                           ps.setString(15,gunper);
                           ps.setString(16,gunpy);
                           ps.setString(17,add);
                           ps.setString(18,marks);
                           ps.executeUpdate();
                           JOptionPane.showMessageDialog(null,"Registration Sucessfully Complete!");
                           setVisible(false);
                           new instructionstudent(rno,sname).setVisible(true);

                       }
                       
                       catch(Exception e)
                       {
                          JOptionPane.showMessageDialog(null,e);
                       }
    }//GEN-LAST:event_saveActionPerformed

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
            java.util.logging.Logger.getLogger(studentdetails8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentdetails8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentdetails8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentdetails8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentdetails8().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JTextField contactnumber;
    private javax.swing.JLabel date1;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fathername;
    private javax.swing.JComboBox<String> gender;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea message;
    private javax.swing.JTextField mothername;
    private javax.swing.JTextField name;
    private javax.swing.JTextField per10;
    private javax.swing.JTextField per12;
    private javax.swing.JTextField perg;
    private javax.swing.JTextField rollno;
    private javax.swing.JButton save;
    private javax.swing.JTextField university10;
    private javax.swing.JTextField university12;
    private javax.swing.JTextField universityg;
    private javax.swing.JTextField year10;
    private javax.swing.JTextField year12;
    private javax.swing.JTextField yearg;
    // End of variables declaration//GEN-END:variables
}