package structural_design_pattern.adeptor_desing_pattern;

public class Adaptor implements ICar {

    HotAirBalloon hotAirBalloon;

    public Adaptor(HotAirBalloon hotAirBalloon){
        this.hotAirBalloon=hotAirBalloon;
    }
    @Override
    public void start() {
        String gas = hotAirBalloon.getGas();
        hotAirBalloon.start(gas);
    }
}
