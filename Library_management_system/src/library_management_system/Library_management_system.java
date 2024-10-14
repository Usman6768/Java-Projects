package library_management_system;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class Library_management_system{
        static Scanner s = new Scanner(System.in);
        static final String adminPassword = "admin123";
        static final String userPassword = "user123";
        

        public static void main(String[] args){
            MainMenu();
        }
            
        // Main Menu 
        public static void MainMenu(){
           
        while(true){
            System.out.println("");
            System.out.println("***********Welcome to Library Management System***********");
            System.out.println("1. Login as Administrator");
            System.out.println("2. Login as User");
            System.out.println("3. EXIT");
            System.out.print("Enter yout choice : ");
            
            try{
            int choice = s.nextInt();
            s.nextLine(); 
            
            
            switch(choice){
                case 1:
                    login("Administrator");
                    break;
                case 2:
                    login("User");
                    break;
                case 3:
                    System.out.println("Exiting form the System, Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice! Please try again.");
            }    
}
            catch(InputMismatchException e){
                    System.out.println("Invalid input! Please Try Again.");
                    s.nextLine();
                    }
            }
}
            
        public static void login(String role){
            while(true){
            System.out.println("");
            System.out.println("Passwords: Administrator(admin123), User(user123) \nEnter password for "+ role + " or type exit to go back.");
            String password = s.nextLine();
            
            if(password.equals("exit")){
                return;
            }
                
            if(role.equals("Administrator") && password.equals(adminPassword)){
                System.out.print("Logging In");
        
            try{
                for(int i = 0; i < 4; i++ ){
                Thread.sleep(400);
                System.out.print(".");
            }
                System.out.println("");
                System.out.println("Logged in Successfully.");
            }
            catch(InterruptedException e){
                System.out.println("An error occuring while logging in.");
            }
                Administrator.AdminMenu();
                return;
            }
            else if(role.equals("User") && password.equals((userPassword))){
                 System.out.print("Logging In");
        
            try{
                for(int i = 0; i < 4; i++ ){
                Thread.sleep(400);
                System.out.print(".");
            }
                System.out.println("");
                System.out.println("Logged in Successfully.");
            }
            catch(InterruptedException e){
                System.out.println("An error occuring while logging in.");
            }
                User.UserMenu();
                return;
            }
            else{
                System.out.println("Incorrect password! Please try again.");
            }
                
            
        }
           
        }
        
        }



    
