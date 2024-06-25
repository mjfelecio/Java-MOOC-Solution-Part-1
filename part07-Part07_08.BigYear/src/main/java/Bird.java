public class Bird {
    private String name;
    private String latinName;
    private int observationCount;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public void addObservationCount() {
        this.observationCount ++;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): " + this.observationCount + " observations";
    }
}