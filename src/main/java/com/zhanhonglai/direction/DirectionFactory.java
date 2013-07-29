package com.zhanhonglai.direction;

public class DirectionFactory {
    public static RoverDirection buildDirection(String directionString) {
        if (directionString.equalsIgnoreCase("w")) {
            return new WestDirection();
        }
        if (directionString.equalsIgnoreCase("e")) {
            return new EastDirection();
        }
        if (directionString.equalsIgnoreCase("s")) {
            return new SouthDirection();
        }
        if (directionString.equalsIgnoreCase("n")) {
            return new NorthDirection();
        } else return null;
    }
}
