public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;
    private int totalCost;


    public Booking(Bedroom bedroom, int numberOfNights) {
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
        this.totalCost = 0;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public int getTotalCost() {
        this.totalCost = this.numberOfNights * bedroom.getCost();
        return totalCost;
    }
}
