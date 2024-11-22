package abstract_factory_design_pattern;

import abstract_factory_design_pattern.models.*;

public class BikeFactory extends AbstractVehicleFactory{

    @Override
    public Vehicle getVehicle(String type) {
        if(type.isEmpty()){
            throw new IllegalArgumentException("type is not valid !");
        }
        if(type.equalsIgnoreCase("Sports")){
            return new SportsBike();
        }else if(type.equalsIgnoreCase("Normal")){
            return new NormalBike();
        }else{
            return new NormalBike();
        }
    }
}
