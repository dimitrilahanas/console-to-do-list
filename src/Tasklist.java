import java.util.ArrayList;

public class Tasklist {
    
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String taskName, String taskDescription) {
        tasks.add(new Task(taskName, taskDescription));
    }
}