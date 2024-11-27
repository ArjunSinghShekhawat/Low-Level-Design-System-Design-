package builder_design_pattern;

import builder_design_pattern.models.Car;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new ScorpioBuilder();
        Director director = new Director(carBuilder);
        director.construct();

        Car build = carBuilder.build();
    }
}
