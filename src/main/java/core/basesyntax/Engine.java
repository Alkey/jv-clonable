package core.basesyntax;

public class Engine implements Cloneable {
    private int horsePowers;
    private String serialNumber;
    private String typeOfFuel;
    private double volume;
    private int weight;

    public Engine(int horsePowers, String serialNumber,
                  String typeOfFuel, double volume, int weight) {
        this.horsePowers = horsePowers;
        this.serialNumber = serialNumber;
        this.typeOfFuel = typeOfFuel;
        this.volume = volume;
        this.weight = weight;
    }

    public Engine clone(Engine engine) {
        return new Engine(engine.horsePowers, engine.serialNumber,
                engine.typeOfFuel, engine.volume, weight);
    }
}
