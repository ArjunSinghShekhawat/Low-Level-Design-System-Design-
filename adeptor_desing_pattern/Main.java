package structural_design_pattern.adeptor_desing_pattern;

public class Main {
    public static void main(String[] args) {
        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        Adaptor adaptor = new Adaptor(hotAirBalloon);

        adaptor.start();

    }
}
