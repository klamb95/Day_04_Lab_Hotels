public enum RoomType {

    SINGLE(1, 35.00),
    DOUBLE(2, 50.00),
    TRIPLE(3, 75.00),
    FAMILY(4, 124.99),
    DINING(100, 0.0),
    CONFERENCE(50, 350.00);

    private final int capacity;
    private final double rate;

    RoomType(int value, double rate){
        this.capacity = value;
        this.rate = rate;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public double getRate() {
        return this.rate;
    }
}
