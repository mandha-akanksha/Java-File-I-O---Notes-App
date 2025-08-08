package Day4_task;
import java.io.*; // Importing input-output classes

public class Notes {
    private final String fileName = "notes.txt"; // File name where notes are stored

    // Method to save note in file
    public void saveNote(String note) {
        try {
            // FileWriter is used to write data into a file.
            // "true" means append mode – adds note to the end without removing existing notes
            FileWriter fileWriter = new FileWriter(fileName, true);
            
            // Writting the note and adding a newline after it
            fileWriter.write(note + "\n");

            // Close the FileWriter to save and release file
            fileWriter.close();

            System.out.println("Note saved"); 
        } catch (IOException e) {
            System.out.println("Error saving note");
        }
    }

    // Method to read and show notes from the file
    public void readNotes() {
        try {
            // Creating File object to check if file exists
            File file = new File(fileName);

            // If file does not exist, shows message and return
            if (!file.exists()) {
                System.out.println("No notes found");
                return;
            }

            // FileReader + BufferedReader helps to read file line-by-line
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String line;

            System.out.println("\n--- Saved Notes ---");

            // Reading and printing each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("- " + line); // Display each saved note
            }

            bufferedReader.close(); // Close the reader

        } catch (IOException e) {
            System.out.println("Error reading notes");
        }
    }
}


