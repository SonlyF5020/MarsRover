import java.util.Scanner;

import static java.lang.Thread.sleep;

public class RoverController {

    Rover rover = new Rover();
    private static final RoverPosition LIMIT_POSITION = new RoverPosition(5,5);
    public void RoverGo() throws InterruptedException, OutOfBoundException {
        acceptInitialPosition();
        acceptInitialDirection();
        handleCommand();
        outShowRover();
    }

    private void outShowRover() {
        rover.showDetails();
    }

    private void handleCommand() throws InterruptedException, OutOfBoundException {
        System.out.print("Commands : ");
        Scanner scanner = new Scanner(System.in);
        String commandString = scanner.nextLine().trim();
        movingInformation();
        rover.handleInputCommand(commandString);
    }

    private void movingInformation() throws InterruptedException {

        System.out.println("   [Engine Start]");
        int i=0;
        while(i<6){
            sleep(1000);
            System.out.print("        .");
            i++;
        }
        System.out.println("      [Arrive]");
    }

    private void acceptInitialDirection() {
        System.out.print("Initial Direction : ");
        Scanner scanner = new Scanner(System.in);
        String directionString = scanner.nextLine().trim();
        RoverDirection initialDirection = RoverDirection.build(directionString);
        rover.setDirection(initialDirection);
    }

    private void acceptInitialPosition() {
        System.out.print("Initial Position : ");
        Scanner scanner = new Scanner(System.in);
        String positionString = scanner.nextLine().trim();
        RoverPosition initialPosition = RoverPosition.buildPositionFromString(positionString);
        rover.setPosition(initialPosition);
    }

    public static boolean isIllegal(RoverPosition roverPosition) {
        return roverPosition.locateIn(LIMIT_POSITION);
    }
}
