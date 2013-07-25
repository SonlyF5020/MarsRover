import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HandleAcceptCommandTest {
    @Test
    public void should_arrive_2_3_when_accept_MRMLM_command_at_the_initialPosition_1_1_north() throws OutOfBoundException {
        //GIVEN
        Rover rover = new Rover();
        RoverPosition initialPosition = new RoverPosition(1,1);
        rover.setPosition(initialPosition);
        rover.setDirection(RoverDirection.NORTH);
        //WHEN
        rover.handleInputCommand("MRMLdafaM");
        //THEN
        assertThat(rover.getPosition().getXPosition(), is(2));
        assertThat(rover.getPosition().getYPosition(), is(3));
        assertThat(rover.getDirection(),is(RoverDirection.NORTH));
    }
}
