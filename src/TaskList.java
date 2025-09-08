import java.util.ArrayList;

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
}