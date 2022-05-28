package tycs_sem6_project;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class StudentFees extends javax.swing.JFrame {

    public StudentFees() {
        initComponents();
        setDefaultCloseOperation(StudentFees.DISPOSE_ON_CLOSE);
        this.setResizable(false);
    }

    private void calc() {
        jTextField12.setText("jTextField8.getText()-(jTextField9.getText()+jTextField10.getText()+jTextField11.getText()");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jFilldata = new javax.swing.JButton();
        jUpdate = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jDelete = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jClose = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jTextField8 = new javax.swing.JTextField();
        jPrint = new javax.swing.JButton();
        jInsert = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jInvoice = new javax.swing.JButton();

        setTitle("Student Fees");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT FEES");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 3), "Student Fees", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 36), new java.awt.Color(51, 204, 255))); // NOI18N

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField12KeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Total Fees");

        jFilldata.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jFilldata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fill.png"))); // NOI18N
        jFilldata.setText("Fill Data");
        jFilldata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jFilldata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFilldataActionPerformed(evt);
            }
        });
        jFilldata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jFilldataKeyPressed(evt);
            }
        });

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

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Batch");

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

        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jDateChooser1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooser1KeyPressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Balance");

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("First Name");

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

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Student ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Mobile No");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("First Installment");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Last Name");

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
        });

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField11KeyPressed(evt);
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

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField10KeyPressed(evt);
            }
        });

        area.setColumns(20);
        area.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });

        jPrint.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/print.png"))); // NOI18N
        jPrint.setText("Print");
        jPrint.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrintActionPerformed(evt);
            }
        });
        jPrint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPrintKeyPressed(evt);
            }
        });

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Admission Date");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Second Installment");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Third Installment");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Middle Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Course");

        jInvoice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jInvoice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/invoice.png"))); // NOI18N
        jInvoice.setText("Recipet");
        jInvoice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jInvoiceActionPerformed(evt);
            }
        });
        jInvoice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jInvoiceKeyPressed(evt);
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
                        .addComponent(jFilldata, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField2)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField8)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField10)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField11)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFilldata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jClose, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(479, 479, 479)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1343, 984));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrintActionPerformed
        // TODO add your handling code here:
        try {
            area.print();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jPrintActionPerformed

    private void jFilldataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFilldataActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from studentinfo where (Student_Id=" + jTextField1.getText() + ")");
            while (rs.next()) {

                int id = rs.getInt(1);
                jTextField1.setText(Integer.toString(id));

                String fname = rs.getString(2);
                jTextField2.setText(fname);

                String mname = rs.getString(3);
                jTextField3.setText(mname);

                String lname = rs.getString(4);
                jTextField4.setText(lname);

                String mob = rs.getString(7);
                jTextField5.setText(mob);

                String course = rs.getString(8);
                jTextField6.setText(course);

                String batch = rs.getString(9);
                jTextField7.setText(batch);
            }

            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Invalid Id");
        }
    }//GEN-LAST:event_jFilldataActionPerformed

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
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField3.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField1.requestFocus();
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField4.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField4.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField5.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField5.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField6.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField6.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField7.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField7.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField5.requestFocus();
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jDateChooser1.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jDateChooser1.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField6.requestFocus();
        }
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jDateChooser1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooser1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField8.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField8.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField7.requestFocus();
        }
    }//GEN-LAST:event_jDateChooser1KeyPressed

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField9.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField9.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jDateChooser1.requestFocus();
        }
    }//GEN-LAST:event_jTextField8KeyPressed

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField10.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField10.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField8.requestFocus();
        }
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField11.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField11.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField9.requestFocus();
        }
    }//GEN-LAST:event_jTextField10KeyPressed

    private void jTextField11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int total = Integer.parseInt(jTextField8.getText());
            int first = Integer.parseInt(jTextField9.getText());
            int second = Integer.parseInt(jTextField10.getText());
            int third = Integer.parseInt(jTextField11.getText());
            int bal = total - (first + second + third);
            jTextField12.setText(Integer.toString(bal));
            jTextField12.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jTextField12.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField10.requestFocus();
        }
    }//GEN-LAST:event_jTextField11KeyPressed

    private void jTextField12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jFilldata.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jFilldata.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField11.requestFocus();
        }
    }//GEN-LAST:event_jTextField12KeyPressed

    private void jFilldataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFilldataKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                Statement stmt = con.createStatement();

                ResultSet rs = stmt.executeQuery("select * from studentinfo where (Student_Id=" + jTextField1.getText() + ")");
                while (rs.next()) {
                    int id = rs.getInt(1);
                    jTextField1.setText(Integer.toString(id));

                    String fname = rs.getString(2);
                    jTextField2.setText(fname);

                    String mname = rs.getString(3);
                    jTextField3.setText(mname);

                    String lname = rs.getString(4);
                    jTextField4.setText(lname);

                    String mob = rs.getString(7);
                    jTextField5.setText(mob);

                    String course = rs.getString(8);
                    jTextField6.setText(course);

                    String batch = rs.getString(9);
                    jTextField7.setText(batch);

                }

                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid Id");
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField12.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jInsert.requestFocus();
        }


    }//GEN-LAST:event_jFilldataKeyPressed

    private void jInsertKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jInsertKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField12.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty() || jTextField6.getText().isEmpty() || jTextField7.getText().isEmpty() || jTextField8.getText().isEmpty() || jTextField9.getText().isEmpty() || jTextField10.getText().isEmpty() || jTextField11.getText().isEmpty() || jTextField12.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill All TextBoxes");
            } else {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                    String dt = sdf.format(jDateChooser1.getDate());
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate("insert into feestructure values(" + jTextField1.getText() + ",'" + jTextField2.getText() + "','" + jTextField3.getText() + "','" + jTextField4.getText() + "','" + jTextField5.getText() + "','" + jTextField6.getText() + "','" + jTextField7.getText() + "','" + dt + "','" + jTextField8.getText() + "','" + jTextField9.getText() + "','" + jTextField10.getText() + "','" + jTextField11.getText() + "','" + jTextField12.getText() + "')");

                    con.close();
                    JOptionPane.showMessageDialog(null, "1 Record  Sucessfully Inserted");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Something Went Wrong");
                }
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jUpdate.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jFilldata.requestFocus();
        }
    }//GEN-LAST:event_jInsertKeyPressed

    private void jUpdateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jUpdateKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField12.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                String dt = sdf.format(jDateChooser1.getDate());
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                Statement stmt = con.createStatement();
                stmt.executeUpdate("update feestructure set Date='" + dt + "',Total_Fees=" + jTextField8.getText() + ",First_Installment=" + jTextField9.getText() + ",Second_Installment=" + jTextField10.getText() + ",Third_Installment=" + jTextField11.getText() + ",Balance=" + jTextField12.getText() + " where Student_Id=" + jTextField1.getText() + "");
                con.close();
                JOptionPane.showMessageDialog(null, "1 Record Successfully Updated");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Record Not Updated");
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jInsert.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jDelete.requestFocus();
        }
    }//GEN-LAST:event_jUpdateKeyPressed

    private void jDeleteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDeleteKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField12.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jUpdate.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jReset.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextField1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Enter Student Id");
            } else {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                    Statement stmt = con.createStatement();
                    stmt.executeUpdate("Delete from feestructure where Student_Id=" + jTextField1.getText() + "");
                    stmt.executeUpdate("Delete from studentinfo where Student_Id=" + jTextField1.getText() + "");
                    con.close();
                    JOptionPane.showMessageDialog(null, "1 Record Successfully Deleted");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Record not Delete");
                }
            }
        }
    }//GEN-LAST:event_jDeleteKeyPressed

    private void jResetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jResetKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField12.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jInvoice.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jDelete.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTextField1.setText(null);
            jTextField2.setText(null);
            jTextField3.setText(null);
            jTextField4.setText(null);
            jTextField5.setText(null);
            jTextField6.setText(null);
            jTextField7.setText(null);
            jDateChooser1.setDate(new Date());
            jTextField8.setText(null);
            jTextField9.setText(null);
            jTextField10.setText(null);
            jTextField11.setText(null);
            jTextField12.setText(null);
            area.setText(null);
        }
    }//GEN-LAST:event_jResetKeyPressed

    private void jPrintKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPrintKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField12.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jInvoice.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jClose.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                area.print();
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_jPrintKeyPressed

    private void jCloseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCloseKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField12.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jPrint.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.dispose();
        }
    }//GEN-LAST:event_jCloseKeyPressed

    private void jSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSearchKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jTextField1.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                Statement stmt = con.createStatement();

                ResultSet rs = stmt.executeQuery("select * from feestructure where (Student_Id=" + jTextField1.getText() + ")");
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

                    String mob = rs.getString(5);
                    jTextField5.setText(mob);

                    String course = rs.getString(6);
                    jTextField6.setText(course);

                    String batch = rs.getString(7);
                    jTextField7.setText(batch);

                    java.util.Date a = rs.getDate(8);
                    jDateChooser1.setDate(a);

                    String total = rs.getString(9);
                    jTextField8.setText(total);

                    String firstinstall = rs.getString(10);
                    jTextField9.setText(firstinstall);

                    String secondinstall = rs.getString(11);
                    jTextField10.setText(secondinstall);

                    String thirdinstall = rs.getString(12);
                    jTextField11.setText(thirdinstall);

                    String balance = rs.getString(13);
                    jTextField12.setText(balance);

                } else {
                    JOptionPane.showMessageDialog(null, "Id Does not Exist");
                }
                con.close();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Invalid Id");
            }
        }
    }//GEN-LAST:event_jSearchKeyPressed

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
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);
        jDateChooser1.setDate(new Date());
        jTextField8.setText(null);
        jTextField9.setText(null);
        jTextField10.setText(null);
        jTextField11.setText(null);
        jTextField12.setText(null);
        area.setText(null);
    }//GEN-LAST:event_jResetActionPerformed

    private void jInvoiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jInvoiceKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            jTextField12.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            jReset.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            jPrint.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            area.setText("******************************************************\n");
            area.setText(area.getText() + "*                                STUDENT FEES RECIPET                            *\n");
            area.setText(area.getText() + "******************************************************\n");
            Date obj = new Date();
            String date = obj.toString();
            area.setText(area.getText() + "\t\t           " + date + "\n\n");
            area.setText(area.getText() + "Student Id :                              " + jTextField1.getText() + "\n\n");
            area.setText(area.getText() + "Student Name :                         " + jTextField2.getText() + " " + jTextField3.getText() + " " + jTextField4.getText() + "\n\n");
            area.setText(area.getText() + "Mobile No :                                " + jTextField5.getText() + "\n\n");
            area.setText(area.getText() + "Course :                                    " + jTextField6.getText() + "\n\n");
            area.setText(area.getText() + "Batch Timing :                           " + jTextField7.getText() + "\n\n");
            area.setText(area.getText() + "Admission Date :                       " + jDateChooser1.getDate() + "\n\n\n");
            area.setText(area.getText() + "Total Fees :                               " + jTextField8.getText() + "\n\n");
            area.setText(area.getText() + "First Installment :                      " + jTextField9.getText() + "\n\n");
            area.setText(area.getText() + "Second Installment :                  " + jTextField10.getText() + "\n\n");
            area.setText(area.getText() + "Third Installment :                     " + jTextField11.getText() + "\n\n");
            area.setText(area.getText() + "-------------------------------------------------------------------------------------\n");
            area.setText(area.getText() + "Balance :                                   " + jTextField12.getText() + "\n\n\n");
            area.setText(area.getText() + "                                                                                    Signature");
        }
    }//GEN-LAST:event_jInvoiceKeyPressed

    private void jSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchActionPerformed
        // TODO add your handling code here:

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from feestructure where (Student_Id=" + jTextField1.getText() + ")");
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

                String mob = rs.getString(5);
                jTextField5.setText(mob);

                String course = rs.getString(6);
                jTextField6.setText(course);

                String batch = rs.getString(7);
                jTextField7.setText(batch);

                java.util.Date a = rs.getDate(8);
                jDateChooser1.setDate(a);

                String total = rs.getString(9);
                jTextField8.setText(total);

                String firstinstall = rs.getString(10);
                jTextField9.setText(firstinstall);

                String secondinstall = rs.getString(11);
                jTextField10.setText(secondinstall);

                String thirdinstall = rs.getString(12);
                jTextField11.setText(thirdinstall);

                String balance = rs.getString(13);
                jTextField12.setText(balance);

            } else {
                JOptionPane.showMessageDialog(null, "Id Does not Exist");
            }

            con.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jSearchActionPerformed

    private void jInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInsertActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty() || jTextField6.getText().isEmpty() || jTextField7.getText().isEmpty() || jTextField8.getText().isEmpty() || jTextField9.getText().isEmpty() || jTextField10.getText().isEmpty() || jTextField11.getText().isEmpty() || jTextField12.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill All TextBoxes");
        } else {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                String dt = sdf.format(jDateChooser1.getDate());
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                Statement stmt = con.createStatement();
                stmt.executeUpdate("insert into feestructure values(" + jTextField1.getText() + ",'" + jTextField2.getText() + "','" + jTextField3.getText() + "','" + jTextField4.getText() + "','" + jTextField5.getText() + "','" + jTextField6.getText() + "','" + jTextField7.getText() + "','" + dt + "','" + jTextField8.getText() + "','" + jTextField9.getText() + "','" + jTextField10.getText() + "','" + jTextField11.getText() + "','" + jTextField12.getText() + "')");

                con.close();
                JOptionPane.showMessageDialog(null, "1 Record  Sucessfully Inserted");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Something Went Wrong");
            }
        }

    }//GEN-LAST:event_jInsertActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty() || jTextField6.getText().isEmpty() || jTextField7.getText().isEmpty() || jTextField8.getText().isEmpty() || jTextField9.getText().isEmpty() || jTextField10.getText().isEmpty() || jTextField11.getText().isEmpty() || jTextField12.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "TextBoxes Are Empty");
        } else {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
                String dt = sdf.format(jDateChooser1.getDate());
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                Statement stmt = con.createStatement();
                stmt.executeUpdate("update feestructure set Date='" + dt + "',Total_Fees=" + jTextField8.getText() + ",First_Installment=" + jTextField9.getText() + ",Second_Installment=" + jTextField10.getText() + ",Third_Installment=" + jTextField11.getText() + ",Balance=" + jTextField12.getText() + " where Student_Id=" + jTextField1.getText() + "");
                con.close();
                JOptionPane.showMessageDialog(null, "1 Record Successfully Updated");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Record Not Updated");
            }
        }

    }//GEN-LAST:event_jUpdateActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // TODO add your handling code here:
        if (jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Student Id");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentfees", "root", "");
                Statement stmt = con.createStatement();
                stmt.executeUpdate("Delete from feestructure where Student_Id=" + jTextField1.getText() + "");
                stmt.executeUpdate("Delete from studentinfo where Student_Id=" + jTextField1.getText() + "");
                con.close();
                JOptionPane.showMessageDialog(null, "1 Record Successfully Deleted");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Record not Delete");
            }
        }

    }//GEN-LAST:event_jDeleteActionPerformed

    private void jInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jInvoiceActionPerformed
        // TODO add your handling code here:
        area.setText("******************************************************\n");
        area.setText(area.getText() + "*                                STUDENT FEES RECIPET                            *\n");
        area.setText(area.getText() + "******************************************************\n");
        Date obj = new Date();
        String date = obj.toString();
        area.setText(area.getText() + "\t\t           " + date + "\n\n");
        area.setText(area.getText() + "Student Id :                              " + jTextField1.getText() + "\n\n");
        area.setText(area.getText() + "Student Name :                         " + jTextField2.getText() + " " + jTextField3.getText() + " " + jTextField4.getText() + "\n\n");
        area.setText(area.getText() + "Mobile No :                                " + jTextField5.getText() + "\n\n");
        area.setText(area.getText() + "Course :                                    " + jTextField6.getText() + "\n\n");
        area.setText(area.getText() + "Batch Timing :                           " + jTextField7.getText() + "\n\n");
        area.setText(area.getText() + "Admission Date :                       " + jDateChooser1.getDate() + "\n\n\n");
        area.setText(area.getText() + "Total Fees :                               " + jTextField8.getText() + "\n\n");
        area.setText(area.getText() + "First Installment :                      " + jTextField9.getText() + "\n\n");
        area.setText(area.getText() + "Second Installment :                  " + jTextField10.getText() + "\n\n");
        area.setText(area.getText() + "Third Installment :                     " + jTextField11.getText() + "\n\n");
        area.setText(area.getText() + "-------------------------------------------------------------------------------------\n");
        area.setText(area.getText() + "Balance :                                   " + jTextField12.getText() + "\n\n\n");
        area.setText(area.getText() + "                                                                                    Signature");
    }//GEN-LAST:event_jInvoiceActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton jClose;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JButton jDelete;
    private javax.swing.JButton jFilldata;
    private javax.swing.JButton jInsert;
    private javax.swing.JButton jInvoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JButton jPrint;
    private javax.swing.JButton jReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSearch;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jUpdate;
    // End of variables declaration//GEN-END:variables
}
