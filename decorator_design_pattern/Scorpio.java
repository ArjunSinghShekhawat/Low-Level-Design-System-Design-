package structural_design_pattern.decorator_design_pattern;

public class Scorpio implements ICar {

    @Override
    public void start() {
        System.out.println("Scorpio is start");
    }

    @Override
    public void stop() {
        System.out.println("Scorpio is stop");
    }

    @Override
    public float getWeight() {
        return baseWeight;
    }
}
