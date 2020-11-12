import java.util.ArrayList;

public class Bedroom extends Room{

    private int roomNumber;
    private boolean booked;

    public Bedroom(RoomType type, ArrayList<Guest> guests, int roomNumber) {
        super(type, guests);
        this.roomNumber = roomNumber;
        this.booked = false;
    }



    public boolean isBooked() {
        return booked;
    }

    public void book() {
        this.booked = true;
    }

    public void checkOut(){
        this.booked = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int bill(Booking newBooking){
        this.book();
        return this.getRate() * newBooking.getNights();
    }
}
