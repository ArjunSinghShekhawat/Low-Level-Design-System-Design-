package prototype_design_pattern;

public interface ScorpioPrototype {
    ScorpioPrototype clone();
    void setScorpioEngine(ScorpioEngine scorpioEngine);
    void start();
}
