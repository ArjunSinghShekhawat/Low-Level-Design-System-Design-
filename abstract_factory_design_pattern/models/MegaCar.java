package abstract_factory_design_pattern.models;

import abstract_factory_design_pattern.Car;

public class MegaCar extends Car {
    @Override
    public void setVehicleType() {
        carType="Mega";

    }

    @Override
    public void setBaseCost() {
        baseCost=28.85;
    }

    @Override
    public void setVehicleChargePerUnitDistance() {
        baseCost=32.55;
    }
}
