# Task-4 : Java File I/O - Notes App

## Objectives:
I created a simple text-based Notes App using Java that allows users to add and view notes, with data being saved into a file using FileWriter and FileReader.

## Tools Used:
- Java(JVM)
- VS Code
- Terminal

## Features:
- Allows users to add and save notes.
- Displays all previously saved notes.
- Notes are stored in a .txt file for persistence.
- Keeps running until the user chooses to exit.
- 
## Files Used:
- Notes.java - Handles file operations
- Main.java - main class which handles user input and menu
  
## Steps I Followed:
- I created two classes — one for the menu (Main.java) and one for file operations (Notes.java).
- Used Scanner to take input from the user.
- Used FileWriter in append mode to write notes into a file.
- Used BufferedReader with FileReader to read and display saved notes.
- Used a while loop to keep the app running until the user chooses to exit.

## Outcome:
Through this task, I learned how to:
- Use FileWriter to write data into a file.
- Use BufferedReader and FileReader to read text from a file.
- Organize code into separate classes for better readability.
- Build a real-time application using simple Java concepts.
- Handle file-related logic like creating, reading, and appending data.
