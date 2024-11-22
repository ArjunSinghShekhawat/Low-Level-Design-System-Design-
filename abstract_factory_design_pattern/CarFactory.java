package abstract_factory_design_pattern;

import abstract_factory_design_pattern.models.MegaCar;
import abstract_factory_design_pattern.models.MicroCar;
import abstract_factory_design_pattern.models.MiniCar;

public class CarFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        if(type.isEmpty()){
            throw new IllegalArgumentException("type is not valid !");
        }
        if(type.equalsIgnoreCase("Mega")){
            return new MegaCar();
        }else if(type.equalsIgnoreCase("Micro")){
            return new MicroCar();
        }else if(type.equalsIgnoreCase("Mini")){
            return new MiniCar();
        }else{
            return new MiniCar();
        }
    }
}
