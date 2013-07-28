package com.zhanhonglai.command;

import com.zhanhonglai.rover.Rover;


public class LeftCommand implements Command {

    @Override
    public void handleCommand(Rover rover) {
        rover.turnLeft();
    }
}
