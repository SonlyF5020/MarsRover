package com.zhanhonglai.command;

public class CommandFactory {
    public static Command buildCommand(char commandChar) {
        switch (commandChar) {
            case 'M':
                return new MoveCommand();
            case 'L':
                return new LeftCommand();
            case 'R':
                return new RightCommand();
            default:
                return new UnknowCommand();
        }
    }
}
