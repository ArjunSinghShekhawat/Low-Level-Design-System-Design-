package abstract_factory_design_pattern.models;

import abstract_factory_design_pattern.Car;

public class MicroCar extends Car {
    @Override
    public void setVehicleType() {
        carType="Micro";

    }

    @Override
    public void setBaseCost() {
        baseCost=20.85;
    }

    @Override
    public void setVehicleChargePerUnitDistance() {
        baseCost=22.55;
    }
}
