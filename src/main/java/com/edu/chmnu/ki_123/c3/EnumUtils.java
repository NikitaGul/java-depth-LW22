package com.edu.chmnu.ki_123.c3;

import java.util.ArrayList;
import java.util.List;

public class EnumUtils {

    public static void addCommandsToListAndPrint(List<Command> commandList) {
        System.out.println("Commands in the list:");
        for (Command command : commandList) {
            System.out.println(command + " - " + command.getDescription());
        }
    }

    public static void printAllCommands() {
        System.out.println("Available commands:");
        for (Command command : Command.values()) {
            System.out.println(command + " - " + command.getDescription());
        }
    }
}
