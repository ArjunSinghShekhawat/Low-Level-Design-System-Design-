package builder_design_pattern;

import builder_design_pattern.models.Car;
import builder_design_pattern.models.Fortuner;

public class FortuerBuilder implements CarBuilder{
    private Fortuner fortuner;

    @Override
    public void buildEngine() {
        System.out.println("Fortuner engine set");
    }

    @Override
    public void buildChassis() {
        System.out.println("Fortuner chassis set");
    }

    @Override
    public void buildTyre() {
        System.out.println("Fortuner tyre set");
    }

    @Override
    public void buildBodyShell() {
        System.out.println("Fortuner body shell set");
    }

    @Override
    public Car build() {
        return fortuner;
    }
}
