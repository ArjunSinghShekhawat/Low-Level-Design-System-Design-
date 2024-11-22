package abstract_factory_design_pattern;

public class FactoryProvider {

    public static AbstractVehicleFactory getVehicleFactory(String factoryType){
        if (factoryType.isEmpty()){
           throw new IllegalArgumentException("factory type is not valid !");
        }
        if(factoryType.equalsIgnoreCase("Car")){
            return new CarFactory();
        }else if(factoryType.equalsIgnoreCase("Auto")){
            return new AutoFactory();
        }else if(factoryType.equalsIgnoreCase("Bike")){
            return new BikeFactory();
        }else{
            return new CarFactory();
        }

    }
}
