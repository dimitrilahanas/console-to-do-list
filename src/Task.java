import java.util.Scanner;

public class Task {
    private String taskName;
    private String taskDescription;

    public Task(String taskName, String taskDescription) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    Scanner input = new Scanner(System.in);

    private void setTaskName() {
        System.out.print("Enter task name: ");
        taskName = input.nextLine();
    }

    private void setTaskDesciption() {
        System.out.print("Enter task description: ");
        taskDescription = input.nextLine();
    }

    private String getTaskName() {
        return taskName;
    }
    
    private String getTaskDescription() {
        return taskDescription;
    }

}