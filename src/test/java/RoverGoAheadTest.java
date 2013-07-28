import com.zhanhonglai.rover.Rover;
import com.zhanhonglai.direction.*;
import com.zhanhonglai.position.RoverPosition;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class RoverGoAheadTest {
    @Test
    public void shouldArrive_3_3_WhenMoveEastFrom_2_3() {
        //GIVEN
        Rover rover = new Rover();
        RoverDirection initialDirection = new EastDirection();
        rover.setDirection(initialDirection);
        RoverPosition initialPosition = new RoverPosition(2, 3);
        rover.setPosition(initialPosition);
        //WHEN
        rover.move();
        //THEN
        assertTrue(rover.getPosition().equals(new RoverPosition(3, 3)));
    }

    @Test
    public void shouldArrive_2_4_WhenMoveNorthFrom_2_3() {
        //GIVEN
        Rover rover = new Rover();
        RoverDirection initialDirection = new NorthDirection();
        rover.setDirection(initialDirection);
        RoverPosition initialPosition = new RoverPosition(2, 3);
        rover.setPosition(initialPosition);
        //WHEN
        rover.move();
        //THEN
        assertTrue(rover.getPosition().equals(new RoverPosition(2, 4)));
    }

    @Test
    public void shouldArrive_1_3_WhenMoveWestFrom_2_3() {
        //GIVEN
        Rover rover = new Rover();
        RoverDirection initialDirection = new WestDirection();
        rover.setDirection(initialDirection);
        RoverPosition initialPosition = new RoverPosition(2, 3);
        rover.setPosition(initialPosition);
        //WHEN
        rover.move();
        //THEN
        assertTrue(rover.getPosition().equals(new RoverPosition(1, 3)));
    }

    @Test
    public void shouldArrive_2_2_WhenMoveSouthFrom_2_3() {
        //GIVEN
        Rover rover = new Rover();
        RoverDirection initialDirection = new SouthDirection();
        rover.setDirection(initialDirection);
        RoverPosition initialPosition = new RoverPosition(2, 3);
        rover.setPosition(initialPosition);
        //WHEN
        rover.move();
        //THEN
        assertTrue(rover.getPosition().equals(new RoverPosition(2, 2)));
    }
}
