package behaviour_design_pattern.command;

public class Main {
    public static void main(String[] args) {

        BreakMechanism breakMechanism = new BreakMechanism();
        AirSuspensionMechanism airSuspensionMechanism = new AirSuspensionMechanism();

        EngageBreakCommand engageBreakCommand=new EngageBreakCommand(breakMechanism);
        AirSuspensionCommand airSuspensionCommand = new AirSuspensionCommand(airSuspensionMechanism);

        Panel panel=new Panel();

        panel.setCommands(0,airSuspensionCommand);
        panel.setCommands(1,engageBreakCommand);

        panel.liftSuspension();



    }
}
