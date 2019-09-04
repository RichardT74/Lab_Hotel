import java.lang.reflect.Array;
import java.util.ArrayList;


public class ConferenceRoom {

    private int capacity;
    private ArrayList<Guest> guests;
    private String name;


    public ConferenceRoom(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public String getName() {
        return name;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void AddGuest(Guest guest) {
        this.guests.add(guest);
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void RemoveGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
