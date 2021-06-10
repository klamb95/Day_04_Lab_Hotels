import java.util.ArrayList;

public abstract class Room {

    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(RoomType roomType){
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public int getCapacityFromEnum() {
        return this.roomType.getCapacity();
    }

    public double getRateFromEnum(){
        return this.roomType.getRate();
    }

    public int getNumberOfGuests(){
        return this.guests.size();

    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }
}
