import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Room> rooms = new ArrayList<>();
    private String streetName;
    private int houseNumber;
    private int paymentMonthPerSqM;

    public Building(){}

    public Building(String streetName,int houseNumber,int paymentMonthPerSqM){
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.paymentMonthPerSqM = paymentMonthPerSqM;
    }

    public String getStreetName(){
        return this.streetName;
    }

    public void setStreetName(String streetName){
        this.streetName = streetName;
    }


    public int getHouseNumber(){
        return this.houseNumber;
    }

    public void setHouseNumber(int houseNumber){
        this.houseNumber = houseNumber;
    }


    public int getPaymentMonthPerSqM(){
        return this.paymentMonthPerSqM;
    }

    public void setPaymentMonthPerSqM(int paymentMonthPerSqM) {
        this.paymentMonthPerSqM = paymentMonthPerSqM;
    }

    public List<Room> getRooms(){
        return this.rooms;
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    public void removeRoom(Room room){
        this.rooms.remove(room);
    }

    public float getTotalArea(){
        float res = 0;
        for (int i = 0;i < this.rooms.size();i++){
            res += this.rooms.get(i).getArea();
        }
        return res;
    }

    public String toString(){
        return "Building streetname " + this.streetName + " House number " + this.houseNumber + " pyament month per SqM " + this.paymentMonthPerSqM;
    }
}
