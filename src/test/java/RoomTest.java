import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Bedroom room1;
    Guest guest1,  guest2;
    Booking newBooking;


    @Before
    public void before(){
        guest1 = new Guest("Maddie");
        guest2 = new Guest("Cyril");
        ArrayList<Guest> guests =  new ArrayList<Guest>();
        guests.add(guest1);
        guests.add(guest2);
        room = new Bedroom(RoomType.DOUBLE, guests, 213);
        room1 = new Bedroom(RoomType.SINGLE, guests, 215);

        newBooking = new Booking(5, room1);
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, room.getCapacity());
    }

    @Test
    public void isBooked(){
        Bedroom bedRoom = (Bedroom) room; //casting
        bedRoom.book();
        assertEquals(true, bedRoom.isBooked());
    }

    @Test
    public void billed(){
        assertEquals(225, room1.bill(newBooking));
    }


}
