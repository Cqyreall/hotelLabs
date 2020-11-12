import java.util.ArrayList;

public class DiningRoom {

    private String name;
    private int capacity;
    private ArrayList<Guest> guests;

    public DiningRoom(String name, int capacity, ArrayList<Guest> guests) {
        this.name = name;
        this.capacity = capacity;
        this.guests = guests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setType(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }
}
