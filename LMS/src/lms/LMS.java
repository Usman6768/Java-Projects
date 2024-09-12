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
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1)); // two buttons stacked vertically
        
        JButton adminbtn = new  JButton("Admin");
        JButton userbtn = new JButton("User");
        
        // admin functionalities
        adminbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openAdminWindow();
            }
        });
        
        userbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "User login Clicked");
        }
        });
        
        panel.add(adminbtn);
        panel.add(userbtn);
        
        frame.add(panel);
        
        
        frame.setVisible(true);
        }
        
        private void openAdminWindow() {
            
            JFrame adminFrame = new JFrame("Admin Panel - Manage Books");
            adminFrame.setSize(800,600);
            adminFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // it inly close this admin window
        
            JPanel adminPanel = new JPanel();
            adminPanel.setLayout(new GridLayout(3, 1)); // 3 rows and 1 column
            
            JButton addBooksBtn = new JButton("Add Book");
            JButton updateBooksBtn = new JButton("Update Book");
            JButton removeBooksBtn = new JButton("Remove Book");
            
            addBooksBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e){
                    addBookForm();
                } 
            });
            
            
            
            
            
            adminPanel.add(addBooksBtn);
            adminPanel.add(updateBooksBtn);
            adminPanel.add(removeBooksBtn);
            
        
        }
        
    
    public static void main(String[] args){
        // TODO code application logic here
        LMS lmss = new LMS();
    }
    
}
