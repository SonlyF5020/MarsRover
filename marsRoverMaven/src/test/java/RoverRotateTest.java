import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverRotateTest {
    Rover rover;
    @Before
    public void setUp(){
        rover = new Rover();
    }

    @Test
    public void should_get_direction_WEST_while_turn_left_at_the_initial_direction_NORTH(){
        RoverDirection initialDirection = RoverDirection.NORTH;
        rover.setDirection(initialDirection);
        rover.turnLeft();
        assertThat(rover.getDirection(),is(RoverDirection.WEST));
    }

    @Test
    public void should_get_direction_EAST_while_turn_right_at_the_initial_direction_NORTH(){
        RoverDirection initialDirection = RoverDirection.NORTH;
        rover.setDirection(initialDirection);
        rover.turnRight();
        assertThat(rover.getDirection(),is(RoverDirection.EAST));
    }

    @Test
    public void should_get_direction_NORTH_while_turn_left_at_the_initial_direction_EAST(){
        RoverDirection initialDirection = RoverDirection.EAST;
        rover.setDirection(initialDirection);
        rover.turnLeft();
        assertThat(rover.getDirection(),is(RoverDirection.NORTH));
    }
    @Test
    public void should_get_direction_SOUTH_while_turn_right_at_the_initial_direction_EAST(){
        RoverDirection initialDirection = RoverDirection.EAST;
        rover.setDirection(initialDirection);
        rover.turnRight();
        assertThat(rover.getDirection(),is(RoverDirection.SOUTH));
    }

    @Test
    public void should_get_direction_EAST_while_turn_left_at_the_initial_direction_SOUTH(){
        RoverDirection initialDirection = RoverDirection.SOUTH;
        rover.setDirection(initialDirection);
        rover.turnLeft();
        assertThat(rover.getDirection(),is(RoverDirection.EAST));
    }
    @Test
    public void should_get_direction_WEST_while_turn_right_at_the_initial_direction_SOUTH(){
        RoverDirection initialDirection = RoverDirection.SOUTH;
        rover.setDirection(initialDirection);
        rover.turnRight();
        assertThat(rover.getDirection(),is(RoverDirection.WEST));
    }
    @Test
    public void should_get_direction_SOUTH_while_turn_left_at_the_initial_direction_WEST(){
        RoverDirection initialDirection = RoverDirection.WEST;
        rover.setDirection(initialDirection);
        rover.turnLeft();
        assertThat(rover.getDirection(),is(RoverDirection.SOUTH));
    }
    @Test
    public void should_get_direction_NORTH_while_turn_right_at_the_initial_direction_WEST(){
        RoverDirection initialDirection = RoverDirection.WEST;
        rover.setDirection(initialDirection);
        rover.turnRight();
        assertThat(rover.getDirection(),is(RoverDirection.NORTH));
    }
}
