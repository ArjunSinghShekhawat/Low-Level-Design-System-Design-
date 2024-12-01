package structural_design_pattern.proxy_design_pattern;

public class ScorpioRM implements Car{
    @Override
    public void turnLeft() {
        System.out.println("Scorpio RM turn left");
    }

    @Override
    public void turnRight() {
        System.out.println("Scorpio RM turn right");
    }

    @Override
    public void goStraight() {
        System.out.println("Scorpio RM go straight");
    }
}
