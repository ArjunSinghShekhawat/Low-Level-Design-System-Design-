package behaviour_design_pattern.cor;

public class Main {
    public static void main(String[] args) {
        AbstractHandler pressureHandler = new PressureIssueHandler(null);
        EngineIssueHandler engineIssueHandler = new EngineIssueHandler(pressureHandler);


        PressureRequest pressureRequest = new PressureRequest();
        engineIssueHandler.handleRequest(pressureRequest);

    }
}
