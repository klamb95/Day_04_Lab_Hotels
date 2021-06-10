public class Booking {

    private double totalBill;
    private Room room;
    private int nights;

    public Booking(Guest guest, Room room, int nights){
        this.room = room;
        this.nights = nights;
        this.totalBill = totalBill;
    }

    public double getTotalBill() {
        return this.totalBill = room.getRateFromEnum() * this.nights;
    }

//    public void setTotalBill(double totalBill) {
//        this.totalBill = totalBill;
//    }

    public Room getRoom() {
        return room;
    }

//    public void setRoom(Room room) {
//        this.room = room;
//    }

    public int getNights() {
        return nights;
    }

//    public void setNights(int nights) {
//        this.nights = nights;
//    }
}
