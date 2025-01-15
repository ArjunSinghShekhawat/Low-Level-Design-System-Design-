package behaviour_design_pattern.cor;

public class PressureIssueHandler extends AbstractHandler{
    public static int code=303;

    public PressureIssueHandler(AbstractHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if(request.getRequestCode()==code){
            System.out.println("Pressure handler handle pressure issue");
        }else{
            super.handleRequest(request);
        }
    }
}
