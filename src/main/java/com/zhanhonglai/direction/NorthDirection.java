package com.zhanhonglai.direction;

import com.zhanhonglai.Rover;

public class NorthDirection extends RoverDirection {

    public NorthDirection() {
        super("north");
    }

    @Override
    public void turnLeft(Rover rover) {
        rover.setDirection(new WestDirection());
    }

    @Override
    public void turnRight(Rover rover) {
        rover.setDirection(new EastDirection());
    }
}
