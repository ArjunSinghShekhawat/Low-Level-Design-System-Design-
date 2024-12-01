package structural_design_pattern.proxy_design_pattern;

public class Scorpio implements Car{
    @Override
    public void turnLeft() {
        System.out.println("Scorpio turn left");
    }

    @Override
    public void turnRight() {
        System.out.println("Scorpio turn right");
    }

    @Override
    public void goStraight() {
        System.out.println("Scorpio go straight");
    }
}
