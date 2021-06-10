import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceroom;

    @Before
    public void before(){
        conferenceroom = new ConferenceRoom(RoomType.CONFERENCE, "Edinburgh Room");
    }

    @Test
    public void roomHasType(){
        assertEquals(RoomType.CONFERENCE, conferenceroom.getRoomType());
    }

    @Test
    public void roomStartsEmpty(){
        assertEquals(0, conferenceroom.getNumberOfGuests());
    }

    @Test
    public void roomHasName(){
        assertEquals("Edinburgh Room", conferenceroom.getRoomName());
    }
}
