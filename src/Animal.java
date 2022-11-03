public class Animal {
    private String name;
    private int distance;
    private int runDist;
    private int swimDist;
    public static  int animalCount=0;

    public int getRunDist() {
        return runDist;
    }

    public void setRunDist(int runDist) {
        this.runDist = runDist;
    }

    public int getSwimDist() {
        return swimDist;
    }

    public void setSwimDist(int swimDist) {
        this.swimDist = swimDist;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }
}
