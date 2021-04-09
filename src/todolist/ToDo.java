package todolist;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.net.URI;
import javax.swing.text.SimpleAttributeSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import todolist.addTask;

public class ToDo extends javax.swing.JFrame {

    Timer updateTimer;
    int DELAY = 100;

    public ToDo() {
        initComponents();
        setResizable(false);
        setSize(635, 500);
        setLocation(400, 150);
        color.setVisible(false);

        updateTimer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date currentTime = new Date();

                String formatTimeStr = "kk:mm";
                DateFormat formatTime = new SimpleDateFormat(formatTimeStr);
                String formattedTimeStr = formatTime.format(currentTime);

                Date currentDate = new Date();
                String formatDateStr = "dd-MM-yyyy";
                DateFormat formatDate = new SimpleDateFormat(formatDateStr);
                String formattedDateStr = formatDate.format(currentDate);
                System.out.println(formattedDateStr);

                jTime.setText(formattedTimeStr);

                try {
                    Class.forName("java.sql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
                    Statement stmt = con.createStatement();
                    String query = "select * from todo where time = '" + formattedTimeStr + "' and date = '"+formattedDateStr+"';";
                    ResultSet rset = stmt.executeQuery(query);
                    
                    String q2 = "select * from todo where time = '" + formattedTimeStr + "';";
                    ResultSet rs2 = stmt.executeQuery(q2);
                    if (rs2.next()) {
                        System.out.println("Working");
                        String value = rs2.getString(4);
                        String titlename = rs2.getString(1);
                        //System.out.println(titlename);
                        System.out.println(value);
                        //String set = t.substring(0, 5);
                        if (value.equals(formattedTimeStr)) {
                            InputStream in;
                            try {
                                in = new FileInputStream(new File("src\\wav\\new-morning-alarm.wav"));
                                AudioStream ad = new AudioStream(in);
                                AudioPlayer.player.start(ad);
                                JOptionPane.showMessageDialog(null, "It's Time " + titlename);
                                AudioPlayer.player.stop(ad);
                                System.exit(0);
                                //String q3 = "update todo set time = 'Time Passed' where time='"+value+"';";
                                //int rs3 = stmt.executeUpdate(q3);
                            } catch (Exception ex) {
                            }
                        }
                    }
                } catch (Exception exec) {
                }

            }
        });

        updateTimer.start();

        try {
            DefaultTableModel model = new DefaultTableModel(new String[]{"TASKS", "DUE TIME", "DUE DATE"}, 0);

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
                    jd.setBackground(new java.awt.Color(0, 51, 51));
                    jd.setForeground(Color.white);
                    table.setBackground(new java.awt.Color(255, 255, 255));
                    table.setForeground(Color.BLACK);
                    jButton1.setBackground(new java.awt.Color(0, 51, 51));
                    jButton1.setForeground(Color.white);

                }

                if ("Dark Theme".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(0, 0, 0));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
                    jPanel1.setBackground(new java.awt.Color(0, 0, 0));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(0, 0, 0));
                    jb1.setForeground(Color.white);
                    jd.setBackground(new java.awt.Color(0, 0, 0));
                    jd.setForeground(Color.white);
                    table.setBackground(new java.awt.Color(102, 102, 102));
                    table.setForeground(Color.WHITE);
                    jButton1.setBackground(new java.awt.Color(0, 0, 0));
                    jButton1.setForeground(Color.white);
                }

                if ("Moody Blue".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(0, 153, 153));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
                    jPanel1.setBackground(new java.awt.Color(0, 153, 153));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(0, 153, 153));
                    jb1.setForeground(Color.BLACK);
                    jd.setBackground(new java.awt.Color(0, 153, 153));
                    jd.setForeground(Color.BLACK);
                    table.setBackground(Color.CYAN);
                    table.setForeground(Color.BLACK);
                    jButton1.setBackground(new java.awt.Color(0, 153, 153));
                    jButton1.setForeground(Color.BLACK);
                }

                if ("Moody Pink".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(255, 0, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
                    jPanel1.setBackground(new java.awt.Color(255, 102, 255));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(255, 102, 255));
                    jb1.setForeground(Color.black);
                    jd.setBackground(new java.awt.Color(255, 102, 255));
                    jd.setForeground(Color.black);
                    table.setBackground(new java.awt.Color(255, 153, 255));
                    table.setForeground(Color.red);
                    jButton1.setBackground(new java.awt.Color(255, 102, 255));
                    jButton1.setForeground(Color.BLACK);
                }
            }

            String q1 = "select * from todo";
            ResultSet rs = stmt.executeQuery(q1);
            while (rs.next()) {
                String a = rs.getString("title");
                String b = rs.getString("date");
                String c = rs.getString("time");
                model.addRow(new Object[]{a, c, b});
            }
            table.setModel(model);
            //Alarm Clock

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jd = new javax.swing.JButton();
        jb1 = new javax.swing.JButton();
        color = new javax.swing.JTextField();
        jTime = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
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

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("TO-DO TASKS");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 70);

        jButton1.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        jButton1.setText("ADD TASK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 100, 90, 50);

        table.setBackground(new java.awt.Color(255, 153, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TASKS", "DUE TIME", "DUE DATE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoscrolls(false);
        table.setColumnSelectionAllowed(true);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tableMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(300);
            table.getColumnModel().getColumn(0).setPreferredWidth(300);
            table.getColumnModel().getColumn(0).setMaxWidth(300);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 190, 610, 130);

        jd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/recycle-bin - Copy.png"))); // NOI18N
        jd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdActionPerformed(evt);
            }
        });
        getContentPane().add(jd);
        jd.setBounds(40, 100, 50, 50);

        jb1.setBackground(new java.awt.Color(0, 51, 51));
        jb1.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        jb1.setForeground(new java.awt.Color(255, 255, 255));
        jb1.setText("SHOW MORE INFO");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb1);
        jb1.setBounds(250, 360, 150, 40);

        color.setEditable(false);
        color.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(color);
        color.setBounds(510, 360, 80, 50);

        jTime.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTime.setForeground(new java.awt.Color(255, 255, 255));
        jTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTime.setText("00:00:00");
        getContentPane().add(jTime);
        jTime.setBounds(270, 100, 120, 40);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg"))); // NOI18N
        img.setText("jLabel2");
        getContentPane().add(img);
        img.setBounds(0, -20, 640, 500);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Add New Task");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator2);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Delete Task");
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem6MouseClicked(evt);
            }
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
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new addTask().setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseEntered

    }//GEN-LAST:event_tableMouseEntered

    private void jdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdActionPerformed
        int ok = 0;
        int remove = 0;
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
            Statement stmt = con.createStatement();

            int row = table.getSelectedRow();
            String cell = table.getModel().getValueAt(row, 0).toString();
            String q1 = "delete from todo where title = '" + cell + "'";
            int rs1 = stmt.executeUpdate(q1);

            DefaultTableModel model = new DefaultTableModel(new String[]{"TASKS", "DUE TIME", "DUE DATE"}, 0);

            String q2 = "select * from todo";
            ResultSet rs2 = stmt.executeQuery(q2);
            while (rs2.next()) {
                String a = rs2.getString("title");
                String b = rs2.getString("date");
                String c = rs2.getString("time");
                model.addRow(new Object[]{a, c, b});
            }
            table.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Select a Record or add a new task to the table, if empty");
            remove = 1;
        }
        if (remove == 0) {
            JOptionPane.showMessageDialog(null, "Task Successfully removed");
        }
    }//GEN-LAST:event_jdActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
            Statement stmt = con.createStatement();

            int row = table.getSelectedRow();
            String cell = table.getModel().getValueAt(row, 0).toString();
            String q1 = "select * from todo where title = '" + cell + "'";
            ResultSet rs1 = stmt.executeQuery(q1);
            if (rs1.next()) {
                String addDesc = rs1.getString(1);
                System.out.println(addDesc);

                new desBox(addDesc).setVisible(true);
                dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Select a Record or add a new task to the table, if empty");
        }
    }//GEN-LAST:event_jb1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        color.setBackground(new java.awt.Color(255, 255, 255));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(0, 51, 51));
        jb1.setForeground(Color.white);
        jd.setBackground(new java.awt.Color(0, 51, 51));
        jd.setForeground(Color.white);
        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setForeground(Color.BLACK);
        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setForeground(Color.white);
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

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        color.setBackground(new java.awt.Color(0, 0, 0));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(0, 0, 0));
        jb1.setForeground(Color.white);
        jd.setBackground(new java.awt.Color(0, 0, 0));
        jd.setForeground(Color.white);
        table.setBackground(new java.awt.Color(102, 102, 102));
        table.setForeground(Color.WHITE);
        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(Color.white);
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

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        color.setBackground(new java.awt.Color(0, 153, 153));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(0, 153, 153));
        jb1.setForeground(Color.BLACK);
        jd.setBackground(new java.awt.Color(0, 153, 153));
        jd.setForeground(Color.BLACK);
        table.setBackground(Color.CYAN);
        table.setForeground(Color.BLACK);
        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(Color.BLACK);
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

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        color.setBackground(new java.awt.Color(255, 0, 255));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
        jPanel1.setBackground(new java.awt.Color(255, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(255, 102, 255));
        jb1.setForeground(Color.black);
        jd.setBackground(new java.awt.Color(255, 102, 255));
        jd.setForeground(Color.black);
        table.setBackground(new java.awt.Color(255, 153, 255));
        table.setForeground(Color.red);
        jButton1.setBackground(new java.awt.Color(255, 102, 255));
        jButton1.setForeground(Color.BLACK);
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

    private void jMenuItem5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseEntered
        color.setBackground(new java.awt.Color(255, 255, 255));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(0, 51, 51));
        jb1.setForeground(Color.white);
        jd.setBackground(new java.awt.Color(0, 51, 51));
        jd.setForeground(Color.white);
        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setForeground(Color.BLACK);
        jButton1.setBackground(new java.awt.Color(0, 51, 51));
        jButton1.setForeground(Color.white);
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
                    jd.setBackground(new java.awt.Color(0, 51, 51));
                    jd.setForeground(Color.white);
                    table.setBackground(new java.awt.Color(255, 255, 255));
                    table.setForeground(Color.BLACK);
                    jButton1.setBackground(new java.awt.Color(0, 51, 51));
                    jButton1.setForeground(Color.white);

                }

                if ("Dark Theme".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(0, 0, 0));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
                    jPanel1.setBackground(new java.awt.Color(0, 0, 0));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(0, 0, 0));
                    jb1.setForeground(Color.white);
                    jd.setBackground(new java.awt.Color(0, 0, 0));
                    jd.setForeground(Color.white);
                    table.setBackground(new java.awt.Color(102, 102, 102));
                    table.setForeground(Color.WHITE);
                    jButton1.setBackground(new java.awt.Color(0, 0, 0));
                    jButton1.setForeground(Color.white);
                }

                if ("Moody Blue".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(0, 153, 153));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
                    jPanel1.setBackground(new java.awt.Color(0, 153, 153));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(0, 153, 153));
                    jb1.setForeground(Color.BLACK);
                    jd.setBackground(new java.awt.Color(0, 153, 153));
                    jd.setForeground(Color.BLACK);
                    table.setBackground(Color.CYAN);
                    table.setForeground(Color.BLACK);
                    jButton1.setBackground(new java.awt.Color(0, 153, 153));
                    jButton1.setForeground(Color.BLACK);
                }

                if ("Moody Pink".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(255, 0, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
                    jPanel1.setBackground(new java.awt.Color(255, 102, 255));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(255, 102, 255));
                    jb1.setForeground(Color.black);
                    jd.setBackground(new java.awt.Color(255, 102, 255));
                    jd.setForeground(Color.black);
                    table.setBackground(new java.awt.Color(255, 153, 255));
                    table.setForeground(Color.red);
                    jButton1.setBackground(new java.awt.Color(255, 102, 255));
                    jButton1.setForeground(Color.BLACK);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem5MouseExited

    private void jMenuItem6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseEntered
        color.setBackground(new java.awt.Color(0, 0, 0));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(0, 0, 0));
        jb1.setForeground(Color.white);
        jd.setBackground(new java.awt.Color(0, 0, 0));
        jd.setForeground(Color.white);
        table.setBackground(new java.awt.Color(102, 102, 102));
        table.setForeground(Color.WHITE);
        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(Color.white);
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
                    jd.setBackground(new java.awt.Color(0, 51, 51));
                    jd.setForeground(Color.white);
                    table.setBackground(new java.awt.Color(255, 255, 255));
                    table.setForeground(Color.BLACK);
                    jButton1.setBackground(new java.awt.Color(0, 51, 51));
                    jButton1.setForeground(Color.white);

                }

                if ("Dark Theme".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(0, 0, 0));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
                    jPanel1.setBackground(new java.awt.Color(0, 0, 0));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(0, 0, 0));
                    jb1.setForeground(Color.white);
                    jd.setBackground(new java.awt.Color(0, 0, 0));
                    jd.setForeground(Color.white);
                    table.setBackground(new java.awt.Color(102, 102, 102));
                    table.setForeground(Color.WHITE);
                    jButton1.setBackground(new java.awt.Color(0, 0, 0));
                    jButton1.setForeground(Color.white);
                }

                if ("Moody Blue".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(0, 153, 153));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
                    jPanel1.setBackground(new java.awt.Color(0, 153, 153));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(0, 153, 153));
                    jb1.setForeground(Color.BLACK);
                    jd.setBackground(new java.awt.Color(0, 153, 153));
                    jd.setForeground(Color.BLACK);
                    table.setBackground(Color.CYAN);
                    table.setForeground(Color.BLACK);
                    jButton1.setBackground(new java.awt.Color(0, 153, 153));
                    jButton1.setForeground(Color.BLACK);
                }

                if ("Moody Pink".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(255, 0, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
                    jPanel1.setBackground(new java.awt.Color(255, 102, 255));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(255, 102, 255));
                    jb1.setForeground(Color.black);
                    jd.setBackground(new java.awt.Color(255, 102, 255));
                    jd.setForeground(Color.black);
                    table.setBackground(new java.awt.Color(255, 153, 255));
                    table.setForeground(Color.red);
                    jButton1.setBackground(new java.awt.Color(255, 102, 255));
                    jButton1.setForeground(Color.BLACK);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem6MouseExited

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
                    jd.setBackground(new java.awt.Color(0, 51, 51));
                    jd.setForeground(Color.white);
                    table.setBackground(new java.awt.Color(255, 255, 255));
                    table.setForeground(Color.BLACK);
                    jButton1.setBackground(new java.awt.Color(0, 51, 51));
                    jButton1.setForeground(Color.white);

                }

                if ("Dark Theme".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(0, 0, 0));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
                    jPanel1.setBackground(new java.awt.Color(0, 0, 0));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(0, 0, 0));
                    jb1.setForeground(Color.white);
                    jd.setBackground(new java.awt.Color(0, 0, 0));
                    jd.setForeground(Color.white);
                    table.setBackground(new java.awt.Color(102, 102, 102));
                    table.setForeground(Color.WHITE);
                    jButton1.setBackground(new java.awt.Color(0, 0, 0));
                    jButton1.setForeground(Color.white);
                }

                if ("Moody Blue".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(0, 153, 153));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
                    jPanel1.setBackground(new java.awt.Color(0, 153, 153));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(0, 153, 153));
                    jb1.setForeground(Color.BLACK);
                    jd.setBackground(new java.awt.Color(0, 153, 153));
                    jd.setForeground(Color.BLACK);
                    table.setBackground(Color.CYAN);
                    table.setForeground(Color.BLACK);
                    jButton1.setBackground(new java.awt.Color(0, 153, 153));
                    jButton1.setForeground(Color.BLACK);
                }

                if ("Moody Pink".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(255, 0, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
                    jPanel1.setBackground(new java.awt.Color(255, 102, 255));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(255, 102, 255));
                    jb1.setForeground(Color.black);
                    jd.setBackground(new java.awt.Color(255, 102, 255));
                    jd.setForeground(Color.black);
                    table.setBackground(new java.awt.Color(255, 153, 255));
                    table.setForeground(Color.red);
                    jButton1.setBackground(new java.awt.Color(255, 102, 255));
                    jButton1.setForeground(Color.BLACK);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem7MouseExited

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
                    jd.setBackground(new java.awt.Color(0, 51, 51));
                    jd.setForeground(Color.white);
                    table.setBackground(new java.awt.Color(255, 255, 255));
                    table.setForeground(Color.BLACK);
                    jButton1.setBackground(new java.awt.Color(0, 51, 51));
                    jButton1.setForeground(Color.white);

                }

                if ("Dark Theme".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(0, 0, 0));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
                    jPanel1.setBackground(new java.awt.Color(0, 0, 0));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(0, 0, 0));
                    jb1.setForeground(Color.white);
                    jd.setBackground(new java.awt.Color(0, 0, 0));
                    jd.setForeground(Color.white);
                    table.setBackground(new java.awt.Color(102, 102, 102));
                    table.setForeground(Color.WHITE);
                    jButton1.setBackground(new java.awt.Color(0, 0, 0));
                    jButton1.setForeground(Color.white);
                }

                if ("Moody Blue".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(0, 153, 153));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
                    jPanel1.setBackground(new java.awt.Color(0, 153, 153));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(0, 153, 153));
                    jb1.setForeground(Color.BLACK);
                    jd.setBackground(new java.awt.Color(0, 153, 153));
                    jd.setForeground(Color.BLACK);
                    table.setBackground(Color.CYAN);
                    table.setForeground(Color.BLACK);
                    jButton1.setBackground(new java.awt.Color(0, 153, 153));
                    jButton1.setForeground(Color.BLACK);
                }

                if ("Moody Pink".equals(themeColor)) {
                    color.setBackground(new java.awt.Color(255, 0, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
                    jPanel1.setBackground(new java.awt.Color(255, 102, 255));
                    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                    jLabel1.setForeground(Color.WHITE);
                    jb1.setBackground(new java.awt.Color(255, 102, 255));
                    jb1.setForeground(Color.black);
                    jd.setBackground(new java.awt.Color(255, 102, 255));
                    jd.setForeground(Color.black);
                    table.setBackground(new java.awt.Color(255, 153, 255));
                    table.setForeground(Color.red);
                    jButton1.setBackground(new java.awt.Color(255, 102, 255));
                    jButton1.setForeground(Color.BLACK);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem8MouseExited

    private void jMenuItem7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseEntered
        color.setBackground(new java.awt.Color(0, 153, 153));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(0, 153, 153));
        jb1.setForeground(Color.BLACK);
        jd.setBackground(new java.awt.Color(0, 153, 153));
        jd.setForeground(Color.BLACK);
        table.setBackground(Color.CYAN);
        table.setForeground(Color.BLACK);
        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jMenuItem7MouseEntered

    private void jMenuItem8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseEntered
        color.setBackground(new java.awt.Color(255, 0, 255));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
        jPanel1.setBackground(new java.awt.Color(255, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel1.setForeground(Color.WHITE);
        jb1.setBackground(new java.awt.Color(255, 102, 255));
        jb1.setForeground(Color.black);
        jd.setBackground(new java.awt.Color(255, 102, 255));
        jd.setForeground(Color.black);
        table.setBackground(new java.awt.Color(255, 153, 255));
        table.setForeground(Color.red);
        jButton1.setBackground(new java.awt.Color(255, 102, 255));
        jButton1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jMenuItem8MouseEntered

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new addTask().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int ok = 0;
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/todolist", "root", "sql");
            Statement stmt = con.createStatement();

            int row = table.getSelectedRow();
            String cell = table.getModel().getValueAt(row, 0).toString();
            String q1 = "delete from todo where title = '" + cell + "'";
            int rs1 = stmt.executeUpdate(q1);

            DefaultTableModel model = new DefaultTableModel(new String[]{"TASKS", "DUE TIME", "DUE DATE"}, 0);

            String q2 = "select * from todo";
            ResultSet rs2 = stmt.executeQuery(q2);
            while (rs2.next()) {
                String a = rs2.getString("title");
                String b = rs2.getString("date");
                String c = rs2.getString("time");
                model.addRow(new Object[]{a, c, b});
            }
            table.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please Select a Record or add a new task to the table, if empty");
        }
        JOptionPane.showMessageDialog(null, "Task Successfully removed");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to close TO-DO List ?", "Quit To-Do Task", JOptionPane.YES_NO_OPTION);

        if (a == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6MouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int a = JOptionPane.showConfirmDialog(null, "Are you sure you want to close TO-DO List ?", "Quit To-Do Task Manager", JOptionPane.YES_NO_OPTION);

        if (a == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(ToDo.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://dheerajgogoi.github.io/sql12362689/aboutsoftware.html");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://dheerajgogoi.github.io/sql12362689/howtouse.html");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        try {
            Desktop desktop = java.awt.Desktop.getDesktop();
            URI oURL = new URI("https://dheerajgogoi.github.io/sql12362689/howtouse.html");
            desktop.browse(oURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(ToDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToDo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField color;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jTime;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jd;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
