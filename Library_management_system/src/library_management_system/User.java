
package library_management_system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import static library_management_system.Library_management_system.s;

public class User extends Library_management_system {

        public static void UserMenu(){
            while(true){
                System.out.println("");
                System.out.println("***********User Menu***********");
                System.out.println("1. Search for Book");
                System.out.println("2. Borrow Book");
                System.out.println("3. View Books");
                System.out.println("4. Check Book availability");
                System.out.println("5. Logout");
                System.out.print("Enter your choice : ");
                
                try{
                int choice = s.nextInt();
                s.nextLine();
                
                switch(choice){
                    case 1:
                        searchBook();
                        break;
                    case 2:
                        borrowBook();
                        break;
                    case 3:
                        Administrator.viewBook();
                        break;
                    case 4:
                        Administrator.checkBooksAvailability();
                        break;
                    case 5:
                        Administrator.logout();
                        return;
                    default:
                        System.out.println("Invalid Choice! Please Try Again");
                        break;
                }
                }
                catch(InputMismatchException e){
                    System.out.println("Invalid Input! Please Try again.");
                    s.nextLine();
                }
            }
}
        
        public static void searchBook(){
          File file = new File("Books.txt");
            System.out.print("Enter the ID, Name or Author of the book you want to search : ");
            String search = s.nextLine();
            
            boolean bookFound = true;
            
            try(Scanner sc = new Scanner(file)){
                while(sc.hasNextLine()){
                    
                    
                    String id = sc.nextLine();
                    String name = sc.nextLine();
                    String author = sc.nextLine();
                    String availability = sc.nextLine();
                    sc.nextLine();
                    
                    if(id.contains(search) || name.contains(search) || author.contains(search)){
                        bookFound = true;
                        
                        System.out.println("Book Found");
                        System.out.println(id);
                        System.out.println(name);
                        System.out.println(author);
                        System.out.println(availability);
                        System.out.println("-----------------");
                        
                }
            }
}
            catch(FileNotFoundException e){
                System.out.println("An error occured: " + e.getMessage());
            }
            if(!bookFound){
                System.out.println("Sorry, Book not found. ");
            }
}
        
        public static void borrowBook() {
        File file = new File("Books.txt");
        System.out.print("Enter the ID or name of the book you want to borrow: ");
        String search = s.nextLine().toLowerCase();

        boolean bookFound = false;
        StringBuilder updatedBookData = new StringBuilder();

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                updatedBookData.append(line).append("\n");

                if (line.contains("Book ID : " + search) || line.contains("Book Name : " + search)) {
                    bookFound = true;
                    updatedBookData.append(sc.nextLine()).append("\n");
                    updatedBookData.append(sc.nextLine()).append("\n");
                    String availability = sc.nextLine();

                    if (availability.contains("Not Available")) {
                        System.out.println("Sorry, this book is currently not available.");
                        updatedBookData.append(availability).append("\n");
                        
                    } else if (availability.contains("Available")){
                        System.out.println("Book is available. \nYou have successfully borrowed it.");
                        updatedBookData.append("Book Status : Not Available\n"); 
                    }
                    updatedBookData.append(sc.nextLine()).append("\n");
                }
            }
            } 
            catch (FileNotFoundException e) {
                System.out.println("An error occurred: " + e.getMessage());
            }

            if (bookFound) {
                try (FileWriter fw = new FileWriter(file, false)) {
                    fw.write(updatedBookData.toString());
                } 
                catch (IOException e) {
                    System.out.println("An error occurred while updating the book status: " + e.getMessage());
                }
            }
            else {
                System.out.println("Sorry, book not found.");
            }
        }

}
