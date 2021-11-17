import java.util.UUID;

public class Co2Sensor extends Sensor{

    public Co2Sensor(String name) {
        super(name);
    }

    @Override
    public double getValue() {
        return 10;
    }

    @Override
    public String toString() {
        return "Co2Sensor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
