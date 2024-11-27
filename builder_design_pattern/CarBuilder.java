package builder_design_pattern;

import builder_design_pattern.models.Car;

public interface CarBuilder {
    void buildEngine();
    void buildChassis();
    void buildTyre();
    void buildBodyShell();
    Car build();
}
