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

    public void removeTask(int taskIndex) {
        try {
            tasks.remove(taskIndex);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Not a task in the list.");
        }
    }
}