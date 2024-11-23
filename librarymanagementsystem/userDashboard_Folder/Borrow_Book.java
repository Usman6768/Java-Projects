/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagementsystem.userDashboard_Folder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import librarymanagementsystem.Db_conn;

/**
 *
 * @author pc
 */
public class Borrow_Book extends javax.swing.JFrame {

    /**
     * Creates new form Borrow_Book
     */
    public Borrow_Book() {
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
        request_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        back_btn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("Borrow Book");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Search Book:");

        search_field.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        search_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        record_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Name", "ISBN", "Author", "Status"
            }
        ));
        jScrollPane1.setViewportView(record_table);

        request_btn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        request_btn.setText("Request for Borrowing");
        request_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                request_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(request_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(back_btn)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(back_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(search_field, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(request_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
       User_Dashboard userDashboard = new User_Dashboard();
       userDashboard.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

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

    private void request_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_request_btnActionPerformed
        
    }//GEN-LAST:event_request_btnActionPerformed

  
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
            java.util.logging.Logger.getLogger(Borrow_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrow_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrow_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrow_Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrow_Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable record_table;
    private javax.swing.JButton request_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_field;
    // End of variables declaration//GEN-END:variables
}
