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
import java.io.BufferedWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

/**
 *
 * @author lenovo
 */
public class addTask extends javax.swing.JFrame {

    Timer updateTimer;
    int DELAY = 100;

    public addTask() {
        initComponents();
        setResizable(false);
        setSize(570, 500);
        setLocation(400, 150);
        color.setVisible(false);

        updateTimer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date currentTime = new Date();

                String formatTimeStr = "kk:mm";
                DateFormat formatTime = new SimpleDateFormat(formatTimeStr);
                String formattedTimeStr = formatTime.format(currentTime);

                jTime.setText(formattedTimeStr);
                String t = time1.getText();
            }
        });

        updateTimer.start();

        if ("Default".equals(jMenuItem5.getText())) {
                    color.setBackground(new java.awt.Color(255, 255, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
                    jLabel1.setForeground(Color.YELLOW);
                    advanced.setForeground(Color.YELLOW);
                    setTime.setForeground(Color.YELLOW);
                    setDate.setForeground(Color.YELLOW);
                    des.setForeground(Color.YELLOW);
                    ad.setBackground(new java.awt.Color(0, 51, 51));
                    ad.setForeground(Color.WHITE);
                    r.setBackground(new java.awt.Color(0, 51, 51));
                    r.setForeground(Color.WHITE);
                    b.setBackground(new java.awt.Color(0, 51, 51));
                    b.setForeground(Color.WHITE);
                }

        else if ("Dark Theme".equals(jMenuItem6.getText())) {
                    color.setBackground(new java.awt.Color(0, 0, 0));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
                    jLabel1.setForeground(Color.red);
                    advanced.setForeground(Color.red);
                    setTime.setForeground(Color.red);
                    setDate.setForeground(Color.red);
                    des.setForeground(Color.red);
                    ad.setBackground(new java.awt.Color(0, 0, 0));
                    ad.setForeground(Color.WHITE);
                    r.setBackground(new java.awt.Color(0, 0, 0));
                    r.setForeground(Color.WHITE);
                    b.setBackground(new java.awt.Color(0, 0, 0));
                    b.setForeground(Color.WHITE);
                }

        else if ("Moody Blue".equals(jMenuItem7.getText())) {
                    color.setBackground(new java.awt.Color(0, 153, 153));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
                    jLabel1.setForeground(Color.WHITE);
                    advanced.setForeground(Color.WHITE);
                    setTime.setForeground(Color.WHITE);
                    setDate.setForeground(Color.WHITE);
                    des.setForeground(Color.WHITE);
                    ad.setBackground(new java.awt.Color(0, 153, 153));
                    ad.setForeground(Color.BLACK);
                    r.setBackground(new java.awt.Color(0, 153, 153));
                    r.setForeground(Color.BLACK);
                    b.setBackground(new java.awt.Color(0, 153, 153));
                    b.setForeground(Color.BLACK);
                }

        else if ("Moody Pink".equals(jMenuItem8.getText())) {
                    color.setBackground(new java.awt.Color(255, 0, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
                    jLabel1.setForeground(Color.red);
                    advanced.setForeground(Color.red);
                    setTime.setForeground(Color.red);
                    setDate.setForeground(Color.red);
                    des.setForeground(Color.red);
                    ad.setBackground(new java.awt.Color(255, 102, 255));
                    ad.setForeground(Color.BLACK);
                    r.setBackground(new java.awt.Color(255, 102, 255));
                    r.setForeground(Color.BLACK);
                    b.setBackground(new java.awt.Color(255, 102, 255));
                    b.setForeground(Color.BLACK);
                }
    }
    int n = 1;
    int p = 1;
    int q = 1, go = 1;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDes = new javax.swing.JTextArea();
        advanced = new javax.swing.JCheckBox();
        setTime = new javax.swing.JCheckBox();
        setDate = new javax.swing.JCheckBox();
        txtDate = new com.toedter.calendar.JDateChooser();
        r = new javax.swing.JButton();
        ad = new javax.swing.JButton();
        b = new javax.swing.JButton();
        time1 = new cambodia.raven.Time();
        des = new javax.swing.JCheckBox();
        color = new javax.swing.JTextField();
        jTime = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
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

        jLabel1.setForeground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("TITLE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 30, 40, 16);

        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });
        getContentPane().add(txtTitle);
        txtTitle.setBounds(190, 20, 340, 30);

        txtDes.setColumns(20);
        txtDes.setRows(5);
        txtDes.setEnabled(false);
        txtDes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtDes);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 80, 340, 70);

        advanced.setForeground(new java.awt.Color(204, 204, 0));
        advanced.setText("Use Advanced Settings (Optional)");
        advanced.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                advancedMouseClicked(evt);
            }
        });
        advanced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedActionPerformed(evt);
            }
        });
        getContentPane().add(advanced);
        advanced.setBounds(50, 190, 220, 25);

        setTime.setForeground(new java.awt.Color(204, 204, 0));
        setTime.setText("Set Time");
        setTime.setEnabled(false);
        setTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setTimeMouseClicked(evt);
            }
        });
        getContentPane().add(setTime);
        setTime.setBounds(100, 260, 96, 25);

        setDate.setForeground(new java.awt.Color(204, 204, 0));
        setDate.setText("Set Date");
        setDate.setEnabled(false);
        setDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setDateMouseClicked(evt);
            }
        });
        setDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setDateActionPerformed(evt);
            }
        });
        getContentPane().add(setDate);
        setDate.setBounds(100, 320, 71, 25);

        txtDate.setDateFormatString("dd-MM-yyyy");
        txtDate.setEnabled(false);
        getContentPane().add(txtDate);
        txtDate.setBounds(220, 320, 260, 22);

        r.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        r.setText("RESET");
        r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rActionPerformed(evt);
            }
        });
        getContentPane().add(r);
        r.setBounds(240, 370, 110, 50);

        ad.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        ad.setText("ADD TASK");
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });
        getContentPane().add(ad);
        ad.setBounds(100, 370, 110, 50);

        b.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        b.setText("BACK");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        getContentPane().add(b);
        b.setBounds(390, 370, 67, 50);
        getContentPane().add(time1);
        time1.setBounds(220, 230, 122, 80);

        des.setForeground(new java.awt.Color(204, 204, 0));
        des.setText("DESCRIPTION");
        des.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desMouseClicked(evt);
            }
        });
        des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desActionPerformed(evt);
            }
        });
        getContentPane().add(des);
        des.setBounds(30, 90, 110, 25);

        color.setEditable(false);
        color.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(color);
        color.setBounds(450, 210, 80, 50);

        jTime.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTime.setForeground(new java.awt.Color(255, 255, 255));
        jTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTime.setText("00:00:00");
        getContentPane().add(jTime);
        jTime.setBounds(320, 170, 120, 30);

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg"))); // NOI18N
        img.setText("jLabel2");
        getContentPane().add(img);
        img.setBounds(0, -20, 570, 480);

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

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Reset");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);
        jMenu1.add(jSeparator2);

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
    }// </editor-fold>//GEN-END:initComponents

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        String title = txtTitle.getText().toString();
        String description = "", time = "", date = "";
        int a = 0, b=0, c=0;
        if(des.isSelected()){
            a = 1;
            description = txtDes.getText().toString();
        }
        if(setTime.isSelected()){
            b = 1;
            time = time1.getText().toString();
        }
        if(setDate.isSelected()){
            c = 1;
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
            date = sdf.format(txtDate.getDate());
        }
        
        try {
            File data = new File("Files/ToDos.txt");
            if (!data.exists()) {
                data.createNewFile();
            }

            FileWriter fw = new FileWriter(data.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);


            bw.write(title + ',' + description + ',' + time + ',' + date + ','+"Incomplete");
            bw.write("\n");
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Error in addbutton");
        }

    }//GEN-LAST:event_adActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed

        new ToDo().setVisible(true);
        dispose();

    }//GEN-LAST:event_bActionPerformed

    private void setDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setDateMouseClicked

    }//GEN-LAST:event_setDateMouseClicked

    private void setTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setTimeMouseClicked

    }//GEN-LAST:event_setTimeMouseClicked

    private void advancedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advancedMouseClicked

    }//GEN-LAST:event_advancedMouseClicked

    private void txtDesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDesMouseClicked


    }//GEN-LAST:event_txtDesMouseClicked

    private void desMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desMouseClicked

    }//GEN-LAST:event_desMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new addTask().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Any unsaved or unadded data will be discarded, \n Are you sure you want to close TO-DO List ?", "Quit To-Do Task", JOptionPane.YES_NO_OPTION);

        if (a == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseEntered
        color.setBackground(new java.awt.Color(255, 255, 255));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
        jLabel1.setForeground(Color.YELLOW);
        advanced.setForeground(Color.YELLOW);
        setTime.setForeground(Color.YELLOW);
        setDate.setForeground(Color.YELLOW);
        des.setForeground(Color.YELLOW);
        ad.setBackground(new java.awt.Color(0, 51, 51));
        ad.setForeground(Color.WHITE);
        r.setBackground(new java.awt.Color(0, 51, 51));
        r.setForeground(Color.WHITE);
        b.setBackground(new java.awt.Color(0, 51, 51));
        b.setForeground(Color.WHITE);
    }//GEN-LAST:event_jMenuItem5MouseEntered

    private void jMenuItem5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseExited
        if ("Default".equals(jMenuItem5.getText())) {
                    color.setBackground(new java.awt.Color(255, 255, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
                    jLabel1.setForeground(Color.YELLOW);
                    advanced.setForeground(Color.YELLOW);
                    setTime.setForeground(Color.YELLOW);
                    setDate.setForeground(Color.YELLOW);
                    des.setForeground(Color.YELLOW);
                    ad.setBackground(new java.awt.Color(0, 51, 51));
                    ad.setForeground(Color.WHITE);
                    r.setBackground(new java.awt.Color(0, 51, 51));
                    r.setForeground(Color.WHITE);
                    b.setBackground(new java.awt.Color(0, 51, 51));
                    b.setForeground(Color.WHITE);
                }

                if ("Dark Theme".equals(jMenuItem6.getText())) {
                    color.setBackground(new java.awt.Color(0, 0, 0));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
                    jLabel1.setForeground(Color.red);
                    advanced.setForeground(Color.red);
                    setTime.setForeground(Color.red);
                    setDate.setForeground(Color.red);
                    des.setForeground(Color.red);
                    ad.setBackground(new java.awt.Color(0, 0, 0));
                    ad.setForeground(Color.WHITE);
                    r.setBackground(new java.awt.Color(0, 0, 0));
                    r.setForeground(Color.WHITE);
                    b.setBackground(new java.awt.Color(0, 0, 0));
                    b.setForeground(Color.WHITE);
                }

                if ("Moody Blue".equals(jMenuItem7.getText())) {
                    color.setBackground(new java.awt.Color(0, 153, 153));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
                    jLabel1.setForeground(Color.WHITE);
                    advanced.setForeground(Color.WHITE);
                    setTime.setForeground(Color.WHITE);
                    setDate.setForeground(Color.WHITE);
                    des.setForeground(Color.WHITE);
                    ad.setBackground(new java.awt.Color(0, 153, 153));
                    ad.setForeground(Color.BLACK);
                    r.setBackground(new java.awt.Color(0, 153, 153));
                    r.setForeground(Color.BLACK);
                    b.setBackground(new java.awt.Color(0, 153, 153));
                    b.setForeground(Color.BLACK);
                }

                if ("Moody Pink".equals(jMenuItem8.getText())) {
                    color.setBackground(new java.awt.Color(255, 0, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
                    jLabel1.setForeground(Color.red);
                    advanced.setForeground(Color.red);
                    setTime.setForeground(Color.red);
                    setDate.setForeground(Color.red);
                    des.setForeground(Color.red);
                    ad.setBackground(new java.awt.Color(255, 102, 255));
                    ad.setForeground(Color.BLACK);
                    r.setBackground(new java.awt.Color(255, 102, 255));
                    r.setForeground(Color.BLACK);
                    b.setBackground(new java.awt.Color(255, 102, 255));
                    b.setForeground(Color.BLACK);
                }
    }//GEN-LAST:event_jMenuItem5MouseExited

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        color.setBackground(new java.awt.Color(255, 255, 255));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
        jLabel1.setForeground(Color.YELLOW);
        advanced.setForeground(Color.YELLOW);
        setTime.setForeground(Color.YELLOW);
        setDate.setForeground(Color.YELLOW);
        des.setForeground(Color.YELLOW);
        ad.setBackground(new java.awt.Color(0, 51, 51));
        ad.setForeground(Color.WHITE);
        r.setBackground(new java.awt.Color(0, 51, 51));
        r.setForeground(Color.WHITE);
        b.setBackground(new java.awt.Color(0, 51, 51));
        b.setForeground(Color.WHITE);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseEntered
        color.setBackground(new java.awt.Color(0, 0, 0));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
        jLabel1.setForeground(Color.red);
        advanced.setForeground(Color.red);
        setTime.setForeground(Color.red);
        setDate.setForeground(Color.red);
        des.setForeground(Color.red);
        ad.setBackground(new java.awt.Color(0, 0, 0));
        ad.setForeground(Color.WHITE);
        r.setBackground(new java.awt.Color(0, 0, 0));
        r.setForeground(Color.WHITE);
        b.setBackground(new java.awt.Color(0, 0, 0));
        b.setForeground(Color.WHITE);
    }//GEN-LAST:event_jMenuItem6MouseEntered

    private void jMenuItem6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem6MouseExited
        if ("Default".equals(jMenuItem5.getText())) {
                    color.setBackground(new java.awt.Color(255, 255, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
                    jLabel1.setForeground(Color.YELLOW);
                    advanced.setForeground(Color.YELLOW);
                    setTime.setForeground(Color.YELLOW);
                    setDate.setForeground(Color.YELLOW);
                    des.setForeground(Color.YELLOW);
                    ad.setBackground(new java.awt.Color(0, 51, 51));
                    ad.setForeground(Color.WHITE);
                    r.setBackground(new java.awt.Color(0, 51, 51));
                    r.setForeground(Color.WHITE);
                    b.setBackground(new java.awt.Color(0, 51, 51));
                    b.setForeground(Color.WHITE);
                }

                if ("Dark Theme".equals(jMenuItem6.getText())) {
                    color.setBackground(new java.awt.Color(0, 0, 0));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
                    jLabel1.setForeground(Color.red);
                    advanced.setForeground(Color.red);
                    setTime.setForeground(Color.red);
                    setDate.setForeground(Color.red);
                    des.setForeground(Color.red);
                    ad.setBackground(new java.awt.Color(0, 0, 0));
                    ad.setForeground(Color.WHITE);
                    r.setBackground(new java.awt.Color(0, 0, 0));
                    r.setForeground(Color.WHITE);
                    b.setBackground(new java.awt.Color(0, 0, 0));
                    b.setForeground(Color.WHITE);
                }

                if ("Moody Blue".equals(jMenuItem7.getText())) {
                    color.setBackground(new java.awt.Color(0, 153, 153));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
                    jLabel1.setForeground(Color.WHITE);
                    advanced.setForeground(Color.WHITE);
                    setTime.setForeground(Color.WHITE);
                    setDate.setForeground(Color.WHITE);
                    des.setForeground(Color.WHITE);
                    ad.setBackground(new java.awt.Color(0, 153, 153));
                    ad.setForeground(Color.BLACK);
                    r.setBackground(new java.awt.Color(0, 153, 153));
                    r.setForeground(Color.BLACK);
                    b.setBackground(new java.awt.Color(0, 153, 153));
                    b.setForeground(Color.BLACK);
                }

                if ("Moody Pink".equals(jMenuItem8.getText())) {
                    color.setBackground(new java.awt.Color(255, 0, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
                    jLabel1.setForeground(Color.red);
                    advanced.setForeground(Color.red);
                    setTime.setForeground(Color.red);
                    setDate.setForeground(Color.red);
                    des.setForeground(Color.red);
                    ad.setBackground(new java.awt.Color(255, 102, 255));
                    ad.setForeground(Color.BLACK);
                    r.setBackground(new java.awt.Color(255, 102, 255));
                    r.setForeground(Color.BLACK);
                    b.setBackground(new java.awt.Color(255, 102, 255));
                    b.setForeground(Color.BLACK);
                }
    }//GEN-LAST:event_jMenuItem6MouseExited

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        color.setBackground(new java.awt.Color(0, 0, 0));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
        jLabel1.setForeground(Color.red);
        advanced.setForeground(Color.red);
        setTime.setForeground(Color.red);
        setDate.setForeground(Color.red);
        des.setForeground(Color.red);
        ad.setBackground(new java.awt.Color(0, 0, 0));
        ad.setForeground(Color.WHITE);
        r.setBackground(new java.awt.Color(0, 0, 0));
        r.setForeground(Color.WHITE);
        b.setBackground(new java.awt.Color(0, 0, 0));
        b.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseEntered
        color.setBackground(new java.awt.Color(0, 153, 153));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
        jLabel1.setForeground(Color.WHITE);
        advanced.setForeground(Color.WHITE);
        setTime.setForeground(Color.WHITE);
        setDate.setForeground(Color.WHITE);
        des.setForeground(Color.WHITE);
        ad.setBackground(new java.awt.Color(0, 153, 153));
        ad.setForeground(Color.BLACK);
        r.setBackground(new java.awt.Color(0, 153, 153));
        r.setForeground(Color.BLACK);
        b.setBackground(new java.awt.Color(0, 153, 153));
        b.setForeground(Color.BLACK);
    }//GEN-LAST:event_jMenuItem7MouseEntered

    private void jMenuItem7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseExited
        if ("Default".equals(jMenuItem5.getText())) {
                    color.setBackground(new java.awt.Color(255, 255, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
                    jLabel1.setForeground(Color.YELLOW);
                    advanced.setForeground(Color.YELLOW);
                    setTime.setForeground(Color.YELLOW);
                    setDate.setForeground(Color.YELLOW);
                    des.setForeground(Color.YELLOW);
                    ad.setBackground(new java.awt.Color(0, 51, 51));
                    ad.setForeground(Color.WHITE);
                    r.setBackground(new java.awt.Color(0, 51, 51));
                    r.setForeground(Color.WHITE);
                    b.setBackground(new java.awt.Color(0, 51, 51));
                    b.setForeground(Color.WHITE);
                }

                if ("Dark Theme".equals(jMenuItem6.getText())) {
                    color.setBackground(new java.awt.Color(0, 0, 0));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
                    jLabel1.setForeground(Color.red);
                    advanced.setForeground(Color.red);
                    setTime.setForeground(Color.red);
                    setDate.setForeground(Color.red);
                    des.setForeground(Color.red);
                    ad.setBackground(new java.awt.Color(0, 0, 0));
                    ad.setForeground(Color.WHITE);
                    r.setBackground(new java.awt.Color(0, 0, 0));
                    r.setForeground(Color.WHITE);
                    b.setBackground(new java.awt.Color(0, 0, 0));
                    b.setForeground(Color.WHITE);
                }

                if ("Moody Blue".equals(jMenuItem7.getText())) {
                    color.setBackground(new java.awt.Color(0, 153, 153));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
                    jLabel1.setForeground(Color.WHITE);
                    advanced.setForeground(Color.WHITE);
                    setTime.setForeground(Color.WHITE);
                    setDate.setForeground(Color.WHITE);
                    des.setForeground(Color.WHITE);
                    ad.setBackground(new java.awt.Color(0, 153, 153));
                    ad.setForeground(Color.BLACK);
                    r.setBackground(new java.awt.Color(0, 153, 153));
                    r.setForeground(Color.BLACK);
                    b.setBackground(new java.awt.Color(0, 153, 153));
                    b.setForeground(Color.BLACK);
                }

                if ("Moody Pink".equals(jMenuItem8.getText())) {
                    color.setBackground(new java.awt.Color(255, 0, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
                    jLabel1.setForeground(Color.red);
                    advanced.setForeground(Color.red);
                    setTime.setForeground(Color.red);
                    setDate.setForeground(Color.red);
                    des.setForeground(Color.red);
                    ad.setBackground(new java.awt.Color(255, 102, 255));
                    ad.setForeground(Color.BLACK);
                    r.setBackground(new java.awt.Color(255, 102, 255));
                    r.setForeground(Color.BLACK);
                    b.setBackground(new java.awt.Color(255, 102, 255));
                    b.setForeground(Color.BLACK);
                }
    }//GEN-LAST:event_jMenuItem7MouseExited

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        color.setBackground(new java.awt.Color(0, 153, 153));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
        jLabel1.setForeground(Color.WHITE);
        advanced.setForeground(Color.WHITE);
        setTime.setForeground(Color.WHITE);
        setDate.setForeground(Color.WHITE);
        des.setForeground(Color.WHITE);
        ad.setBackground(new java.awt.Color(0, 153, 153));
        ad.setForeground(Color.BLACK);
        r.setBackground(new java.awt.Color(0, 153, 153));
        r.setForeground(Color.BLACK);
        b.setBackground(new java.awt.Color(0, 153, 153));
        b.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseEntered
        color.setBackground(new java.awt.Color(255, 0, 255));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
        jLabel1.setForeground(Color.red);
        advanced.setForeground(Color.red);
        setTime.setForeground(Color.red);
        setDate.setForeground(Color.red);
        des.setForeground(Color.red);
        ad.setBackground(new java.awt.Color(255, 102, 255));
        ad.setForeground(Color.BLACK);
        r.setBackground(new java.awt.Color(255, 102, 255));
        r.setForeground(Color.BLACK);
        b.setBackground(new java.awt.Color(255, 102, 255));
        b.setForeground(Color.BLACK);
    }//GEN-LAST:event_jMenuItem8MouseEntered

    private void jMenuItem8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem8MouseExited
        if ("Default".equals(jMenuItem5.getText())) {
                    color.setBackground(new java.awt.Color(255, 255, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1616109 - Copy.jpg")));
                    jLabel1.setForeground(Color.YELLOW);
                    advanced.setForeground(Color.YELLOW);
                    setTime.setForeground(Color.YELLOW);
                    setDate.setForeground(Color.YELLOW);
                    des.setForeground(Color.YELLOW);
                    ad.setBackground(new java.awt.Color(0, 51, 51));
                    ad.setForeground(Color.WHITE);
                    r.setBackground(new java.awt.Color(0, 51, 51));
                    r.setForeground(Color.WHITE);
                    b.setBackground(new java.awt.Color(0, 51, 51));
                    b.setForeground(Color.WHITE);
                }

                if ("Dark Theme".equals(jMenuItem6.getText())) {
                    color.setBackground(new java.awt.Color(0, 0, 0));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/—Pngtree—trendy wallpaper background design with_1160491 - Copy.png")));
                    jLabel1.setForeground(Color.red);
                    advanced.setForeground(Color.red);
                    setTime.setForeground(Color.red);
                    setDate.setForeground(Color.red);
                    des.setForeground(Color.red);
                    ad.setBackground(new java.awt.Color(0, 0, 0));
                    ad.setForeground(Color.WHITE);
                    r.setBackground(new java.awt.Color(0, 0, 0));
                    r.setForeground(Color.WHITE);
                    b.setBackground(new java.awt.Color(0, 0, 0));
                    b.setForeground(Color.WHITE);
                }

                if ("Moody Blue".equals(jMenuItem7.getText())) {
                    color.setBackground(new java.awt.Color(0, 153, 153));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/049M_crau5k_Full - Copy.jpg")));
                    jLabel1.setForeground(Color.WHITE);
                    advanced.setForeground(Color.WHITE);
                    setTime.setForeground(Color.WHITE);
                    setDate.setForeground(Color.WHITE);
                    des.setForeground(Color.WHITE);
                    ad.setBackground(new java.awt.Color(0, 153, 153));
                    ad.setForeground(Color.BLACK);
                    r.setBackground(new java.awt.Color(0, 153, 153));
                    r.setForeground(Color.BLACK);
                    b.setBackground(new java.awt.Color(0, 153, 153));
                    b.setForeground(Color.BLACK);
                }

                if ("Moody Pink".equals(jMenuItem8.getText())) {
                    color.setBackground(new java.awt.Color(255, 0, 255));
                    img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
                    jLabel1.setForeground(Color.red);
                    advanced.setForeground(Color.red);
                    setTime.setForeground(Color.red);
                    setDate.setForeground(Color.red);
                    des.setForeground(Color.red);
                    ad.setBackground(new java.awt.Color(255, 102, 255));
                    ad.setForeground(Color.BLACK);
                    r.setBackground(new java.awt.Color(255, 102, 255));
                    r.setForeground(Color.BLACK);
                    b.setBackground(new java.awt.Color(255, 102, 255));
                    b.setForeground(Color.BLACK);
                }
    }//GEN-LAST:event_jMenuItem8MouseExited

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        color.setBackground(new java.awt.Color(255, 0, 255));
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pawel-czerwinski-hR545CzxZxk-unsplash - Copy.jpg")));
        jLabel1.setForeground(Color.red);
        advanced.setForeground(Color.red);
        setTime.setForeground(Color.red);
        setDate.setForeground(Color.red);
        des.setForeground(Color.red);
        ad.setBackground(new java.awt.Color(255, 102, 255));
        ad.setForeground(Color.BLACK);
        r.setBackground(new java.awt.Color(255, 102, 255));
        r.setForeground(Color.BLACK);
        b.setBackground(new java.awt.Color(255, 102, 255));
        b.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new ToDo().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void advancedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advancedActionPerformed
        if (advanced.isSelected()) {
            setTime.setEnabled(true);
            setDate.setEnabled(true);
        } else {
            setTime.setEnabled(false);
            setDate.setEnabled(false);
        }

    }//GEN-LAST:event_advancedActionPerformed

    private void setDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setDateActionPerformed
        if (setDate.isSelected()) {
            txtDate.setEnabled(true);
        } else {
            txtDate.setEnabled(false);
        }
    }//GEN-LAST:event_setDateActionPerformed

    private void desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desActionPerformed
        if (des.isSelected()) {
            txtDes.setEnabled(true);
        } else {
            txtDes.setEnabled(false);
        }
    }//GEN-LAST:event_desActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int a = JOptionPane.showConfirmDialog(null, "Any unsaved or unadded data will be discarded, \n Are you sure you want to close TO-DO List ?", "Quit To-Do Task", JOptionPane.YES_NO_OPTION);

        if (a == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
            setDefaultCloseOperation(ToDo.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    private void rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rActionPerformed
        txtTitle.setText(null);
        txtDes.setText(null);
        txtDate.setCalendar(null);
        des.setSelected(false);
        advanced.setSelected(false);
        setTime.setSelected(false);
        setDate.setSelected(false);
        txtDate.setEnabled(false);
        setTime.setEnabled(false);
        setDate.setEnabled(false);
        txtDes.setEnabled(false);
    }//GEN-LAST:event_rActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        txtTitle.setText(null);
        txtDes.setText(null);
        txtDate.setCalendar(null);
        des.setSelected(false);
        advanced.setSelected(false);
        setTime.setSelected(false);
        setDate.setSelected(false);
        txtDate.setEnabled(false);
        setTime.setEnabled(false);
        setDate.setEnabled(false);
        txtDes.setEnabled(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

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
            java.util.logging.Logger.getLogger(addTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addTask().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ad;
    private javax.swing.JCheckBox advanced;
    private javax.swing.JButton b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField color;
    private javax.swing.JCheckBox des;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JLabel jTime;
    private javax.swing.JButton r;
    private javax.swing.JCheckBox setDate;
    private javax.swing.JCheckBox setTime;
    private cambodia.raven.Time time1;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextArea txtDes;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
