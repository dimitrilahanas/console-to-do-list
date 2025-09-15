import java.util.ArrayList;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class TaskList {

    private ArrayList<Task> tasks = new ArrayList<>();
    private String database = "database/tasks.txt";
    Task taskInfo = new Task(null, null);

    public void addTask(String taskName, String taskDescription) {
        tasks.add(new Task(taskName, taskDescription));
    }

    public void viewTasks() {
        tasks.forEach(task -> System.out.println(task));
    }

    public void removeTask(String taskContains) {
        tasks.removeIf(task -> task.getTaskName().equals(taskContains));
    }

    public void saveTasks() {
        try (FileWriter writer = new FileWriter(database)) {
            for (Task task : tasks) {
                writer.write(task.toString() + "\n");
            }

        } catch (IOException e) {
            System.out.println("Error." + e.getMessage());
        }
    }

    public void setTasks() {
        Scanner fileInput;
        try {
            fileInput = new Scanner(new File(database));

            while (fileInput.hasNextLine()) {
                String taskName = fileInput.nextLine(); 
                taskInfo.setTaskName(taskName);

                String taskDesc = fileInput.nextLine();
                taskInfo.setTaskDescription(taskDesc);

                addTask(taskName, taskDesc);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}