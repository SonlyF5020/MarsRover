package com.zhanhonglai.direction;

import com.zhanhonglai.rover.Rover;
import com.zhanhonglai.position.RoverPosition;

public class SouthDirection extends RoverDirection {
    public SouthDirection() {
        super("S");
    }

    @Override
    public void turnLeft(Rover rover) {
        rover.setDirection(new EastDirection());
    }

    @Override
    public void turnRight(Rover rover) {
        rover.setDirection(new WestDirection());
    }

    @Override
    public void moveAhead(Rover rover) {
        int tempXposition = rover.getPosition().getXposition();
        int tempYposition = rover.getPosition().getYposition();
        rover.setPosition(new RoverPosition(tempXposition,tempYposition-1));
    }
}
