//package library_management_system;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.InputMismatchException;
//
//      // Book class to return books
////    class Book implements Serializable{
////        private String title;
////        private String author;
////        private boolean isIssued;
////        
////        public Book(String title, String author){
////            this.title = title;
////            this.author = author;
////            this.isIssued = false;
////        }
////        
////        // getters
////        public String getTitle(){
////            return title;
////        }
////        public String getAuthor(){
////            return author;
////        }
////        public boolean isIssued(){
////            return isIssued;
////        }
////        // settters
////        public void setIssued(boolean issued){
////            isIssued = issued;
////        }
////        
////        @Override
////        public String toString(){
////            return "Title: " + title + ", Author:" + author + ", Issued " + (isIssued ? "Yes" : "No");   
////        }
////    }
//
//
//public class Library_management_system{
//    
//        static Scanner scanner = new Scanner(System.in);
//        static Book[] books = new Book[100]; // Store books in an ArrayList
//        static int book_count = 0;
//        static String adminPassword = "admin123";
//        static String userPassword = "user123";
//        static final String BOOK_FILE = "C:\\Users\\pc\\Documents\\NetBeansProjects\\Library_management_system\\Project files\\books.txt";     
//        
//        public static void main(String[] args){
//            loadBooksFile();    
//            MainMenu();
//        }
//        
//        // method that load books from the file
//        public static void loadBooksFile(){
//            try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(BOOK_FILE))){
//                books = (ArrayList<Book>) ois.readObject();
//            }
//            catch(FileNotFoundException e){
//                System.out.println("Sorry, Book not found.");
//            }
//            catch(IOException | ClassNotFoundException e){
//                System.out.println("Error loading books: " + e.getMessage());
//                
//            }
//        }
//        
//        
//        // method to save books to the file
//        public static void saveBooks(){
//            try{
//                File file = new File(BOOK_FILE);
//                
//                if(!file.exists()){
//                    file.createNewFile();
//                    System.out.println("File Created Successfully.");
//                }
//                
//                FileWriter writer = new FileWriter("book.txt", true);
//                BufferedWriter bufferedWriter = new BufferedWriter(writer);
//                
//                bufferedWriter.write("Book ID: " + Id);
//                bufferedWriter.newLine();
//                bufferedWriter.write("Book Name: " + name);
//                bufferedWriter.newLine();
//                bufferedWriter.newLine();
//                bufferedWriter.write("Author Name: " + author);
//                bufferedWriter.newLine();
//                bufferedWriter.write("-----------------------");
//                bufferedWriter.newLine();
//                
//                bufferedWriter.close();
//                
//                System.out.println("book saved");
//            }
//            catch(Exception e){
//                System.out.println("an error");
//            }
//                
//            
//            
//        }
//        
//        
//        
//        // Main Menu 
//        public static void MainMenu(){
//           
//        while(true){
//            System.out.println("");
//            System.out.println("***********Welcome to Library Management System***********");
//            System.out.println("1. Login as Administrator");
//            System.out.println("2. Login as User");
//            System.out.println("3. EXIT");
//            System.out.print("Enter yout choice : ");
//            
//            try{
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // for new line
//            
//            
//            switch(choice){
//                case 1:
//                    login("Administrator");
//                    break;
//                case 2:
//                    login("User");
//                    break;
//                case 3:
//                    System.out.println("Exiting form the System, Goodbye!");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Invalid Choice! Please try again.");
//            }    
//}
//            catch(InputMismatchException e){
//                    System.out.println("Invalid input! Please Try Again.");
//                    scanner.nextLine();
//                    }
//            }
//}
//        
//        
//        // login
//        public static void login(String role){
//            while(true){
//            System.out.println("");
//            System.out.println("Enter password for "+ role + " or type exit to go back.");
//            String password = scanner.nextLine(); // nextLine for string
//            
//            if(password.equals("exit")){
//                MainMenu();
//                return;
//            }
//                
//            if(role.equals("Administrator") && password.equals(adminPassword)){
//                AdminMenu();
//                return;
//            }
//            else if(role.equals("User") && password.equals((userPassword))){
//                UserMenu();
//                return;
//            }
//            else{
//                System.out.println("Incorrect password! Please try again.");
//            }
//                
//            }
//        }
//           
//        
//        // Admin Menu
//        public static void AdminMenu(){
//            while(true){
//                System.out.println("");
//                System.out.println("***********Administrator Menu***********");
//                System.out.println("1. Manage Books Inventory");
//                System.out.println("2. Issue books");
//                System.out.println("3. Monitor overdue books");
//                System.out.println("4. Manage users");
//                System.out.println("5. Logout");
//                
//                
//                try{
//                int choice = scanner.nextInt();
//                scanner.nextLine();
//                
//                
//                switch(choice){
//                    case 1:
//                        manageBookInventory();
//                        break;
//                    case 2:
//                        break;
//                    case 3:
//                        break;
//                    case 4:
//                        break;
//                    case 5:
//                        MainMenu();
//                        return;
//                    default:
//                        System.out.println("Invalid Choice! Please Try Again.");
//                } 
//                }
//                catch(InputMismatchException e){
//                    System.out.println("Invalid Input! Please Try again.");
//                    scanner.nextLine();
//                }
//            }
//            }
//            
//        
//        // User Menu
//        public static void UserMenu(){
//                System.out.println("");
//                System.out.println("User Menu");
//                System.out.println("1. Search for Books");
//                System.out.println("2. Check availability");
//                System.out.println("3. View borrowing history");
//                System.out.println("4. Logout");
//                
//                int choice = scanner.nextInt();
//                scanner.nextLine();
//                
//                switch(choice){
//                    case 1:
//                        break;
//                    case 2:
//                        break;
//                    case 3:
//                        break;
//                    case 4:
//                        MainMenu();
//                        break;
//                    default:
//                        System.out.println("Invalid Choice! Please Try Again");
//                        UserMenu();
//                        break;
//                }
//            }
//        
//
//        // Manage book inventory 
//        public static void manageBookInventory(){
//            while(true){
//            System.out.println("");
//            System.out.println("***********Manage Book Inventory***********");
//            System.out.println("1. Add Book");
//            System.out.println("2. Update Book");
//            System.out.println("3. Remove Book");
//            System.out.println("4. Back to Admin Menu");
//            System.out.print("Enter your choice : ");
//            
//            try{
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//            
//            switch(choice) {
//            case 1:
//                addBook();
//                break;
//            case 2:
//                updateBook();
//                break;
//            case 3:
////                removeBook();
//                break;
//            case 4:
//                return;
//            default:
//                System.out.println("Invalid Choice! Please Try again.");
//            }
//}
//            catch(InputMismatchException e){
//                System.out.println("Invalid Input! Please Try again.");
//                scanner.nextLine();
//            }
//}
//        }
//        
//        
//        // method to add books
//        public static void addBook(){
//            try{
//            System.out.print("Enter Book Title: ");
//            String title = scanner.nextLine();
//            System.out.print("Enter Book author : ");
//            String author = scanner.nextLine();
//            
//            
//            books.add(new Book(title, author));
//            saveBooks();
//            System.out.println("Book added successfully.");
//            }
//            catch(Exception e){
//                System.out.println("Sorry, Error adding Book " + e.getMessage());
//            }
//        }
//        
//        
//        // method to update books
//        public static void updateBook(){
//            System.out.print("Enter the title of the book to update : ");
//            String title = scanner.nextLine();
//            
//           
//            for(Book book: books){
//                if(book.getTitle().equalsIgnoreCase(title))
//                {
//                    try{
//                    System.out.print("Enter new Title: ");
//                    String newTitle = scanner.nextLine();
//                    System.out.print("Enter new Author: ");
//                    String newAuthor = scanner.nextLine();
//                    
//                    books.set(books.indexOf(book), new Book(newTitle, newAuthor));
//                    saveBooks();
//                    System.out.println("Book updated Successfully.");
//                    return;
//                    }
//                    catch(Exception e){
//                        System.out.println("Sorry, Error updating book : " + e.getMessage());
//                    }
//                }
//            }
//            System.out.println("Sorry! Book not found.");
//            
//        }
//        
//        
//        // method to remove books
//        public static void removeBook(){
//            System.out.println("Enter the title of the book to remove: ");
//            String title = scanner.nextLine();
//            
//            for(Book book : books){
//                if(book.getTitle().equalsIgnoreCase(title)){
//                    try{
//                    books.remove(book);
//                    saveBooks();
//                    System.out.println("Book removed successfully.");
//                    return;
//                }
//                
//                catch(Exception e){
//                    System.out.println("Sorry, Error removing book: " +e.getMessage());
//                    }
//            }
//            System.out.println("Book not found.");
//            manageBookInventory();
//        }
//}
//        
//        
//}



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
            s.nextLine(); // for new line
            
            
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
            System.out.println("Enter password for "+ role + " or type exit to go back.");
            String password = s.nextLine(); // nextLine for string
            
            if(password.equals("exit")){
                return;
            }
                
            if(role.equals("Administrator") && password.equals(adminPassword)){
                Administrator.AdminMenu();
                return;
            }
            else if(role.equals("User") && password.equals((userPassword))){
                User.UserMenu();
                return;
            }
            else{
                System.out.println("Incorrect password! Please try again.");
            }
                
            
        }
           
        }
        
        }



    