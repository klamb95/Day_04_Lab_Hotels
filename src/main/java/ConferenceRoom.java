public class ConferenceRoom extends Room {
    private String roomName;

    public ConferenceRoom(RoomType roomType, String roomName){
        super(roomType);
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }
}
