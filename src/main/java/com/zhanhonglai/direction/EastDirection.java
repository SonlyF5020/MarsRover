package com.zhanhonglai.direction;

import com.zhanhonglai.Rover;

public class EastDirection extends RoverDirection {
    public EastDirection() {
        super("east");
    }

    @Override
    public void turnLeft(Rover rover) {
        rover.setDirection(new NorthDirection());
    }

    @Override
    public void turnRight(Rover rover) {
        rover.setDirection(new SouthDirection());
    }
}
