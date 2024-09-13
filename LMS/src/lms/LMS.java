/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lms;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author pc
 */
public class LMS extends JFrame{

        public LMS(){
        JFrame frame = new JFrame();
        frame.setTitle("Library Management System");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window

        // content starts from here
        JLabel label = new JLabel("Welcome to LMS");
        frame.add(label);
        
        // main panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1)); // two buttons stacked vertically
        
        
        // admin and user buttons
        JButton adminbtn = new  JButton("Admin");
        JButton userbtn = new JButton("User");
        
        
        // To open admin window when click on admin button
        adminbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAdminWindow();
            }
        });
        
        
        // To open User window when click on user button
        userbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "User login Clicked");
        }
        });
        
        
        // add buttons to the panel
        panel.add(adminbtn);
        panel.add(userbtn);
        
        
        // now add the panel to the frame
        frame.add(panel);
        
 
        frame.setVisible(true);
        }
        
        
         // Open Admin Window Method
        private void openAdminWindow() {
            // Admin Frame
            JFrame adminFrame = new JFrame("Admin Panel - Manage Books");
            adminFrame.setSize(800,600);
            adminFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // it only close this admin window
            
            
            // Admin Panel
            JPanel adminPanel = new JPanel();
            adminPanel.setLayout(new GridLayout(3, 1)); // 3 rows and 1 column
            
            
            // Manage Books Buttons
            JButton addBooksBtn = new JButton("Add Book");
            JButton updateBooksBtn = new JButton("Update Book");
            JButton removeBooksBtn = new JButton("Remove Book");
            
            
            // Action Listeners
            addBooksBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    addBookForm();
                } 
            });
            
            updateBooksBtn.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e){
                   JOptionPane.showMessageDialog(null, "Update Book clicked");
               }
            });
            
            removeBooksBtn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(null, "Remove Book Clicked");
                }
            });
            
            // add buttons to the panel
            adminPanel.add(addBooksBtn);
            adminPanel.add(updateBooksBtn);
            adminPanel.add(removeBooksBtn);
            
            adminFrame.add(adminPanel);
            adminFrame.setVisible(true);
            
        
        }
        
        
        private void addBookForm(){
            // created frame for adding book form
            JFrame addBookFrame = new JFrame();
            addBookFrame.setSize(800,600);
            addBookFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            JPanel formPanel = new JPanel();
            formPanel.setLayout(new GridLayout(5,2));
            
            JLabel titlelabel = new JLabel("Title");
            JTextField textField = new JTextField();
            
            JLabel authorlabel = new JLabel("Author:");
            JTextField authorField = new JTextField();
        }
        
    
    public static void main(String[] args){
        // TODO code application logic here
        LMS lmss = new LMS();
    }
    
}
