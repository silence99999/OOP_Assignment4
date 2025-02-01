import java.util.ArrayList;
import java.util.List;

public class City {
    private List<Building> buildings = new ArrayList<>();
    private String name;

    public City(){}

    public City(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public List<Building> getBuildings(){
        return this.buildings;
    }

    public void addBuilding(Building building){
        this.buildings.add(building);
    }

    public void removeBuilding(Building building){
        this.buildings.remove(building);
    }

    public Building search(String name,int houseNumber){
        for (int i = 0;i < this.buildings.size();i++){
            if (this.buildings.get(i).getStreetName().equals(name) && this.buildings.get(i).getHouseNumber() == houseNumber) {
                return this.buildings.get(i);
            }
        }

        return null;
    }

    public String toString() {
        return "City " + this.name;
    }
}
