
package library_management_system;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Administrator extends Library_management_system {
   
    

    public static void AdminMenu(){
            while(true){
                System.out.println("");
                System.out.println("***********Administrator Menu***********");
                System.out.println("1. Add Book");
                System.out.println("2. Update Book");
                System.out.println("3. Remove Book");
                System.out.println("4. View Books");
                System.out.println("5. Check Books availabilty");
                System.out.println("6. Issue Book");
                System.out.println("7. Logout");
                System.out.print("Enter Your choice : ");
                
                
                try{
                int choice = s.nextInt();
                s.nextLine();
                
                
                switch(choice){
                    case 1:
                        addBook();
                        break;
                    case 2:
                        updateBook();
                        break;
                    case 3:
                        removeBook();
                        break;
                    case 4:
                        viewBook();
                        break;
                    case 5:
                        checkBooksAvailability();
                        break;
                    case 6:
                        break;
                    case 7:
                        return;
                    default:
                        System.out.println("Invalid Choice! Please Try Again.");
                } 
                }
                catch(InputMismatchException e){
                    System.out.println("Invalid Input! Please Try again.");
                    s.nextLine();
                }
            }
            }
            
    
    
    public static void addBook(){
        
        
        System.out.print("Enter ID of Book: ");
        String id = s.nextLine();
        
        System.out.print("Enter Name of Book: ");
        String name = s.nextLine();
        
        System.out.print("Enter author of Book: ");
        String author = s.nextLine();
        
        System.out.print("Enter author of Book: ");
        String isAvailable = s.nextLine();
        
        saveBook(id, name, author, isAvailable); 
        
    }
    
    public static void saveBook(String id, String name, String author, String isAvailable){
        try{
            FileWriter fileWriter = new FileWriter("books.txt", true);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            
            bw.write("Book ID : " + id);
            bw.newLine();
            bw.write("Book Name : " + name);
            bw.newLine();
            bw.write("Author Name : " + author);
            bw.newLine();
            bw.write("Book Status : " + isAvailable);
            bw.newLine();       
            bw.write("-----------------------");
            bw.newLine();
                
            bw.close();
                
            System.out.println("Book Added Successfully.");
            
        }
        catch(Exception e){
            System.out.println("An error occured while adding book." + e.getMessage());
        }
    }
    
    public static void viewBook(){
        File file = new File("Books.txt");
        try{
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println("error" + e.getMessage());
        }
    }
    
    public static void updateBook(){
        File file = new File("Books.txt");
        StringBuilder updatedBook = new StringBuilder();
        boolean bookFound = false;
        
        System.out.print("Enter the id of the book to remove : ");
        String idToUpdate = s.nextLine();
        
        try(Scanner sc = new Scanner(file)){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                if(line.contains("Book ID : " + idToUpdate)){
                    bookFound = true;
                    System.out.println("Updating Deatils for Book ID : " + idToUpdate);
                    
                    System.out.print("Enter new Name for the book : ");
                    String newName = s.nextLine();
                    
                    if (newName.isEmpty()) {
                    newName = sc.nextLine().split(": ")[1]; // Keep old name
                    }
                    
                    System.out.print("Enter new author for the book : ");
                    String newAuthor = s.nextLine();
                    
                    if (newAuthor.isEmpty()) {
                    newAuthor = sc.nextLine().split(": ")[1]; // Keep old author
                    }
                    
                    System.out.print("Enter new status for the book : ");
                    String newStatus = s.nextLine();
                    
                    if (newStatus.isEmpty()) {
                    newStatus = sc.nextLine().split(": ")[1]; // Keep old author
                    }
                    
                    
                    updatedBook.append("Book ID : ").append(idToUpdate).append("\n");
                    updatedBook.append("Book Name : ").append(newName).append("\n");
                    updatedBook.append("Author Name : ").append(newAuthor).append("\n");
                    updatedBook.append("Book Status : ").append(newStatus).append("\n");
                    updatedBook.append("-----------------");
                    
                    sc.nextLine();
                    sc.nextLine();
                    sc.nextLine();
                }
                else{
                    updatedBook.append(line).append("\n");
                }
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println("Sorry, An Error occured : " + e.getMessage());
            return;
        }
        
        if(bookFound){
            try(FileWriter fw = new FileWriter(file,false)){
                    fw.write(updatedBook.toString());
                    System.out.println("Book updated Successfully.");
            }
            catch(IOException e){
                System.out.println("Sorry, An Error occured while saving : " + e.getMessage());
            }
        }
        else{
            System.out.println("Sorry, Book not found.");
        }
    }
    
    public static void removeBook(){
        File file = new File("Books.txt");
        StringBuilder updatedBook = new StringBuilder();
        boolean bookFound = false;
        
        System.out.print("Enter the id of the book to remove : ");
        String idToRemove = s.nextLine();
        
        try(Scanner sc = new Scanner(file)){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                if(line.contains("Book ID : " + idToRemove)){
                    bookFound = true;
                    
                    sc.nextLine();
                    sc.nextLine();
                    sc.nextLine();
                    sc.nextLine();
                    System.out.println("Book Successfully removed.");
                }
                else{
                    updatedBook.append(line).append("\n");
                }
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println("Sorry, An Error occured : " + e.getMessage());
            return;
        }
        
        if(bookFound){
            try(FileWriter fw = new FileWriter(file,false)){
                    fw.write(updatedBook.toString());
                    System.out.println("Book Inventory updated Successfully.");
            }
            catch(IOException e){
                System.out.println("Sorry, An Error occured while saving : " + e.getMessage());
            }
        }
        else{
            System.out.println("Sorry, Book not found.");
        }
    }
    
    public static void checkBooksAvailability(){
        File file = new File("Books.txt");
        System.out.print("Enter the ID or name of the book to check its availabilty : ");
        String searchBook = s.nextLine();
        
        boolean bookFound = false;
        
        try(Scanner sc = new Scanner(file)){
            while(sc.hasNextLine()){
            String line = sc.nextLine();
            
            if((line.contains("Book ID : " + searchBook) || line.contains("Book Name : " + searchBook)) && line.contains("Book Status : Available")){
                bookFound = true;
                System.out.println("Book Found");
                System.out.println(line);
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                System.out.println("Book is Available.");
                System.out.println("-----------------------");
                break;
            }
            else if((line.contains("Book ID : " + searchBook) || line.contains("Book Name : " + searchBook)) && line.contains("Book Status : Not Available")){
                bookFound = true;
                System.out.println("Book Found");
                System.out.println(line);
                System.out.println(sc.nextLine());
                System.out.println(sc.nextLine());
                System.out.println("Book is Not Available.");
                System.out.println("-----------------------");
                break;
            }
            else{
                System.out.println("Book not found");
            }
        }
        }
        catch(FileNotFoundException e){
            System.out.println("An error occured : " + e.getMessage());
        }
        if(!bookFound){
            System.out.println("Sorry, Book not Found.");
        }
}
}
    
   
    


    
    

