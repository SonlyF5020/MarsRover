import com.zhanhonglai.rover.Rover;
import com.zhanhonglai.direction.*;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RoverGoRightTest {

    @Test
    public void directionShouldBeSouthWhenTurnLeftFromEast(){
        //GIVEN
        Rover rover = new Rover();
        RoverDirection initialDirection = new EastDirection();
        rover.setDirection(initialDirection);
        //WHEN
        rover.turnRight();
        //THEN
        assertThat(rover.getDirection().getDirectionString(),is("south"));
    }

    @Test
    public void directionShouldBeWestWhenTurnLeftFromSouth(){
        //GIVEN
        Rover rover = new Rover();
        RoverDirection initialDirection = new SouthDirection();
        rover.setDirection(initialDirection);
        //WHEN
        rover.turnRight();
        //THEN
        assertThat(rover.getDirection().getDirectionString(),is("west"));
    }

    @Test
    public void directionShouldBeNorthWhenTurnLeftFromWest(){
        //GIVEN
        Rover rover = new Rover();
        RoverDirection initialDirection = new WestDirection();
        rover.setDirection(initialDirection);
        //WHEN
        rover.turnRight();
        //THEN
        assertThat(rover.getDirection().getDirectionString(),is("north"));
    }

    @Test
    public void directionShouldBeEastWhenTurnLeftFromNorth(){
        //GIVEN
        Rover rover = new Rover();
        RoverDirection initialDirection = new NorthDirection();
        rover.setDirection(initialDirection);
        //WHEN
        rover.turnRight();
        //THEN
        assertThat(rover.getDirection().getDirectionString(),is("east"));
    }
}
