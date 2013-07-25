package com.zhanhonglai.direction;

import com.zhanhonglai.Rover;

public class WestDirection extends RoverDirection {

    public WestDirection() {
        super("west");
    }

    @Override
    public void turnLeft(Rover rover) {
        rover.setDirection(new SouthDirection());
    }

    @Override
    public void turnRight(Rover rover) {
        rover.setDirection(new NorthDirection());
    }
}
