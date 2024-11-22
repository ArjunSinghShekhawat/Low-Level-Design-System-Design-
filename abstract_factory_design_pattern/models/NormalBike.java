package abstract_factory_design_pattern.models;

import abstract_factory_design_pattern.Bike;

public class NormalBike extends Bike {

    @Override
    public void setVehicleType() {
        bikeType="Normal";
    }

    @Override
    public void setBaseCost() {
        baseCost=4.78;
    }

    @Override
    public void setVehicleChargePerUnitDistance() {
        chargePerUnitDistance=6.54;
    }
}
