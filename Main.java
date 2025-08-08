package Day4_task;

import java.util.Scanner;

public class Main {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Notes notes = new Notes(); // Creating object of Notes class
        int choice = 0;

        
        while (choice != 3) {
            
            System.out.println("\n ---Simple Notes App--- ");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
           // scanner.nextLine(); 
           
            if (choice == 1) {
                // If user selects Add Note
                System.out.print("Enter your note: ");
                String note = scanner.next(); 
                notes.saveNote(note); // Calling method to save note in file
            } else if (choice == 2) {
                // If user selects View Notes
                notes.readNotes(); // Calling method to read and display notes
            } else if (choice == 3) {
                System.out.println("Exit");
            } else {
                System.out.println("enter a valid option.");
            }
        }

    }
}


