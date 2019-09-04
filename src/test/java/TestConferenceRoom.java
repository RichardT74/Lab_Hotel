import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestConferenceRoom {

    private Guest guest1;
    private Guest guest2;

    private ConferenceRoom conferenceRoom1;


    @Before
    public void setUp() throws Exception {
        guest1 = new Guest("John");
        guest2 = new Guest("Harry");

        conferenceRoom1 = new ConferenceRoom(20, "Green");
    }


    @Test
    public void canAddGuestsToConferenceRoom() {
        conferenceRoom1.AddGuest(guest1);
        assertEquals(1, conferenceRoom1.guestCount());

    }


    @Test
    public void canRemoveGuestsFromConferenceRoom() {
        conferenceRoom1.AddGuest(guest1);
        conferenceRoom1.AddGuest(guest2);
        conferenceRoom1.RemoveGuest(guest2);

        assertEquals(1, conferenceRoom1.guestCount());

    }

}


