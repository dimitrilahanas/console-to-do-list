import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class TaskList {

    private ArrayList<Task> tasks = new ArrayList<>();

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
        try (FileWriter writer = new FileWriter("database/tasks.txt")) {
            tasks.forEach(task -> {
                try {
                    writer.write(task.toString() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

        } catch (IOException e) {
            System.out.println("Error." + e.getMessage());
        }
    }
}