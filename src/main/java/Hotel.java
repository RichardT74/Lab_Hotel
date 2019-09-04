import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;


    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();

    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(ArrayList<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void setConferenceRooms(ArrayList<ConferenceRoom> conferenceRooms) {
        this.conferenceRooms = conferenceRooms;
    }


    public void checkIn(Bedroom bedroom, Guest guest) {
        bedroom.AddGuest(guest);
    }

    public void checkOut(Bedroom bedroom, Guest guest) {
        bedroom.RemoveGuest(guest);
    }

    public void confCheckIn(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.AddGuest(guest);
    }

    public void confCheckOut(ConferenceRoom conferenceRoom, Guest guest) {
        conferenceRoom.RemoveGuest(guest);
    }


    public Booking bookRoom(Bedroom bedroom, int numberOfNights) {
        Booking booking = new Booking(bedroom, numberOfNights);
        return booking;
    }
}

