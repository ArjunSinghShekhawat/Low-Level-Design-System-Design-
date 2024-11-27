package builder_design_pattern;

import builder_design_pattern.models.Car;
import builder_design_pattern.models.Scorpio;

public class ScorpioBuilder implements CarBuilder{


    private Scorpio scorpio;
    @Override
    public void buildEngine() {
        System.out.println("Scorpio engine set");
    }

    @Override
    public void buildChassis() {
        System.out.println("Scorpio chassis set");
    }

    @Override
    public void buildTyre() {
        System.out.println("Scorpio tyre set");
    }

    @Override
    public void buildBodyShell() {
        System.out.println("Scorpio body shell set");
    }

    @Override
    public Car build() {
        return scorpio;
    }
}
