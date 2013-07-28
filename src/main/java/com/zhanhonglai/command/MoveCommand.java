package com.zhanhonglai.command;

import com.zhanhonglai.rover.Rover;


public class MoveCommand implements Command {
    @Override
    public void handleCommand(Rover rover) {
        rover.move();
    }
}
