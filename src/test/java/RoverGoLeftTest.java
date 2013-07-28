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
        assertThat(rover.getDirection().getDirectionString(),is("west"));
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
        assertThat(rover.getDirection().getDirectionString(),is("south"));
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
        assertThat(rover.getDirection().getDirectionString(),is("east"));
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
        assertThat(rover.getDirection().getDirectionString(),is("north"));
    }

}
