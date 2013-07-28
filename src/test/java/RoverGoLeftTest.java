import com.zhanhonglai.direction.*;
import com.zhanhonglai.rover.Rover;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverGoLeftTest {

    @Test
    public void directionShouldBeWestWhenTurnLeftFromNorth(){
        //GIVEN
        Rover rover = new Rover();
        RoverDirection initialDirection = new NorthDirection();
        rover.setDirection(initialDirection);
        //WHEN
        rover.turnLeft();
        //THEN
        assertThat(rover.getDirection().getDirectionString(),is("W"));
    }

    @Test
    public void directionShouldBeSouthWhenTurnLeftFromWest() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        RoverDirection initialDirection = new WestDirection();
        rover.setDirection(initialDirection);
        //WHEN
        rover.turnLeft();
        //THEN
        assertThat(rover.getDirection().getDirectionString(),is("S"));
    }

    @Test
    public void directionShouldBeEastWhenTurnLeftFromSouth() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        RoverDirection initialDirection = new SouthDirection();
        rover.setDirection(initialDirection);
        //WHEN
        rover.turnLeft();
        //THEN
        assertThat(rover.getDirection().getDirectionString(),is("E"));
    }

    @Test
    public void directionShouldBeNorthWhenTurnLeftFromEast() throws Exception {
        //GIVEN
        Rover rover = new Rover();
        RoverDirection initialDirection = new EastDirection();
        rover.setDirection(initialDirection);
        //WHEN
        rover.turnLeft();
        //THEN
        assertThat(rover.getDirection().getDirectionString(),is("N"));
    }

}
