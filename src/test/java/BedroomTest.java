import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(RoomType.DOUBLE, 66);
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void roomHasNumber(){
        assertEquals(66, bedroom.getRoomNum());
    }

}
