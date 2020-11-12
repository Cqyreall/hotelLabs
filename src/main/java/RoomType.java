public enum RoomType {

    SINGLE(1, 45),
    DOUBLE(2, 55),
    CONFERENCEROOM(10, 65),
    DININGROOM(50, 0);

    private final int value;
    private final int rate;

    RoomType(int value, int rate){
        this.value = value;
        this.rate = rate;
    }

    public int getValue() {
        return value;
    }

    public int getRate() {
        return rate;
    }
}
