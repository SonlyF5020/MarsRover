
public enum RoverDirection {
    WEST("W"),NORTH("N"),EAST("E"),SOUTH("S");
    private String directionValue;

    private RoverDirection(String directionValue) {
        this.directionValue = directionValue;
    }

    public String getDirectionValue() {
        return directionValue;
    }

    public RoverDirection rightDirection() {
        int index = indexOf(this);
        return RoverDirection.values()[right(index)];
    }

    private int indexOf(RoverDirection roverDirection) {
        for (RoverDirection direction:RoverDirection.values()){
            if (direction.equals(roverDirection)){
                return direction.ordinal();
            }
        }
        return 0;
    }

    private static int right(int index) {
        return ++index>3? 0:index;
    }

    public RoverDirection leftDirection() {
        int index = indexOf(this);
        return RoverDirection.values()[left(index)];
    }

    private int left(int index) {
        return --index<0? 3:index;
    }

    public static RoverDirection build(String directionValue){
        for(RoverDirection roverDirection:RoverDirection.values()){
            if (roverDirection.equals(directionValue)){
                return roverDirection;
            }
        }
        return null;
    }
}
