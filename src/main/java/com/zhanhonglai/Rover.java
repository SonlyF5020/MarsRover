package com.zhanhonglai;

import com.zhanhonglai.direction.RoverDirection;

public class Rover {
    private RoverDirection direction;
    private Object position;

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

    public Object getPosition() {
        return position;
    }
}
