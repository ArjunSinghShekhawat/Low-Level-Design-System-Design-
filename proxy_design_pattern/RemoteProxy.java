package structural_design_pattern.proxy_design_pattern;

public class RemoteProxy implements Car{
    private  ScorpioRM scorpioRM = new ScorpioRM();
    @Override
    public void turnLeft() {
        System.out.println("I am inside turn left in remote class");
        scorpioRM.turnLeft();
    }

    @Override
    public void turnRight() {
        System.out.println("I am inside turn right in remote class");
        scorpioRM.turnRight();
    }

    @Override
    public void goStraight() {
        System.out.println("I am inside turn go straight in remote class");
        scorpioRM.goStraight();
    }
}
