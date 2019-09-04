import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHotel {


    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Bedroom bedroom3;


    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;


    private Hotel hotel;

    private Booking booking;




    @Before
    public void setUp() throws Exception {
        guest1 = new Guest( "John");
        guest2 = new Guest( "Harry");
        guest3 = new Guest( "Sara");
        guest4 = new Guest( "Kate");


        bedroom1 = new Bedroom(1, 2, "Double", 50);
        bedroom2 = new Bedroom(2, 2, "Double", 40);
        bedroom3 = new Bedroom(3, 3, "Triple", 100);


        conferenceRoom1 = new ConferenceRoom(2, "Green");
        conferenceRoom2 = new ConferenceRoom(3, "Red");

        hotel = new Hotel();

        booking = new Booking(bedroom1, 5);
    }

    @Test
    public void addGuestToRoom(){
        hotel.checkIn(bedroom1, guest1);
        assertEquals(1, bedroom1.guestCount());
    }


    @Test
    public void removeGuestFromRoom(){
        hotel.checkIn(bedroom1, guest2);
        hotel.checkOut(bedroom1, guest2);
        assertEquals(0, bedroom1.guestCount());
    }


    @Test
    public void addGuestToConferenceRoom(){
        hotel.confCheckIn(conferenceRoom1, guest1);
        assertEquals(1, conferenceRoom1.guestCount());
    }


    @Test
    public void removeGuestFromConferenceRoom(){
        hotel.confCheckIn(conferenceRoom1, guest1);
        hotel.confCheckOut(conferenceRoom1, guest1);
        assertEquals(0, conferenceRoom1.guestCount());
    }


    @Test
    public void createBooking(){
        Booking booking = hotel.bookRoom(bedroom1, 5);
        assertEquals(5, booking.getNumberOfNights());
        assertEquals( 250, booking.getTotalCost());

    }





}
