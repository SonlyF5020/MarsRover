package com.zhanhonglai.rover;

import com.zhanhonglai.direction.NorthDirection;
import com.zhanhonglai.direction.RoverDirection;
import com.zhanhonglai.position.RoverPosition;

public class Rover {
    private RoverDirection direction;
    private RoverPosition position;

    public Rover() {
        this.direction = new NorthDirection();
        this.position = new RoverPosition(0,0);
    }

    public void setDirection(RoverDirection position) {
        this.direction = position;
    }

    public void turnLeft() {
        direction.turnLeft(this);
    }

    public RoverDirection getDirection() {
        return direction;
    }

    public void turnRight() {
        direction.turnRight(this);
    }

    public void move() {
        direction.moveAhead(this);
    }

    public RoverPosition getPosition() {
        return position;
    }

    public void setPosition(RoverPosition position) {
        this.position = position;
    }
}
