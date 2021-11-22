package com.workshop;

import java.util.ArrayList;
import java.util.HashMap;
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
        Map<UUID, String> m = new HashMap<UUID, String>();

        for (Building b : this.buildings) {
            m.put(b.getId(), b.getName());
        }

        return m;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        Map<UUID, String> sensors = new HashMap<UUID, String>();

        for (Building b : this.buildings) {
            for (Sensor s : b.sensors) {
                sensors.put(s.getId(), s.getName());
            }
        }

        return sensors;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        Map<UUID, String> actuators = new HashMap<UUID, String>();

        for (Building b : this.buildings) {
            for (Actuator a : b.actuators) {
                actuators.put(a.getId(), a.getName());
            }
        }

        return actuators;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        UUID sensorUUID = UUID.randomUUID();
        for (Building b : this.buildings) {
            if (b.getId() == buildingId) {
                sensorUUID = b.addTemperatureSensor(name);
                return sensorUUID;
            }
        }
        return sensorUUID;
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
