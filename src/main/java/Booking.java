public class Booking{

    private int nights;
    private Bedroom bedRoom;

    public Booking(int nights, Bedroom bedRoom) {
        this.nights = nights;
        this.bedRoom = bedRoom;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public Bedroom getBedRoom() {
        return bedRoom;
    }

    public void setBedRoom(Bedroom bedRoom) {
        this.bedRoom = bedRoom;
    }
}