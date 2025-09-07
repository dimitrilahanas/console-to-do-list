import java.util.Scanner;

public class Controller {

    Scanner input = new Scanner(System.in);

    // Task Inputs
    TaskList list = new TaskList();

    private void createTask() {
        System.out.print("Enter task name: ");
        String taskName = input.nextLine();

        System.out.print("Enter task description: ");
        String taskDescription = input.nextLine();

        list.addTask(taskName, taskDescription);
        System.out.println(taskName + " has been to your task list.");
    }

    // Commands Inputs
    Command command = new Command();

    private void selectCommand() {
        
        int selection;

        do {
            System.out.print("Select a command: ");
            selection = input.nextInt();
            input.nextLine();

            switch (selection) {
                case 0:
                    System.out.println("Exiting System...");
                    break;
                case 1:
                    createTask();
                    break;
                case 2:
                    list.viewTasks();
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