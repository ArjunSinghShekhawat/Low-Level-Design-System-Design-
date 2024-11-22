package abstract_factory_design_pattern;

public class App {
    public static void main(String[] args) {

        AbstractVehicleFactory carFactory = FactoryProvider.getVehicleFactory("car");
        Vehicle miniCar = carFactory.getVehicle("mini");
        miniCar.book(10);


        AbstractVehicleFactory bikeFactory = FactoryProvider.getVehicleFactory("bike");
        Vehicle sportsBike = bikeFactory.getVehicle("sports");
        sportsBike.book(10);

        AbstractVehicleFactory autoFactory = FactoryProvider.getVehicleFactory("auto");
        Vehicle personalAuto = autoFactory.getVehicle("Personal");
        personalAuto.book(10);

    }
}
