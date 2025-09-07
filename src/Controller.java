import java.util.Scanner;

public class Controller {

    Scanner input = new Scanner(System.in);

    // Task Inputs
    Tasklist tasklist = new Tasklist();
    private void createTask() {
        System.out.print("Enter task name: ");
        String taskName = input.nextLine();

        System.out.print("Enter task description: ");
        String taskDescription = input.nextLine();

        tasklist.addTask(taskName, taskDescription);
        System.out.println("Task " + taskName + " added.");
    }

    // Commands Inputs
    Command command = new Command();

    private void selectCommand() {
        
        int selection;

        do {
            System.out.print("Select a command: ");
            selection = input.nextInt();

            switch (selection) {
                case 0:
                    System.out.println("Exiting System...");
                    break;
                case 1:
                    createTask();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid Command.");
            }
        }
        while (selection != 0);
    }

    public void runner() {
        command.getCommandList();
        selectCommand();
    }

}