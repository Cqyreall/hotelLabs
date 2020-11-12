import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private String name;
    private boolean booked;

    public ConferenceRoom(RoomType capacity, ArrayList<Guest> guests, String name) {
        super(capacity, guests);
        this.name = name;
        this.booked = false;
    }

    public boolean isBooked() {
        return booked;
    }

    public void book() {
        this.booked = true;
    }

    public void checkOut() {
        this.booked = false;
    }
}
