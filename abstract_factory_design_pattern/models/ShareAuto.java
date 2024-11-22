package abstract_factory_design_pattern.models;

import abstract_factory_design_pattern.Auto;

public class ShareAuto extends Auto {
    @Override
    public void setVehicleType() {
        autoType="Shared";
    }

    @Override
    public void setBaseCost() {
        baseCost=7.54;
    }

    @Override
    public void setVehicleChargePerUnitDistance() {
        chargePerUnitDistance=9.22;
    }
}
