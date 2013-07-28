import com.zhanhonglai.direction.EastDirection;
import com.zhanhonglai.direction.NorthDirection;
import com.zhanhonglai.direction.RoverDirection;
import com.zhanhonglai.direction.WestDirection;
import com.zhanhonglai.handler.RoverHandler;
import com.zhanhonglai.position.RoverPosition;
import com.zhanhonglai.rover.Rover;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RoverHandlerTest {
    @Test
    public void shouldCreateInitialPosition() {
        RoverHandler roverHandler = new RoverHandler();
        RoverPosition initialPosition = roverHandler.createInitialPosition("2 3");
        assertTrue(initialPosition.equals(new RoverPosition(2, 3)));
    }

    @Test
    public void shouldCreateInitialDirection() {
        RoverHandler roverHandler = new RoverHandler();
        RoverDirection initialDirection = roverHandler.createInitialDirection("w");
        assertTrue(initialDirection.equals(new WestDirection()));
    }

    @Test
    public void shouldHandleCommandString() {
        //GIVEN
        Rover rover = new Rover();
        RoverHandler roverHandler = new RoverHandler();
        roverHandler.setRover(rover);
        //WHEN
        roverHandler.handleCommand("Mrmlmrmlmrm");
        //THEN
        RoverDirection expectedDirection = new EastDirection();
        RoverPosition expectedPosition = new RoverPosition(3, 3);

        assertTrue(rover.getPosition().equals(expectedPosition));
        assertTrue(rover.getDirection().equals(expectedDirection));
    }
}
