package abstract_factory_design_pattern;

import abstract_factory_design_pattern.models.*;

public class AutoFactory extends AbstractVehicleFactory{
    @Override
    public Vehicle getVehicle(String type) {
        if(type.isEmpty()){
            throw new IllegalArgumentException("type is not valid !");
        }
        if(type.equalsIgnoreCase("Personal")){
            return new PersonalAuto();
        }else if(type.equalsIgnoreCase("Shared")){
            return new ShareAuto();
        }else{
            return new PersonalAuto();
        }
    }
}
