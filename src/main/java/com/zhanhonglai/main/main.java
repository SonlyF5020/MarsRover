package com.zhanhonglai.main;

import com.zhanhonglai.handler.RoverHandler;
import com.zhanhonglai.rover.Rover;

public class main {
    public static void main(String[] args) {
        Rover rover = new Rover();
        RoverHandler handler = new RoverHandler();
        handler.setRover(rover);
        handler.run();
    }
}
