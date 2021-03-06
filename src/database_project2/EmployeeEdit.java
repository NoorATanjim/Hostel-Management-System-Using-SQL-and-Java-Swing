/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author SARK
 */
public class EmployeeEdit extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeEdit
     */
    
    String AdminId;
    EmployeeInfo user;
    public EmployeeEdit() {
        initComponents();
    }
    
    public EmployeeEdit(EmployeeInfo user,String AdminId) {
        this.AdminId = AdminId;
        this.user  = user;
        initComponents();
        footerName.setOpaque(true);
        footerFathersName.setOpaque(true);
        footerMothersName.setOpaque(true);
        footerEmail.setOpaque(true);
        footerContact.setOpaque(true);
        footerSalary.setOpaque(true);
        footerAddress.setOpaque(true);
        footerGContact.setOpaque(true);
        
        footerName.setVisible(false);
        footerFathersName.setVisible(false);
        footerMothersName.setVisible(false);
        footerEmail.setVisible(false);
        footerContact.setVisible(false);
        footerSalary.setVisible(false);
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
        
        post.setSelectedItem(user.getPost());
        address.setText(user.getAddress());
        salary.setText(Integer.toString(user.getSalary()));
        
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        jLabel13 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        fathersName = new javax.swing.JTextField();
        mothersName = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        contactNo = new javax.swing.JTextField();
        dateOfBirth = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        name = new javax.swing.JTextField();
        gContactNo = new javax.swing.JTextField();
        addImageButton = new javax.swing.JButton();
        bloodGroup = new javax.swing.JComboBox<>();
        post = new javax.swing.JComboBox<>();
        footerFathersName = new javax.swing.JLabel();
        footerName = new javax.swing.JLabel();
        footerMothersName = new javax.swing.JLabel();
        footerEmail = new javax.swing.JLabel();
        footerContact = new javax.swing.JLabel();
        footerAddress = new javax.swing.JLabel();
        footerGContact = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        footerSalary = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1050, 570));
        setMinimumSize(new java.awt.Dimension(1050, 570));
        setPreferredSize(new java.awt.Dimension(1050, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 19, 52));

        jLabel1.setText("Update Employee Info");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

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
                .addGap(27, 27, 27)
                .addComponent(backButton)
                .addGap(305, 305, 305)
                .addComponent(jLabel1)
                .addContainerGap(537, Short.MAX_VALUE))
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

        jLabel3.setText("Address:");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 90, 20));

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

        jLabel8.setText("Father's Name:");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 140, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Post:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 110, 30));

        jLabel10.setText("Guardian Contact No:");
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Name:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 30));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/database_project2/DSC_0335.jpg"))); // NOI18N
        image.setText("Image");
        image.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 120, 120));

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

        address.setColumns(20);
        address.setRows(5);
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(address);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 190, 60));

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
        getContentPane().add(gContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 190, 30));

        addImageButton.setText("Add Image");
        addImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addImageButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addImageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, 110, 20));

        bloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(bloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 190, 30));

        post.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Accountant", "Cook", "Cleaner", "Others" }));
        getContentPane().add(post, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 190, 30));

        footerFathersName.setBackground(new java.awt.Color(255, 0, 0));
        footerFathersName.setText("Fathers Name is Empty");
        getContentPane().add(footerFathersName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 190, 13));

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

        footerAddress.setText("Address is Empty");
        footerAddress.setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().add(footerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 190, 13));

        footerGContact.setText("Guardian Contact No is Empty");
        footerGContact.setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().add(footerGContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 190, 13));

        jLabel14.setText("Salary");
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 110, 30));

        salary.setPreferredSize(new java.awt.Dimension(59, 27));
        salary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                salaryKeyTyped(evt);
            }
        });
        getContentPane().add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 190, 30));

        footerSalary.setText("Salary is Empty");
        footerSalary.setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().add(footerSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, 190, 13));

        jPanel4.setBackground(new java.awt.Color(173, 216, 230));

        submitButton.setText("Update");
        submitButton.setBackground(new java.awt.Color(0, 102, 102));
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(472, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(420, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new EmployeeDetails(this.AdminId,user.getEmployeeId()).setVisible(true);
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

        if((contactNo.getText().length()==0) && (evt.getKeyChar()==KeyEvent.VK_BACK_SPACE || evt.getKeyChar()==KeyEvent.VK_DELETE || !((evt.getKeyChar() >= '0') && (evt.getKeyChar()<= '9'))))
        footerContact.setVisible(true);
        else
        footerContact.setVisible(false);
    }//GEN-LAST:event_contactNoKeyTyped

    private void dateOfBirthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateOfBirthKeyTyped

    }//GEN-LAST:event_dateOfBirthKeyTyped

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
        if((gContactNo.getText().length()==0) && (evt.getKeyChar()==KeyEvent.VK_BACK_SPACE || evt.getKeyChar()==KeyEvent.VK_DELETE || !((evt.getKeyChar() >= '0') && (evt.getKeyChar()<= '9'))))
        footerGContact.setVisible(true);
        else
        footerGContact.setVisible(false);
    }//GEN-LAST:event_gContactNoKeyTyped

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

    private void salaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_salaryKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9') ||
            (c == KeyEvent.VK_BACK_SPACE) ||
            (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
        if((salary.getText().length()==0) && (evt.getKeyChar()==KeyEvent.VK_BACK_SPACE || evt.getKeyChar()==KeyEvent.VK_DELETE || !((evt.getKeyChar() >= '0') && (evt.getKeyChar()<= '9'))))
        footerSalary.setVisible(true);
        else
        footerSalary.setVisible(false);
    }//GEN-LAST:event_salaryKeyTyped
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
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

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
        else if(salary.getText().length()==0)
        {
            JOptionPane.showMessageDialog(this, "Salary is Empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            EmployeeInfo user1 = new EmployeeInfo();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();
            String f = formatter.format(date);
            user1.setEmployeeId(user.getEmployeeId());

            user1.setName(name.getText());
            user1.setFathersName(fathersName.getText());
            user1.setMothersName(mothersName.getText());
            user1.setEmail(email.getText());
            user1.setContactNo(contactNo.getText());
            user1.setDateOfBirth(new SimpleDateFormat("dd/MM/yyyy").format(dateOfBirth.getDate()).toString());
            user1.setBloodGroup(bloodGroup.getSelectedItem().toString());
            user1.setPost(post.getSelectedItem().toString());
            user1.setAddress(address.getText());
            user1.setGuardianContactNo(gContactNo.getText());
            user1.setSalary(Integer.valueOf(salary.getText()));

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
            user1.setImage(baos.toByteArray());
            try
            {
                new ConnectMSSQL().updateEmployee(user1);
                
                JOptionPane.showMessageDialog(this, "Updated Successfully","Updated",JOptionPane.INFORMATION_MESSAGE);
                backButtonActionPerformed(evt);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "Error Occured","Error",JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeEdit().setVisible(true);
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
    private javax.swing.JLabel footerSalary;
    private javax.swing.JTextField gContactNo;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mothersName;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> post;
    private javax.swing.JTextField salary;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
