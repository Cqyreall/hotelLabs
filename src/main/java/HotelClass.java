import java.util.ArrayList;
import java.util.HashMap;

public class HotelClass {

        private ArrayList<Bedroom> bedRooms;
        private ArrayList<ConferenceRoom> conferenceRooms;
        private HashMap<String, DiningRoom> diningRooms;

    public HotelClass(ArrayList<Bedroom> bedRooms, ArrayList<ConferenceRoom> conferenceRooms, HashMap<String, DiningRoom> diningRooms) {
        this.bedRooms = bedRooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public ArrayList<Bedroom> getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(ArrayList<Bedroom> bedRooms) {
        this.bedRooms = bedRooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }

    public Booking checkIn(ArrayList<Guest> guests, Bedroom bedroom, int nights){
        
        Booking booked = new Booking(nights, bedroom);
        if (!bedroom.isBooked() && guests.size() <= bedroom.getCapacity()){
            bedroom.setGuests(guests);
            bedroom.book();
        }
        
        return booked;
    }

    public void checkOut(ArrayList<Bedroom> bedRoomsList, Integer roomNumber) {
        
        ArrayList<Guest> clearGuest = new ArrayList<Guest>();
        for(int i = 0; i < bedRoomsList.size(); i++){
            Bedroom currentRoom = bedRoomsList.get(i);
            if(currentRoom.getRoomNumber() == roomNumber){
                currentRoom.setGuests(clearGuest);
                currentRoom.checkOut();
            }

        }
        
    }

    public HashMap<String, DiningRoom> getDiningRooms() {
        return diningRooms;
    }

    public void setDiningRooms(HashMap<String, DiningRoom> diningRooms) {
        this.diningRooms = diningRooms;
    }

    public ArrayList<Bedroom> getEmptyRooms() {
        
        ArrayList<Bedroom> emptyRooms = new ArrayList<Bedroom>();
        for(int i = 0; i < bedRooms.size(); i++){
            Bedroom currentRoom = bedRooms.get(i);
            if(currentRoom.getGuests().size() == 0){
                emptyRooms.add(currentRoom);
            }
        }
        
        return emptyRooms;
    }
}
