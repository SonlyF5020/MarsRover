import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverMoveTest {
    Rover rover = new Rover();

    @Before
    public void setUp() {
        RoverPosition initialPosition = new RoverPosition(2, 3);
        rover.setPosition(initialPosition);
    }

    @Test
    public void shouldArrive_3_3_while_move_east_from_2_3() throws OutOfBoundException {
        //GIVEN
        rover.setDirection(RoverDirection.EAST);
        RoverPosition expectedPosition = new RoverPosition(3,3);
        //WHEN
        rover.move();
        //THEN
        assertTrue(rover.getPosition().equals(expectedPosition));
    }

    @Test
    public void shouldArrive_1_3_while_move_west_from_2_3() throws OutOfBoundException {
        //GIVEN
        rover.setDirection(RoverDirection.WEST);
        RoverPosition expectedPosition = new RoverPosition(1,3);
        //WHEN
        rover.move();
        //THEN
        assertTrue(rover.getPosition().equals(expectedPosition));
    }

    @Test
    public void shouldArrive_2_4_while_move_north_from_2_3() throws OutOfBoundException {
        //GIVEN
        rover.setDirection(RoverDirection.NORTH);
        RoverPosition expectedPosition = new RoverPosition(2,4);
        //WHEN
        rover.move();
        //THEN
        assertTrue(rover.getPosition().equals(expectedPosition));
    }

    @Test
    public void shouldArrive_2_2_while_move_south_from_2_3() throws Exception, OutOfBoundException {
        //GIVEN
        rover.setDirection(RoverDirection.SOUTH);
        RoverPosition expectedPosition = new RoverPosition(2,2);
        //WHEN
        rover.move();
        //THEN
        assertTrue(rover.getPosition().equals(expectedPosition));
    }
}
