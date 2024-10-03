
package library_management_system;

import java.util.InputMismatchException;

public class User extends Library_management_system {
        // User Menu
        public static void UserMenu(){
            while(true){
                System.out.println("");
                System.out.println("User Menu");
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
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
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
}
