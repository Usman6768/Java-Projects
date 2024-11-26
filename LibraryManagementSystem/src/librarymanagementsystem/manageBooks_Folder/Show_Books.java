
package librarymanagementsystem.manageBooks_Folder;

import librarymanagementsystem.manageUsers_Folder.*;
import javax.swing.JOptionPane;
import librarymanagementsystem.adminDashboard_Folder.Manage_Users;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import librarymanagementsystem.Db_conn;
import librarymanagementsystem.adminDashboard_Folder.Manage_Books;


public class Show_Books extends javax.swing.JFrame {

    
    public Show_Books() {
        initComponents();
        showData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        record_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back_btn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Books");

        record_table.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        record_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Name", "ISBN", "Author", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        record_table.setRowHeight(30);
        record_table.setRowMargin(10);
        jScrollPane1.setViewportView(record_table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back_btn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(back_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        Manage_Books manageBooks = new Manage_Books();
        manageBooks.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed
    
    private void showData() {
    String query = "SELECT * FROM books"; 
    try {
        Db_conn db = new Db_conn();
        Connection conn = db.getConnection();
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet result = stmt.executeQuery();

       
        DefaultTableModel model = (DefaultTableModel) record_table.getModel();
        model.setRowCount(0); 

        
        while (result.next()) {
            Object[] row = {
                result.getInt("bookID"), 
                result.getString("bookName"),
                result.getString("isbn"),
                result.getString("author"),
                result.getString("status"),
            };
            model.addRow(row);
        }

        result.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error fetching user data: " + e.getMessage());
        e.printStackTrace(); // For debugging
    }
}

    
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
            java.util.logging.Logger.getLogger(Show_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show_Books.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Show_Books().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable record_table;
    // End of variables declaration//GEN-END:variables
}
