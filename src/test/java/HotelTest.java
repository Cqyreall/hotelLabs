import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Bedroom bedRoom, bedRoom2;
    ConferenceRoom conferenceRoom;
    HotelClass hotel;
    Guest guest1,  guest2, guest3, guest4, guest5, guest6, guest7;
    ArrayList<Bedroom> bedRoomsList;
    ArrayList<ConferenceRoom> conferenceRoomsList;
    ArrayList<Guest> subwayGuest;
    ArrayList<Guest> bedRoomguests;
    ArrayList<Guest> conferenceRoomguests;
    Booking bedroomBooking;
    DiningRoom subWay;
    DiningRoom theWinchester;
    HashMap<String, DiningRoom> diningRooms;

    @Before
    public void before(){
        guest1 = new Guest("Maddie");
        guest2 = new Guest("Cyril");
        subwayGuest = new ArrayList<Guest>();
        bedRoomguests =  new ArrayList<Guest>();
        bedRoomguests.add(guest1);
        bedRoomguests.add(guest2);
        bedRoom = new Bedroom(RoomType.DOUBLE, bedRoomguests, 213);
        bedRoom2 = new Bedroom(RoomType.SINGLE, subwayGuest, 237);
        bedRoomsList = new ArrayList<Bedroom>();
        bedRoomsList.add(bedRoom);
        bedRoomsList.add(bedRoom2);


        guest3 = new Guest("Craig");
        guest4 = new Guest("Steve");
        guest5 = new Guest("Steven");
        guest6 = new Guest("Tj");
        guest7 = new Guest("David");
        conferenceRoomguests =  new ArrayList<Guest>();
        conferenceRoomguests.add(guest3);
        conferenceRoomguests.add(guest4);
        conferenceRoomguests.add(guest5);
        conferenceRoomguests.add(guest6);
        conferenceRoomguests.add(guest7);
        conferenceRoom = new ConferenceRoom(RoomType.DOUBLE, conferenceRoomguests, "Suite");
        conferenceRoomsList = new ArrayList<ConferenceRoom>();
        conferenceRoomsList.add(conferenceRoom);

        bedroomBooking = new Booking(2, bedRoom);



        subWay = new DiningRoom("The Prancing Pony", RoomType.DININGROOM.getValue(), subwayGuest);
        theWinchester = new DiningRoom("The Winchester", RoomType.DININGROOM.getValue(), subwayGuest);

        diningRooms = new HashMap<String, DiningRoom>();
        diningRooms.put(subWay.getName(), subWay);
        diningRooms.put(theWinchester.getName(), theWinchester);

        hotel = new HotelClass(bedRoomsList, conferenceRoomsList, diningRooms);

    }

    @Test
    public void isBooked(){
        hotel.checkIn(bedRoomguests, bedRoomsList.get(0), 2);
        assertEquals(true, bedRoomsList.get(0).isBooked());
    }

    @Test
    public void checkOut(){
        hotel.checkIn(bedRoomguests, bedRoomsList.get(0), 2);
        hotel.checkOut(bedRoomsList, bedRoomsList.get(0).getRoomNumber());
        assertEquals(0, bedRoomsList.get(0).getGuests().size());
        assertEquals(false, bedRoomsList.get(0).isBooked());
    }

    @Test
    public void returnsNumberOfNights(){
        Booking finalBook = hotel.checkIn(bedRoomguests, bedRoomsList.get(0), 2);
        assertEquals(2, finalBook.getNights());
    }

    @Test
    public void returnsEmptyRoom(){
        hotel.checkIn(bedRoomguests, bedRoomsList.get(0), 2);
        assertEquals(bedRoom2, hotel.getEmptyRooms().get(0));
    }


}
