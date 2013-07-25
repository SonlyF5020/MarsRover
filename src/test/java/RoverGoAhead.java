import com.zhanhonglai.Rover;
import com.zhanhonglai.direction.EastDirection;
import com.zhanhonglai.direction.RoverDirection;
import com.zhanhonglai.direction.WestDirection;
import com.zhanhonglai.position.RoverPosition;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RoverGoAhead {
    @Test
    public void shouldArrive_3_3_WhenMoveEastFrom_2_3(){
        //GIVEN
        Rover rover = new Rover();
        RoverDirection initialDirection = new EastDirection();
        rover.setDirection(initialDirection);
        //WHEN
        rover.move();
        //THEN
        assertThat((RoverPosition) rover.getPosition(),equalTo(new RoverPosition()));
    }
}
