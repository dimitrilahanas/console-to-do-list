public class Command {
    private String[] commandList() {
        String[] supportedCommands = {
            "0 - Exit System",
            "1 - Create Task",
            "2 - View Task",
            "3 - Delete Task"
        };

        return supportedCommands;
    }

    public void getCommandList() {
        for (String commands : commandList()) {
            System.out.println(commands);
        }
    }
}
