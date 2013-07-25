
public class RoverPosition {
    private int xPosition;
    private int yPosition;

    public RoverPosition(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public void change(RoverDirection direction) throws OutOfBoundException {
        int temp_xPosition = xPosition;
        int temp_yPosition = yPosition;
        switch (direction) {
            case EAST:
                temp_xPosition++;
                break;
            case WEST:
                temp_xPosition--;
                break;
            case SOUTH:
                temp_yPosition--;
                break;
            case NORTH:
                temp_yPosition++;
                break;
            default:
                break;
        }
        RoverPosition tempPosition = new RoverPosition(temp_xPosition, temp_yPosition);
        if (RoverController.isIllegal(tempPosition)){
            xPosition = temp_xPosition;
            yPosition = temp_yPosition;
        }
        else{
            throw new OutOfBoundException("outOfBound");
        }
    }

    public static RoverPosition buildPositionFromString(String positionString) {
        String[] result = positionString.split(" ");
        int xPosition = Integer.parseInt(result[0]);
        int yPosition = Integer.parseInt(result[1]);
        return new RoverPosition(xPosition,yPosition);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoverPosition that = (RoverPosition) o;
        return xPosition == that.xPosition && yPosition == that.yPosition;
    }

    @Override
    public int hashCode() {
        int result = xPosition;
        result = 31 * result + yPosition;
        return result;
    }

    public boolean locateIn(RoverPosition limitPosition) {
        return xPosition<=limitPosition.getXPosition()&&yPosition<=limitPosition.getYPosition()&&xPosition>=0&&yPosition>=0;
    }
}
