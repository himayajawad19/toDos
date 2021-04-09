/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todolist;

import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Locale;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.sql.*;

/**
 *
 * @author lenovo
 */
public class desBox extends javax.swing.JFrame {

    Timer updateTimer;
    int DELAY = 100;

    public desBox(String title) {
        initComponents();
        setSize(600, 475);
        setLocation(400, 150);
        color.setVisible(false);
        System.out.println(title);

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

        try {

            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
            Statement stmt = con.createStatement();

            String q = "select * from theme;";
            ResultSet rs2 = stmt.executeQuery(q);
            if (rs2.next()) {
                String themeColor = rs2.getString(1);

                if ("Default".equals(themeColor)) {
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
                }

                if ("Dark Theme".equals(themeColor)) {
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
                }

                if ("Moody Blue".equals(themeColor)) {
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
                }

                if ("Moody Pink".equals(themeColor)) {
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
            }

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
        jTime = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
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
        jMenu8 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem12 = new javax.swing.JMenuItem();

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
        jLabel2.setBounds(44, 88, 65, 32);

        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("DESCRIPTION");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(44, 162, 100, 16);

        jLabel4.setForeground(new java.awt.Color(204, 204, 0));
        jLabel4.setText("DUE TIME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(47, 286, 60, 16);

        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setText("DUE DATE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(47, 352, 70, 16);

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
        jScrollPane1.setBounds(201, 162, 334, 83);

        j3.setForeground(new java.awt.Color(204, 204, 0));
        j3.setText("YOUR TASK DUE DATE");
        getContentPane().add(j3);
        j3.setBounds(201, 340, 230, 24);

        j2.setForeground(new java.awt.Color(204, 204, 0));
        j2.setText("YOUR TASK DUE TIME");
        getContentPane().add(j2);
        j2.setBounds(201, 282, 230, 24);

        jb1.setText("Go Back");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb1);
        jb1.setBounds(440, 340, 77, 40);

        color.setEditable(false);
        color.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(color);
        color.setBounds(440, 270, 80, 50);

        jTime.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTime.setForeground(new java.awt.Color(255, 255, 255));
        jTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTime.setText("00:00:00");
        getContentPane().add(jTime);
        jTime.setBounds(320, 100, 120, 40);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg"))); // NOI18N
        img.setText("jLabel2");
        getContentPane().add(img);
        img.setBounds(0, -20, 600, 450);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
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

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
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

        jMenu8.setText("About");

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setText("About The Software Version");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem10);
        jMenu8.add(jSeparator8);

        jMenu9.setText("Help");

        jMenuItem11.setText("How To Use?");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem11);
        jMenu9.add(jSeparator10);

        jMenuItem12.setText("How To Add or Delete Tasks?");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem12);

        jMenu8.add(jMenu9);

        jMenuBar1.add(jMenu8);

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
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
            Statement stmt = con.createStatement();

            String q = "select * from theme;";
            ResultSet rs1 = stmt.executeQuery(q);
            if (rs1.next()) {
                String themeColor = rs1.getString(1);

                if ("Default".equals(themeColor)) {
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
                }

                if ("Dark Theme".equals(themeColor)) {
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
                }

                if ("Moody Blue".equals(themeColor)) {
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
                }

                if ("Moody Pink".equals(themeColor)) {
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
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
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
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
            Statement stmt = con.createStatement();

            String q1 = "update theme set themes='Default';";
            int rs1 = stmt.executeUpdate(q1);
            if (rs1 == 1) {
                JOptionPane.showMessageDialog(null, "Theme Updated successfully");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
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
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
            Statement stmt = con.createStatement();

            String q = "select * from theme;";
            ResultSet rs1 = stmt.executeQuery(q);
            if (rs1.next()) {
                String themeColor = rs1.getString(1);

                if ("Default".equals(themeColor)) {
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
                }

                if ("Dark Theme".equals(themeColor)) {
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
                }

                if ("Moody Blue".equals(themeColor)) {
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
                }

                if ("Moody Pink".equals(themeColor)) {
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
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
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
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
            Statement stmt = con.createStatement();

            String q1 = "update theme set themes='Dark Theme';";
            int rs1 = stmt.executeUpdate(q1);
            if (rs1 == 1) {
                JOptionPane.showMessageDialog(null, "Theme Updated successfully");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
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
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
            Statement stmt = con.createStatement();

            String q = "select * from theme;";
            ResultSet rs1 = stmt.executeQuery(q);
            if (rs1.next()) {
                String themeColor = rs1.getString(1);

                if ("Default".equals(themeColor)) {
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
                }

                if ("Dark Theme".equals(themeColor)) {
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
                }

                if ("Moody Blue".equals(themeColor)) {
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
                }

                if ("Moody Pink".equals(themeColor)) {
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
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
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
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
            Statement stmt = con.createStatement();

            String q1 = "update theme set themes='Moody Blue';";
            int rs1 = stmt.executeUpdate(q1);
            if (rs1 == 1) {
                JOptionPane.showMessageDialog(null, "Theme Updated successfully");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
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
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
            Statement stmt = con.createStatement();

            String q = "select * from theme;";
            ResultSet rs1 = stmt.executeQuery(q);
            if (rs1.next()) {
                String themeColor = rs1.getString(1);

                if ("Default".equals(themeColor)) {
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
                }

                if ("Dark Theme".equals(themeColor)) {
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
                }

                if ("Moody Blue".equals(themeColor)) {
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
                }

                if ("Moody Pink".equals(themeColor)) {
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
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
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
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
            Statement stmt = con.createStatement();

            String q1 = "update theme set themes='Moody Pink';";
            int rs1 = stmt.executeUpdate(q1);
            if (rs1 == 1) {
                JOptionPane.showMessageDialog(null, "Theme Updated successfully");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to close TO-DO List ?", "Quit To-Do Task", JOptionPane.YES_NO_OPTION);

        if (a == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(ToDo.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://dheerajgogoi.github.io/todolist/aboutsoftware.html");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://dheerajgogoi.github.io/todolist/howtouse.html");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }       // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://dheerajgogoi.github.io/todolist/howtouse.html");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

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
                new desBox().setVisible(true);
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JLabel jTime;
    private javax.swing.JButton jb1;
    private javax.swing.JTextArea txtDes;
    // End of variables declaration//GEN-END:variables
}
