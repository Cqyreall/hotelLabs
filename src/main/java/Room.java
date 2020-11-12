import java.util.ArrayList;

public abstract class Room {

    private RoomType type;
    private ArrayList<Guest> guests;

    public Room(RoomType capacity, ArrayList<Guest> guests) {
        this.type = capacity;
        this.guests = guests;
    }

    public int getCapacity() {
        return type.getValue();
    }
    
    public int getRate(){return type.getRate();}

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }
    
    
}
