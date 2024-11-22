package abstract_factory_design_pattern.models;

import abstract_factory_design_pattern.Car;

public class MiniCar extends Car {

    @Override
    public void setVehicleType() {
        carType="Mini";

    }

    @Override
    public void setBaseCost() {
        baseCost=10.85;
    }

    @Override
    public void setVehicleChargePerUnitDistance() {
        baseCost=12.55;
    }
}
