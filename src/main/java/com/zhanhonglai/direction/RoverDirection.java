package com.zhanhonglai.direction;

import com.zhanhonglai.Rover;

public abstract class RoverDirection {
    private String directionString;

    public RoverDirection(String directionString) {
        this.directionString = directionString;
    }

    public abstract void turnLeft(Rover rover);

    public String getDirectionString() {
        return directionString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoverDirection that = (RoverDirection) o;

        if (directionString != null ? !directionString.equals(that.directionString) : that.directionString != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        return directionString != null ? directionString.hashCode() : 0;
    }

    public abstract void turnRight(Rover rover);

    public abstract void moveAhead(Rover rover);
}
