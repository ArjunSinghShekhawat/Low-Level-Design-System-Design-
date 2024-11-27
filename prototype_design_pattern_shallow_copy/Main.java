package prototype_design_pattern_shallow_copy;

public class Main {
    public static void main(String[] args) {
        //scorpio Prototype
        ScorpioPrototype scorpioPrototype = new Scorpio();

        //create ScorpioN
        ScorpioPrototype scorpioN = scorpioPrototype.clone();
        scorpioN.setScorpioEngine(new ScorpioNEngine());
        scorpioN.start();


        //create ScorpioClassic
        ScorpioPrototype scorpioClassic = scorpioPrototype.clone();
        scorpioClassic.setScorpioEngine(new ScorpioClassicEngine());
        scorpioClassic.start();

    }
}