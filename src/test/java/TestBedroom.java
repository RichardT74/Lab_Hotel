import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBedroom {

    private Guest guest1;
    private Guest guest2;

    private Bedroom bedroom1;


    @Before
    public void setUp() throws Exception {
        guest1 = new Guest("John");
        guest2 = new Guest("Harry");

        bedroom1 = new Bedroom(1, 2, "Double", 50);
    }


    @Test
    public void canAddGuestsToRoom() {
        bedroom1.AddGuest(guest1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canRemoveGuestFromRoom() {
        bedroom1.AddGuest(guest1);
        bedroom1.AddGuest(guest2);
        bedroom1.RemoveGuest(guest1);
        assertEquals(1, bedroom1.guestCount());
    }

}
