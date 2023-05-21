package todolist;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
//import sun.audio.AudioPlayer;
//import sun.audio.AudioStream;

public class ToDo extends javax.swing.JFrame {

    Timer updateTimer;
    int DELAY = 100;
    DefaultTableModel model;

    public ToDo() {
        initComponents();
        model = (DefaultTableModel) table.getModel();
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
            jd.setBackground(new java.awt.Color(0, 51, 51));
            jd.setForeground(Color.white);
            table.setBackground(new java.awt.Color(255, 255, 255));
            table.setForeground(Color.BLACK);
            jButton1.setBackground(new java.awt.Color(0, 51, 51));
            jButton1.setForeground(Color.white);

        } else if ("Dark Theme".equals(jMenuItem6.getText())) {
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
        } else if ("Moody Blue".equals(jMenuItem7.getText())) {
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
        } else if ("Moody Pink".equals(jMenuItem8.getText())) {
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
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
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
                "TASKS", "DUE TIME", "DUE DATE", "STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoscrolls(false);
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

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Add New Task");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator2);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Delete Task");
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
        if (table.getSelectedRow() != -1) {
            int row = table.getSelectedRow();

            String filePath = "Files/ToDos.txt"; // Replace with the actual file path
            String lineToDelete = table.getModel().getValueAt(row, 0).toString();; // Line to search and delete
            System.out.println(lineToDelete);
            try {
                File inputFile = new File(filePath);
                File tempFile = new File("Files/temp.txt"); // Temporary file to write updated content

                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

                String currentLine;
                boolean found = false;

                // Copy content to temporary file excluding the line to delete
                while ((currentLine = reader.readLine()) != null) {
                    if (currentLine.contains(lineToDelete)) {
                        found = true;
                        continue; // Skip this line and don't write it to the temporary file
                    }

                    writer.write(currentLine);
                    writer.newLine();
                }

                writer.close();
                reader.close();

                // Delete the original file
                inputFile.delete();

                // Rename the temporary file to the original file name
                tempFile.renameTo(inputFile);

                if (found) {
                    System.out.println("Line deleted successfully.");
                    int modelRow = table.convertRowIndexToModel(table.getSelectedRow());
                    model.removeRow(modelRow);
                    TableRowSorter<DefaultTableModel> t4 = new TableRowSorter<>(model);
                    table.setRowSorter(t4);
                    t4.setRowFilter(null);
                } else {
                    System.out.println("Line not found in the file.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jdActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed

        String filePath = "Files/ToDos.txt";
        int row = table.getSelectedRow();
        String cell = table.getModel().getValueAt(row, 0).toString();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            int lineNumber = 1;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains(cell)) {
                    System.out.println("Found at line " + lineNumber + ": " + line);
                    found = true;
                    String[] data = line.split(",");
                    for (String val : data) {
                        System.out.println(val);
                    }
                    desBox d1 = new desBox(data);
                    this.setVisible(false);
                    d1.setVisible(true);
                }
                lineNumber++;
            }

            if (!found) {
                System.out.println("Data not found in the file.");
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
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
        if ("Default".equals(jMenuItem5.getText())) {
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

        if ("Dark Theme".equals(jMenuItem6.getText())) {
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

        if ("Moody Blue".equals(jMenuItem7.getText())) {
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

        if ("Moody Pink".equals(jMenuItem8.getText())) {
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
        if ("Default".equals(jMenuItem5.getText())) {
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

        if ("Dark Theme".equals(jMenuItem6.getText())) {
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

        if ("Moody Blue".equals(jMenuItem7.getText())) {
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

        if ("Moody Pink".equals(jMenuItem8.getText())) {
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
    }//GEN-LAST:event_jMenuItem6MouseExited

    private void jMenuItem7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseExited
        if ("Default".equals(jMenuItem5.getText())) {
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

        if ("Dark Theme".equals(jMenuItem6.getText())) {
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

        if ("Moody Blue".equals(jMenuItem7.getText())) {
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

        if ("Moody Pink".equals(jMenuItem8.getText())) {
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
    }//GEN-LAST:event_jMenuItem7MouseExited

    private void jMenuItem8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseExited
        if ("Default".equals(jMenuItem5.getText())) {
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

        if ("Dark Theme".equals(jMenuItem6.getText())) {
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

        if ("Moody Blue".equals(jMenuItem7.getText())) {
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

        if ("Moody Pink".equals(jMenuItem8.getText())) {
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

        DefaultTableModel model = new DefaultTableModel(new String[]{"TASKS", "DUE TIME", "DUE DATE", "STATUS"}, 0);
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (model.getRowCount() <= 0) {
            try {
                File myObj = new File("Files/ToDos.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }

                try ( Scanner myReader = new Scanner(myObj)) {
                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        model.insertRow(model.getRowCount(), new Object[]{data.split(",")[0], data.split(",")[2], data.split(",")[3], data.split(",")[4]});
                    }
                    TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
                    table.setRowSorter(sorter);

                    // Set the custom Comparator for the "Status" column
                    Comparator<String> statusComparator = (s1, s2) -> {
                        if (s1.contains("Complete") && !s2.contains("Complete")) {
                            return -1; // s1 comes before s2
                        } else if (!s1.contains("Complete") && s2.contains("Complete")) {
                            return 1; // s2 comes before s1
                        } else {
                            return 0; // s1 and s2 are equal
                        }
                    };
                    sorter.setComparator(3, statusComparator); // Column index of "Status" column

                    // Sort the table based on the "Status" column in ascending order
                    sorter.setSortKeys(List.of(new RowSorter.SortKey(3, SortOrder.DESCENDING)));
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
            }
        }


    }//GEN-LAST:event_formWindowActivated

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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
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
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jTime;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jd;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
