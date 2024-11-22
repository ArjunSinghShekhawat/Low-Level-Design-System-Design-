package abstract_factory_design_pattern.models;

import abstract_factory_design_pattern.Bike;

public class SportsBike extends Bike {
    @Override
    public void setVehicleType() {
        bikeType="Sports";
    }

    @Override
    public void setBaseCost() {
        baseCost=6.78;
    }

    @Override
    public void setVehicleChargePerUnitDistance() {
        chargePerUnitDistance=8.54;
    }
}
