package prototype_design_pattern_shallow_copy;

public interface ScorpioPrototype {
    ScorpioPrototype clone();
    void setScorpioEngine(ScorpioEngine scorpioEngine);
    void start();
}
