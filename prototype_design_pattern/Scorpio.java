package prototype_design_pattern;

public class Scorpio implements ScorpioPrototype{

    private ScorpioEngine scorpioEngine;

    public Scorpio(){
        this.scorpioEngine = new ScorpioEngine();
    }
    private Scorpio(ScorpioEngine scorpioEngine){
        this.scorpioEngine=new ScorpioEngine(scorpioEngine);
    }
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
