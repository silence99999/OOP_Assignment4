public class Room {
    private Building building;
    private int number;
    private float area;

    public Room(){}

    public Room(int number,float area){
        this.number = number;
        this.area = area;
    }

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }


    public float getArea() {
        return this.area;
    }

    public void setArea(float area){
        this.area = area;
    }

    public String toString(){
        return "Room number " + this.number + " Area of the room " + this.area;
    }
}
