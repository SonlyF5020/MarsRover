package com.zhanhonglai.position;

public class RoverPosition {
    private int xposition;
    private int yposition;

    public RoverPosition(int xposition, int yposition) {
        this.xposition = xposition;
        this.yposition = yposition;
    }

    public int getXposition() {
        return xposition;
    }

    public int getYposition() {
        return yposition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoverPosition that = (RoverPosition) o;

        if (xposition != that.xposition) return false;
        if (yposition != that.yposition) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = xposition;
        result = 31 * result + yposition;
        return result;
    }

    @Override
    public String toString() {
        return "( "+xposition+" , "+yposition+" )";
    }
}
