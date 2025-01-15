package behaviour_design_pattern.command;

public class EngageBreakCommand implements Command{


    //composition
    BreakMechanism breakMechanism;

    public EngageBreakCommand(BreakMechanism breakMechanism){
        this.breakMechanism=breakMechanism;
    }
    @Override
    public void execute() {
        breakMechanism.applyBreak();
    }
}
