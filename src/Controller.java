import java.util.Scanner;

public class Controller {

    private String[] commandList() {
        String[] supportedCommands = {
            "0 - Exit System",
            "1 - Create Task",
            "2 - View Task",
            "3 - Delete Task"
        };

        return supportedCommands;
    }

    private void getCommandList() {
        for (String commands : commandList()) {
            System.out.println(commands);
        }
    }

    private void selectCommand() {
        Scanner input = new Scanner(System.in);
        int selection;

        do {
            System.out.print("Select a command: ");
            selection = input.nextInt();

            switch (selection) {
                case 0:
                    System.out.println("Exiting System...");
                    break;
                case 1:
                    System.out.println("Create Task.");
                    break;
                case 2:
                    System.out.println("View Task.");
                    break;
                case 3:
                    System.out.println("Delete Task.");
                    break;
                default:
                    System.out.println("Invalid Command.");
                    break;
            }
        }
        while (selection != 0);
        input.close();
    }

    public void runner() {
        getCommandList();
        selectCommand();
    }

}