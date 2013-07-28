package com.zhanhonglai.command;

import com.zhanhonglai.rover.Rover;

public class UnknowCommand implements Command {
    @Override
    public void handleCommand(Rover rover) {
        System.out.println("unknow command!");
    }
}
