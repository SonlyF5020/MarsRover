package com.zhanhonglai.command;

import com.zhanhonglai.rover.Rover;


public class RightCommand implements Command {
    @Override
    public void handleCommand(Rover rover) {
        rover.turnRight();
    }
}
