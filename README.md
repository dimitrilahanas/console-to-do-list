# TodoApp

A simple Java console-based Todo application that allows you to create, view, and delete tasks. Tasks are saved to a text file so that they persist between program runs.

## Features
- Create a new task with a name and description
- View all saved tasks
- Remove a task by name
- Tasks are persisted to a local file (`database/tasks.txt`)

## How to Run
1. Clone or download the repository to your local machine.
2. Ensure you have Java (JDK 8 or higher) installed.
3. Compile the project:
   ```bash
   javac *.java
   ```
4. Run the program:
   ```bash
   java TodoApp
   ```

### Alternative run methods
- If you have a build script (`build.sh` for Linux/Mac or `build.bat` for Windows), run:
  ```bash
  ./build.sh
  ```
  or
  ```bash
  build.bat
  ```
- In some IDEs (like VSCode or IntelliJ), you can simply **open the project and run `TodoApp.java`**.

## File Structure
- `TodoApp.java` → Main entry point
- `Controller.java` → Handles user input and command loop
- `TaskList.java` → Manages task storage, saving, and loading
- `Task.java` → Defines a task (name + description)
- `Command.java` → Displays supported commands
- `database/tasks.txt` → File where tasks are stored

## To Be Implemented
The current version is functional but basic. Future improvements could include:
- **Task editing**: Ability to modify a task's name or description after creation.
- **Due dates**: Assign deadlines to tasks and display overdue/urgent ones.
- **Task IDs**: Assign unique IDs to tasks for easier reference instead of name matching.
- **Confirmation prompts**: Ask for confirmation before deleting a task.
- **Sorting and filtering**: Sort tasks alphabetically, by creation time, or by due date.
- **Improved persistence format**: Use JSON or CSV instead of plain text for safer, more extensible task storage.
- **Search functionality**: Search tasks by keywords.
- **User interface enhancements**: Improve the console menu or create a graphical UI in the future.

---

This project is aimed for me to experiment with Java, OOP, and file handling.
