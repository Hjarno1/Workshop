import java.util.ArrayList;
import java.util.UUID;

public class BuildingManagementSystem {
    ArrayList<Building> buildings;

    public ArrayList<Building> getBuildings() {
        return buildings;
    }
    public UUID addBuilding (String name) {
        Building aBuilding = new Building(name);
        buildings.add(aBuilding);
        return aBuilding.getId();
    }

    public void removeBuilding (UUID id){
        for (int i = 0; i < buildings.size(); i++) {
            if (id==buildings.get(i).getId()){
                buildings.remove(i);
                break;
            }
        }
    }

}
