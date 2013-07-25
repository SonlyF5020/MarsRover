package com.zhanhonglai.direction;

import com.zhanhonglai.Rover;

public class SouthDirection extends RoverDirection {
    public SouthDirection() {
        super("south");
    }

    @Override
    public void turnLeft(Rover rover) {
        rover.setDirection(new EastDirection());
    }

    @Override
    public void turnRight(Rover rover) {
        rover.setDirection(new WestDirection());
    }
}
