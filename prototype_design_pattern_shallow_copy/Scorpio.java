package prototype_design_pattern_shallow_copy;

public class Scorpio implements ScorpioPrototype{

    private ScorpioEngine scorpioEngine = new ScorpioEngine();
    @Override
    public ScorpioPrototype clone() {
        return new Scorpio();
    }

    @Override
    public void setScorpioEngine(ScorpioEngine scorpioEngine) {
        this.scorpioEngine=scorpioEngine;
    }

    @Override
    public void start() {
        System.out.println("Start ho hai hai");
    }
}
