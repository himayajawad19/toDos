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

//                jTime.setText(formattedTimeStr);

            }
        });

        updateTimer.start();
      

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
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jd = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

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

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TO-DO TASKS");
        jPanel1.add(jLabel1);

        jButton2.setText("COMPLETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(204, 204, 255));
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

        jButton1.setFont(new java.awt.Font("Lao UI", 1, 12)); // NOI18N
        jButton1.setText("ADD TASK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jd.setText("DELETE");
        jd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 640, 450);
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String selectedValue ="Complete";
        System.out.println(selectedValue);
        String filePath = "Files/ToDos.txt"; // Replace with the actual file path
        int row=table.getSelectedRow();
        String searchLine = (String) table.getModel().getValueAt(row,0); // Line to search for
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
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton jd;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
