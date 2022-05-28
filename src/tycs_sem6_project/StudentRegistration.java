package tycs_sem6_project;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;

public class StudentRegistration extends javax.swing.JFrame {

    public StudentRegistration() {
        initComponents();
        setDefaultCloseOperation(StudentRegistration.DISPOSE_ON_CLOSE);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jUpdate = new javax.swing.JButton();
        jNew = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jSearch = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDelete = new javax.swing.JButton();
        jClose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jInsert = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jMobile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Registration");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 255));
        jLabel1.setText("STUDENT REGISTRATION");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2), "Student Registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36), new java.awt.Color(51, 204, 255))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Course");

        jComboBox9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8:00 Am To 9:00 Am", "9:00 Am To 10:00 Am", "10:00 Am To 11:00 Am", "11:00 Am To 12:00 Pm", "1:00 Pm To 2:00 Pm", "2:00 Pm To 3:00 Pm", "3:00 Pm To 4:00 Pm", "4:30 Pm To 5:30 Pm", "5:30 Pm To 6:30 Pm", "6:30 Pm To7:30 Pm", "7:30 Pm To 8:30 Pm", "8:30 Pm To 9:30 Pm" }));
        jComboBox9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox9KeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Address");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("First Name");

        jUpdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jUpdate.setText("Update");
        jUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });
        jUpdate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jUpdateKeyPressed(evt);
            }
        });

        jNew.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.png"))); // NOI18N
        jNew.setText("New");
        jNew.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewActionPerformed(evt);
            }
        });
        jNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jNewKeyPressed(evt);
            }
        });

        jReset.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reset.png"))); // NOI18N
        jReset.setText("Reset");
        jReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });
        jReset.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jResetKeyPressed(evt);
            }
        });

        jSearch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        jSearch.setText("Search");
        jSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchActionPerformed(evt);
            }
        });
        jSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jSearchKeyPressed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("D.O.B");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Middle Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Mobile No");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Batch Timing");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Student ID");

        jDelete.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jDelete.setText("Delete");
        jDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        jDelete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDeleteKeyPressed(evt);
            }
        });

        jClose.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close.png"))); // NOI18N
        jClose.setText("Close");
        jClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCloseActionPerformed(evt);
            }
        });
        jClose.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCloseKeyPressed(evt);
            }
        });

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextArea6.setRows(5);
        jTextArea6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextArea6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea6KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea6);

        jInsert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/insert.png"))); // NOI18N
        jInsert.setText("Insert");
        jInsert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInsertActionPerformed(evt);
            }
        });
        jInsert.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jInsertKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Last Name");

        jComboBox8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Programming C", "Programming C++", "Core Java", "Advance Java", "Python", "HTML", ".NET", "PHP", "DBMS" }));
        jComboBox8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox8KeyPressed(evt);
            }
        });

        jDateChooser5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jDateChooser5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jDateChooser5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser5KeyPressed(evt);
            }
        });

        jMobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jMobile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png"))); // NOI18N
        jMobile.setText("Mobile No");
        jMobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMobileActionPerformed(evt);
            }
        });
        jMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMobileKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jDateChooser5, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jComboBox9, javax.swing.GroupLayout.Alignment.LEADING, 0, 246, Short.MAX_VALUE)
                                        .addComponent(jComboBox8, javax.swing.GroupLayout.Alignment.LEADING, 0, 246, Short.MAX_VALUE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jNew, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jClose, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(77, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jDateChooser5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNew, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jClose, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(960, 948));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField2.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jSearch.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField3.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField1.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField4.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField2.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jDateChooser5.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField3.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jDateChooser5.requestFocus();
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextArea6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea6KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField7.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jDateChooser5.requestFocus();
        }
    }//GEN-LAST:event_jTextArea6KeyPressed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jComboBox8.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextArea6.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jComboBox8.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jMobile.requestFocus();
        }


    }//GEN-LAST:event_jTextField7KeyPressed

    private void jComboBox8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox8KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jComboBox9.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField7.requestFocus();
        }


    }//GEN-LAST:event_jComboBox8KeyPressed

    private void jComboBox9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox9KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jNew.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jComboBox8.requestFocus();
        }

    }//GEN-LAST:event_jComboBox9KeyPressed

    private void jSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                Statement stmt = con.createStatement();

                ResultSet rs = stmt.executeQuery("select * from studentinfo where (Student_Id=" + jTextField1.getText() + ")");
                //while (rs.next()) {

                if (rs.next()) {
                    int id = rs.getInt(1);
                    jTextField1.setText(Integer.toString(id));

                    String fname = rs.getString(2);
                    jTextField2.setText(fname);

                    String mname = rs.getString(3);
                    jTextField3.setText(mname);

                    String lname = rs.getString(4);
                    jTextField4.setText(lname);

                    java.util.Date a = rs.getDate(5);
                    jDateChooser5.setDate(a);

                    String add = rs.getString(6);
                    jTextArea6.setText(add);

                    String mob = rs.getString(7);
                    jTextField7.setText(mob);

                    String course = rs.getString(8);
                    jComboBox8.setSelectedItem(course);

                    String batch = rs.getString(9);
                    jComboBox9.setSelectedItem(batch);

                } else {
                    JOptionPane.showMessageDialog(null, "Id Does not exist");
                }

                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid Id");
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jTextField1.requestFocus();
        }
    }//GEN-LAST:event_jSearchKeyPressed

    private void jNewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jNewKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            //jComboBox9.requestFocus();
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("select max(Student_Id)+1 from studentinfo");
                while (rs.next()) {
                    int id = rs.getInt(1);
                    jTextField1.setText(Integer.toString(id));
                }
                con.close();
                jTextField2.setText(null);
                jTextField3.setText(null);
                jTextField4.setText(null);
                jDateChooser5.setDate(new Date());
                jTextArea6.setText(null);
                jTextField7.setText(null);
                jComboBox8.setSelectedIndex(0);
                jComboBox9.setSelectedIndex(0);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid Id");
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jInsert.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jComboBox9.requestFocus();
        }
    }//GEN-LAST:event_jNewKeyPressed

    private void jInsertKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jInsertKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextArea6.getText().isEmpty() || jTextField7.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill All TextFields");
            } else {

                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                    String dt = sdf.format(jDateChooser5.getDate());
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate("insert into studentinfo values(" + jTextField1.getText() + ",'" + jTextField2.getText() + "','" + jTextField3.getText() + "','" + jTextField4.getText() + "','" + dt + "','" + jTextArea6.getText() + "','" + jTextField7.getText() + "','" + jComboBox8.getSelectedItem().toString() + "','" + jComboBox9.getSelectedItem().toString() + "')");
                    con.close();
                    JOptionPane.showMessageDialog(null, "1 Record Sucessfully Inserted");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Something Wrong");
                }
                AllStudents all = new AllStudents();
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jNew.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jUpdate.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jComboBox9.requestFocus();
        }
    }//GEN-LAST:event_jInsertKeyPressed

    private void jUpdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUpdateKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextArea6.getText().isEmpty() || jTextField7.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "TextBox Are Empty");
            } else {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                    String dt = sdf.format(jDateChooser5.getDate());
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate("update studentinfo set First_Name='" + jTextField2.getText() + "',Middle_Name='" + jTextField3.getText() + "',Last_Name='" + jTextField4.getText() + "',DOB='" + dt + "',Address='" + jTextArea6.getText() + "',Mobile_No='" + jTextField7.getText() + "',Course='" + jComboBox8.getSelectedItem().toString() + "',Batch='" + jComboBox9.getSelectedItem().toString() + "' where Student_Id=" + jTextField1.getText() + "");
                    con.close();
                    JOptionPane.showMessageDialog(null, "1 Record Successfully Updated");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Record Not Updated");
                }
            }

        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jDelete.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jInsert.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jComboBox9.requestFocus();
        }
    }//GEN-LAST:event_jUpdateKeyPressed

    private void jDeleteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDeleteKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextField1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Student Id");
            }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                Statement stmt = con.createStatement();
                stmt.executeUpdate("Delete from studentinfo where Student_Id=" + jTextField1.getText() + "");
                stmt.executeUpdate("Delete from feestructure where Student_Id=" + jTextField1.getText() + "");
                con.close();
                JOptionPane.showMessageDialog(null, "1 Record Successfully Deleted");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Record not Delete");
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jReset.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jUpdate.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jComboBox9.requestFocus();
        }
    }//GEN-LAST:event_jDeleteKeyPressed

    private void jResetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jResetKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField1.setText(null);
            jTextField2.setText(null);
            jTextField3.setText(null);
            jTextField4.setText(null);
            jDateChooser5.setDate(new Date());
            jTextArea6.setText(null);
            jTextField7.setText(null);
            jComboBox8.setSelectedIndex(0);
            jComboBox9.setSelectedIndex(0);
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jClose.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jDelete.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jComboBox9.requestFocus();
        }
    }//GEN-LAST:event_jResetKeyPressed

    private void jCloseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCloseKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jReset.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jComboBox9.requestFocus();
        }
    }//GEN-LAST:event_jCloseKeyPressed

    private void jDateChooser5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser5KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField4.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextArea6.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextArea6.requestFocus();
        }
    }//GEN-LAST:event_jDateChooser5KeyPressed

    private void jNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select max(Student_Id)+1 from studentinfo");
            while (rs.next()) {
                int id = rs.getInt(1);
                jTextField1.setText(Integer.toString(id));
            }

            con.close();
            //jTextField1.setText(null);
            jTextField2.setText(null);
            jTextField3.setText(null);
            jTextField4.setText(null);
            jDateChooser5.setDate(new Date());
            jTextArea6.setText(null);
            jTextField7.setText(null);
            jComboBox8.setSelectedIndex(0);
            jComboBox9.setSelectedIndex(0);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invalid Id");
        }
    }//GEN-LAST:event_jNewActionPerformed

    private void jInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertActionPerformed
        // TODO add your handling code here:
        if (jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextArea6.getText().isEmpty() || jTextField7.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill All TextFields");
        } else {

            try {
                SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                String dt = sdf.format(jDateChooser5.getDate());
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                Statement stmt = con.createStatement();
                stmt.executeUpdate("insert into studentinfo values(" + jTextField1.getText() + ",'" + jTextField2.getText() + "','" + jTextField3.getText() + "','" + jTextField4.getText() + "','" + dt + "','" + jTextArea6.getText() + "','" + jTextField7.getText() + "','" + jComboBox8.getSelectedItem().toString() + "','" + jComboBox9.getSelectedItem().toString() + "')");
                con.close();
                JOptionPane.showMessageDialog(null, "1 Record Sucessfully Inserted");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Something Wrong");
            }
            AllStudents all = new AllStudents();
        }


    }//GEN-LAST:event_jInsertActionPerformed

    private void jCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCloseActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jCloseActionPerformed

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jDateChooser5.setDate(new Date());
        jTextArea6.setText(null);
        jTextField7.setText(null);
        jComboBox8.setSelectedIndex(0);
        jComboBox9.setSelectedIndex(0);

    }//GEN-LAST:event_jResetActionPerformed

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from studentinfo where (Student_Id=" + jTextField1.getText() + ")");
            // while (rs.next()) {
            if (rs.next()) {
                int id = rs.getInt(1);
                jTextField1.setText(Integer.toString(id));

                String fname = rs.getString(2);
                jTextField2.setText(fname);

                String mname = rs.getString(3);
                jTextField3.setText(mname);

                String lname = rs.getString(4);
                jTextField4.setText(lname);

                java.util.Date a = rs.getDate(5);
                jDateChooser5.setDate(a);

                String add = rs.getString(6);
                jTextArea6.setText(add);

                String mob = rs.getString(7);
                jTextField7.setText(mob);

                String course = rs.getString(8);
                jComboBox8.setSelectedItem(course);

                String batch = rs.getString(9);
                jComboBox9.setSelectedItem(batch);

            } else {
                JOptionPane.showMessageDialog(null, "Id Does not exist");
            }

            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invalid Id");
        }
    }//GEN-LAST:event_jSearchActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Student Id");
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("Delete from studentinfo where Student_Id=" + jTextField1.getText() + "");
            stmt.executeUpdate("Delete from feestructure where Student_Id=" + jTextField1.getText() + "");
            con.close();
            JOptionPane.showMessageDialog(null, "1 Record Successfully Deleted");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Record not Delete");
        }
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        // TODO add your handling code here: 
        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextArea6.getText().isEmpty() || jTextField7.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TextBox Are Empty");
        } else {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                String dt = sdf.format(jDateChooser5.getDate());
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                Statement stmt = con.createStatement();
                stmt.executeUpdate("update studentinfo set First_Name='" + jTextField2.getText() + "',Middle_Name='" + jTextField3.getText() + "',Last_Name='" + jTextField4.getText() + "',DOB='" + dt + "',Address='" + jTextArea6.getText() + "',Mobile_No='" + jTextField7.getText() + "',Course='" + jComboBox8.getSelectedItem().toString() + "',Batch='" + jComboBox9.getSelectedItem().toString() + "' where Student_Id=" + jTextField1.getText() + "");
                con.close();
                JOptionPane.showMessageDialog(null, "1 Record Successfully Updated");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Record Not Updated");
            }
        }

    }//GEN-LAST:event_jUpdateActionPerformed

    private void jMobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMobileActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from studentinfo where (Mobile_No=" + jTextField7.getText() + ")");
            //while (rs.next()) {
            if (rs.next()) {
                int id = rs.getInt(1);
                jTextField1.setText(Integer.toString(id));

                String fname = rs.getString(2);
                jTextField2.setText(fname);

                String mname = rs.getString(3);
                jTextField3.setText(mname);

                String lname = rs.getString(4);
                jTextField4.setText(lname);

                java.util.Date a = rs.getDate(5);
                jDateChooser5.setDate(a);

                String add = rs.getString(6);
                jTextArea6.setText(add);

                String mob = rs.getString(7);
                jTextField7.setText(mob);

                String course = rs.getString(8);
                jComboBox8.setSelectedItem(course);

                String batch = rs.getString(9);
                jComboBox9.setSelectedItem(batch);

            } else {
                JOptionPane.showMessageDialog(null, "Mobile Number Does Not Exist");
            }

            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invaid Mobile Number");
        }
    }//GEN-LAST:event_jMobileActionPerformed

    private void jMobileKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMobileKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jTextField7.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                Statement stmt = con.createStatement();

                ResultSet rs = stmt.executeQuery("select * from studentinfo where (Mobile_No=" + jTextField7.getText() + ")");
                // while (rs.next()) {
                if (rs.next()) {
                    int id = rs.getInt(1);
                    jTextField1.setText(Integer.toString(id));

                    String fname = rs.getString(2);
                    jTextField2.setText(fname);

                    String mname = rs.getString(3);
                    jTextField3.setText(mname);

                    String lname = rs.getString(4);
                    jTextField4.setText(lname);

                    java.util.Date a = rs.getDate(5);
                    jDateChooser5.setDate(a);

                    String add = rs.getString(6);
                    jTextArea6.setText(add);

                    String mob = rs.getString(7);
                    jTextField7.setText(mob);

                    String course = rs.getString(8);
                    jComboBox8.setSelectedItem(course);

                    String batch = rs.getString(9);
                    jComboBox9.setSelectedItem(batch);

                } else {
                    JOptionPane.showMessageDialog(null, "Mobile Number Does Not Exit");
                }

                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid Mobile Number");
            }
        }
    }//GEN-LAST:event_jMobileKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jClose;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JButton jDelete;
    private javax.swing.JButton jInsert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jMobile;
    private javax.swing.JButton jNew;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearch;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton jUpdate;
    // End of variables declaration//GEN-END:variables
}
