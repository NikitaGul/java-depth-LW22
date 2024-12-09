package com.edu.chmnu.ki_123.c3;

import java.util.List;

public enum Command {
    FORWARD("Forward"),
    BACKWARD("Backward"),
    LEFT("Left"),
    RIGHT("Right");

    private final String description;

    Command(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void printAllCommandsInList(List<Command> commandsList){
        EnumUtils.addCommandsToListAndPrint(commandsList);
    }

    public static void printAllCommands(){
        EnumUtils.printAllCommands();
    }
}
