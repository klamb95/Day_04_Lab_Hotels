import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Guest guest2;
    Bedroom bedroomDouble;
    Bedroom bedroomTriple;
    DiningRoom diningRoom;
    DiningRoom diningRoom2;

    @Before
    public void before() {
        hotel = new Hotel("CodeClan Towers");
        guest = new Guest("Dave");
        guest2 = new Guest("Jim");
        bedroomDouble = new Bedroom(RoomType.DOUBLE, 1);
        bedroomTriple = new Bedroom(RoomType.TRIPLE, 2);
        diningRoom = new DiningRoom(RoomType.DINING, "The Eating Place");
        diningRoom2 = new DiningRoom(RoomType.DINING, "The Other Eating Place");
    }

    @Test
    public void hotelHasName() {
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void hotelRoomsStartEmpty(){
        assertEquals(0, hotel.getRooms());
    }

    @Test
    public void hotelConfRoomsStartEmpty(){
        assertEquals(0, hotel.getConferenceRooms());
    }

    @Test
    public void canAddRooms(){
        hotel.addBedroom(bedroomDouble);
        assertEquals(1, hotel.getRooms());
    }

    @Test
    public void canCheckInGuest() {
        hotel.addBedroom (bedroomDouble);
        hotel.checkInGuest(guest, bedroomDouble, 2);
        assertEquals(1, bedroomDouble.getNumberOfGuests());
    }

    @Test
    public void hashmapOfDiningRooms(){
        hotel.addDiningRoom(diningRoom);
        hotel.addDiningRoom(diningRoom2);
        assertEquals(2, hotel.numberOfDiningRooms());
    }

    @Test
    public void testReturnEmptyRooms(){
        hotel.addBedroom(bedroomDouble);
        hotel.addBedroom(bedroomTriple);
        hotel.checkInGuest(guest, bedroomDouble, 2);
        assertEquals(1, hotel.numberOfEmptyRooms());
    }

    @Test
    public void checkIntoFullHotel(){
        hotel.addBedroom(bedroomDouble);
        hotel.checkInGuest(guest, bedroomDouble, 2);
        hotel.checkInGuest(guest2, bedroomDouble, 2);
        assertEquals(1, bedroomDouble.getNumberOfGuests());
    }
}
