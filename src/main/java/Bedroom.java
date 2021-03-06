import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String roomType;
    private ArrayList<Guest> guests;
    private double nightlyRate;

    public Bedroom(int roomNumber, int capacity, String roomType, double nightlyRate){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.roomType = roomType;
        this.guests = new ArrayList<Guest>();
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getRoomType(){
        return this.roomType;
    }

    public int countGuests(){
        return this.guests.size();
    }

    public void addGuest (Guest guest){
        this.guests.add(guest);
    }

    public boolean checkAvailability(){
        if (this.guests.size() == 0){
            return true;
        }
        return false;
    }


}
