/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lenovo
 */
public class desBox extends javax.swing.JFrame {

    Timer updateTimer;
    int DELAY = 100;

    public desBox(String[] data) {
        initComponents();
        setSize(600, 475);
        setLocation(400, 150);
        color.setVisible(false);
        statusBox.removeAllItems();

        statusBox.addItem("Incomplete");
        statusBox.addItem("Complete");
        updateTimer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date currentTime = new Date();

                String formatTimeStr = "kk:mm";
                DateFormat formatTime = new SimpleDateFormat(formatTimeStr);
                String formattedTimeStr = formatTime.format(currentTime);

                jTime.setText(formattedTimeStr);
            }
        });

        updateTimer.start();
        if ("Default".equals(jMenuItem5.getText())) {
            color.setBackground(new java.awt.Color(255, 255, 255));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
            jPanel1.setBackground(new java.awt.Color(0, 51, 51));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 51, 51));
            jb1.setForeground(Color.white);
            jLabel2.setForeground(Color.YELLOW);
            jLabel3.setForeground(Color.YELLOW);
            jLabel4.setForeground(Color.YELLOW);
            jLabel5.setForeground(Color.YELLOW);
            j1.setForeground(Color.YELLOW);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.YELLOW);
            j2.setForeground(Color.YELLOW);
        } else if ("Dark Theme".equals(jMenuItem6.getText())) {
            color.setBackground(new java.awt.Color(0, 0, 0));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
            jPanel1.setBackground(new java.awt.Color(0, 0, 0));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 0, 0));
            jb1.setForeground(Color.white);
            jLabel2.setForeground(Color.RED);
            jLabel3.setForeground(Color.RED);
            jLabel4.setForeground(Color.RED);
            jLabel5.setForeground(Color.RED);
            j1.setForeground(Color.RED);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.RED);
            j2.setForeground(Color.RED);
        } else if ("Moody Blue".equals(jMenuItem7.getText())) {
            color.setBackground(new java.awt.Color(0, 153, 153));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
            jPanel1.setBackground(new java.awt.Color(0, 153, 153));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 153, 153));
            jb1.setForeground(Color.BLACK);
            jLabel2.setForeground(Color.WHITE);
            jLabel3.setForeground(Color.WHITE);
            jLabel4.setForeground(Color.WHITE);
            jLabel5.setForeground(Color.WHITE);
            j1.setForeground(Color.WHITE);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.WHITE);
            j2.setForeground(Color.WHITE);
        } else if ("Moody Pink".equals(jMenuItem8.getText())) {
            color.setBackground(new java.awt.Color(255, 0, 255));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
            jLabel2.setForeground(Color.red);
            jLabel3.setForeground(Color.red);
            jLabel4.setForeground(Color.red);
            jLabel5.setForeground(Color.red);
            j1.setForeground(Color.red);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.red);
            j2.setForeground(Color.red);
            jPanel1.setBackground(new java.awt.Color(255, 102, 255));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(255, 102, 255));
            jb1.setForeground(Color.black);
        }

        System.out.println(data[0]);
        j1.setText(data[0]);
        txtDes.setText(data[1]);
        j2.setText(data[2]);
        j3.setText(data[3]);
//                statusBox.

    }

    private desBox() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*desBox(String title) {
        
        try {
            
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
            Statement stmt = con.createStatement();
            
            String q1 = "select * from todo where title = '" + title + "'";
            ResultSet rs1 = stmt.executeQuery(q1);
            
            if (rs1.next()) {
                String a = rs1.getString(1);
                String b = rs1.getString(2);
                String c = rs1.getString(3);
                String d = rs1.getString(4);
                
                j1.setText(a);
                txtDes.setText(b);
                j2.setText(d);
                j3.setText(c);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDes = new javax.swing.JTextArea();
        j3 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        jb1 = new javax.swing.JButton();
        color = new javax.swing.JTextField();
        statusBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jTime = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("MORE INFO.");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 70);

        jLabel2.setForeground(new java.awt.Color(204, 204, 0));
        jLabel2.setText("TITLE/TASK");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(44, 88, 60, 32);

        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("DESCRIPTION");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(44, 162, 100, 16);

        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("DUE TIME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 280, 60, 16);

        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("DUE DATE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 320, 70, 16);

        j1.setForeground(new java.awt.Color(204, 204, 0));
        j1.setText("YOUR TASK NAME");
        getContentPane().add(j1);
        j1.setBounds(200, 90, 334, 30);

        txtDes.setEditable(false);
        txtDes.setBackground(new java.awt.Color(51, 51, 51));
        txtDes.setColumns(20);
        txtDes.setForeground(new java.awt.Color(255, 255, 255));
        txtDes.setRows(5);
        txtDes.setText("YOUR TASK DESCRIPTION");
        txtDes.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(txtDes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(201, 162, 334, 86);

        j3.setForeground(new java.awt.Color(204, 204, 0));
        j3.setText("YOUR TASK DUE DATE");
        getContentPane().add(j3);
        j3.setBounds(200, 310, 230, 24);

        j2.setForeground(new java.awt.Color(204, 204, 0));
        j2.setText("YOUR TASK DUE TIME");
        getContentPane().add(j2);
        j2.setBounds(200, 270, 230, 24);

        jb1.setText("Go Back");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb1);
        jb1.setBounds(500, 350, 75, 40);

        color.setEditable(false);
        color.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(color);
        color.setBounds(440, 270, 80, 50);

        statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        statusBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusBoxActionPerformed(evt);
            }
        });
        getContentPane().add(statusBox);
        statusBox.setBounds(200, 340, 130, 30);

        jLabel6.setForeground(new java.awt.Color(204, 204, 0));
        jLabel6.setText("STATUS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 350, 50, 20);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn);
        updateBtn.setBounds(400, 350, 80, 40);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg"))); // NOI18N
        img.setText("jLabel2");
        getContentPane().add(img);
        img.setBounds(0, -20, 600, 450);

        jTime.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTime.setForeground(new java.awt.Color(255, 255, 255));
        jTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTime.setText("00:00:00");
        getContentPane().add(jTime);
        jTime.setBounds(320, 100, 120, 40);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Add New Task");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem2.setText("Go Back");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator3);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenu3.setText("Change Theme");

        jMenuItem5.setText("Default");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseExited(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);
        jMenu3.add(jSeparator5);

        jMenuItem6.setText("Dark Theme");
        jMenuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem6MouseExited(evt);
            }
        });
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);
        jMenu3.add(jSeparator6);

        jMenuItem7.setText("Moody Blue");
        jMenuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem7MouseExited(evt);
            }
        });
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);
        jMenu3.add(jSeparator7);

        jMenuItem8.setText("Moody Pink");
        jMenuItem8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jMenuItem8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jMenuItem8MouseExited(evt);
            }
        });
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        new ToDo().setVisible(true);
        dispose();
    }//GEN-LAST:event_jb1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new addTask().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new ToDo().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to close TO-DO List ?", "Quit To-Do Task", JOptionPane.YES_NO_OPTION);

        if (a == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseEntered
        color.setBackground(new java.awt.Color(255, 255, 255));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(0, 51, 51));
        jb1.setForeground(Color.white);
        jLabel2.setForeground(Color.YELLOW);
        jLabel3.setForeground(Color.YELLOW);
        jLabel4.setForeground(Color.YELLOW);
        jLabel5.setForeground(Color.YELLOW);
        j1.setForeground(Color.YELLOW);
        txtDes.setForeground(Color.white);
        j3.setForeground(Color.YELLOW);
        j2.setForeground(Color.YELLOW);
    }//GEN-LAST:event_jMenuItem5MouseEntered

    private void jMenuItem5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseExited
        if ("Default".equals(jMenuItem5.getText())) {
            color.setBackground(new java.awt.Color(255, 255, 255));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
            jPanel1.setBackground(new java.awt.Color(0, 51, 51));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 51, 51));
            jb1.setForeground(Color.white);
            jLabel2.setForeground(Color.YELLOW);
            jLabel3.setForeground(Color.YELLOW);
            jLabel4.setForeground(Color.YELLOW);
            jLabel5.setForeground(Color.YELLOW);
            j1.setForeground(Color.YELLOW);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.YELLOW);
            j2.setForeground(Color.YELLOW);
        } else if ("Dark Theme".equals(jMenuItem6.getText())) {
            color.setBackground(new java.awt.Color(0, 0, 0));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
            jPanel1.setBackground(new java.awt.Color(0, 0, 0));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 0, 0));
            jb1.setForeground(Color.white);
            jLabel2.setForeground(Color.RED);
            jLabel3.setForeground(Color.RED);
            jLabel4.setForeground(Color.RED);
            jLabel5.setForeground(Color.RED);
            j1.setForeground(Color.RED);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.RED);
            j2.setForeground(Color.RED);
        } else if ("Moody Blue".equals(jMenuItem7.getText())) {
            color.setBackground(new java.awt.Color(0, 153, 153));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
            jPanel1.setBackground(new java.awt.Color(0, 153, 153));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 153, 153));
            jb1.setForeground(Color.BLACK);
            jLabel2.setForeground(Color.WHITE);
            jLabel3.setForeground(Color.WHITE);
            jLabel4.setForeground(Color.WHITE);
            jLabel5.setForeground(Color.WHITE);
            j1.setForeground(Color.WHITE);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.WHITE);
            j2.setForeground(Color.WHITE);
        } else if ("Moody Pink".equals(jMenuItem8.getText())) {
            color.setBackground(new java.awt.Color(255, 0, 255));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
            jLabel2.setForeground(Color.red);
            jLabel3.setForeground(Color.red);
            jLabel4.setForeground(Color.red);
            jLabel5.setForeground(Color.red);
            j1.setForeground(Color.red);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.red);
            j2.setForeground(Color.red);
            jPanel1.setBackground(new java.awt.Color(255, 102, 255));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(255, 102, 255));
            jb1.setForeground(Color.black);
        }
    }//GEN-LAST:event_jMenuItem5MouseExited

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        color.setBackground(new java.awt.Color(255, 255, 255));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(0, 51, 51));
        jb1.setForeground(Color.white);
        jLabel2.setForeground(Color.YELLOW);
        jLabel3.setForeground(Color.YELLOW);
        jLabel4.setForeground(Color.YELLOW);
        jLabel5.setForeground(Color.YELLOW);
        j1.setForeground(Color.YELLOW);
        txtDes.setForeground(Color.white);
        j3.setForeground(Color.YELLOW);
        j2.setForeground(Color.YELLOW);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseEntered
        color.setBackground(new java.awt.Color(0, 0, 0));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(0, 0, 0));
        jb1.setForeground(Color.white);
        jLabel2.setForeground(Color.RED);
        jLabel3.setForeground(Color.RED);
        jLabel4.setForeground(Color.RED);
        jLabel5.setForeground(Color.RED);
        j1.setForeground(Color.RED);
        txtDes.setForeground(Color.white);
        j3.setForeground(Color.RED);
        j2.setForeground(Color.RED);
    }//GEN-LAST:event_jMenuItem6MouseEntered

    private void jMenuItem6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseExited
        if ("Default".equals(jMenuItem5.getText())) {
            color.setBackground(new java.awt.Color(255, 255, 255));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
            jPanel1.setBackground(new java.awt.Color(0, 51, 51));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 51, 51));
            jb1.setForeground(Color.white);
            jLabel2.setForeground(Color.YELLOW);
            jLabel3.setForeground(Color.YELLOW);
            jLabel4.setForeground(Color.YELLOW);
            jLabel5.setForeground(Color.YELLOW);
            j1.setForeground(Color.YELLOW);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.YELLOW);
            j2.setForeground(Color.YELLOW);
        } else if ("Dark Theme".equals(jMenuItem6.getText())) {
            color.setBackground(new java.awt.Color(0, 0, 0));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
            jPanel1.setBackground(new java.awt.Color(0, 0, 0));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 0, 0));
            jb1.setForeground(Color.white);
            jLabel2.setForeground(Color.RED);
            jLabel3.setForeground(Color.RED);
            jLabel4.setForeground(Color.RED);
            jLabel5.setForeground(Color.RED);
            j1.setForeground(Color.RED);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.RED);
            j2.setForeground(Color.RED);
        } else if ("Moody Blue".equals(jMenuItem7.getText())) {
            color.setBackground(new java.awt.Color(0, 153, 153));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
            jPanel1.setBackground(new java.awt.Color(0, 153, 153));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 153, 153));
            jb1.setForeground(Color.BLACK);
            jLabel2.setForeground(Color.WHITE);
            jLabel3.setForeground(Color.WHITE);
            jLabel4.setForeground(Color.WHITE);
            jLabel5.setForeground(Color.WHITE);
            j1.setForeground(Color.WHITE);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.WHITE);
            j2.setForeground(Color.WHITE);
        } else if ("Moody Pink".equals(jMenuItem8.getText())) {
            color.setBackground(new java.awt.Color(255, 0, 255));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
            jLabel2.setForeground(Color.red);
            jLabel3.setForeground(Color.red);
            jLabel4.setForeground(Color.red);
            jLabel5.setForeground(Color.red);
            j1.setForeground(Color.red);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.red);
            j2.setForeground(Color.red);
            jPanel1.setBackground(new java.awt.Color(255, 102, 255));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(255, 102, 255));
            jb1.setForeground(Color.black);
        }
    }//GEN-LAST:event_jMenuItem6MouseExited

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        color.setBackground(new java.awt.Color(0, 0, 0));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(0, 0, 0));
        jb1.setForeground(Color.white);
        jLabel2.setForeground(Color.RED);
        jLabel3.setForeground(Color.RED);
        jLabel4.setForeground(Color.RED);
        jLabel5.setForeground(Color.RED);
        j1.setForeground(Color.RED);
        txtDes.setForeground(Color.white);
        j3.setForeground(Color.RED);
        j2.setForeground(Color.RED);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseEntered
        color.setBackground(new java.awt.Color(0, 153, 153));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(0, 153, 153));
        jb1.setForeground(Color.BLACK);
        jLabel2.setForeground(Color.WHITE);
        jLabel3.setForeground(Color.WHITE);
        jLabel4.setForeground(Color.WHITE);
        jLabel5.setForeground(Color.WHITE);
        j1.setForeground(Color.WHITE);
        txtDes.setForeground(Color.white);
        j3.setForeground(Color.WHITE);
        j2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jMenuItem7MouseEntered

    private void jMenuItem7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseExited
        if ("Default".equals(jMenuItem5.getText())) {
            color.setBackground(new java.awt.Color(255, 255, 255));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
            jPanel1.setBackground(new java.awt.Color(0, 51, 51));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 51, 51));
            jb1.setForeground(Color.white);
            jLabel2.setForeground(Color.YELLOW);
            jLabel3.setForeground(Color.YELLOW);
            jLabel4.setForeground(Color.YELLOW);
            jLabel5.setForeground(Color.YELLOW);
            j1.setForeground(Color.YELLOW);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.YELLOW);
            j2.setForeground(Color.YELLOW);
        } else if ("Dark Theme".equals(jMenuItem6.getText())) {
            color.setBackground(new java.awt.Color(0, 0, 0));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
            jPanel1.setBackground(new java.awt.Color(0, 0, 0));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 0, 0));
            jb1.setForeground(Color.white);
            jLabel2.setForeground(Color.RED);
            jLabel3.setForeground(Color.RED);
            jLabel4.setForeground(Color.RED);
            jLabel5.setForeground(Color.RED);
            j1.setForeground(Color.RED);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.RED);
            j2.setForeground(Color.RED);
        } else if ("Moody Blue".equals(jMenuItem7.getText())) {
            color.setBackground(new java.awt.Color(0, 153, 153));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
            jPanel1.setBackground(new java.awt.Color(0, 153, 153));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 153, 153));
            jb1.setForeground(Color.BLACK);
            jLabel2.setForeground(Color.WHITE);
            jLabel3.setForeground(Color.WHITE);
            jLabel4.setForeground(Color.WHITE);
            jLabel5.setForeground(Color.WHITE);
            j1.setForeground(Color.WHITE);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.WHITE);
            j2.setForeground(Color.WHITE);
        } else if ("Moody Pink".equals(jMenuItem8.getText())) {
            color.setBackground(new java.awt.Color(255, 0, 255));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
            jLabel2.setForeground(Color.red);
            jLabel3.setForeground(Color.red);
            jLabel4.setForeground(Color.red);
            jLabel5.setForeground(Color.red);
            j1.setForeground(Color.red);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.red);
            j2.setForeground(Color.red);
            jPanel1.setBackground(new java.awt.Color(255, 102, 255));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(255, 102, 255));
            jb1.setForeground(Color.black);
        }
    }//GEN-LAST:event_jMenuItem7MouseExited

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        color.setBackground(new java.awt.Color(0, 153, 153));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(0, 153, 153));
        jb1.setForeground(Color.BLACK);
        jLabel2.setForeground(Color.WHITE);
        jLabel3.setForeground(Color.WHITE);
        jLabel4.setForeground(Color.WHITE);
        jLabel5.setForeground(Color.WHITE);
        j1.setForeground(Color.WHITE);
        txtDes.setForeground(Color.white);
        j3.setForeground(Color.WHITE);
        j2.setForeground(Color.WHITE);

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseEntered
        color.setBackground(new java.awt.Color(255, 0, 255));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
        jLabel2.setForeground(Color.red);
        jLabel3.setForeground(Color.red);
        jLabel4.setForeground(Color.red);
        jLabel5.setForeground(Color.red);
        j1.setForeground(Color.red);
        txtDes.setForeground(Color.white);
        j3.setForeground(Color.red);
        j2.setForeground(Color.red);
        jPanel1.setBackground(new java.awt.Color(255, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(255, 102, 255));
        jb1.setForeground(Color.black);
    }//GEN-LAST:event_jMenuItem8MouseEntered

    private void jMenuItem8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseExited
        if ("Default".equals(jMenuItem5.getText())) {
            color.setBackground(new java.awt.Color(255, 255, 255));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
            jPanel1.setBackground(new java.awt.Color(0, 51, 51));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 51, 51));
            jb1.setForeground(Color.white);
            jLabel2.setForeground(Color.YELLOW);
            jLabel3.setForeground(Color.YELLOW);
            jLabel4.setForeground(Color.YELLOW);
            jLabel5.setForeground(Color.YELLOW);
            j1.setForeground(Color.YELLOW);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.YELLOW);
            j2.setForeground(Color.YELLOW);
        } else if ("Dark Theme".equals(jMenuItem6.getText())) {
            color.setBackground(new java.awt.Color(0, 0, 0));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
            jPanel1.setBackground(new java.awt.Color(0, 0, 0));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 0, 0));
            jb1.setForeground(Color.white);
            jLabel2.setForeground(Color.RED);
            jLabel3.setForeground(Color.RED);
            jLabel4.setForeground(Color.RED);
            jLabel5.setForeground(Color.RED);
            j1.setForeground(Color.RED);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.RED);
            j2.setForeground(Color.RED);
        } else if ("Moody Blue".equals(jMenuItem7.getText())) {
            color.setBackground(new java.awt.Color(0, 153, 153));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
            jPanel1.setBackground(new java.awt.Color(0, 153, 153));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(0, 153, 153));
            jb1.setForeground(Color.BLACK);
            jLabel2.setForeground(Color.WHITE);
            jLabel3.setForeground(Color.WHITE);
            jLabel4.setForeground(Color.WHITE);
            jLabel5.setForeground(Color.WHITE);
            j1.setForeground(Color.WHITE);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.WHITE);
            j2.setForeground(Color.WHITE);
        } else if ("Moody Pink".equals(jMenuItem8.getText())) {
            color.setBackground(new java.awt.Color(255, 0, 255));
            img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
            jLabel2.setForeground(Color.red);
            jLabel3.setForeground(Color.red);
            jLabel4.setForeground(Color.red);
            jLabel5.setForeground(Color.red);
            j1.setForeground(Color.red);
            txtDes.setForeground(Color.white);
            j3.setForeground(Color.red);
            j2.setForeground(Color.red);
            jPanel1.setBackground(new java.awt.Color(255, 102, 255));
            jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
            jLabel1.setForeground(Color.WHITE);
            jb1.setBackground(new java.awt.Color(255, 102, 255));
            jb1.setForeground(Color.black);
        }
    }//GEN-LAST:event_jMenuItem8MouseExited

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        color.setBackground(new java.awt.Color(255, 0, 255));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
        jLabel2.setForeground(Color.red);
        jLabel3.setForeground(Color.red);
        jLabel4.setForeground(Color.red);
        jLabel5.setForeground(Color.red);
        j1.setForeground(Color.red);
        txtDes.setForeground(Color.white);
        j3.setForeground(Color.red);
        j2.setForeground(Color.red);
        jPanel1.setBackground(new java.awt.Color(255, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(255, 102, 255));
        jb1.setForeground(Color.black);

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to close TO-DO List ?", "Quit To-Do Task", JOptionPane.YES_NO_OPTION);

        if (a == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(ToDo.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void statusBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusBoxActionPerformed
//        String selectedValue = (String) statusBox.getSelectedItem();
//        System.out.println(selectedValue);
//        String filePath = "Files/ToDos.txt"; // Replace with the actual file path
//        String searchLine = j1.getText(); // Line to search for
//        int updateIndex = 4; // Index to update in the line
//        String newValue = selectedValue; // New value to replace at the specified index
//
//        try {
//            // Read the contents of the file into a static array
//            String[] lines = new String[100]; // Assuming a maximum of 100 lines
//            BufferedReader reader = new BufferedReader(new FileReader(filePath));
//            String line;
//            int lineNumber = 0;
//            while ((line = reader.readLine()) != null && lineNumber < lines.length) {
//                lines[lineNumber] = line;
//                lineNumber++;
//            }
//            reader.close();
//
//            // Search for the line that matches your criteria
//            for (int i = 0; i < lineNumber; i++) {
//                String currentLine = lines[i];
//                String[] values = currentLine.split(",");
//                if (currentLine.equals(searchLine)) {
//                    // Check if the index is within the range of values
//                    if (updateIndex >= 0 && updateIndex < values.length) {
//                        // Update the value at the desired index
//                        values[updateIndex] = newValue;
//                        // Join the values back into a single line
//                        String updatedLine = String.join(",", values);
//                        // Update the line in the static array
//                        lines[i] = updatedLine;
//                        break; // Exit the loop after updating the line
//                    } else {
//                        System.out.println("Index is out of range.");
//                        return;
//                    }
//                }
//            }
//
//            // Write the modified contents back to the file
//            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
//            for (int i = 0; i < lineNumber; i++) {
//                writer.write(lines[i]);
//                writer.newLine();
//            }
//            writer.close();
//
//            System.out.println("Value updated successfully.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



    }//GEN-LAST:event_statusBoxActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
          String selectedValue = (String) statusBox.getSelectedItem();
        System.out.println(selectedValue);
        String filePath = "Files/ToDos.txt"; // Replace with the actual file path
        String searchLine = j1.getText(); // Line to search for
        int updateIndex = 4; // Index to update in the line
        String newValue = selectedValue; // New value to replace at the specified index

        try {
            // Read the contents of the file into a static array
            String[] lines = new String[100]; // Assuming a maximum of 100 lines
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null && lineNumber < lines.length) {
                lines[lineNumber] = line;
                lineNumber++;
            }
            reader.close();

            // Search for the line that matches your criteria
            for (int i = 0; i < lineNumber; i++) {
                String currentLine = lines[i];
                
                if (currentLine.contains(searchLine)) {
                    String[] values = currentLine.split(",");
                
                    System.out.println(currentLine);
                    // Check if the index is within the range of values
                    if (updateIndex >= 0 && updateIndex < values.length) {
                        // Update the value at the desired index
                        values[updateIndex] = newValue;
                        // Join the values back into a single line
                        String updatedLine = String.join(",", values);
                        // Update the line in the static array
                        lines[i] = updatedLine;
                        break; // Exit the loop after updating the line
                    } else {
                        System.out.println("Index is out of range.");
                        return;
                    }
                }
            }

            // Write the modified contents back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            for (int i = 0; i < lineNumber; i++) {
                writer.write(lines[i]);
                writer.newLine();
            }
            writer.close();

            System.out.println("Value updated successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_updateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(desBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(desBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(desBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(desBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String[] dummy_data = new String[]{"", "", "", ""};
                new desBox(dummy_data).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField color;
    private javax.swing.JLabel img;
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JLabel jTime;
    private javax.swing.JButton jb1;
    private javax.swing.JComboBox<String> statusBox;
    private javax.swing.JTextArea txtDes;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
