public class TemperatureSensor extends Sensor{

    public TemperatureSensor(String name) {
        super(name);
    }

    @Override
    public double getValue() {
        return 10;
    }

    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
