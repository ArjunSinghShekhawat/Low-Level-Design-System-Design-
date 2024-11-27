package builder_design_pattern;

public class Director   {

    private CarBuilder carBuilder;

    public  Director(CarBuilder carBuilder){
        this.carBuilder=carBuilder;
    }
    public void construct(){
        carBuilder.buildEngine();
        carBuilder.buildChassis();
        carBuilder.buildTyre();
        carBuilder.buildBodyShell();
    }
}
