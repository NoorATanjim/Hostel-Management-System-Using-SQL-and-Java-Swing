/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageFilter;
import javax.swing.JFileChooser;
import java.io.File;      
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author SARK
 */
public class MemberEdit extends javax.swing.JFrame {

    /**
     * Creates new form MemberEdit
     */
    String AdminId;
    MemberInfo user;
    public MemberEdit(MemberInfo user,String AdminId) {
        this.AdminId = AdminId;
        this.user  = user;
        initComponents();
        footerName.setOpaque(true);
        footerFathersName.setOpaque(true);
        footerMothersName.setOpaque(true);
        footerEmail.setOpaque(true);
        footerContact.setOpaque(true);
        
        footerAddress.setOpaque(true);
        footerGContact.setOpaque(true);
        
        footerName.setVisible(false);
        footerFathersName.setVisible(false);
        footerMothersName.setVisible(false);
        footerEmail.setVisible(false);
        footerContact.setVisible(false);
        
        footerAddress.setVisible(false);
        footerGContact.setVisible(false);
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dateOfBirth.getDateEditor();editor.setEnabled(false);
        
        name.setText(user.getName());
        fathersName.setText(user.getFathersName());
        mothersName.setText(user.getMothersName());
        gContactNo.setText(user.getGuardianContactNo());
        email.setText(user.getEmail());
        contactNo.setText(user.getContactNo());
        bloodGroup.setSelectedItem(user.getBloodGroup());
        try
        {
            dateOfBirth.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(user.getDateOfBirth()));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        profession.setSelectedItem(user.getProfession());
        address.setText(user.getAddress());
        
        seatNo.addItem(user.getSeatNo()+" , Current Seat");
        setValueForSeatChooser();
        mealType.setSelectedItem(user.getMealType());
        InputStream in = new ByteArrayInputStream(user.getImage());
        BufferedImage img = null;
        try
        {
            img = ImageIO.read(in);  
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
                 
        Image dimg = img.getScaledInstance(image.getWidth(), image.getHeight(),Image.SCALE_SMOOTH);
        Icon icon = new ImageIcon(dimg);
        image.setIcon(icon);
    }
    
    
    public MemberEdit() {
        
        
        
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
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fathersName = new javax.swing.JTextField();
        mothersName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        contactNo = new javax.swing.JTextField();
        dateOfBirth = new com.toedter.calendar.JDateChooser();
        seatNo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        name = new javax.swing.JTextField();
        gContactNo = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        bloodGroup = new javax.swing.JComboBox<>();
        profession = new javax.swing.JComboBox<>();
        footerFathersName = new javax.swing.JLabel();
        mealType = new javax.swing.JComboBox<>();
        footerName = new javax.swing.JLabel();
        footerMothersName = new javax.swing.JLabel();
        footerEmail = new javax.swing.JLabel();
        footerContact = new javax.swing.JLabel();
        footerAddress = new javax.swing.JLabel();
        footerGContact = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        addImageButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 570));
        setMinimumSize(new java.awt.Dimension(1050, 570));
        setPreferredSize(new java.awt.Dimension(1050, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Member Info");

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(371, 371, 371)
                .addComponent(jLabel1)
                .addContainerGap(486, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Mother's Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Address:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 90, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 60, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Contact No:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Date of Birth:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 130, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Blood Group:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Father's Name:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Profession:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 110, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Guardian Contact No:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Meal Type:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 100, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Seat No:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 80, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Name:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 92, -1, 30));

        fathersName.setPreferredSize(new java.awt.Dimension(59, 27));
        fathersName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fathersNameKeyTyped(evt);
            }
        });
        getContentPane().add(fathersName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 190, 30));

        mothersName.setPreferredSize(new java.awt.Dimension(59, 27));
        mothersName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mothersNameActionPerformed(evt);
            }
        });
        mothersName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mothersNameKeyTyped(evt);
            }
        });
        getContentPane().add(mothersName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 190, 30));

        email.setPreferredSize(new java.awt.Dimension(59, 27));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 190, 30));

        contactNo.setPreferredSize(new java.awt.Dimension(59, 27));
        contactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactNoKeyTyped(evt);
            }
        });
        getContentPane().add(contactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 190, 30));

        dateOfBirth.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateOfBirthKeyTyped(evt);
            }
        });
        getContentPane().add(dateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 190, 30));

        seatNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatNoActionPerformed(evt);
            }
        });
        getContentPane().add(seatNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, 190, 30));

        address.setColumns(20);
        address.setRows(5);
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(address);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 260, 190, 60));

        name.setPreferredSize(new java.awt.Dimension(59, 27));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 190, 30));

        gContactNo.setPreferredSize(new java.awt.Dimension(59, 27));
        gContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gContactNoKeyTyped(evt);
            }
        });
        getContentPane().add(gContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 190, 30));

        updateButton.setBackground(new java.awt.Color(0, 51, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        bloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(bloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 190, 30));

        profession.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Teacher", "Doctor", "Engineer", "Service Holder", "Others" }));
        getContentPane().add(profession, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 190, 30));

        footerFathersName.setBackground(new java.awt.Color(255, 0, 0));
        footerFathersName.setText("Fathers Name is Empty");
        getContentPane().add(footerFathersName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 190, 13));

        mealType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Breakfast+Lunch+Dinner", "Breakfast", "Lunch", "Dinner", "Breakfast+Lunch", "Breakfast+Dinner", "Lunch+Dinner" }));
        getContentPane().add(mealType, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 190, 30));

        footerName.setBackground(new java.awt.Color(255, 0, 0));
        footerName.setText("Name is Empty");
        getContentPane().add(footerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 190, 13));

        footerMothersName.setBackground(new java.awt.Color(255, 0, 0));
        footerMothersName.setText("Mothers Name is Empty");
        getContentPane().add(footerMothersName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 190, 13));

        footerEmail.setBackground(new java.awt.Color(255, 0, 0));
        footerEmail.setText("Email is not valid");
        getContentPane().add(footerEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 190, 13));

        footerContact.setBackground(new java.awt.Color(255, 0, 0));
        footerContact.setText("Contact No. is Empty");
        getContentPane().add(footerContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 190, 13));

        footerAddress.setBackground(new java.awt.Color(255, 0, 0));
        footerAddress.setText("Address is Empty");
        getContentPane().add(footerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 190, 13));

        footerGContact.setBackground(new java.awt.Color(255, 0, 0));
        footerGContact.setText("Guardian Contact No is Empty");
        getContentPane().add(footerGContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 190, 13));

        image.setBackground(new java.awt.Color(102, 102, 102));
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/DSC_0335.jpg"))); // NOI18N
        image.setText("Image");
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, 120, 120));

        addImageButton.setText("Add Image");
        addImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addImageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, 90, 20));

        jPanel2.setBackground(new java.awt.Color(135, 206, 180));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1050, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new MemberDetails(this.AdminId,user.getMemberId()).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void fathersNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fathersNameKeyTyped
        if(fathersName.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        footerFathersName.setVisible(true);
        else
        footerFathersName.setVisible(false);
    }//GEN-LAST:event_fathersNameKeyTyped

    private void mothersNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mothersNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mothersNameActionPerformed

    private void mothersNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mothersNameKeyTyped
        if(mothersName.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        footerMothersName.setVisible(true);
        else
        footerMothersName.setVisible(false);
    }//GEN-LAST:event_mothersNameKeyTyped

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped

        if(email.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        footerEmail.setVisible(true);
        else
        footerEmail.setVisible(false);
    }//GEN-LAST:event_emailKeyTyped

    private void contactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactNoKeyTyped

        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }

        if(contactNo.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        footerContact.setVisible(true);
        else
        footerContact.setVisible(false);

    }//GEN-LAST:event_contactNoKeyTyped

    private void dateOfBirthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateOfBirthKeyTyped

    }//GEN-LAST:event_dateOfBirthKeyTyped

    private void seatNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatNoActionPerformed

    private void addressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyTyped
        if(address.getText().length()==0  && evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        footerAddress.setVisible(true);
        else
        footerAddress.setVisible(false);
    }//GEN-LAST:event_addressKeyTyped

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        if(name.getText().length()==0 && evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        footerName.setVisible(true);
        else
        footerName.setVisible(false);

    }//GEN-LAST:event_nameKeyTyped

    private void gContactNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gContactNoKeyTyped

        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
        if(gContactNo.getText().length()==0  && evt.getKeyChar()==KeyEvent.VK_BACK_SPACE)
        footerGContact.setVisible(true);
        else
        footerGContact.setVisible(false);
    }//GEN-LAST:event_gContactNoKeyTyped

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        if(name.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Name is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(fathersName.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Fathers Name is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(mothersName.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Mothers Name is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(email.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Email is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(!validate(email.getText()))
        {
            JOptionPane.showMessageDialog(this, "Email is not Valid","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(contactNo.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Contact No is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(((JTextField)dateOfBirth.getDateEditor().getUiComponent()).getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Date Of Birth is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(address.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Address is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(gContactNo.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Guardian Contact No is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(seatNo.getSelectedItem().toString().equals("No Empty Seat Exist"))
        {
            JOptionPane.showMessageDialog(this, "No Empty Seat Exist","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            
            user.setName(name.getText());
            user.setFathersName(fathersName.getText());
            user.setMothersName(mothersName.getText());
            user.setEmail(email.getText());
            user.setContactNo(contactNo.getText());
            user.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").format(dateOfBirth.getDate()).toString());
            user.setBloodGroup(bloodGroup.getSelectedItem().toString());
            user.setProfession(profession.getSelectedItem().toString());
            user.setAddress(address.getText());
            user.setGuardianContactNo(gContactNo.getText());
            user.setMealType(mealType.getSelectedItem().toString());
            String temp = seatNo.getSelectedItem().toString();
            user.setSeatNo(temp.substring(0,temp.indexOf(' ', 0)));
            
            
            Icon icon = image.getIcon();
            BufferedImage bi = new BufferedImage(icon.getIconWidth(),icon.getIconHeight(),BufferedImage.TYPE_INT_RGB);
            Graphics g = bi.createGraphics();

            icon.paintIcon(null, g, 0,0);
            g.setColor(Color.WHITE);
            g.drawString("",10,20);
            g.dispose();

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            try
            {

                ImageIO.write(bi, "jpg", baos);
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
            user.setImage(baos.toByteArray());
            try
            {
                new ConnectMSSQL().updateMember(user);
                new ConnectMSSQL().update("Seat", "IsEmpty=1 , MemberId = '' where SeatId = '"+user.getSeatNo()+"'");
                new ConnectMSSQL().update("Room", "EmptyBed=EmptyBed+1 where RoomId='"+user.getSeatNo().substring(0, user.getSeatNo().length()-1)+"'");   
                new ConnectMSSQL().update("Seat", "IsEmpty=0 , MemberId = '"+user.getMemberId()+"' where SeatId = '"+user.getSeatNo()+"'");
                new ConnectMSSQL().update("Room", "EmptyBed=EmptyBed-1 where RoomId='"+user.getSeatNo().substring(0, user.getSeatNo().length()-1)+"'");
          
                JOptionPane.showMessageDialog(this, "Updated Successfully","Added",JOptionPane.INFORMATION_MESSAGE);
                backButtonActionPerformed(evt);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e.getMessage(),"Error",JOptionPane.INFORMATION_MESSAGE);
            }
            

        }

    }//GEN-LAST:event_updateButtonActionPerformed
    public void setValueForSeatChooser()
    {
        ArrayList<SeatInfo> arr  = new ArrayList();
        arr = new ConnectMSSQL().getSeatInfo("where IsEmpty=1");
        for(int i=0;i<arr.size();i++)
        {
            ArrayList<RoomInfo> a = new ArrayList();
            a =new ConnectMSSQL().getRoomInfo("where RoomId = '"+arr.get(i).getRoomId()+"'");
            seatNo.addItem(arr.get(i).getSeatId()+" , "+a.get(0).getType()+" , "+a.get(0).getTotalBed()+" beds room");
        }
        
    }
    
    private void addImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addImageButtonActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg"));

        fileChooser.setAcceptAllFileFilterUsed(false);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = fileChooser.getSelectedFile();
            //System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            String IMG_PATH = selectedFile.getAbsolutePath().toString();
            try {
                BufferedImage img = ImageIO.read(new File(IMG_PATH));
                Image dimg = img.getScaledInstance(image.getWidth(), image.getHeight(),
                    Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(dimg);
                image.setIcon(icon);
                //JOptionPane.showMessageDialog(null, label);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_addImageButtonActionPerformed
     public boolean validate(String email)
    {
        int x = email.indexOf("@");
        if(x==-1)
            return false;
        x = email.indexOf(".", x);
        if(x==-1)
            return false;
        return true;
    }
    
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
            java.util.logging.Logger.getLogger(MemberEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addImageButton;
    private javax.swing.JTextArea address;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> bloodGroup;
    private javax.swing.JTextField contactNo;
    private com.toedter.calendar.JDateChooser dateOfBirth;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fathersName;
    private javax.swing.JLabel footerAddress;
    private javax.swing.JLabel footerContact;
    private javax.swing.JLabel footerEmail;
    private javax.swing.JLabel footerFathersName;
    private javax.swing.JLabel footerGContact;
    private javax.swing.JLabel footerMothersName;
    private javax.swing.JLabel footerName;
    private javax.swing.JTextField gContactNo;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> mealType;
    private javax.swing.JTextField mothersName;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> profession;
    private javax.swing.JComboBox<String> seatNo;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
