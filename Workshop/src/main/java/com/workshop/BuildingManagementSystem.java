package com.workshop;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

public class BuildingManagementSystem implements IBuildingManagementSystem {
    ArrayList<Building> buildings = new ArrayList<Building>();

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

    @Override
    public Map<UUID, String> getBuildingInformation() {
        return null;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        return null;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        return null;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        return null;
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        return null;
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {

    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        return null;
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {

    }
}
