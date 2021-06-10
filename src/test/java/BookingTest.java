import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Room room;
    Hotel hotel;
    Guest guest;

    @Before
    public void before(){
        room = new Bedroom(RoomType.DOUBLE, 01);
        booking = new Booking(guest, room, 3);
    }

    @Test
    public void bookingHasRoom(){
        assertEquals(room, booking.getRoom());
    }

    @Test
    public void bookingHasNights() {
        assertEquals(3, booking.getNights());
    }

    @Test
    public void canGetBill(){
        assertEquals(150.00, booking.getTotalBill(), 0.0);
    }
}
