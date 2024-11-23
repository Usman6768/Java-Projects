
package librarymanagementsystem.manageBooks_Folder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import librarymanagementsystem.Db_conn;
import librarymanagementsystem.adminDashboard_Folder.Manage_Books;


public class Remove_book extends javax.swing.JFrame {

   
   public Remove_book() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        search_field = new javax.swing.JTextField();
        search_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        record_table = new javax.swing.JTable();
        remove_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back_btn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Remove Book");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Enter Book ID:");

        search_field.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        search_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_fieldActionPerformed(evt);
            }
        });

        search_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        record_table.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(record_table);

        remove_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        remove_btn.setText("Remove");
        remove_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back_btn)
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(remove_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(back_btn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(search_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(search_btn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remove_btn)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        Manage_Books manageBook = new Manage_Books();
        manageBook.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void search_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_fieldActionPerformed
        
    }//GEN-LAST:event_search_fieldActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        String search = search_field.getText().trim();
        
        if(search.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter book name!");
            return;
        }
        String query = "SELECT * FROM books where bookName LIKE ? OR author LIKE ?";
        
        
        
        try{
            Db_conn db = new Db_conn();
            Connection conn = db.getConnection();
            
            PreparedStatement stmt = conn.prepareStatement(query);
            
            stmt.setString(1, "%" + search + "%");
            stmt.setString(2, "%" + search + "%");
            
            ResultSet result = stmt.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) record_table.getModel();
            model.setRowCount(0);
            
            while(result.next()) {
            Object[] row = {
                result.getInt("bookID"),
                result.getString("bookName"),
                result.getString("isbn"),
                result.getString("author"),
                result.getString("status")
            };
            model.addRow(row);
        }
            if(model.getRowCount() == 0){
                JOptionPane.showMessageDialog(this,"Sorry, No Records found.");
            }
        result.close();
        stmt.close();
        conn.close();
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Error Fetching data from database");
            
        }
        
    }//GEN-LAST:event_search_btnActionPerformed

    private void remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btnActionPerformed
    int selectedRow = record_table.getSelectedRow(); // Get the selected row index
    
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a book to remove!");
        return;
    }
        
    int bookID = (int) record_table.getValueAt(selectedRow, 0);

    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove the selected book?", "Confirm Removal",JOptionPane.YES_NO_OPTION);

    if (confirm == JOptionPane.YES_OPTION) {
        String query = "DELETE FROM books WHERE bookID = ?";
        
        try {
            Db_conn db = new Db_conn();
            Connection conn = db.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, bookID);

            int rowsAffected = stmt.executeUpdate();
            
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Book removed successfully!");
                DefaultTableModel model = (DefaultTableModel) record_table.getModel();
                model.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(this, "Failed to remove the book. Please try again.");
            }

            stmt.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error removing the book: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_remove_btnActionPerformed

  
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
            java.util.logging.Logger.getLogger(Remove_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remove_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remove_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remove_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Remove_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable record_table;
    private javax.swing.JButton remove_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_field;
    // End of variables declaration//GEN-END:variables
}