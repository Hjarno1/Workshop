import java.util.ArrayList;
import java.util.UUID;

public class Building extends Unit{

    ArrayList<Sensor> sensors;
    ArrayList<Actuator> actuators;

    public Building(String name) {
        super(name);
    }


    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public ArrayList<Actuator> getActuators() {
        return actuators;
    }

    public UUID addTemperatureSensor (String name) {
        TemperatureSensor aTemperatureSensor = new TemperatureSensor(name);
        sensors.add(aTemperatureSensor);
        return aTemperatureSensor.getId();
    }

    public UUID addCo2Sensor (String name) {
        Co2Sensor aCo2Sensor = new Co2Sensor(name);
        sensors.add(aCo2Sensor);
        return aCo2Sensor.getId();
    }

    public void removeSensor (UUID id){
        for (int i = 0; i < sensors.size(); i++) {
            if (id==sensors.get(i).getId()){
                sensors.remove(i);
                break;
            }
        }
    }
    public UUID addVentActuator (String name) {
        VentilationActuator aVentilationActuator = new VentilationActuator(name);
        actuators.add(aVentilationActuator);
        return aVentilationActuator.getId();

    }

    public void removeActuator (UUID id){
        for (int i = 0; i < actuators.size(); i++) {
            if (id==actuators.get(i).getId()){
                actuators.remove(i);
                break;
            }
        }
    }
}
