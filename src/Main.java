import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        City city = new City("name");
        Building building1 = new Building("streetname1",1,20);
        Building building2 = new Building("streetname2",2,25);
        Room room1 = new Room(1,50);
        Room room2 = new Room(2,55);
        Room room3 = new Room(3,60);


        System.out.println(city);
        System.out.println(building1);
        System.out.println(building2);
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);

        city.addBuilding(building1);
        city.addBuilding(building2);

        building1.addRoom(room1);
        building1.addRoom(room2);
        building2.addRoom(room3);

        System.out.println(building1);
        System.out.println(building1.getTotalArea());

        System.out.println(city.search("streetname1",1));
    }
}
