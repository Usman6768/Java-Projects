# Library Management System

The **Library Management System** is a Java-based console application that allows administrators and users to manage books in a library. The application offers functionalities for administrators to add, update, and remove books, as well as for users to search and borrow books.

## Features

### Administrator:
- Add books to the library.
- Update book details (ID, name, author, status).
- Remove books from the library.
- View the list of all books.
- Check the availability status of books.
- Logout from the system.

### User:
- Search for books by ID, name, or author.
- View the list of available books.
- Check the availability of a specific book.
- Logout from the system.

## Technologies Used
- **Java**: The core programming language used for this project.
- **Java I/O**: Used for file handling to store and retrieve book records.
- **OOP Principles**: Encapsulation, inheritance, and polymorphism.
- **Exception Handling**: Ensures smooth user experience by managing errors like invalid inputs or file not found.
- **Multi-threading**: Used to simulate loading effects during login and logout.

## Prerequisites

To run this project, ensure you have the following installed:

- **Java 8 or later**
- **IDE** (e.g., IntelliJ IDEA, Eclipse) or a text editor with command-line tools
- **Git** (optional, for version control)

## Project Structure

The project contains three main classes:

1. `Library_management_system`: The main class that contains the login system and main menu.
2. `Administrator`: This class contains the functionalities for the administrator to manage books.
3. `User`: This class provides features for users to search and view book information.

## How to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/Usman6768/library-management-system.git
    cd library-management-system
    ```

2. Compile and run the Java program using the command line or your IDE.

   - If using the command line:
     ```bash
     javac -d bin src/library_management_system/*.java
     java -cp bin library_management_system.Library_management_system
     ```

3. The program will display the main menu with options to login as an Administrator or User.

4. Use the following credentials for login:
    - **Administrator**: `admin123`
    - **User**: `user123`

## Functionalities Overview

### 1. **Admin Functionalities:**
   - Add, update, remove, and check the availability of books.
   - Stores the books' details in a text file named `books.txt`.

### 2. **User Functionalities:**
   - Search for books by ID, name, or author.
   - View books and check their availability.

## File Structure

```
library-management-system/
│
├── src/ 
│   └── library_management_system/  
│        ├── Library_management_system.java
│        ├── Administrator.java
│        └── User.java
│
├── bin/  (Compiled files)
├── books.txt  (Stores book information)
├── README.md  (Project documentation)
└── .gitignore
```

## Issues & Contributions

Feel free to submit issues or pull requests if you find any bugs or want to contribute to improving the project.

