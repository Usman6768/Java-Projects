//
//package librarymanagementsystem;
////
////import javax.swing.*;
////import java.awt.*;
////
////public class LibraryManagementSystem {
////
////    public static void main(String[] args) {
////        createWelcomeScreen();
////    }
////    
////    public static void createWelcomeScreen(){
////        JFrame frame = new JFrame("Library Management System");
////        frame.setSize(800, 600);
////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.setLocationRelativeTo(null); 
////        
////        
////        JPanel panel = new JPanel();
////        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
////        
////        JLabel heading = new JLabel("Library Management System", SwingConstants.CENTER);
////        heading.setFont(new Font("Arial", Font.BOLD, 24));
////        heading.setAlignmentX(Component.CENTER_ALIGNMENT);
////        
////        JPanel btnsPanel = new JPanel();
////        btnsPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10)); // Center buttons with spacing
////
////        
////        JButton adminBtn = new JButton("Administrator");
////        adminBtn.setFocusable(false);
////        JButton userBtn = new JButton("User");
////        userBtn.setFocusable(false);
////        
////        
////        btnsPanel.add(adminBtn);
////        btnsPanel.add(userBtn);
////        
////        panel.add(heading);
////        panel.add(Box.createVerticalStrut(20)); // Spacer between heading and buttons
////        panel.add(btnsPanel);
////        
////        frame.add(panel);
////        frame.setVisible(true);
////        
////    }
////}
//
////import javax.swing.*;
////import java.awt.*;
////
////public class LibraryManagementSystem {
////
////    public static void main(String[] args) {
////        createWelcomeScreen();
////    }
////    
////    public static void createWelcomeScreen(){
////        // Create the main frame
////        JFrame frame = new JFrame("Library Management System");
////        frame.setSize(800, 600);
////        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.setLocationRelativeTo(null); 
////
////        // Outer panel to center everything in the frame
////        JPanel outerPanel = new JPanel(new GridBagLayout());
////        outerPanel.setBackground(Color.GRAY);
////        
////        // Main panel to hold heading and buttons vertically
////        JPanel mainPanel = new JPanel();
////        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); // Vertical alignment
////
////        // Heading label
////        JLabel heading = new JLabel("Library Management System", SwingConstants.CENTER);
////        heading.setFont(new Font("Arial", Font.BOLD, 24));
////        heading.setAlignmentX(Component.CENTER_ALIGNMENT);
////
////        // Button panel to hold buttons side by side
////        JPanel buttonPanel = new JPanel();
////        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10)); // Center buttons with spacing
////
////        // Administrator and User buttons
////        JButton adminBtn = new JButton("Administrator");
////        JButton userBtn = new JButton("User");
////
////        // Add buttons to button panel
////        buttonPanel.add(adminBtn);
////        buttonPanel.add(userBtn);
////
////        // Add components to the main panel
////        mainPanel.add(heading);
////        mainPanel.add(Box.createVerticalStrut(20)); // Spacer between heading and buttons
////        mainPanel.add(buttonPanel);
////
////        // Add main panel to the outer panel (centered)
////        outerPanel.add(mainPanel);
////
////        // Add outer panel to the frame
////        frame.add(outerPanel);
////        frame.setVisible(true);
////    }
////}
//
//import javax.swing.*;
//import java.awt.*;
//
//public class LibraryManagementSystem {
//
//    public static void main(String[] args) {
//        createWelcomeScreen();
//    }
//    
//    public static void createWelcomeScreen(){
//        // Create the main frame
//        JFrame frame = new JFrame("Library Management System");
//        frame.setSize(600, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null); 
//
//        // Outer panel to center everything in the frame
//        JPanel outerPanel = new JPanel(new GridBagLayout());
//        outerPanel.setBackground(Color.GRAY); // Set background color to gray
//
//        // Main panel to hold heading and buttons vertically
//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
//        mainPanel.setOpaque(false); // Make mainPanel transparent so outerPanel background shows through
//
//        
//        // Heading label
//        JLabel heading = new JLabel("Library Management System", SwingConstants.CENTER);
//        heading.setFont(new Font("Arial", Font.BOLD, 24));
//        heading.setForeground(Color.WHITE); // Set text color to white
//        heading.setAlignmentX(Component.CENTER_ALIGNMENT);
//
//        // Button panel to hold buttons side by side
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
//        buttonPanel.setOpaque(false); // Make button panel transparent
//
//
//        // Administrator and User buttons
//        JButton adminBtn = new JButton("Administrator");
//        JButton userBtn = new JButton("User");
//
//        // Set button colors
//        adminBtn.setBackground(Color.DARK_GRAY);
//        adminBtn.setFocusable(false);
//        adminBtn.setForeground(Color.WHITE); // Set text color to white
//        adminBtn.setMargin(new Insets(10, 20, 10, 20)); // Add padding to make the button larger
//         
//        userBtn.setFocusable(false);
//        userBtn.setBackground(Color.DARK_GRAY);
//        userBtn.setForeground(Color.WHITE); // Set text color to white
//        userBtn.setMargin(new Insets(10, 20, 10, 20)); // Add padding to make the button larger
//
//        adminBtn.addActionListener(e -> LoginScreen(frame));
//        userBtn.addActionListener(e -> LoginScreen(frame));
//
//        
//        // Add buttons to button panel
//        buttonPanel.add(adminBtn);
//        buttonPanel.add(userBtn);
//
//        // Add components to the main panel
//        mainPanel.add(heading);
//        mainPanel.add(Box.createVerticalStrut(20)); // Spacer between heading and buttons
//        mainPanel.add(buttonPanel);
//
//        // Add main panel to the outer panel (centered)
//        outerPanel.add(mainPanel);
//
//        // Add outer panel to the frame
//        frame.add(outerPanel);
//        frame.setVisible(true);
//    }
//    
//    public static void LoginScreen(JFrame frame){
//        frame.getContentPane().removeAll();
//        
//        // Create a new panel for the login screen
//        JPanel loginPanel = new JPanel();
//        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
//        loginPanel.setBackground(Color.GRAY);
//
//        // Heading label for login
//        JLabel loginHeading = new JLabel("Login", SwingConstants.CENTER);
//        loginHeading.setFont(new Font("Arial", Font.BOLD, 24));
//        loginHeading.setForeground(Color.WHITE);
//        loginHeading.setAlignmentX(Component.CENTER_ALIGNMENT);
//
//        // Username label and text field
//        JLabel usernameLabel = new JLabel("Username:");
//        usernameLabel.setForeground(Color.WHITE);
//        JTextField usernameField = new JTextField(15);
//        usernameField.setMaximumSize(new Dimension(250, 30)); // Set fixed width and height
//        
//
//
//        // Password label and password field
//        JLabel passwordLabel = new JLabel("Password:");
//        passwordLabel.setForeground(Color.WHITE);
//        JPasswordField passwordField = new JPasswordField(20);
//        passwordField.setMaximumSize(new Dimension(250, 30)); // Set fixed width and height
//
//        // Submit button
//        JButton submitBtn = new JButton("Submit");
//        submitBtn.setBackground(Color.DARK_GRAY);
//        submitBtn.setForeground(Color.WHITE);
//
//        // Add ActionListener to submit button (example: print to console)
//        submitBtn.addActionListener(e -> {
//            String username = usernameField.getText();
//            String password = new String(passwordField.getPassword());
//            System.out.println("Username: " + username + ", Password: " + password);
//        });
//
//        // Add components to login panel with spacing
//        loginPanel.add(loginHeading);
//        loginPanel.add(Box.createVerticalStrut(20));
//        loginPanel.add(usernameLabel);
//        loginPanel.add(usernameField);
//        loginPanel.add(Box.createVerticalStrut(10));
//        loginPanel.add(passwordLabel);
//        loginPanel.add(passwordField);
//        loginPanel.add(Box.createVerticalStrut(20));
//        loginPanel.add(submitBtn);
//
//        // Center the login panel in the frame
//        frame.add(loginPanel);
//        frame.revalidate();
//        frame.repaint();
//    }
//}
//
