import java.util.UUID;

public class Unit {

    String name;
    UUID id;

    public Unit(String name) {
        this.name = name;
        this.id = UUID.randomUUID();

    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
