package behaviour_design_pattern.cor;

public class EngineIssueHandler extends AbstractHandler{
    public static int code=302;

    public EngineIssueHandler(AbstractHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if(request.getRequestCode()==code){
            System.out.println("Engine handler handle engine issue");
        }else{
            super.handleRequest(request);
        }
    }
}
