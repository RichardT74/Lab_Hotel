import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;
    private String type;
    private int cost;






    public Bedroom(int roomNumber, int capacity, String type, int cost) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
        this.cost = cost;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public String getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }





    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }



    public int guestCount(){
        return this.guests.size();
    }

    public void RemoveGuest(Guest guest) {
         this.guests.remove(guest);
    }

    public void AddGuest(Guest guest) {
         this.guests.add(guest);
}


}
