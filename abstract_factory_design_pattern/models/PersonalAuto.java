package abstract_factory_design_pattern.models;

import abstract_factory_design_pattern.Auto;

public class PersonalAuto extends Auto {
    @Override
    public void setVehicleType() {
        autoType="Personal";
    }

    @Override
    public void setBaseCost() {
        baseCost=12.54;
    }

    @Override
    public void setVehicleChargePerUnitDistance() {
        chargePerUnitDistance=11.22;
    }
}
