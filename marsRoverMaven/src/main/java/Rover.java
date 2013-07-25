
public class Rover {
    private RoverPosition position;
    private RoverDirection direction;

    public void setPosition(RoverPosition position) {
        this.position = position;
    }

    public void setDirection(RoverDirection direction) {
        this.direction = direction;
    }

    public void move() throws OutOfBoundException {
            position.change(direction);
    }

    public RoverPosition getPosition() {
        return position;
    }

    public RoverDirection getDirection() {
        return direction;
    }

    public void turnRight() {
        setDirection(direction.rightDirection());
    }

    public void turnLeft() {
        setDirection(direction.leftDirection());
    }

    public void handleInputCommand(String commandString) throws OutOfBoundException {
        String actualString = commandString.trim();
        for (int i=0;i<actualString.length();i++){
          switch (actualString.charAt(i)){
              case 'M':
              case 'm':
                  move();
                  break;
              case 'L':
              case 'l':
                  turnLeft();
                  break;
              case 'R':
              case 'r':
                  turnRight();
                  break;
              default:
                  System.out.println("unKnown command: "+actualString.charAt(i));
                  break;
          }
       }
    }

    public void showDetails() {
        System.out.println("Position : ("+position.getXPosition()+" , "+position.getYPosition()+")");
        System.out.println("Direction : "+direction.getDirectionValue());
    }
}
