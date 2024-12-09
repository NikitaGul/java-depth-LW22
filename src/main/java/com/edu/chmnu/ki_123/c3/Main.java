package com.edu.chmnu.ki_123.c3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Command.printAllCommands();

        System.out.println("\nAdding commands to a list and printing the list:");

        List<Command> commandList = new ArrayList<>();
        commandList.add(Command.FORWARD);
        commandList.add(Command.BACKWARD);
        commandList.add(Command.LEFT);

        Command.printAllCommandsInList(commandList);

        Command left = Command.LEFT;
        System.out.println(left.getDescription());
    }
}