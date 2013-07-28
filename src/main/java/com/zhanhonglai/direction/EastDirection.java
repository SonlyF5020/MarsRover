package com.zhanhonglai.direction;

import com.zhanhonglai.rover.Rover;
import com.zhanhonglai.position.RoverPosition;

public class EastDirection extends RoverDirection {
    public EastDirection() {
        super("E");
    }

    @Override
    public void turnLeft(Rover rover) {
        rover.setDirection(new NorthDirection());
    }

    @Override
    public void turnRight(Rover rover) {
        rover.setDirection(new SouthDirection());
    }

    @Override
    public void moveAhead(Rover rover) {
        int tempXposition = rover.getPosition().getXposition();
        int tempYposition = rover.getPosition().getYposition();
        rover.setPosition(new RoverPosition(tempXposition+1,tempYposition));
    }
}
