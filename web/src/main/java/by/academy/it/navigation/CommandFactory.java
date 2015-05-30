package by.academy.it.navigation;

import by.academy.it.navigation.commands.Command;

public class CommandFactory {

    public static Command getCommand(String page) {
        Commands currentCommand = Commands.valueOf(page.toUpperCase());
        return currentCommand.getCommand();
    }

}
