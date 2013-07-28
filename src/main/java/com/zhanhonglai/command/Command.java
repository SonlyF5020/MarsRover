package com.zhanhonglai.command;

import com.zhanhonglai.rover.Rover;

public interface Command {
    public void handleCommand(Rover rover);
}
