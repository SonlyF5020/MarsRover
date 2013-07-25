import org.junit.Test;

public class PositionLimitTest {
    @Test(expected = OutOfBoundException.class)
    public void shouldCatchOutOfBoundException() throws Exception, OutOfBoundException {
        //GIVEN
        Rover rover = new Rover();
        RoverPosition initialPosition = new RoverPosition(1,1);
        rover.setPosition(initialPosition);
        rover.setDirection(RoverDirection.NORTH);
        //WHEN
        rover.handleInputCommand("MMMMMM");
    }
}
