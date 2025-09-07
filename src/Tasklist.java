import java.util.ArrayList;

public class TaskList {

    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String taskName, String taskDescription) {
        tasks.add(new Task(taskName, taskDescription));
    }

    public void viewTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}