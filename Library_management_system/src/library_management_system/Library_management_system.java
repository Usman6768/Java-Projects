package library_management_system;

import java.util.ArrayList;
import java.util.Scanner;

      // Book class to return books
    class Book{
        private String title;
        private String author;
        private boolean isIssued;
        
        public Book(String title, String author){
            this.title = title;
            this.author = author;
            this.isIssued = false;
        }
        
        // getters
        public String getTitle(){
            return title;
        }
        public String getAuthor(){
            return author;
        }
        public boolean isIssued(){
            return isIssued;
        }
        // settters
        public void setIssued(boolean issued){
            isIssued = issued;
        }
        
        @Override
        public String toString(){
            return "Title: " + title + ", Author:" + author + ", Issued " + (isIssued ? "Yes" : "No");   
        }
    }


public class Library_management_system{
    
        static Scanner scanner = new Scanner(System.in);
        static ArrayList<Book> books = new ArrayList<>(); // Store books in an ArrayList
        static String adminPassword = "admin123";
        static String userPassword = "user123";
        
        public static void main(String[] args){
            MainMenu();
        }
    
        // Main Menu 
        public static void MainMenu(){
            int choice = 0;
        do{
            System.out.println("Welcome to Library Management System");
            System.out.println("1. Login as Administrator");
            System.out.println("2. Login as User");
            System.out.println("3. EXIT");
            System.out.print("Enter yout choice : ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // for new line
            
            
            switch(choice){
                case 1:
                    login("Administrator");
                    break;
                case 2:
                    login("User");
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice! Please try again.");
                    MainMenu();
                    break;
                    
            }
        
        }while(choice!=3);
        }

            // login
        public static void login(String role){
            System.out.println("Enter password for "+ role + " : ");
            String password = scanner.nextLine(); // nextLine for string
                
            if(role.equals("Administrator") && password.equals(adminPassword)){
                AdminMenu();
            }
            else if(role.equals("User") && password.equals((userPassword))){
                UserMenu();
            }
            else{
                System.out.println("Incorrect password! Returning to Main Menu");
                MainMenu();
            }
                
            }
            
             // Admin Menu
            public static void AdminMenu(){
                System.out.println("Administrator Menu");
                System.out.println("1. Manage Books Inventory");
                System.out.println("2. Issue books");
                System.out.println("3. Monitor overdue books");
                System.out.println("4. Manage users");
                System.out.println("5. Logout");
                
                
                
                int choice = scanner.nextInt();
                scanner.nextLine();
                
                
                switch(choice){
                    case 1:
                        manageBookInventory();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        MainMenu();
                        break;
                    default:
                        System.out.println("Invalid Choice! Please Try Again.");
                        AdminMenu();
                        break;
                } 
            }
            
            // User Menu
            public static void UserMenu(){
                System.out.println("User Menu");
                System.out.println("1. Search for Books");
                System.out.println("2. Check availability");
                System.out.println("3. View borrowing history");
                System.out.println("4. Logout");
                
                int choice = scanner.nextInt();
                scanner.nextLine();
                
                switch(choice){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        MainMenu();
                        break;
                    default:
                        System.out.println("Invalid Choice! Please Try Again");
                        UserMenu();
                        break;
                }
            }
        

        // Manage book inventory 
        public static void manageBookInventory(){
            System.out.println("Manage Book Inventory");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Back to Admin Menu");
            System.out.print("Enter your choice : ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch(choice) {
            case 1:
                addBook();
                break;
            case 2:
//                updateBook();
                break;
            case 3:
//                removeBook();
                break;
            case 4:
                AdminMenu();
                break;
            default:
                System.out.println("Invalid Choice! Please Try again.");
                manageBookInventory();
                break;
             
}
}
        public static void addBook(){
            System.out.print("Enter Book Title: ");
            String title = scanner.nextLine();
            System.out.print("Enter Book author : ");
            String author = scanner.nextLine();
            
            
            books.add(new Book(title, author));
            System.out.println("Book added successfully.");
            
            manageBookInventory();
            
        }
        
        public static void updateBook(){
            System.out.print("Enter the title of the book to update : ");
            String title = scanner.nextLine();
            
            for(Book book: books){
                if(book.getTitle().equalsIgnoreCase(title))
                {
                    System.out.print("Enter new Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter new Author: ");
                    String newAuthor = scanner.nextLine();
                    
                    books.set(books.indexOf(book), new Book(newTitle, newAuthor));
                    System.out.println("Book updated Successfully.");
                    
                    manageBookInventory();
                    return;
                }
            }
            System.out.println("Sorry! Book not found.");
            manageBookInventory();
            
        }
}

        
  
    

    
        
        
        
        
    
    

